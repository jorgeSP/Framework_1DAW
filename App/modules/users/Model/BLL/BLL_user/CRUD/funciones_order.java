package App.modules.users.Model.BLL.BLL_user.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import App.classes.*;
import App.modules.users.Model.Classes.singleton;
import App.modules.users.Model.Classes.order.*;
import App.utils.funciones;


public class funciones_order {

	public static void cambiar_order_admin() {
		String[] options = { "A " + Settings.lenguaje.getProperty("dni"),
				"B " + Settings.lenguaje.getProperty("usuario"),
				"C " + Settings.lenguaje.getProperty("nombre"),
				"D " + Settings.lenguaje.getProperty("apellidos"),
				"E " + Settings.lenguaje.getProperty("fecha_nacimiento"),
				"F " + Settings.lenguaje.getProperty("edad"),
				"H " + Settings.lenguaje.getProperty("fecha_contratacion"),
				"I " + Settings.lenguaje.getProperty("sueldo") };
		String menu = "";
		char orden = ' ';

		if (singleton.usuarioadmin.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_ordenar_admin"), " ",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menucombo_box(options, Settings.lenguaje.getProperty("ordenar_admin"), "");
			orden = menu.charAt(0);
			switch (orden) {
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
	public static int menu_opciones_order_admin() {
		int menu;
		String opciones1[] = {Settings.lenguaje.getInstance().getProperty("order_admin"),Settings.lenguaje.getInstance().getProperty("order_cliente")};
		menu = funciones.menubuttons(opciones1, Settings.lenguaje.getInstance().getProperty("elije_operacion"),
				"opciones");
		switch(menu){
		case 0:
			funciones_order.cambiar_order_admin();
		break;
		case 1:
			funciones_order.cambiar_order_cliente();
			break;
		}
		
		return menu;
	}

	public static void cambiar_order_cliente() {
		String[] options = { "A " + Settings.lenguaje.getProperty("dni"),
				"B " + Settings.lenguaje.getProperty("usuario"),
				"C " + Settings.lenguaje.getProperty("nombre"),
				"D " + Settings.lenguaje.getProperty("apellidos"),
				"E " + Settings.lenguaje.getProperty("fecha_nacimiento"),
				"F " + Settings.lenguaje.getProperty("edad") };
		String menu = "";
		char orden = ' ';
		if (singleton.usuariocliente.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_ordenar_cliente"), " ",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menucombo_box(options, Settings.lenguaje.getProperty("ordenar_cliente"), "");
			orden = menu.charAt(0);
			switch (orden) {
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
		String[] options = { "A " + Settings.lenguaje.getProperty("dni"),
				"B " + Settings.lenguaje.getProperty("nombre"),
				"C " + Settings.lenguaje.getProperty("apellidos"),
				"D " + Settings.lenguaje.getProperty("fecha_nacimiento"),
				"E " + Settings.lenguaje.getProperty("edad") };
		String menu = "";
		char orden = ' ';

		if (singleton.usuarionormal.isEmpty()) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_ordenar_normal"), " ",
					JOptionPane.ERROR_MESSAGE);
		} else {
			menu = funciones.menucombo_box(options, Settings.lenguaje.getProperty("ordenar_normal"), "");
			orden = menu.charAt(0);
			switch (orden) {
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
