package App.modules.users.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.Funciones_find;
import App.utils.funciones;

public class Funciones_leer_usuarios {
	public static void leer_admin(admin a1, cliente a2) {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getInstance().getProperty("ver_usuarios_admin"),
				Settings.lenguaje.getInstance().getProperty("buscar_admin_dni"),
				Settings.lenguaje.getInstance().getProperty("ver_usuarios_cliente"),
				Settings.lenguaje.getInstance().getProperty("buscar_cliente_dni") };
		if (singleton.usuarioadmin.isEmpty() && singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_leer_usuario"), "",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menubuttons(opciones, Settings.lenguaje.getInstance().getProperty("elije_opcion"), "");
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
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("no_usuarios"), " ",
							JOptionPane.ERROR_MESSAGE);
				} else {
					location = Funciones_find.find_admin(a1);
					if (location != -1) {
						a1 = singleton.usuarioadmin.get(location);
						JOptionPane.showMessageDialog(null, a1.toString());
					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("no_usuarios"),
								" ", JOptionPane.ERROR_MESSAGE);
					}
				}
				break;
			case 2:
				for (int i = 0; i < singleton.usuariocliente.size(); i++) {
					String cad = "";
					cad = cad + (singleton.usuariocliente.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 3:

				location = -1;
				a2 = Funciones_find.IDclient();
				if (a2 == null) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("no_usuarios"), "",
							JOptionPane.ERROR_MESSAGE);
				} else {
					location = Funciones_find.find_client(a2);
					if (location != -1) {
						a2 = singleton.usuariocliente.get(location);
						JOptionPane.showMessageDialog(null, a2.toString());
					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("no_usuarios"),
								" ", JOptionPane.ERROR_MESSAGE);
					}
				}
				break;

			}
		}
	}

	public static void leer_cliente(cliente a1) {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getInstance().getProperty("ver_usuarios_cliente"),
				Settings.lenguaje.getProperty("buscar_cliente_dni") };
		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_leer_usuario"),
					Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menubuttons(opciones, Settings.lenguaje.getInstance().getProperty("elije_opcion"),
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
					JOptionPane.showMessageDialog(null, "no hay usuarios", "", JOptionPane.ERROR_MESSAGE);
				} else {
					location = Funciones_find.find_client(a1);
					if (location != -1) {
						a1 = singleton.usuariocliente.get(location);
						JOptionPane.showMessageDialog(null, a1.toString());
					} else {
						JOptionPane.showMessageDialog(null, "error no hay usuarios", " ", JOptionPane.ERROR_MESSAGE);
					}
				}
				break;
			}
		}
	}

	public static void leer_cliente_unico(cliente a1) {
		int menu = 0, location = -1;

		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_leer_usuario"),
					Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		} else {
			location = -1;
			
			location = Funciones_find.find_nombre();
			if (location != -1) {
				a1 = singleton.usuariocliente.get(location);
				JOptionPane.showMessageDialog(null, a1.toString());
			} else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("no_usuarios"), " ",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}

	public static void leer_normal_unico() {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getInstance().getProperty("ver_usuarios_cliente"),
				Settings.lenguaje.getProperty("buscar_cliente_dni") };
		if (singleton.usuarionormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_leer_usuario"),
					Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		} else {
			location = 0;
			if (location != -1) {
				JOptionPane.showMessageDialog(null, singleton.usuarionormal.toArray());
			} else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("no_usuarios"), " ",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}

	public static void leer_normal(normal a1) {
		int menu = 0, location = -1;
		String opciones[] = { Settings.lenguaje.getInstance().getProperty("ver_usuarios_normal"),
				Settings.lenguaje.getInstance().getProperty("buscar_normal_dni") };
		if (singleton.usuarionormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_leer_usuario"), "",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menubuttons(opciones, Settings.lenguaje.getInstance().getProperty("elije_opcion"), "");
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
					JOptionPane.showMessageDialog(null, "no hay usuarios que mostrar", " ", JOptionPane.ERROR_MESSAGE);
				} else {
					location = Funciones_find.find_normal(a1);
					if (location != -1) {
						a1 = singleton.usuarionormal.get(location);
						JOptionPane.showMessageDialog(null, a1.toString());
					} else {
						JOptionPane.showMessageDialog(null, "error al leer los usuarios", " ",
								JOptionPane.ERROR_MESSAGE);
					}
				}

				break;
			}
		}
	}

}
