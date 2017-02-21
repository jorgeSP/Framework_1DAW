package App;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import App.classes.Settings;
import App.classes.singleton_login;
import App.modules.users.Model.BLL.BLL_user.*;
import App.modules.users.Model.BLL.BLL_user.CRUD.*;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.signin_signup;
import App.utils.Funciones_Tema;
import App.utils.json_auto_ajustes;

public class main_Framework {

	public static void main(String[] args) {
		int option = 0, menu1 = 0, menu3 = 0, menu_login = 0;
		boolean continuar, continuar1;
		users ad = null, cli = null, nor = null, a1 = null;
		Settings.getInstance();
		do {
			Funciones_Tema.theme();
			funciones_abrir_guardar_auto.abrir_ficheros_auto();
			option = funciones_users.menu_general_usuarios();
			if ((option == 4) || (option == -1))
				System.exit(0);
			if (option == 0) { // entramos a realizar operaciones con usuario
				// cliente
				continuar = false;
				continuar1 = false;
				do {
					funciones_abrir_guardar_auto.abrir_ficheros_auto();
					menu_login = funciones_users.menu_login();
					switch (menu_login) {
					case 0:
						singleton_login.tipo_usuario = "cliente";
						continuar = signin_signup.login_user();
						if (continuar == false) {
							continuar1 = false;
							break;
						} else {
							do {
								singleton_login.tipo_usuario = "cliente";
								menu1 = funciones_users.menu_opciones_cliente();
								if (menu1 == -1) {
									menu3 = 1;
									option = 3;
								}

								if (menu1 == 0) { // leemos usuario cliente
									Funciones_leer_usuarios.leer_cliente_unico((cliente) cli);
									menu3 = 0;
								}
								if (menu1 == 1) { // cambiamos datos usuario
													// cliente
									Funciones_cambiar_datos.update_cliente_unico((cliente) cli);
									menu3 = 0;
								}
								if (menu1 == 2) { // borramos usuario cliente
									Funciones_borrar_usuarios.borrar_cliente_unico();
									funciones_abrir_guardar_auto.guardar_ficheros_auto();
									menu3 = 1;
									option = 3;
								}
								if (menu1 == 3) {
									funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_cliente();
									menu3 = 0;
								}
								if (menu1 == 4) {

									funciones_abrir_guardar_onDemand.guardar_ficheros_onDemand_cliente();
									menu3 = 0;
								}
								if (menu1 == 5) {// volver
									funciones_abrir_guardar_auto.guardar_ficheros_auto();
									menu3 = 1;
									option = 3;
								}
								if (menu1 == 6) { // salir de la aplicacion
									funciones_abrir_guardar_auto.guardar_ficheros_auto();
									JOptionPane.showMessageDialog(null,
											Settings.lenguaje.getInstance().getProperty("despedida"));
									System.exit(0);
								}

							} while (menu3 == 0);

						}
						break;
					case 1:
						signin_signup.registrar_usuario_cliente();
						funciones_abrir_guardar_auto.guardar_ficheros_auto();
						JOptionPane.showMessageDialog(null,
								Settings.lenguaje.getInstance().getProperty("usuario_cli_registrado"));
						break;
					case 2:
						continuar1 = true;
						break;
					}

				} while (continuar1 != true);
			} else if (option == 1) { // entramos a realizar operaciones con
				continuar = false;
				continuar1 = false;
				do {
					funciones_abrir_guardar_auto.abrir_ficheros_auto();
					menu_login = funciones_users.menu_login();
					switch (menu_login) {
					case 0:
						singleton_login.tipo_usuario = "admin";
						continuar = signin_signup.login_user();
						if (continuar == false) {
							continuar1 = false;
							break;
						} else {
							do {

								menu1 = funciones_users.menu_opciones_admin();
								if (menu1 == -1) {
									menu3 = 1;
									option = 3;
								}
								if (menu1 == 0) { // leemos usuario admin
									Funciones_leer_usuarios.leer_admin((admin) ad, (cliente) cli);
									menu3 = 0;
								}
								if (menu1 == 1) { // cambiamos datos usuario
													// admin
									Funciones_cambiar_datos.update_admin((admin) ad, (cliente) cli);
									option = 1;
								}
								if (menu1 == 2) { // borramos usuario admin

									Funciones_borrar_usuarios.borrar_admin((admin) a1, (cliente) cli);
									funciones_abrir_guardar_auto.guardar_ficheros_auto();
									option = 1;
								}
								if (menu1 == 3) { // cambiar order

									funciones_order.menu_opciones_order_admin();
									menu3 = 0;
								}
								if (menu1 == 4) {
									funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_admin_cliente();
									menu3 = 0;
								}
								if (menu1 == 5) {

									funciones_abrir_guardar_onDemand.guardar_ficheros_onDemand_admin_cliente();
									menu3 = 0;
								}
								if (menu1 == 6) {

									funciones_abrir_guardar_auto.guardar_ficheros_auto();
									menu3 = 1;
									option = 3;
								}
								if (menu1 == 7) { // salir de la aplicacion
									funciones_abrir_guardar_auto.guardar_ficheros_auto();
									JOptionPane.showMessageDialog(null,
											Settings.lenguaje.getInstance().getProperty("despedida"));
									System.exit(0);
								}

							} while (menu3 == 0);

						}

						break;
					case 1:
						boolean valor = signin_signup.autentificacion_admin();
						if (valor == true) {
							signin_signup.registrar_usuario_admin();
							funciones_abrir_guardar_auto.guardar_ficheros_auto();
							JOptionPane.showMessageDialog(null,
									Settings.lenguaje.getInstance().getProperty("usuario_ad_registrado"));
						}
						break;
					case 2:
						continuar1 = true;
						break;
					}

				} while (continuar1 != true);
				// usuario admin

			} else
			// entramos a realizar operaciones con usuario normal
			if (option == 2) {
				do {
					funciones_abrir_guardar_auto.abrir_ficheros_auto();
					menu1 = funciones_users.menu_opciones_normal();
					if (menu1 == -1) {
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 0) { // creamos usuario normal
						nor = Funciones_crear.crear_usuario_normal();
						funciones_abrir_guardar_auto.guardar_ficheros_auto();
						option = 1;
						menu3 = 0;
					}
					if (menu1 == 1) { // leemos usuario normal
						Funciones_leer_usuarios.leer_normal_unico();
						menu3 = 0;
					}

					if (menu1 == 2) { // volver
						funciones_abrir_guardar_auto.guardar_ficheros_auto();
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 3) {// salir de la aplicacion
						singleton.usuarionormal.remove(nor);
						singleton.usuarionormal = new ArrayList<normal>();
						funciones_abrir_guardar_auto.guardar_ficheros_auto();
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("despedida"));
						System.exit(0);
					}

				} while (menu3 == 0);
			} else if (option == 3) {

				do {
					menu1 = funciones_users.menu_opciones_settings();
					if (menu1 == -1) {
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 0) {
						funciones_users.menu_fecha();
						option = 3;
						menu3 = 0;
					}

					if (menu1 == 1) {
						funciones_users.menu_moneda();
						option = 3;
						menu3 = 0;
						funciones_abrir_guardar_auto.guardar_ficheros_auto();
					}

					if (menu1 == 2) {
						funciones_users.menu_decimales();
						option = 3;
						menu3 = 0;
						funciones_abrir_guardar_auto.guardar_ficheros_auto();
					}

					if (menu1 == 3) {
						funciones_users.menu_lenguajes();
						menu3 = 0;
					}
					if (menu1 == 4) {
						Settings.getInstance().setdummies(true);
						main_dummies.main(args);
					}
					if (menu1 == 5) {
						funciones_users.menu_archivos();
						json_auto_ajustes.savejson_config();
					}
					if (menu1 == 6) {
						funciones_users.Tema();
						json_auto_ajustes.savejson_config();
					}
					if (menu1 == 7) {
						menu3 = 1;
						option = 3;
						json_auto_ajustes.savejson_config();

					}
				} while (menu3 == 0);

			}

		} while ((option != 4));
	}
}
