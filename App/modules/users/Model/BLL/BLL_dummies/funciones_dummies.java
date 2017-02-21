package App.modules.users.Model.BLL.BLL_dummies;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.classes.fecha;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.Classes.*;
import App.utils.Core_mensajes;
import App.utils.funciones;



public class funciones_dummies {
	public static String defecto = "dd/mm/yyyy";
	public static char defecto_moneda = '€';
	public static int decimales_defecto = 1;

	public static String read_users_generics(users u) {
		// leer campos usuarios(admin,normal,cliente)
		String cad = "";
		if (u instanceof admin) {
			cad = ((admin) u).toString();
		}
		if (u instanceof normal) {
			cad = ((normal) u).toString();
		}
		if (u instanceof cliente) {
			cad = ((cliente) u).toString();
		}
		return cad;
	}
	//elimina todos los usuarios de la lista
	public static users delete_users_generics(users u) {

		u = null;
		return u;
	}
	public static void delete_users_generics_ad() {
		if(singleton.usuarioadmin.isEmpty()){
			JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
		singleton.usuarioadmin.clear();
		JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
		}
	}
	public static void delete_users_generics_nor() {
		if(singleton.usuarionormal.isEmpty()){
			JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
		singleton.usuarionormal.clear();
		JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
		}
	}
	public static void delete_users_generics_cli() {
		if(singleton.usuariocliente.isEmpty()){
			JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
		singleton.usuariocliente.clear();
		JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
		}
	}

	public static void menu_fecha() {
		String[] opciones = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		int menu = 0;
		menu = funciones.menubuttons(opciones, Core_mensajes.pregunta_formato_fecha(funciones_users.lenguajes), " ");
		switch (menu) {
		case 0:
			Settings.getInstance().setformato_fecha("dd/mm/yyyy");
		
			break;
		case 1:
			Settings.getInstance().setformato_fecha("dd-mm-yyyy");
		
			break;
		case 2:
			Settings.getInstance().setformato_fecha("yyyy/mm/dd");
		
			break;
		case 3:
			Settings.getInstance().setformato_fecha("yyyy-mm-dd");
			
			break;
		}
	}

	public static void menu_moneda() {
		int menu = 0;
		String[] opciones = { Settings.lenguaje.getProperty("euros"), Settings.lenguaje.getProperty("dolares"),
				Settings.lenguaje.getProperty("libras") };
		menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("pregunta_moneda"), " ");
		switch (menu) {
		case 0:
			Settings.getInstance().setmoneda('€');
		
			break;
		case 1:
			Settings.getInstance().setmoneda('$');
		
			break;
		case 2:
			Settings.getInstance().setmoneda('£');
		
			break;
		case 3:
			Settings.getInstance().setmoneda('Ƀ');
		
		}
	}

	public static void menu_lenguajes() {
		int menu = 0;
		String opciones[] = { Settings.lenguaje.getProperty("español"), Settings.lenguaje.getProperty("ingles"),
				Settings.lenguaje.getProperty("italiano") };
		menu = funciones.menubuttons(opciones, Core_mensajes.pregunta_formato_idioma(funciones_users.lenguajes), " ");
		switch (menu) {
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
	}

	public static void menu_decimales() {
		String[] opciones = { "1", "2", "3", "4", "5" };
		int menu = 0;
		menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("pregunta_decimales"), " ");
		switch (menu) {
		case 0:
			Settings.getInstance().setdecimales(1);
		
			break;
		case 1:
			Settings.getInstance().setdecimales(2);
		
			break;
		case 2:
			Settings.getInstance().setdecimales(3);
		
			break;
		case 3:
			Settings.getInstance().setdecimales(4);
		
			break;
		case 4:
			Settings.getInstance().setdecimales(5);
		
			break;
		}
	}

	public static users create_users_genericos(int i) {
		@SuppressWarnings("unused")
		char moneda =Settings.getInstance().getmoneda();
		users u = null;
		@SuppressWarnings("unused")
		String nombre = " ", apellidos = "", dni = "", direccion = "", sexe = "", usuario = "", contraseña = "",
				email = "", ciudad = "", codigo_postal = "", pais = "", movil = "", numero_visitas = "";
		@SuppressWarnings("unused")
		int compras, comentarios;
		@SuppressWarnings("unused")
		fecha fnac = null, fcont = null;
		// crear usuario cliente
		if (i == 1) {

//			nombre = "pepito";
//			apellidos = "lopez gañan";
//			dni = "21689442M";
//			direccion = "pare lluis fullana";
//			sexe = "hombre";
//			fnac = new fecha("10/10/1985", "dd/mm/yyyy");
//			usuario = "pepitogrillo";
//			contraseña = "paranguaricutirimicuaroAQA122";
//			compras = 25;
//			email = "pepitogrillo@gmail.com";
//			ciudad = "españa";
//			codigo_postal = "03830";
//
//			u = new cliente(nombre, apellidos, dni, direccion, sexe, fnac, usuario, contraseña, compras, email, ciudad,
//					codigo_postal);
			u=Make_dummies.makedummies_client();
		}
		// crear usuario admin
		if (i == 2) {
//			nombre = "eltontoderonaldo";
//			apellidos = "lopez carvajal";
//			dni = "21689442M";
//			direccion = "calle juan luis";
//			sexe = "mujer";
//			usuario = "ronaldotonton";
//			contraseña = "YsabesQuEloeres12";
//			email = "creoquesoydios@gmail.com";
//			pais = "portugal";
//			ciudad = "asaber";
//			codigo_postal = "03830";
//			movil = "123456789";
//			fnac = new fecha("10/10/1980", "dd/mm/yyyy");
//			fcont = new fecha("10/10/2008", "dd/mm/yyyy");
//			u = new admin(nombre, apellidos, dni, direccion, sexe, fnac, usuario, contraseña, email, pais, ciudad,
//					codigo_postal, movil, fcont, moneda);
			u=Make_dummies.makedummies_admin();
		}
		// crear usuario normal
		if (i == 3) {
//			nombre = "nombrenormal";
//			apellidos = "apellidos balderrama";
//			dni = "21489553D";
//			direccion = "direccion usuario nor";
//			sexe = "hombre";
//			fnac = new fecha("10/10/1983", "dd/mm/yyyy");
//			comentarios = 40;
//			numero_visitas = "25";
//			u = new normal(nombre, apellidos, dni, direccion, sexe, fnac, comentarios, numero_visitas);
			u=Make_dummies.makedummies_userregister();
		}
		return u;
	}

	public static users update_users_generics(users u) {
		String combo;
		String[] opciones = { Settings.lenguaje.getProperty("nombre"),
				Settings.lenguaje.getProperty("apellidos"), Settings.lenguaje.getProperty("dni"),
				Settings.lenguaje.getProperty("direccion"), Settings.lenguaje.getProperty("sexo"),
				Settings.lenguaje.getProperty("fecha_nacimiento"),
				Settings.lenguaje.getProperty("fecha_contratacion"), Settings.lenguaje.getProperty("usuario"),
				Settings.lenguaje.getProperty("contraseña"), Settings.lenguaje.getProperty("email"),
				Settings.lenguaje.getProperty("pais"), Settings.lenguaje.getProperty("ciudad"),
				Settings.lenguaje.getProperty("cod_Postal"), Settings.lenguaje.getProperty("movil"),
				Settings.lenguaje.getProperty("salir_menu") };
		String opciones1[] = { Settings.lenguaje.getProperty("nombre"),
				Settings.lenguaje.getProperty("apellidos"), Settings.lenguaje.getProperty("dni"),
				Settings.lenguaje.getProperty("direccion"), Settings.lenguaje.getProperty("sexo"),
				Settings.lenguaje.getProperty("comentarios"), Settings.lenguaje.getProperty("numero_visitas"),
				Settings.lenguaje.getProperty("fecha_nacimiento"), };
		String opciones2[] = { Settings.lenguaje.getProperty("nombre"),
				Settings.lenguaje.getProperty("apellidos"), Settings.lenguaje.getProperty("dni"),
				Settings.lenguaje.getProperty("direccion"), Settings.lenguaje.getProperty("sexo"),
				Settings.lenguaje.getProperty("usuario"), Settings.lenguaje.getProperty("contraseña"),
				Settings.lenguaje.getProperty("compras"), Settings.lenguaje.getProperty("email"),
				Settings.lenguaje.getProperty("ciudad"), Settings.lenguaje.getProperty("cod_Postal"),
				Settings.lenguaje.getProperty("fecha_nacimiento") };
		// cambiar datos usuario admin.
		if (u instanceof admin) {

			combo = funciones.menucombo_box(opciones, Settings.lenguaje.getProperty("pregunta_cambio_datos"), " ");

			if (combo == null) {
				System.exit(0);
			}
			switch (combo) {
			case "Nombre":
				u.setnombre("pepito");
				break;
			case "Name":
				u.setnombre("pepito");
				break;
			case "Nome":
				u.setnombre("pepito");
				break;
			case "Apellidos":
				u.setapellidos("apellido_dummies_admin");
				break;
			case "Surname":
				u.setapellidos("apellido_dummies_admin");
				break;
			case "Cognomi":
				u.setdni("apellido_dummies_admin");
				break;
			case "Direccion":
				u.setdireccion("direccion_dummies_admin");
				break;
			case "Adress":
				u.setdireccion("direccion_dummies_admin");
				break;
			case "Indirizzo":
				u.setdireccion("direccion_dummies_admin");
				break;
			case "Sexo":
				u.setsexe("sexo_dummies_main");
				break;
			case "Sex":
				u.setsexe("sexo_dummies_main");
				break;
			case "Sesso":
				u.setsexe("sexo_dummies_main");
				break;
			case "Fecha Nacimiento":
				fecha f_naixement = new fecha("10/10/1970");
				JOptionPane.showMessageDialog(null,
						"la fecha de nacimiento se ha cambiado a " + f_naixement.toString());
				break;
			case "Date Birth":
				fecha f_naixement1 = new fecha("10/10/1970");
				JOptionPane.showMessageDialog(null,
						"la fecha de nacimiento se ha cambiado a " + f_naixement1.toString());
				break;
			case "Data nascita":
				fecha f_naixement2 = new fecha("10/10/1970");
				JOptionPane.showMessageDialog(null,
						"la fecha de nacimiento se ha cambiado a " + f_naixement2.toString());
				break;
			case "Fecha Contratacion":
				fecha f_contratacio = new fecha("10/10/2000");
				JOptionPane.showMessageDialog(null,
						"la fecha de contratacion se ha cambiado a " + f_contratacio.toString());
				break;
			case "Data assunzione":
				fecha f_contratacio1 = new fecha("10/10/2000");
				JOptionPane.showMessageDialog(null,
						"la fecha de contratacion se ha cambiado a " + f_contratacio1.toString());
				break;
			case "Date Recruitmen":
				fecha f_contratacio2 = new fecha("10/10/2000");
				JOptionPane.showMessageDialog(null,
						"la fecha de contratacion se ha cambiado a " + f_contratacio2.toString());
				break;
			case "Usuario":
				((admin) u).setusuario("cambio_usuario_admin");
				JOptionPane.showMessageDialog(null,
						"El Nombre del usuario admin se ha cambiado ha " + ((admin) u).getusuario());
				break;
			case "Username":
				((admin) u).setusuario("cambio_usuario_admin");
				JOptionPane.showMessageDialog(null,
						"El Nombre del usuario admin se ha cambiado ha " + ((admin) u).getusuario());
				break;
			case "Utente":
				((admin) u).setusuario("cambio_usuario_admin");
				JOptionPane.showMessageDialog(null,
						"El Nombre del usuario admin se ha cambiado ha " + ((admin) u).getusuario());
				break;
			case "Contraseña":
				((admin) u).setcontraseña("cambio_contraseña_admin");
				JOptionPane.showMessageDialog(null,
						"La Contraseña del usuario admin se ha cambiado ha " + ((admin) u).getcontraseña());
				break;
			case "Password":
				((admin) u).setcontraseña("cambio_contraseña_admin");
				JOptionPane.showMessageDialog(null,
						"La Contraseña del usuario admin se ha cambiado ha " + ((admin) u).getcontraseña());
				break;
			case "Passwords":
				((admin) u).setcontraseña("cambio_contraseña_admin");
				JOptionPane.showMessageDialog(null,
						"La Contraseña del usuario admin se ha cambiado ha " + ((admin) u).getcontraseña());
				break;
			case "Email":
				((admin) u).setemail("cambio_email_admin");
				JOptionPane.showMessageDialog(null,
						"El Email del usuario admin se ha cambiado ha " + ((admin) u).getemail());
				break;
			case "Posta elettronica":
				((admin) u).setemail("cambio_email_admin");
				JOptionPane.showMessageDialog(null,
						"El Email del usuario admin se ha cambiado ha " + ((admin) u).getemail());
				break;
			case "Pais":
				((admin) u).setpais("cambio_pais_admin");
				break;
			case "Country":
				((admin) u).setpais("cambio_pais_admin");
				break;
			case "Paese":
				((admin) u).setpais("cambio_pais_admin");
				break;
			case "Ciudad":
				((admin) u).setciudad("cambio_ciudad_admin");
				break;
			case "City":
				((admin) u).setciudad("cambio_ciudad_admin");
				break;
			case "Citta":
				((admin) u).setciudad("cambio_ciudad_admin");
				break;
			case "Codigo postal":
				((admin) u).setcodigo_postal("cambio_cod_postal_admin");
				break;
			case "Cod postal":
				((admin) u).setcodigo_postal("cambio_cod_postal_admin");
				break;
			case "Zip Code":
				((admin) u).setcodigo_postal("cambio_cod_postal_admin");
				break;
			case "Movil":
				((admin) u).setmovil("cambio_movil_admin");
				break;
			case "Phone":
				((admin) u).setmovil("cambio_movil_admin");
				break;
			case "Mobile":
				((admin) u).setmovil("cambio_movil_admin");
				break;
			}
		}
		// cambiar datos usuario cliente.
		if (u instanceof cliente) {
			String combo1;

			combo1 = funciones.menucombo_box(opciones2, Settings.lenguaje.getProperty("pregunta_cambio_datos"),
					" ");
			if (combo1 == null) {
				System.exit(0);
			}
			switch (combo1) {
			case "Nombre":
				u.setnombre("nombre_cambiado");
				break;
			case "Name":
				u.setnombre("nombre_cambiado");
				break;
			case "Nome":
				u.setnombre("nombre_cambiado");
				break;
			case "Apellidos":
				u.setapellidos("apellido cambiado");
				break;
			case "Surname":
				u.setapellidos("apellido cambiado");
				break;
			case "Cognomi":
				u.setdni("apellido cambiado");
				break;
			case "Direccion":
				u.setdireccion("direccion cambiada");
				break;
			case "Adress":
				u.setdireccion("direccion cambiada");
				break;
			case "Indirizzo":
				u.setdireccion("direccion cambiada");
				break;
			case "Sexo":
				u.setsexe("sexo cambiado");
				break;
			case "Sex":
				u.setsexe("sexo cambiado");
				break;
			case "Sesso":
				u.setsexe("sexo cambiado");
				break;
			case "Usuario":
				((cliente) u).setusuario("usuario cambiado");

				break;
			case "Username":
				((cliente) u).setusuario("usuario cambiado");

				break;
			case "Utente":
				((cliente) u).setusuario("usuario cambiado");

				break;
			case "Contraseña":
				((cliente) u).setcontraseña("contraseña cambiada");

				break;
			case "Password":
				((cliente) u).setcontraseña("contraseña cambiada");

				break;
			case "Passwords":
				((cliente) u).setcontraseña("contraseña cambiada");

				break;
			case "Compras":
				((cliente) u).setcompras(0);
				break;
			case "Shopping":
				((cliente) u).setcompras(0);
				break;
			case "Lo shopping":
				((cliente) u).setcompras(0);
				break;
			case "Email":
				((cliente) u).setemail("email cambiado");
				break;
			case "Posta elettronica":
				((cliente) u).setemail("email cambiado");
				break;
			case "Ciudad":
				((cliente) u).setciudad("ciudad cambiada");
				break;
			case "City":
				((cliente) u).setciudad("ciudad cambiada");
				break;
			case "Citta":
				((cliente) u).setciudad("ciudad cambiada");
				break;
			case "Codigo postal":
				((cliente) u).setcodigo_postal("cod postal cambiado");
				break;
			case "Zip Code":
				((cliente) u).setcodigo_postal("cod postal cambiado");
				break;
			case "Cod postal":
				((cliente) u).setcodigo_postal("cod postal cambiado");
				break;
			case "Fecha Nacimiento":
				@SuppressWarnings("unused")
				fecha f_naixement2 = new fecha("10/10/1970");
				break;
			case "Date Birth":
				@SuppressWarnings("unused")
				fecha f_naixement3 = new fecha("10/10/1970");
				break;
			case "Data nascita":
				@SuppressWarnings("unused")
				fecha f_naixement4 = new fecha("10/10/1970");
				break;
			}
		}
		// cambiar datos usuario normal
		if (u instanceof normal) {
			String combo2;

			combo2 = funciones.menucombo_box(opciones1, Settings.lenguaje.getProperty("pregunta_cambio_datos"),
					" ");
			if (combo2 == null) {
				System.exit(0);
			}
			switch (combo2) {
			case "Nombre":
				u.setnombre("nombre_cambiado");
				break;
			case "Name":
				u.setnombre("nombre_cambiado");
				break;
			case "Nome":
				u.setnombre("nombre_cambiado");
				break;
			case "Apellidos":
				u.setapellidos("apellido cambiado");
				break;
			case "Surname":
				u.setapellidos("apellido cambiado");
				break;
			case "Cognomi":
				u.setdni("apellido cambiado");
				break;
			case "Direccion":
				u.setdireccion("direccion cambiada");
				break;
			case "Adress":
				u.setdireccion("direccion cambiada");
				break;
			case "Indirizzo":
				u.setdireccion("direccion cambiada");
				break;
			case "Sexo":
				u.setsexe("sexo cambiado");
				break;
			case "Sex":
				u.setsexe("sexo cambiado");
				break;
			case "Sesso":
				u.setsexe("sexo cambiado");
				break;
			case "Comentarios":
				((normal) u).setcomentarios(0);
				break;
			case "Reviews":
				((normal) u).setcomentarios(0);
				break;
			case "Recensioni":
				((normal) u).setcomentarios(0);
				break;
			case "Numero visitas":
				((normal) u).setnumero_visitas("1");
				break;

			case "Number Visits":
				((normal) u).setnumero_visitas("1");
				break;

			case "Numero di visite":
				((normal) u).setnumero_visitas("1");
				break;
			case "Fecha Nacimiento":
				@SuppressWarnings("unused")
				fecha f_naixement2 = new fecha("10/10/1970");
				break;
			case "Date Birth":
				@SuppressWarnings("unused")
				fecha f_naixement3 = new fecha("10/10/1970");
				break;
			case "Data nascita":
				@SuppressWarnings("unused")
				fecha f_naixement4 = new fecha("10/10/1970");
				break;
			}
		}
		return u;
	}
	
	public static users create_users_dni(int i) {
		users u = null;
		@SuppressWarnings("unused")
		char moneda = Settings.getInstance().getmoneda();
		// crear usuario cliente
		if (i == 1) {
		
			String dni = "21689442M";
			
			u = new cliente(dni);
		}
		// crear usuario admin
		if (i == 2) {
		
			String dni = "21689442M";
		
			u = new admin(dni);
		}
		// crear usuario normal
		if (i == 3) {
			// String edad = funciones_datos_users.pide_edad();
			
			String dni = "21689442M";
			
			u = new normal(dni);

		}
		return u;
	}
}
