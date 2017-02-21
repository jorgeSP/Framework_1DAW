package App.utils;

public class Core_mensajes {
	// MENSAGES MAIN

	public static String elije_opcion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Choose an option";
			break;
		case "es":
			elije_opcion = "elije una opcion";
			break;
		case "ita":
			elije_opcion = "Scegli un'opzione";
			break;
		}
		return elije_opcion;
	}

	public static String elije_operacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "that operation you want to perform on the user";
			break;
		case "es":
			elije_opcion = "Que operacion deseas realizar sobre el usuario ";
			break;
		case "ita":
			elije_opcion = "tale operazione che si desidera eseguire sull'utente";
			break;
		}
		return elije_opcion;
	}

	public static String elije_operacion1(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "you want to perform any operation on the user again";
			break;
		case "es":
			elije_opcion = "Que operacion deseas realizar sobre el usuario ";
			break;
		case "ita":
			elije_opcion = "si desidera eseguire qualsiasi operazione sull'utente nuovo";
			break;
		}
		return elije_opcion;
	}

	public static String error_leer_usuario(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "to be able to read the user first must create it";
			break;
		case "es":
			elije_opcion = "para poder leer el usuario primero debe crearlo";
			break;
		case "ita":
			elije_opcion = "per essere in grado di leggere che l'utente deve prima crearlo";
			break;
		}
		return elije_opcion;
	}

	public static String nueva_operacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "you want to perform any operation on the user again";
			break;
		case "es":
			elije_opcion = "�desea realizar denuevo alguna operacion sobre el usuario?";
			break;
		case "ita":
			elije_opcion = "per essere in grado di leggere il manuale d'uso in primo luogo � necessario creare";
			break;
		}
		return elije_opcion;
	}

	public static String error_cambio_datos(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "in order to change the user data first you need to create it";
			break;
		case "es":
			elije_opcion = "para poder cambiar datos del usuario primero debe crearlo";
			break;
		case "ita":
			elije_opcion = "al fine di modificare i dati dell'utente � necessario crearlo";
			break;
		}
		return elije_opcion;
	}

	public static String error_borrar_datos(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "before deleting the user first you need to create it";
			break;
		case "es":
			elije_opcion = "para poder borrar el usuario primero debe crearlo";
			break;
		case "ita":
			elije_opcion = "prima di eliminare l'utente in primo luogo � necessario crearlo";
			break;
		}
		return elije_opcion;
	}

	public static String despedida(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Good bye";
			break;
		case "es":
			elije_opcion = "Adios";
			break;
		case "ita":
			elije_opcion = "Arrivederci";
			break;
		}
		return elije_opcion;
	}

	public static String operaciones_settings(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "that operation you want to perform";
			break;
		case "es":
			elije_opcion = "que operacion deseas realizar";
			break;
		case "ita":
			elije_opcion = "tale operazione che si desidera eseguire";
			break;
		}
		return elije_opcion;
	}
	
	public static String usuario_creado(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Created user";
			break;
		case "es":
			elije_opcion = "Usuario creado";
			break;
		case "ita":
			elije_opcion = "utente creato";
			break;
		}
		return elije_opcion;
	}

	public static String nueva_op_ajustes(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "�want to perform some operation more in settings?";
			break;
		case "es":
			elije_opcion = "�desea realizar alguna operacion mas en ajustes?";
			break;
		case "ita":
			elije_opcion = "�per eseguire un'operazione pi� impostazioni?";
			break;
		}
		return elije_opcion;
	}

	// MENSAGES FUNCIONES.JAVA
	public static String error_num_entero(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "You have not entered a whole number";
			break;
		case "es":
			elije_opcion = "No has introducido un numero entero";
			break;
		case "ita":
			elije_opcion = "Non � stato un numero intero";
			break;
		}
		return elije_opcion;
	}

	public static String error_num_nocero(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter a number other than zero for the splitter";
			break;
		case "es":
			elije_opcion = "Introduce un numero distinto de cero para el divisor";
			break;
		case "ita":
			elije_opcion = "Immettere un numero diverso da zero per la barra di divisione";
			break;
		}
		return elije_opcion;
	}

	public static String error_raro(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Error, the division between the zero is an indeterminacy";
			break;
		case "es":
			elije_opcion = "Error, la division entre cero es una indeterminacion";
			break;
		case "ita":
			elije_opcion = "Errore, la divisione tra zero � un'indeterminatezza";
			break;
		}
		return elije_opcion;
	}

	public static String salir_aplicacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Coming out of the application";
			break;
		case "es":
			elije_opcion = "Saliendo de la aplicacion";
			break;
		case "ita":
			elije_opcion = "Uscire dall'applicazione";
			break;
		}
		return elije_opcion;
	}

	public static String error_nonumero(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Not have introduced a number";
			break;
		case "es":
			elije_opcion = "No has introducido un numero";
			break;
		case "ita":
			elije_opcion = "Non � stato un numero";
			break;
		}
		return elije_opcion;
	}

	public static String error_noletra(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "You have not entered a letter";
			break;
		case "es":
			elije_opcion = "No has introducido una letra";
			break;
		case "ita":
			elije_opcion = "Non hai inserito una lettera";
			break;
		}
		return elije_opcion;
	}

	public static String error_datos(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Data entry error";
			break;
		case "es":
			elije_opcion = "Error de introduccion de datos";
			break;
		case "ita":
			elije_opcion = "Errore di introduzione dei dati";
			break;
		}
		return elije_opcion;
	}

	public static String error_nocadena(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Not have introduced a chain";
			break;
		case "es":
			elije_opcion = "No has introducido una cadena";
			break;
		case "ita":
			elije_opcion = "Non hanno introdotto una catena";
			break;
		}
		return elije_opcion;
	}

	// MENSAGES FUNCIONES_FECHA_USERS.JAVA

	public static String formato_fecha1(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter your date of birth \n format: XX/XX/XXXX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de nacimciento \n formato: XX/XX/XXXX";
			break;
		case "ita":
			elije_opcion = "Inserisci la tua data di nascita \n formato: XX/XX/XXXX";
			break;
		}
		return elije_opcion;
	}

	public static String error_formato_fecha1(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Must enter the date in format yy/MM/xxxx";
			break;
		case "es":
			elije_opcion = "Debe introducir la fecha en formato yy/MM/xxxx";
			break;
		case "ita":
			elije_opcion = "Necessario immettere la data nel formato yy/MM/xxxx";
			break;
		}
		return elije_opcion;
	}

	public static String error_fecha(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Incorrect date, should introduce a coherent date";
			break;
		case "es":
			elije_opcion = "Fecha incorrecta,debe introducir una fecha coherente";
			break;
		case "ita":
			elije_opcion = "Data sbagliata, dovrebbe introdurre una data coerenza";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_fecha_contratacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "the date of hiring not can be superior to the date current";
			break;
		case "es":
			elije_opcion = "La fecha de contratacion no puede ser superior a la fecha actual";
			break;
		case "ita":
			elije_opcion = "la data di assunzione non pu� essere superiore alla data corrente";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_contratacion_nacimiento(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "the date can not be rear than date of birth";
			break;
		case "es":
			elije_opcion = "la fecha de contratacion no puede ser posterior a la fecha de nacimiento";
			break;
		case "ita":
			elije_opcion = "la data di assunzione non pu� essere posteriore alla data corrente";
			break;
		}
		return elije_opcion;
	}
	
	public static String error1_contratacion_nacimiento(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Ho you do not have the age required to be engaged or is introducing a lower than the birth date";
			break;
		case "es":
			elije_opcion = "Ho usted no tiene la edad requerida para ser contratado o esta introduciendo una fecha inferior a la de nacimiento";
			break;
		case "ita":
			elije_opcion = "Ho non si ha l'et� necessaria per essere contratta o questo immettendo una data inferiore ad esso di nascita";
			break;
		}
		return elije_opcion;
	}
	
	public static String error2_contratacion_nacimiento(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "the date of hiring not can be equal to the date of birth";
			break;
		case "es":
			elije_opcion = "la fecha de contratacion no puede ser igual a la fecha de nacimiento";
			break;
		case "ita":
			elije_opcion = "la data di assunzione non pu� essere uguale alla data di nascita";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_comparador(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "For to change the date of birth to that fecha\n must change the date of recruitment because serious minor of age and not could be contracted";
			break;
		case "es":
			elije_opcion = "Para poder cambiar la fecha de nacimiento a esa fecha\n debe cambiar la fecha de contratacion porque seria menor de edad y no podria estar contratado";
			break;
		case "ita":
			elije_opcion = "Per modificare la data di nascita di questo fecha\n che � necessario modificare la data, perch� sarebbe minore e potrebbe essere contratta";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_contratacion_fechaactual(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "the date of hiring not can be superior to the date current";
			break;
		case "es":
			elije_opcion = "la fecha de contratacion no puede ser superior a la fecha actual";
			break;
		case "ita":
			elije_opcion = "la data di assunzione non pu� essere superiore alla data corrente";
			break;
		}
		return elije_opcion;
	}

	public static String menor_edad(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "you do not have the age required to register on the web";
			break;
		case "es":
			elije_opcion = "usted no tiene la edad requerida para poder registrarse en la web";
			break;
		case "ita":
			elije_opcion = "non avete l'et� richiesta per registrarsi � nel web";
			break;
		}
		return elije_opcion;
	}

	public static String formato_fecha2(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter your date of birth \n format: XX-XX-XXXX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de nacimciento \n formato: XX-XX-XXXX";
			break;
		case "ita":
			elije_opcion = "Inserisci la tua data di nascita \n formato: XX-XX-XXXX";
			break;
		}
		return elije_opcion;
	}

	public static String error_formato_fecha2(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Must enter the date in format yy-MM-xxxx";
			break;
		case "es":
			elije_opcion = "Debe introducir la fecha en formato yy-MM-xxxx";
			break;
		case "ita":
			elije_opcion = "Necessario immettere la data nel formato yy-MM-xxxx";
			break;
		}
		return elije_opcion;
	}

	public static String formato_fecha3(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter your date of birth \n format: XXXX/XX/XX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de nacimciento \n formato: XXXX/XX/XX";
			break;
		case "ita":
			elije_opcion = "Inserisci la tua data di nascita \n formato: XXXX/XX/XX";
			break;
		}
		return elije_opcion;
	}

	public static String formato_fecha4(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter your date of birth \n format: XXXX-XX-XX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de nacimciento \n formato: XXXX-XX-XX";
			break;
		case "ita":
			elije_opcion = "Inserisci la tua data di nascita \n formato: XXXX-XX-XX";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_formato_fecha3(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Must enter the date in format xxxx/yy/MM";
			break;
		case "es":
			elije_opcion = "Debe introducir la fecha en formato xxxx/yy/MM";
			break;
		case "ita":
			elije_opcion = "Necessario immettere la data nel formato xxxx/yy/MM";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_formato_fecha4(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Must enter the date in format xxxx-yy-MM";
			break;
		case "es":
			elije_opcion = "Debe introducir la fecha en formato xxxx-yy-MM";
			break;
		case "ita":
			elije_opcion = "Necessario immettere la data nel formato xxxx-yy-MM";
			break;
		}
		return elije_opcion;
	}
	
	public static String error_cambio_fnac(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "in order to change the birth date to that date \n you must change the date because it would be minor and could be contracted";
			break;
		case "es":
			elije_opcion = "para poder cambiar la fecha de nacimiento a esa fecha \n debe cambiar la fecha de contratacion porque seria menor de edad y no podria estar contratado";
			break;
		case "ita":
			elije_opcion = "per modificare la data di nascita a quella data \n necessario modificare la data di assunzione perch� gravi minore di et� e non poteva essere contratta";
			break;
		}
		return elije_opcion;
	}
	
	public static String formato1_fecha_contratacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the date of hiring \n Format XX/XX/XXXX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de contratacion \n Formato: XX/XX/XXXX";
			break;
		case "ita":
			elije_opcion = "Immettere la data di assunzione \n Formato XX/XX/XXXX";
			break;
		}
		return elije_opcion;
	}
	
	public static String formato2_fecha_contratacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the date of hiring \n Format XX-XX-XXXX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de contratacion \n Formato:  XX-XX-XXXX";
			break;
		case "ita":
			elije_opcion = "Immettere la data di assunzione \n Formato  XX-XX-XXXX";
			break;
		}
		return elije_opcion;
	}
	
	public static String formato3_fecha_contratacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the date of hiring \n Format XXXX/XX/XX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de contratacion \n Formato:  XXXX/XX/XX";
			break;
		case "ita":
			elije_opcion = "Immettere la data di assunzione \n Formato  XXXX/XX/XX";
			break;
		}
		return elije_opcion;
	}
	
	public static String formato4_fecha_contratacion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the date of hiring \n Format XXXX-XX-XX";
			break;
		case "es":
			elije_opcion = "Introduce tu fecha de contratacion \n Formato:  XXXX-XX-XX";
			break;
		case "ita":
			elije_opcion = "Immettere la data di assunzione \n Formato  XXXX-XX-XX";
			break;
		}
		return elije_opcion;
	}
	
	// MENSAGES FUNCIONES_DATOS_USER.JAVA

	public static String pregunta_edad(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Tell me your age";
			break;
		case "es":
			elije_opcion = "Dime tu edad";
			break;
		case "ita":
			elije_opcion = "Dimmi la tua et�";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_nombre(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter a name";
			break;
		case "es":
			elije_opcion = "Introduce un nombre";
			break;
		case "ita":
			elije_opcion = "Si prega di inserire un nome";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_dni(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter your ID, (12345678 M)";
			break;
		case "es":
			elije_opcion = "Introduce su dni, (12345678M)";
			break;
		case "ita":
			elije_opcion = "Inserisci il tuo ID (12345678 M)";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_apellidos(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter your last name";
			break;
		case "es":
			elije_opcion = "Introduce apellidos";
			break;
		case "ita":
			elije_opcion = "Inserisci il tuo cognome";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_direccion(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter an address";
			break;
		case "es":
			elije_opcion = "Introduce una direccion";
			break;
		case "ita":
			elije_opcion = "Si prega di inserire un indirizzo";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_sexo(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter your sex, (male / female)";
			break;
		case "es":
			elije_opcion = "Introduce tu sexo, (hombre/mujer)";
			break;
		case "ita":
			elije_opcion = "Inserisci il tuo sesso (maschio/femmina)";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_usuario(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter a user";
			break;
		case "es":
			elije_opcion = "Introduce un usuario";
			break;
		case "ita":
			elije_opcion = "Immettere un utente";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_contraseña(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter a password, minimum 8 digits 1 letter uppercase and 2 numbers";
			break;
		case "es":
			elije_opcion = "Introduce una contrase�a, minimo 8 digitos 1 letra mayuscula y 2 numeros";
			break;
		case "ita":
			elije_opcion = "Immettere una password, minimo 8 cifre 1 lettera maiuscola e 2 numeri";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_descuento(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the discount, (min 10 max 90)";
			break;
		case "es":
			elije_opcion = "Introduce el descuento, (min 10 max 90)";
			break;
		case "ita":
			elije_opcion = "Inserire lo sconto, (min. 10 max 90)";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_comentarios(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the number of comments";
			break;
		case "es":
			elije_opcion = "Introduce el numero de comentarios";
			break;
		case "ita":
			elije_opcion = "Immettere il numero di commenti";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_compras(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the number of purchases";
			break;
		case "es":
			elije_opcion = "Introduce el numero de compras realizadas";
			break;
		case "ita":
			elije_opcion = "Immettere il numero di acquisti effettuati";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_puntos(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter those points, (between 1000-9999)";
			break;
		case "es":
			elije_opcion = "Introduce los puntos, (entre 1000-9999)";
			break;
		case "ita":
			elije_opcion = "Inserire i punti (tra 1000-9999)";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_email(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter an email";
			break;
		case "es":
			elije_opcion = "Introduce un email";
			break;
		case "ita":
			elije_opcion = "Inserisci un indirizzo email";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_ciudad(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter a city";
			break;
		case "es":
			elije_opcion = "Introduce una ciudad";
			break;
		case "ita":
			elije_opcion = "Inserisci una citt�";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_codigo_postal(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the Code postal (5 numbers)";
			break;
		case "es":
			elije_opcion = "Introduce el codigo postal (5 numeros)";
			break;
		case "ita":
			elije_opcion = "Immettere il codice postale (5 numeri)";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_pais(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Please enter a country";
			break;
		case "es":
			elije_opcion = "Introduce un pais";
			break;
		case "ita":
			elije_opcion = "Si prega di inserire un paese";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_movil(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter your mobile phone (the phone must contain 9 digits)";
			break;
		case "es":
			elije_opcion = "Introduce un pais";
			break;
		case "ita":
			elije_opcion = "Inserisci il tuo cellulare (il cellulare deve contenere 9 cifre)";
			break;
		}
		return elije_opcion;
	}

	public static String pregunta_visitas(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Enter the number of visits";
			break;
		case "es":
			elije_opcion = "Introduce el numero de visitas";
			break;
		case "ita":
			elije_opcion = "Immettere il numero di visite";
			break;
		}
		return elije_opcion;
	}

	// MENSAGES FUNCIONES_USERS.JAVA
	
	public static String pregunta_formato_fecha(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Which format you want to change";
			break;
		case "es":
			elije_opcion = " A que formato deseas cambiar";
			break;
		case "ita":
			elije_opcion = "Quale formato si desidera modificare";
			break;
		}
		return elije_opcion;
	}
	
	public static String pregunta_formato_idioma(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = " That language want to change";
			break;
		case "es":
			elije_opcion = " A que idioma deseas cambiar";
			break;
		case "ita":
			elije_opcion = " Che lingua desidera modificare";
			break;
		}
		return elije_opcion;
	}
	
	public static String pregunta_moneda(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Currency you want to change";
			break;
		case "es":
			elije_opcion = " A que moneda desea cambiar";
			break;
		case "ita":
			elije_opcion = "Valuta che si desidera modificare";
			break;
		}
		return elije_opcion;
	}
	
	public static String pregunta_decimales(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "Many decimal places you want to?";
			break;
		case "es":
			elije_opcion = "Cuantos decimales desea?";
			break;
		case "ita":
			elije_opcion = "Quante cifre decimali che si desidera?";
			break;
		}
		return elije_opcion;
	}
	
	public static String pregunta_cambio_datos(String lenguajes) {
		String elije_opcion = "";
		switch (lenguajes) {
		case "en":
			elije_opcion = "That field would change?";
			break;
		case "es":
			elije_opcion = "Que campo deseas cambiar?";
			break;
		case "ita":
			elije_opcion = "Tale campo cambierebbe?";
			break;
		}
		return elije_opcion;
	}
	
	
}
/*
	
												
												
														
														
																
															
													
*/