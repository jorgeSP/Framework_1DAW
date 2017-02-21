package App.modules.users.Model.funciones;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.classes.singleton_login;
import App.modules.users.Model.Classes.*;
import App.utils.funciones;

public class Funciones_find {

	public static int find_admin(admin admin) {
		for (int i = 0; i <= (singleton.usuarioadmin.size() - 1); i++) {
			if ((singleton.usuarioadmin.get(i)).equals(admin))
				return i;
		}
		return -1;
	}

	public static int find_client(cliente cliente) {
		for (int i = 0; i <= (singleton.usuariocliente.size() - 1); i++) {
			if ((singleton.usuariocliente.get(i)).equals(cliente))
				return i;
		}
		return -1;
	}

	public static int find_normal(normal normal) {
		for (int i = 0; i <= (singleton.usuarionormal.size() - 1); i++) {
			if ((singleton.usuarionormal.get(i)).equals(normal))
				return i;
		}
		return -1;
	}

	public static int find_nombre() {
		switch (singleton_login.tipo_usuario) {
		case "cliente":
			for (int i = 0; i <= (singleton.usuariocliente.size() - 1); i++) {
				String resultado = singleton.usuariocliente.get(i).getusuario();
				if (singleton_login.nombre_usuario.equals(resultado))
					return i;
			}
			break;
		case "admin":
			for (int i = 0; i <= (singleton.usuarioadmin.size() - 1); i++) {
				String resultado = singleton.usuarioadmin.get(i).getusuario();
				if (singleton_login.nombre_usuario.equals(resultado))
					return i;
			}
			break;
		}
		return -1;
	}

	public static String[] generate_vector_admin() {
		admin a1 = null;
		String s = "";
		int arraylist = singleton.usuarioadmin.size();
		String[] user = new String[arraylist];
		for (int i = 0; i < arraylist; i++) {
			a1 = (admin) singleton.usuarioadmin.get(i);
			s = a1.getdni() + "-----" + a1.getnombre() + " " + a1.getapellidos();
			user[i] = s;
		}

		return user;
	}

	public static String[] generate_vector_client() {
		cliente a1 = null;
		String s = "";

		int arraylist = singleton.usuariocliente.size();
		String[] user = new String[arraylist];
		for (int i = 0; i < arraylist; i++) {
			a1 = (cliente) singleton.usuariocliente.get(i);
			s = a1.getdni() + "-----" + a1.getnombre() + " " + a1.getapellidos();
			user[i] = s;
		}

		return user;
	}

	public static String[] generate_vector_userregister() {
		normal a1 = null;
		String s = "";
		int arraylist = singleton.usuarionormal.size();
		String[] user = new String[arraylist];
		for (int i = 0; i < arraylist; i++) {
			a1 = (normal) singleton.usuarionormal.get(i);
			s = a1.getdni() + "-----" + a1.getnombre() + " " + a1.getapellidos();
			user[i] = s;
		}

		return user;
	}

	public static admin IDadmin() {
		admin a1 = null;
		String ID = "";
		boolean continuar = false;
		String[] admin = generate_vector_admin();
		String search = funciones.menucombo_box(admin, Settings.lenguaje.getProperty("seleciona_usuario"), "");
		do {
			if (search != "") {
				for (int i = 0; i < 9; i++) {
					ID += search.charAt(i);
				}
				a1 = new admin(ID);
				continuar = true;
			} else {
				continuar = false;
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"));
			}
		} while (continuar == false);
		return a1;
	}

	public static cliente IDclient() {
		cliente c1 = null;
		String ID = "";
		boolean continuar = false;
		String[] cliente = generate_vector_client();
		String search = funciones.menucombo_box(cliente, Settings.lenguaje.getProperty("seleciona_usuario"), "");
		do {
			if (search != "") {
				for (int i = 0; i < 9; i++) {
					ID += search.charAt(i);
				}
				c1 = new cliente(ID);
				continuar = true;
			} else {
				continuar = false;
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"));
			}
		} while (continuar == false);

		return c1;
	}

	public static normal IDuserregister() {
		normal u1 = null;
		String ID = "";
		boolean continuar = false;
		String[] normal = generate_vector_userregister();
		String search = funciones.menucombo_box(normal, Settings.lenguaje.getProperty("seleciona_usuario"), "");
		do {
			if (search != "") {
				for (int i = 0; i < 9; i++) {
					ID += search.charAt(i);
				}
				u1 = new normal(ID);
				continuar = true;
			} else {
				continuar = false;
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"));
			}
		} while (continuar == false);
		return u1;
	}

}
