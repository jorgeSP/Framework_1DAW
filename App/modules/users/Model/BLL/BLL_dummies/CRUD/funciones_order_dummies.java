package App.modules.users.Model.BLL.BLL_dummies.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.modules.users.Model.Classes.singleton;
import App.modules.users.Model.Classes.order.*;
import App.utils.funciones;



public class funciones_order_dummies {

	public static void cambiar_order_admin() {
		String[] options = { "A " + Settings.lenguaje.getInstance().getProperty("dni"),
				"B " + Settings.lenguaje.getInstance().getProperty("usuario"), "C" + Settings.lenguaje.getInstance().getProperty("nombre"),
				"D " +Settings.lenguaje.getInstance().getProperty("apellidos"),
				"E " +Settings.lenguaje.getInstance().getProperty("fecha_nacimiento"),
				"F " + Settings.lenguaje.getInstance().getProperty("edad"),
				"H " + Settings.lenguaje.getInstance().getProperty("fecha_contratacion"),
				"I " + Settings.lenguaje.getInstance().getProperty("sueldo") };
		String menu = "";
		char order = ' ';

		if (singleton.usuarioadmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_ordenar_admin"), " ",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menucombo_box(options, Settings.lenguaje.getInstance().getProperty("ordenar_admin"), "");
			order = menu.charAt(0);
			switch (order) {
			case 'A':
				Collections.sort(singleton.usuarioadmin);
				break;
			case 'B':
				Collections.sort(singleton.usuarioadmin, new order_usuario_admin());
				break;
			case 'C':
				Collections.sort(singleton.usuarioadmin, new order_nombre());
				break;
			case 'D':
				Collections.sort(singleton.usuarioadmin, new order_apellidos());
				break;
			case 'E':
				Collections.sort(singleton.usuarioadmin, new order_fecha_nacimiento());
				break;
			case 'F':
				Collections.sort(singleton.usuarioadmin, new order_edad());
				break;
			case 'H':
				Collections.sort(singleton.usuarioadmin, new order_fecha_contratacion());
				break;
			case 'I':
				Collections.sort(singleton.usuarioadmin, new order_sueldo());
				break;
			}
		}
	}

	public static void cambiar_order_cliente() {
		String[] options = { "A " + Settings.lenguaje.getInstance().getProperty("dni"),
				"B " + Settings.lenguaje.getInstance().getProperty("usuario"), "C" + Settings.lenguaje.getInstance().getProperty("nombre"),
				"D " + Settings.lenguaje.getInstance().getProperty("apellidos"),
				"E " +Settings.lenguaje.getInstance().getProperty("fecha_nacimiento"),
				"F " + Settings.lenguaje.getInstance().getProperty("edad") };
		String menu = "";
		char order = ' ';
		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_ordenar_cliente"), " ",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menucombo_box(options, Settings.lenguaje.getInstance().getProperty("ordenar_cliente"), "");
			order = menu.charAt(0);
			switch (order) {
			case 'A':
				Collections.sort(singleton.usuariocliente);
				break;
			case 'B':
				Collections.sort(singleton.usuariocliente, new order_usuario_cliente());
				break;
			case 'C':
				Collections.sort(singleton.usuariocliente, new order_nombre());
				break;
			case 'D':
				Collections.sort(singleton.usuariocliente, new order_apellidos());
				break;
			case 'E':
				Collections.sort(singleton.usuariocliente, new order_fecha_nacimiento());
				break;
			case 'F':
				Collections.sort(singleton.usuariocliente, new order_edad());
				break;
			}
		}
	}

	public static void cambiar_order_normal() {
		String[] options = { "A " + Settings.lenguaje.getInstance().getProperty("dni"),
				"B " + Settings.lenguaje.getInstance().getProperty("nombre"), "C" +Settings.lenguaje.getInstance().getProperty("apellidos"),
				"D " + Settings.lenguaje.getInstance().getProperty("fecha_nacimiento"),
				"E " + Settings.lenguaje.getInstance().getProperty("edad") };
		String menu = "";
		char order = ' ';

		if (singleton.usuarionormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_ordenar_normal"), " ",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menucombo_box(options, Settings.lenguaje.getInstance().getProperty("ordenar_normal"), "");
			order = menu.charAt(0);
			switch (order) {
			case 'A':
				Collections.sort(singleton.usuarionormal);
				break;
			case 'B':
				Collections.sort(singleton.usuarionormal, new order_nombre());
				break;
			case 'C':
				Collections.sort(singleton.usuarionormal, new order_apellidos());
				break;
			case 'D':
				Collections.sort(singleton.usuarionormal, new order_fecha_nacimiento());
				break;
			case 'E':
				Collections.sort(singleton.usuarionormal, new order_edad());
				break;
			}
		}
	}
}
