package App.modules.users.Model.BLL.BLL_user;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.classes.fecha;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.funciones_datos_users;
import App.modules.users.Model.funciones.funciones_fecha_users;
import App.utils.funciones;

public class funciones_users {
	public static String defecto = "dd/mm/yyyy";
	public static char defecto_moneda = '€';
	public static int decimales_defecto = 1;
	public static String lenguajes = "es";

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

	public static users delete_users_generics(users u) {

		u = null;
		return u;
	}

	public static int menu_fecha() {
		int menu = 0;
		String[] opciones = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		menu = funciones.menubuttons(opciones, Settings.lenguaje.getInstance().getProperty("pregunta_formato_fecha"),
				" ");
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
		return menu;
	}

	public static void menu_archivos() {
		int menu = 0;
		String[] opciones = { "XML", "txt" };
		menu = funciones.menubuttons(opciones, Settings.lenguaje.getProperty("pregunta_ficheros"), " ");
		switch (menu) {
		case 0:
			Settings.getInstance().setficheros(0);
		
			break;
		case 1:
			Settings.getInstance().setficheros(2);
			
			break;
		}
	}

	public static void menu_moneda() {
		int menu = 0;
		String[] opciones = { Settings.lenguaje.getProperty("euros"), Settings.lenguaje.getProperty("dolares"),
				Settings.lenguaje.getProperty("libras"),"Bitcoin" };
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

	public static int menu_usuarios() {
		int menu;
		String opciones1[] = { Settings.lenguaje.getInstance().getProperty("crear"),
				Settings.lenguaje.getInstance().getProperty("leer_datos"),
				Settings.lenguaje.getInstance().getProperty("modificar_datos"),
				Settings.lenguaje.getInstance().getProperty("borrar"),
				Settings.lenguaje.getInstance().getProperty("orden"),Settings.lenguaje.getInstance().getProperty("abrir"),Settings.lenguaje.getInstance().getProperty("guardar"),
				Settings.lenguaje.getInstance().getProperty("volver"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(opciones1, Settings.lenguaje.getInstance().getProperty("elije_operacion"),
				"opciones");
		return menu;
	}

	public static int menu_general_usuarios() {
		int menu;
		String opciones[] = { Settings.lenguaje.getInstance().getProperty("usuario_cliente"),
				Settings.lenguaje.getInstance().getProperty("usuario_admin"),
				Settings.lenguaje.getInstance().getProperty("usuario_normal"),
				Settings.lenguaje.getInstance().getProperty("opciones"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(opciones, Settings.lenguaje.getInstance().getProperty("elije_opcion"), " ");
		return menu;
	}
	public static int menu_login() {
		int menu;
		String[] login = { Settings.lenguaje.getInstance().getProperty("login"),
				Settings.lenguaje.getInstance().getProperty("registrarse"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(login, Settings.lenguaje.getInstance().getProperty("elije_opcion"), " ");
		return menu;
	}
	String[] prueba_login = { Settings.lenguaje.getInstance().getProperty("login"),
			Settings.lenguaje.getInstance().getProperty("registrarse"),
			Settings.lenguaje.getInstance().getProperty("salir") };

	public static int menu_opciones() {
		int menu;
		String opciones1[] = { Settings.lenguaje.getInstance().getProperty("crear"),
				Settings.lenguaje.getInstance().getProperty("leer_datos"),
				Settings.lenguaje.getInstance().getProperty("modificar_datos"),
				Settings.lenguaje.getInstance().getProperty("borrar"),
				Settings.lenguaje.getInstance().getProperty("orden"),
				Settings.lenguaje.getInstance().getProperty("abrir"),
				Settings.lenguaje.getInstance().getProperty("guardar"),
				Settings.lenguaje.getInstance().getProperty("volver"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(opciones1, Settings.lenguaje.getInstance().getProperty("elije_operacion"),
				"opciones");
		return menu;
	}
	
	public static int menu_opciones_normal() {
		int menu;
		String opciones1[] = { Settings.lenguaje.getInstance().getProperty("crear"),
				Settings.lenguaje.getInstance().getProperty("leer_datos"),
				Settings.lenguaje.getInstance().getProperty("volver"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(opciones1, Settings.lenguaje.getInstance().getProperty("elije_operacion"),
				"opciones");
		return menu;
	}
	public static int menu_opciones_admin() {
		int menu;
		String opciones1[] = {
				Settings.lenguaje.getInstance().getProperty("leer_datos"),
				Settings.lenguaje.getInstance().getProperty("modificar_datos"),
				Settings.lenguaje.getInstance().getProperty("borrar"),
				Settings.lenguaje.getInstance().getProperty("orden"),
				Settings.lenguaje.getInstance().getProperty("abrir"),
				Settings.lenguaje.getInstance().getProperty("guardar"),
				Settings.lenguaje.getInstance().getProperty("volver"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(opciones1, Settings.lenguaje.getInstance().getProperty("elije_operacion"),
				"opciones");
		return menu;
	}
	
	public static int menu_opciones_cliente() {
		int menu;
		String opciones1[] = {
				Settings.lenguaje.getInstance().getProperty("leer_datos"),
				Settings.lenguaje.getInstance().getProperty("modificar_datos"),
				Settings.lenguaje.getInstance().getProperty("borrar"),
				Settings.lenguaje.getInstance().getProperty("abrir"),
				Settings.lenguaje.getInstance().getProperty("guardar"),
				Settings.lenguaje.getInstance().getProperty("volver"),
				Settings.lenguaje.getInstance().getProperty("salir") };
		menu = funciones.menubuttons(opciones1, Settings.lenguaje.getInstance().getProperty("elije_operacion"),
				"opciones");
		return menu;
	}

	public static int menu_opciones_settings() {
		int menu;
		String opciones2[] = { Settings.lenguaje.getInstance().getProperty("formato_fecha"),
				Settings.lenguaje.getInstance().getProperty("cambio_moneda"),
				Settings.lenguaje.getInstance().getProperty("utilizar_decimales"),
				Settings.lenguaje.getInstance().getProperty("cambiar_idioma"), "Dummies",
				Settings.lenguaje.getInstance().getProperty("elije_fich"),
				Settings.lenguaje.getInstance().getProperty("tema"),
				Settings.lenguaje.getInstance().getProperty("volver") };
		menu = funciones.menubuttons(opciones2, Settings.lenguaje.getInstance().getProperty("elije_opcion"),
				"opciones");
		return menu;
	}

	public static void menu_lenguajes() {
		String opciones[] = { Settings.lenguaje.getProperty("español"), Settings.lenguaje.getProperty("ingles"),
				Settings.lenguaje.getProperty("italiano") };
		int menu_leng = funciones.menubuttons(opciones, Settings.lenguaje.getInstance().getProperty("elije_un_idioma"),
				" ");
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
	}

	public static void Tema() {
		String[] options = { "METAL", "GTK", "MOTIF", "NINBUS", "WINDOWS95", "WINDOWS" };
		int menu = 0;

		menu = funciones.menubuttons(options, Settings.lenguaje.getProperty("elije_tema"), " ");
		switch (menu) {
		case 0:// Metal - Predeterminado JAVA
			Settings.getInstance().setTema("METAL");
		
			break;

		case 1:// GTK
			Settings.getInstance().setTema("GTK");
		
			break;

		case 2:// Motif
			Settings.getInstance().setTema("MOTIF");
	
			break;

		case 3:// Nimbus - JAVA
			Settings.getInstance().setTema("NINBUS");
		
			break;

		case 4:// WINDOWS 95
			Settings.getInstance().setTema("WINDOWS95");
		
			break;

		case 5:// WINDOWS
			Settings.getInstance().setTema("WINDOWS");
			
			break;
		}
	}

	public static users create_users_genericos(int i,String dni1) {
		users u = null;
		char moneda = Settings.getInstance().getmoneda();
		// crear usuario cliente
		if (i == 1) {
			String nombre = funciones_datos_users.pide_nombre();
			String apellidos = funciones_datos_users.pide_apellidos();
			String dni = dni1; //funciones_datos_users.pide_dni();
			String direccion = funciones_datos_users.pide_direccion();
			String sexe = funciones_datos_users.pide_sexe();
			fecha fnac = funciones_fecha_users.pidefecha_nacimiento();
			String usuario = funciones_datos_users.pide_usuario();
			String contraseña = funciones_datos_users.pide_contraseña();
			int compras = funciones_datos_users.pide_compras();
			String email = funciones_datos_users.pide_mail();
			String ciudad = funciones_datos_users.pide_ciudad();
			String codigo_postal = funciones_datos_users.pide_codigpostal();

			u = new cliente(nombre, apellidos, dni, direccion, sexe, fnac, usuario, contraseña, compras, email, ciudad,
					codigo_postal);
		}
		// crear usuario admin
		if (i == 2) {
			String nombre = funciones_datos_users.pide_nombre();
			String apellidos = funciones_datos_users.pide_apellidos();
			String dni = dni1;//funciones_datos_users.pide_dni();
			String direccion = funciones_datos_users.pide_direccion();
			String sexe = funciones_datos_users.pide_sexe();
			String usuario = funciones_datos_users.pide_usuario();
			String contraseña = funciones_datos_users.pide_contraseña();
			String email = funciones_datos_users.pide_mail();
			String pais = funciones_datos_users.pide_pais();
			String ciudad = funciones_datos_users.pide_ciudad();
			String codigo_postal = funciones_datos_users.pide_codigpostal();
			String movil = funciones_datos_users.pide_movil();
			fecha fnac = funciones_fecha_users.pidefecha_nacimiento();
			fecha fcont = funciones_fecha_users.pidefecha_contratacion(fnac);
			u = new admin(nombre, apellidos, dni, direccion, sexe, fnac, usuario, contraseña, email, pais, ciudad,
					codigo_postal, movil, fcont, moneda);
		}
		// crear usuario normal
		if (i == 3) {
			String nombre = funciones_datos_users.pide_nombre();
			String apellidos = funciones_datos_users.pide_apellidos();
			String dni = dni1;//funciones_datos_users.pide_dni();
			String direccion = funciones_datos_users.pide_direccion();
			String sexe = funciones_datos_users.pide_sexe();
			fecha fnac = funciones_fecha_users.pidefecha_nacimiento();
			int comentarios = funciones_datos_users.pide_comentarios();
			String numero_visitas = funciones_datos_users.pide_numerovisitas();
			u = new normal(nombre, apellidos, dni, direccion, sexe, fnac, comentarios, numero_visitas);

		}
		return u;
	}

	public static users update_users_generics(users u) {
		String combo;
		String[] opciones = { Settings.lenguaje.getProperty("nombre"), Settings.lenguaje.getProperty("apellidos"),
				Settings.lenguaje.getProperty("dni"), Settings.lenguaje.getProperty("direccion"),
				Settings.lenguaje.getProperty("sexo"), Settings.lenguaje.getProperty("fecha_nacimiento"),
				Settings.lenguaje.getProperty("fecha_contratacion"), Settings.lenguaje.getProperty("usuario"),
				Settings.lenguaje.getProperty("contraseña"), Settings.lenguaje.getProperty("email"),
				Settings.lenguaje.getProperty("pais"), Settings.lenguaje.getProperty("ciudad"),
				 Settings.lenguaje.getProperty("movil"),
				Settings.lenguaje.getProperty("salir_menu") };
		String[] opciones1 = { Settings.lenguaje.getProperty("nombre"), Settings.lenguaje.getProperty("apellidos"),
				Settings.lenguaje.getProperty("dni"), Settings.lenguaje.getProperty("direccion"),
				Settings.lenguaje.getProperty("sexo"), Settings.lenguaje.getProperty("comentarios"),
				Settings.lenguaje.getProperty("numero_visitas"), Settings.lenguaje.getProperty("fecha_nacimiento"), };
		String[] opciones2 = { Settings.lenguaje.getProperty("nombre"), Settings.lenguaje.getProperty("apellidos"),
				Settings.lenguaje.getProperty("dni"), Settings.lenguaje.getProperty("direccion"),
				Settings.lenguaje.getProperty("sexo"), Settings.lenguaje.getProperty("usuario"),
				Settings.lenguaje.getProperty("contraseña"), Settings.lenguaje.getProperty("compras"),
				Settings.lenguaje.getProperty("email"), Settings.lenguaje.getProperty("ciudad"),
				 Settings.lenguaje.getProperty("fecha_nacimiento") };
		// cambiar datos usuario admin.
		if (u instanceof admin) {

			combo = funciones.menucombo_box(opciones, Settings.lenguaje.getProperty("pregunta_cambio_datos"), " ");
			if (combo == null) {
				System.exit(0);
			}
			switch (combo) {
			case "Nombre":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Name":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Nome":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Apellidos":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "Surname":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "Cognomi":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "dni":
				u.setdni(funciones_datos_users.pide_dni_update_admin());
				break;
			case "Direccion":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Adress":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Indirizzo":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Sexo":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Sex":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Sesso":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Fecha Nacimiento":
				fecha f_naixement = funciones_datos_users.cambia_fecha_nacimiento((admin) u);
				JOptionPane.showMessageDialog(null,
						"la fecha de nacimiento se ha cambiado a " + f_naixement.toString());
				break;
			case "Date Birth":
				fecha f_naixement1 = funciones_datos_users.cambia_fecha_nacimiento((admin) u);
				JOptionPane.showMessageDialog(null,
						"la fecha de nacimiento se ha cambiado a " + f_naixement1.toString());
				break;
			case "Data nascita":
				fecha f_naixement2 = funciones_datos_users.cambia_fecha_nacimiento((admin) u);
				JOptionPane.showMessageDialog(null,
						"la fecha de nacimiento se ha cambiado a " + f_naixement2.toString());
				break;
			case "Fecha Contratacion":
				fecha f_contratacio = funciones_datos_users.cambia_fecha_contratacion((admin) u);
				JOptionPane.showMessageDialog(null,
						"la fecha de contratacion se ha cambiado a " + f_contratacio.toString());
				break;
			case "Data assunzione":
				fecha f_contratacio1 = funciones_datos_users.cambia_fecha_contratacion((admin) u);
				JOptionPane.showMessageDialog(null,
						"la fecha de contratacion se ha cambiado a " + f_contratacio1.toString());
				break;
			case "Date Recruitmen":
				fecha f_contratacio2 = funciones_datos_users.cambia_fecha_contratacion((admin) u);
				JOptionPane.showMessageDialog(null,
						"la fecha de contratacion se ha cambiado a " + f_contratacio2.toString());
				break;
			case "Usuario":
				((admin) u).setusuario(funciones_datos_users.pide_usuario());
				JOptionPane.showMessageDialog(null,
						"El Nombre del usuario admin se ha cambiado ha " + ((admin) u).getusuario());
				break;
			case "Username":
				((admin) u).setusuario(funciones_datos_users.pide_usuario());
				JOptionPane.showMessageDialog(null,
						"El Nombre del usuario admin se ha cambiado ha " + ((admin) u).getusuario());
				break;
			case "Utente":
				((admin) u).setusuario(funciones_datos_users.pide_usuario());
				JOptionPane.showMessageDialog(null,
						"El Nombre del usuario admin se ha cambiado ha " + ((admin) u).getusuario());
				break;
			case "Contraseña":
				((admin) u).setcontraseña(funciones_datos_users.pide_contraseña());
				JOptionPane.showMessageDialog(null,
						"La Contraseña del usuario admin se ha cambiado ha " + ((admin) u).getcontraseña());
				break;
			case "Password":
				((admin) u).setcontraseña(funciones_datos_users.pide_contraseña());
				JOptionPane.showMessageDialog(null,
						"La Contraseña del usuario admin se ha cambiado ha " + ((admin) u).getcontraseña());
				break;
			case "Passwords":
				((admin) u).setcontraseña(funciones_datos_users.pide_contraseña());
				JOptionPane.showMessageDialog(null,
						"La Contraseña del usuario admin se ha cambiado ha " + ((admin) u).getcontraseña());
				break;
			case "Email":
				((admin) u).setemail(funciones_datos_users.pide_mail());
				JOptionPane.showMessageDialog(null,
						"El Email del usuario admin se ha cambiado ha " + ((admin) u).getemail());
				break;
			case "Posta elettronica":
				((admin) u).setemail(funciones_datos_users.pide_mail());
				JOptionPane.showMessageDialog(null,
						"El Email del usuario admin se ha cambiado ha " + ((admin) u).getemail());
				break;
			case "Pais":
				((admin) u).setpais(funciones_datos_users.pide_pais());
				break;
			case "Country":
				((admin) u).setpais(funciones_datos_users.pide_pais());
				break;
			case "Paese":
				((admin) u).setpais(funciones_datos_users.pide_pais());
				break;
			case "Ciudad":
				((admin) u).setciudad(funciones_datos_users.pide_ciudad());
				break;
			case "City":
				((admin) u).setciudad(funciones_datos_users.pide_ciudad());
				break;
			case "Citta":
				((admin) u).setciudad(funciones_datos_users.pide_ciudad());
				break;
			case "Codigo postal":
				((admin) u).setcodigo_postal(funciones_datos_users.pide_codigpostal());
				break;
			case "Cod postal":
				((admin) u).setcodigo_postal(funciones_datos_users.pide_codigpostal());
				break;
			case "Zip Code":
				((admin) u).setcodigo_postal(funciones_datos_users.pide_codigpostal());
				break;
			case "Movil":
				((admin) u).setmovil(funciones_datos_users.pide_movil());
				break;
			case "Phone":
				((admin) u).setmovil(funciones_datos_users.pide_movil());
				break;
			case "Mobile":
				((admin) u).setmovil(funciones_datos_users.pide_movil());
				break;
			}
		}
		// cambiar datos usuario cliente.
		if (u instanceof cliente) {
			String combo1;
			combo1 = funciones.menucombo_box(opciones2, Settings.lenguaje.getProperty("pregunta_cambio_datos"), " ");
			if (combo1 == null) {
				System.exit(0);
			}
			switch (combo1) {
			case "Nombre":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Name":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Nome":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Apellidos":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "Surname":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "Cognomi":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "dni":
				u.setdni(funciones_datos_users.pide_dni_update_cliente());
				break;
			case "Direccion":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Adress":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Indirizzo":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Sexo":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Sex":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Sesso":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Usuario":
				((cliente) u).setusuario(funciones_datos_users.pide_usuario());

				break;
			case "Username":
				((cliente) u).setusuario(funciones_datos_users.pide_usuario());

				break;
			case "Utente":
				((cliente) u).setusuario(funciones_datos_users.pide_usuario());

				break;
			case "Contraseña":
				((cliente) u).setcontraseña(funciones_datos_users.pide_contraseña());

				break;
			case "Password":
				((cliente) u).setcontraseña(funciones_datos_users.pide_contraseña());

				break;
			case "Passwords":
				((cliente) u).setcontraseña(funciones_datos_users.pide_contraseña());

				break;
			case "Compras":
				((cliente) u).setcompras(funciones_datos_users.pide_compras());
				break;
			case "Shopping":
				((cliente) u).setcompras(funciones_datos_users.pide_compras());
				break;
			case "Lo shopping":
				((cliente) u).setcompras(funciones_datos_users.pide_compras());
				break;
			case "Email":
				((cliente) u).setemail(funciones_datos_users.pide_mail());
				break;
			case "Posta elettronica":
				((cliente) u).setemail(funciones_datos_users.pide_mail());
				break;
			case "Ciudad":
				((cliente) u).setciudad(funciones_datos_users.pide_ciudad());
				break;
			case "City":
				((cliente) u).setciudad(funciones_datos_users.pide_ciudad());
				break;
			case "Citta":
				((cliente) u).setciudad(funciones_datos_users.pide_ciudad());
				break;
			case "Codigo postal":
				((cliente) u).setcodigo_postal(funciones_datos_users.pide_codigpostal());
				break;
			case "Zip Code":
				((cliente) u).setcodigo_postal(funciones_datos_users.pide_codigpostal());
				break;
			case "Cod postal":
				((cliente) u).setcodigo_postal(funciones_datos_users.pide_codigpostal());
				break;
			case "Fecha Nacimiento":
				((cliente) u).setfnac(funciones_fecha_users.pidefecha_nacimiento());
				break;
			case "Date Birth":
				((cliente) u).setfnac(funciones_fecha_users.pidefecha_nacimiento());
				break;
			case "Data nascita":
				((cliente) u).setfnac(funciones_fecha_users.pidefecha_nacimiento());
				break;
			}
		}
		// cambiar datos usuario normal
		if (u instanceof normal) {
			String combo2;
			combo2 = funciones.menucombo_box(opciones1, Settings.lenguaje.getProperty("pregunta_cambio_datos"), " ");
			if (combo2 == null) {
				System.exit(0);
			}
			switch (combo2) {
			case "Nombre":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Name":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Nome":
				u.setnombre(funciones_datos_users.pide_nombre());
				break;
			case "Apellidos":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "Surname":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "Cognomi":
				u.setapellidos(funciones_datos_users.pide_apellidos());
				break;
			case "dni":
				u.setdni(funciones_datos_users.pide_dni_update_normal());
				break;
			case "Direccion":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Adress":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Indirizzo":
				u.setdireccion(funciones_datos_users.pide_direccion());
				break;
			case "Sexo":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Sex":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Sesso":
				u.setsexe(funciones_datos_users.pide_sexe());
				break;
			case "Comentarios":
				((normal) u).setcomentarios(funciones_datos_users.pide_comentarios());
				break;
			case "Reviews":
				((normal) u).setcomentarios(funciones_datos_users.pide_comentarios());
				break;
			case "Recensioni":
				((normal) u).setcomentarios(funciones_datos_users.pide_comentarios());
				break;
			case "Numero visitas":
				((normal) u).setnumero_visitas(funciones_datos_users.pide_numerovisitas());
				break;

			case "Number Visits":
				((normal) u).setnumero_visitas(funciones_datos_users.pide_numerovisitas());
				break;

			case "Numero di visite":
				((normal) u).setnumero_visitas(funciones_datos_users.pide_numerovisitas());
				break;
			case "Fecha Nacimiento":
				fecha f_naixement = null;
				f_naixement = funciones_fecha_users.pidefecha_nacimiento();
				((normal) u).setfnac(f_naixement);
				break;
			case "Date Birth":
				@SuppressWarnings("unused")
				fecha f_naixement1 = null;
				f_naixement = funciones_fecha_users.pidefecha_nacimiento();
				((normal) u).setfnac(f_naixement);
				break;
			case "Data nascita":
				@SuppressWarnings("unused")
				fecha f_naixement2 = null;
				f_naixement = funciones_fecha_users.pidefecha_nacimiento();
				((normal) u).setfnac(f_naixement);
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

			String dni = funciones_datos_users.pide_dni();

			u = new cliente(dni);
		}
		// crear usuario admin
		if (i == 2) {

			String dni = funciones_datos_users.pide_dni();

			u = new admin(dni);
		}
		// crear usuario normal
		if (i == 3) {

			String dni = funciones_datos_users.pide_dni();

			u = new normal(dni);

		}
		return u;
	}

}