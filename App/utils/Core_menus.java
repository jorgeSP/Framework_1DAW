package App.utils;

public class Core_menus {
	public static String [] menu_principal(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "Usuario cliente", "Usuario admin", "Usuario normal", "Opciones", "Salir" };
		String opciones1[] = { "User client", "User admin", "User normal", "Options", "Exit" };
		String opciones2[] = { "utente cliente", "utente admin", "utente normale", "Opzioni", "Uscita" };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		return resultado;
	}
	public static String [] menu_opciones_usuario(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "crear", "leer datos", "Modificar datos", "Borrar", "volver", "Salir" };
		String opciones1[] = { "crear", "read", "update", "delete", "volver", "Exit" };
		String opciones2[] = { "creare", "leggere", "modificare", "Elimina", "Ritorno", "Uscita" };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		return resultado;
	}
	public static String [] menu_si_no(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "SI", "NO" };
		String opciones1[] = { "YES", "NO" };
		String opciones2[] = { "SE", "Non" };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		return resultado;
	}
	public static String [] menu_ajustes_cuenta(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "Formato Fecha", "Cambio Moneda", "Utilizar decimales", "Cambiar idioma", "volver" };
		String opciones1[] = { "Format date", "Change currency", "Use decimals", "change languaje", "Return" };
		String opciones2[] = { "Formato data", "Cambiare valuta", "Usate i decimali", "Cambia lingua", "Ritorno" };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		return resultado;
	}
	
	public static String [] menu_moneda(String lenguajes){
		String resultado[]= {};
		String[] moneda = { "Euros", "Dolares", "libras","Bitcoin"};
		String[] moneda1 = { "Euros", "Dollars", "pounds","Bitcoin"};
		String[] moneda2 = { "Euros", "Dollari", "sterline","Bitcoin"};
		switch(lenguajes) {
		case "es":
			resultado=moneda;
			break;
		case "en":
			resultado=moneda1;
			break;
		case "ita":
			resultado=moneda2;
			break;
		}
		return resultado;
	}
	public static String [] menu_fecha(){
		String [] opciones = { "dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
		return opciones;
	}
	public static String [] menu_decimales(){
		String [] opciones = {"1","2", "3","4","5"};
		return opciones;
	}
	public static String [] menu_update_admin(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "Nombre", "Apellidos", "Dni", "Direccion", "Sexo", "Fecha Nacimiento",
				"Fecha Contratacion", "Usuario", "Contraseña", "Email", "Pais", "Ciudad", "Cod Postal", "Movil",
				"Salir menu" };
		String opciones1[] = { "Name", "Surname", "Dni", "Address", "Sex", "Date birth",
				"Date recruitment", "Username", "Password", "Email", "Country", "City", "Zip code", "Phone",
				"Exit menu" };
		String opciones2[] = { "Nome", "Cognomi", "Dni", "Indirizzo", "Sesso", "Data nascita",
				"Data assunzione", "Utente", "Password", "Posta elettronica", "Paese", "Città", "Cod Postal", "Mobile",
				"Uscire dal menu" };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		
		return resultado;
	}
	public static String [] menu_update_normal(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "Nombre", "Apellidos", "Dni", "Direccion", "Sexo", "Comentarios", "Numero visitas",
				"Fecha nacimiento", };
		String opciones1[] = { "Name", "Surname", "Dni", "Address", "Sex", "Reviews", "Number visits",
				"Date birth", };
		String opciones2[] = { "Nome", "Cognomi", "Dni", "Indirizzo", "Sesso", "Recensioni", "Numero di visite",
				"Data nascita", };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		return resultado;
	}
	public static String [] menu_update_cliente(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "Nombre", "Apellidos", "Dni", "direccion", "Sexo", "Usuario", "Contraseña",
				"Compras", "Email", "Ciudad", "Cod Postal", "Fecha Nacimiento" };
		String opciones1[] = {  "Name", "Surname", "Dni", "Address", "Sex", "User", "Password",
				"Shopping", "Email", "Country", "Cod Postal", "Date birth" };
		String opciones2[] = { "Nome", "Cognomi", "Dni", "Indirizzo", "Sesso", "Utente", "Contraseña",
				"Lo shopping", "Posta elettronica", "Città", "Cod Postal", "Data nascita" };
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		
		return resultado;
	}
	public static String [] menu_lenguajes(String lenguajes){
		String resultado[]= {};
		String opciones[] = { "Español", "Ingles", "Italiano"};
		String opciones1[] = { "Spanish", "English", "Italian"};
		String opciones2[] = { "Spagnolo", "Inglese", "Italiani"};
		switch(lenguajes) {
		case "es":
			resultado=opciones;
			break;
		case "en":
			resultado=opciones1;
			break;
		case "ita":
			resultado=opciones2;
			break;
		}
		return resultado;
	}

}
