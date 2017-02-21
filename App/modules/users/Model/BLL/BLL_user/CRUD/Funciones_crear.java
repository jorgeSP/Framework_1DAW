package App.modules.users.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.Funciones_find;



public class Funciones_crear {
//	public static admin crear_usuario_admin() {
//		int location = -1;
//		admin a1 = null;
//		a1 = (admin) funciones_users.create_users_dni(2);
//		location = Funciones_find.find_admin((admin) a1);
//		if (location != -1) {
//			JOptionPane.showMessageDialog(null,Settings.lenguaje.getProperty("usererror2"), " ",
//					JOptionPane.ERROR_MESSAGE);
//		} else {
//			a1 = (admin) funciones_users.create_users_genericos(2);
//			singleton.usuarioadmin.add((admin) a1);
//			JOptionPane.showMessageDialog(null,
//					Settings.lenguaje.getInstance().getProperty("usuario_creado"));
//		}
//		return a1;
//	}
//
//	public static cliente crear_usuario_cliente() {
//		cliente a2 = null;
//		int location = -1;
//		a2 = (cliente) funciones_users.create_users_dni(1);
//		location = Funciones_find.find_client((cliente) a2);
//		if (location != -1) {
//			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("usererror2"), "",
//					JOptionPane.ERROR_MESSAGE);
//		} else {
//			a2 = (cliente) funciones_users.create_users_genericos(1);
//			singleton.usuariocliente.add((cliente) a2);
//			JOptionPane.showMessageDialog(null,
//					Settings.lenguaje.getInstance().getProperty("usuario_creado"));
//		}
//		return a2;
//	}
//public static normal crear_usuario_normal() {
//		normal a3 = null;
//		int location = -1;
//		a3 = (normal) funciones_users.create_users_dni(3);
//		location = Funciones_find.find_normal((normal) a3);
//		if (location != -1) {
//			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("usererror2"), "",
//					JOptionPane.ERROR_MESSAGE);
//		} else {
//			a3 = (normal) funciones_users.create_users_genericos(3);
//			singleton.usuarionormal.add((normal) a3);
//			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("usuario_creado"));
//		}
//		return a3;
//	}
	public static normal crear_usuario_normal() {
		normal a2 = null;
		int location = -1;
		singleton.usuarionormal.clear();
		a2 = (normal) funciones_users.create_users_dni(3);
		location = Funciones_find.find_normal((normal) a2);
		if (location != -1) {
			JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("dni_existente"), "",//Settings.lenguaje.getProperty("usererror2")
					JOptionPane.ERROR_MESSAGE);
		} else {
			String dni=a2.getdni();
			a2 = (normal) funciones_users.create_users_genericos(3,dni);
			singleton.usuarionormal.add((normal) a2);
			JOptionPane.showMessageDialog(null,
					Settings.lenguaje.getInstance().getProperty("usuario_creado"));
		}
		return a2;
	}

	

}
