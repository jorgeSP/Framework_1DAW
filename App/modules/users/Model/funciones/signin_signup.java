package App.modules.users.Model.funciones;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.classes.singleton_login;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.Classes.admin;
import App.modules.users.Model.Classes.cliente;
import App.modules.users.Model.Classes.singleton;
import App.utils.funciones;

public class signin_signup {
	public static boolean login_user() {
		String s = "";
		String validador = "";
		admin a1 = null;
		cliente a2 = null;
		boolean continuar = false;
		switch (singleton_login.tipo_usuario) {
		case "admin":
			int arraylist = singleton.usuarioadmin.size();
			singleton_login.nombre_usuario = funciones_datos_users.pide_usuario();
			singleton_login.contraseña = funciones_datos_users.pide_contraseña();
			validador = singleton_login.nombre_usuario + singleton_login.contraseña;
			for (int i = 0; i < arraylist; i++) {
				a1 = (admin) singleton.usuarioadmin.get(i);
				s = a1.getusuario() + a1.getcontraseña();
				if (s.equals(validador)) {
					i = singleton.usuarioadmin.size();
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("bienvenido")+" "+ a1.getusuario());
					continuar = true;
				}
			}
			if (continuar == false) {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("datos_incorrectos"));
			}
			break;
		case "cliente":
			int arraylist1 = singleton.usuariocliente.size();
			singleton_login.nombre_usuario = funciones_datos_users.pide_usuario();
			singleton_login.contraseña = funciones_datos_users.pide_contraseña();
			validador = singleton_login.nombre_usuario + singleton_login.contraseña;
			for (int i = 0; i < arraylist1; i++) {
				a2 = (cliente) singleton.usuariocliente.get(i);
				s = a2.getusuario() + a2.getcontraseña();
				if (s.equals(validador)) {
					i = singleton.usuariocliente.size();
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("bienvenido")+" "+ a2.getusuario());
					continuar = true;
				}
			}
			if (continuar == false) {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("datos_incorrectos"));
			}
			break;
		}
		return continuar;
	}

	public static cliente registrar_usuario_cliente() {
		cliente a1 = null;
		cliente a2 = null;
		int location = -1;
		boolean continuar = false;

		do {
			a1 = (cliente) funciones_users.create_users_dni(1);
			location = Funciones_find.find_client((cliente) a1);
			if (location != -1) {
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("datos_incorrectos_dni"),
						"", JOptionPane.ERROR_MESSAGE);
				continuar = false;
			} else {
				continuar = true;
				String dni = a1.getdni();
				a2 = (cliente) funciones_users.create_users_genericos(1, dni);
				singleton.usuariocliente.add((cliente) a2);

			}

		} while (continuar == false);

		return a2;
	}

	public static admin registrar_usuario_admin() {
		admin a1 = null;
		admin a2 = null;
		int location = -1;
		boolean continuar = false;

		do {
			a1 = (admin) funciones_users.create_users_dni(2);
			location = Funciones_find.find_admin((admin) a1);
			if (location != -1) {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("datos_incorrectos_dni"),
						"", JOptionPane.ERROR_MESSAGE);
				continuar = false;
			} else {
				continuar = true;
				String dni = a1.getdni();
				a2 = (admin) funciones_users.create_users_genericos(2, dni);
				singleton.usuarioadmin.add((admin) a2);

			}

		} while (continuar == false);

		return a2;
	}

	public static boolean autentificacion_admin() {
		boolean continuar = false;
		String clave = funciones.valcadena(Settings.lenguaje.getProperty("clave_secreta"), "");
		String clave_secreta = "admin";
		if (clave.equals(clave_secreta)) {
			continuar = true;
		} else {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("clave_secreta_invalida"));
			continuar = false;
		}
		return continuar;
	}
}
