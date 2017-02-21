package App;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import App.classes.*;
import App.modules.users.Model.BLL.BLL_dummies.CRUD.Funciones_crear_dummies;
import App.modules.users.Model.BLL.BLL_dummies.funciones_dummies;
import App.modules.users.Model.BLL.BLL_dummies.CRUD.*;
import App.modules.users.Model.Classes.*;
import App.utils.Funciones_Tema;
import App.utils.funciones;
import App.utils.json_auto_ajustes;

public class main_dummies {
	public static void main(String[] args) {
		int option = 0;
		int menu1 = 0;
		int menu3 = 0;
		users ad = null;
		users cli = null;
		users nor = null;
		singleton.usuarioadmin = new ArrayList<admin>();
		singleton.usuariocliente = new ArrayList<cliente>();
		singleton.usuarionormal = new ArrayList<normal>();
		Settings.getInstance();
		do {
			Funciones_Tema.theme();
			String opciones[] = { Settings.lenguaje.getProperty("usuario_cliente"),
					Settings.lenguaje.getProperty("usuario_admin"), Settings.lenguaje.getProperty("usuario_normal"),
					Settings.lenguaje.getProperty("opciones"), Settings.lenguaje.getProperty("salir") };
			String opciones1[] = { Settings.lenguaje.getProperty("crear"), Settings.lenguaje.getProperty("leer_datos"),
					Settings.lenguaje.getProperty("modificar_datos"), Settings.lenguaje.getProperty("borrar"), "Order",
					Settings.lenguaje.getProperty("volver"), Settings.lenguaje.getProperty("salir") };
			String opciones2[] = { Settings.lenguaje.getProperty("formato_fecha"),
					Settings.lenguaje.getProperty("cambio_moneda"), Settings.lenguaje.getProperty("utilizar_decimales"),
					Settings.lenguaje.getProperty("cambiar_idioma"), "Main normal",
					Settings.lenguaje.getProperty("volver") };
			String[] opc_leng = { Settings.lenguaje.getProperty("español"), Settings.lenguaje.getProperty("ingles"),
					Settings.lenguaje.getProperty("italiano") };
			option = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("elije_opcion"), "menu");
			if ((option == 4) || (option == -1))
				System.exit(0);
			if (option == 0) { // entramos a realizar operaciones con usuario
								// cliente

				do {
					menu1 = funciones.menubuttons(opciones1, Settings.lenguaje.getProperty("elije_operacion"),
							"opciones");
					if (menu1 == -1) {
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 0) { // creamos usuario cliente

						cli = Funciones_crear_dummies.crear_usuario_cliente();
						singleton.usuariocliente.add((cliente) cli);
						option = 0;
						menu3 = 0;
					}
					if (menu1 == 1) { // leemos usuario cliente

						Funciones_leer_usuarios_dummies.leer_cliente((cliente) cli);
						menu3 = 0;
					}
					if (menu1 == 2) { // cambiamos datos usuario cliente
						Funciones_cambiar_datos_dummies.update_cliente((cliente) cli);
						option = 1;
					}
					if (menu1 == 3) { // borramos usuario cliente
						funciones_dummies.delete_users_generics_cli();
						option = 1;
					}
					if (menu1 == 4) { // Order
						funciones_order_dummies.cambiar_order_cliente();
					}

					if (menu1 == 5) { // volver
						menu3 = 1;
						option = 3;
					}

					if (menu1 == 6) { // salir de la aplicacion
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("despedida"));
						System.exit(0);
					}
				} while (menu3 == 0);
			} else
			// entramos a realizar operaciones con usuario admin
			if (option == 1) {
				do {
					menu1 = funciones.menubuttons(opciones1, Settings.lenguaje.getProperty("elije_operacion"),
							"opciones");
					if (menu1 == -1) {
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 0) {

						ad = Funciones_crear_dummies.crear_usuario_admin();
						singleton.usuarioadmin.add((admin) ad);
						option = 0;
						menu3 = 0;
					}
					if (menu1 == 1) { // leemos usuario admin

						Funciones_leer_usuarios_dummies.leer_admin((admin) ad);
						menu3 = 0;
					}
					if (menu1 == 2) { // cambiamos datos usuario admin
						Funciones_cambiar_datos_dummies.update_admin((admin) ad);
						option = 1;
					}
					if (menu1 == 3) { // borramos usuario admin
						// Funciones_borrar_usuarios_dummies.borrar_admin((admin)
						// cli);
						funciones_dummies.delete_users_generics_ad();
						option = 1;
					}
					if (menu1 == 4) { // Order
						funciones_order_dummies.cambiar_order_admin();
					}

					if (menu1 == 5) { // volver
						menu3 = 1;
						option = 3;
					}

					if (menu1 == 6) { // salir de la aplicacion
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("despedida"));
						System.exit(0);
					}

				} while (menu3 == 0);
			} else

			if (option == 2) { // entramos a realizar operaciones con usuario
								// normal
				do {
					menu1 = funciones.menubuttons(opciones1, Settings.lenguaje.getProperty("elije_operacion"),
							"opciones");
					if (menu1 == -1) {
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 0) { // creamos usuario normal

						nor = Funciones_crear_dummies.crear_usuario_normal();
						singleton.usuarionormal.add((normal) nor);
						option = 0;
						menu3 = 0;
					}
					if (menu1 == 1) { // leemos usuario normal

						Funciones_leer_usuarios_dummies.leer_normal((normal) nor);
						menu3 = 0;
					}
					if (menu1 == 2) { // cambiamos datos usuario normal
						Funciones_cambiar_datos_dummies.update_normal((normal) nor);
						option = 1;
					}
					if (menu1 == 3) { // borramos usuario normal

						funciones_dummies.delete_users_generics_nor();
						option = 1;
					}
					if (menu1 == 4) { // Order
						funciones_order_dummies.cambiar_order_normal();
					}

					if (menu1 == 5) { // volver
						menu3 = 1;
						option = 3;
					}

					if (menu1 == 6) { // salir de la aplicacion
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("despedida"));
						System.exit(0);
					}

				} while (menu3 == 0);
			} else if (option == 3) {

				do {
					menu1 = funciones.menubuttons(opciones2, Settings.lenguaje.getProperty("operaciones_settings"),
							" ");
					if (menu1 == -1) {
						menu3 = 1;
						option = 3;
					}
					if (menu1 == 0) {
						funciones_dummies.menu_fecha();
						option = 3;
						menu3 = 0;
					}
					if (menu1 == 1) {
						funciones_dummies.menu_moneda();
						option = 3;
						menu3 = 0;
					}
					if (menu1 == 2) {
						funciones_dummies.menu_decimales();
						option = 3;
						menu3 = 0;
					}
					if (menu1 == 3) {
						int menu_leng = funciones.menubuttons(opc_leng,
								Settings.lenguaje.getProperty("elije_un_idioma"), "");
						switch (menu_leng) {
						case 0:
							Settings.getInstance().setlenguaje("es");
							break;
						case 1:
							Settings.getInstance().setlenguaje("en");
							break;
						case 2:
							Settings.getInstance().setlenguaje("ita");
							break;
						}
						option = 3;
						menu3 = 0;
						json_auto_ajustes.savejson_config();
					}
					if (menu1 == 4) {
						Settings.getInstance().setdummies(false);
						main_Framework.main(args);
					}
					if (menu1 == 5) {
						menu3 = 1;
						option = 3;
						json_auto_ajustes.savejson_config();
					}
				} while (menu3 == 0);

			}
		} while ((option != 4));
	}

}
