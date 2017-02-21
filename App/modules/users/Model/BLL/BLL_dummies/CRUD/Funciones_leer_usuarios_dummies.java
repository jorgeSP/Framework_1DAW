package App.modules.users.Model.BLL.BLL_dummies.CRUD;

import javax.swing.JOptionPane;
import App.classes.*;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.Funciones_find;
import App.utils.funciones;


public class Funciones_leer_usuarios_dummies {
	public static void leer_admin(admin a1) {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getProperty("ver_usuarios_admin"),
				Settings.lenguaje.getProperty("buscar_admin_dni") };
		if (singleton.usuarioadmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_leer_usuario"), "",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("elije_opcion"), "");
			switch (menu) {
			case 0:
				for (int i = 0; i < singleton.usuarioadmin.size(); i++) {
					String cad = "";
					cad = cad + (singleton.usuarioadmin.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location = -1;
				a1 = Funciones_find.IDadmin();
				if (a1 == null) {
					JOptionPane.showMessageDialog(null,"no hay usuarios"," ", JOptionPane.ERROR_MESSAGE);
				}else{
					location = Funciones_find.find_admin(a1);
					if (location != -1) {
						a1 = singleton.usuarioadmin.get(location);
						JOptionPane.showMessageDialog(null, a1.toString());
					}else {
						JOptionPane.showMessageDialog(null,"error al leer los usuarios"," ", JOptionPane.ERROR_MESSAGE);
					}
				}
				
				
				
				
				
//				location = -1;
//				a1 = (admin) funciones_dummies.create_users_dni(2);
//				location = funciones_find_dummies.find_admin(a1);
//				if (location != -1) {
//					a1 = singleton.usuarioadmin.get(location);
//					JOptionPane.showMessageDialog(null, a1.toString());
//				} else {
//					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_leer_usuario"), "",
//							JOptionPane.ERROR_MESSAGE);
//				}
				break;
			}
		}
	}

	public static void leer_cliente(cliente a1) {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getProperty("ver_usuarios_cliente"),
				Settings.lenguaje.getProperty("buscar_cliente_dni") };
		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_leer_usuario"),
					"", JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("elije_opcion"),
					Settings.lenguaje.getProperty("asktitle"));
			switch (menu) {
			case 0:
				for (int i = 0; i < singleton.usuariocliente.size(); i++) {
					String cad = "";
					cad = cad + (singleton.usuariocliente.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location = -1;
				a1 = Funciones_find.IDclient();
				if (a1 == null) {
					JOptionPane.showMessageDialog(null,"no hay usuarios"," ", JOptionPane.ERROR_MESSAGE);
				}else{
					location = Funciones_find.find_client(a1);
					if (location != -1) {
						a1 = singleton.usuariocliente.get(location);
						JOptionPane.showMessageDialog(null, a1.toString());
					}else {
						JOptionPane.showMessageDialog(null,"error al leer los usuarios"," ", JOptionPane.ERROR_MESSAGE);
					}
				}
				break;
			}
		}
	}

	public static void leer_normal(normal a1) {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getProperty("ver_usuarios_normal"),
				Settings.lenguaje.getProperty("buscar_normal_dni") };
		if (singleton.usuarionormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_leer_usuario"), "",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("elije_opcion"), "");
			switch (menu) {
			case 0:
				for (int i = 0; i < singleton.usuarionormal.size(); i++) {
					String cad = "";
					cad = cad + (singleton.usuarionormal.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location = -1;
				a1 = Funciones_find.IDuserregister();
				if (a1 == null) {
					JOptionPane.showMessageDialog(null,"no hay usuarios"," ", JOptionPane.ERROR_MESSAGE);
				}else{
					location = Funciones_find.find_normal(a1);
					if (location != -1) {
						a1 = singleton.usuarionormal.get(location);
						JOptionPane.showMessageDialog(null, a1.toString());
					}else {
						JOptionPane.showMessageDialog(null,"error al leer los usuarios"," ", JOptionPane.ERROR_MESSAGE);
					}
				}
				break;
			}
		}
	}

}
