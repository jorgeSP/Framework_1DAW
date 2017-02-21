package App.modules.users.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.Funciones_find;
import App.utils.funciones;

public class Funciones_cambiar_datos {

	public static void update_admin(admin a1, cliente a2) {
		int location = -1, menu;
		String[] opciones = { Settings.lenguaje.getProperty("admin"), Settings.lenguaje.getProperty("cliente") };
		menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("modificar_datos1"), "");
		switch (menu) {
		case 0:

			if (singleton.usuarioadmin.isEmpty()) {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
						Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			} else {
				a1 = Funciones_find.IDadmin();
				location = -1;
				// a1 = (admin) funciones_users.create_users_dni(2);
				location = Funciones_find.find_admin(a1);
				if (location != -1) {
					a1 = singleton.usuarioadmin.get(location);
					funciones_users.update_users_generics(a1);
					singleton.usuarioadmin.set(location, a1);
				} else {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
							Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
				}
			}

			break;
		case 1:

			if (singleton.usuariocliente.isEmpty()) {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
						Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			} else {
				a2 = Funciones_find.IDclient();
				location = -1;
				// a2 = (cliente) funciones_users.create_users_dni(1);
				location = Funciones_find.find_client(a2);
				if (location != -1) {
					a2 = singleton.usuariocliente.get(location);
					funciones_users.update_users_generics(a2);
					singleton.usuariocliente.set(location, a2);
				} else {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
							Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
				}
			}
			break;
		}

	}

	public static void update_cliente(cliente a2) {
		int location = -1;

		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
					Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			a2 = (cliente) funciones_users.create_users_dni(1);
			location = Funciones_find.find_nombre();
			if (location != -1) {
				a2 = singleton.usuariocliente.get(location);
				funciones_users.update_users_generics(a2);
				singleton.usuariocliente.set(location, a2);
			} else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
						Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_cliente_unico(cliente a2) {
		int location = -1;

		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
					Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			// a2 = (cliente) funciones_users.create_users_dni(1);
			location = Funciones_find.find_nombre();
			if (location != -1) {
				a2 = singleton.usuariocliente.get(location);
				funciones_users.update_users_generics(a2);
				singleton.usuariocliente.set(location, a2);
			} else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
						Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public static void update_normal(normal a3) {
		int location = -1;

		if (singleton.usuarionormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
					Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			a3 = (normal) funciones_users.create_users_dni(3);
			location = Funciones_find.find_normal(a3);
			if (location != -1) {
				a3 = singleton.usuarionormal.get(location);
				funciones_users.update_users_generics(a3);
				singleton.usuarionormal.set(location, a3);
			} else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"),
						Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
