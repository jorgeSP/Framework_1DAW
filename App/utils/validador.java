package App.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import App.classes.Settings;
import App.utils.funciones;

public class validador {
	// expresiones regulares
	private static final String plantilla_nombre = "^[a-zA-Z//s]*$";
	private static final String plantilla_edad = "^[0-9]{1,2}$";
	private static final String plantilla_direccion = "^[a-zA-Z0-9-\\s]*$";
	private static final String plantilla_apellidos = "^[a-zA-Z\\s]*$";
	private static final String plantilla_sexe = "^(hombre|mujer)*$";
	private static final String plantilla_usuario = "^[a-z]{4,15}$";
	private static final String plantilla_contraseña = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{8,})$";
	private static final String plantilla_descuento = "^\\w[10-90%]$";/* "^[0-9]{5}$"; */
	private static final String plantilla_puntos = "^[0-9]{4}$";
	private static final String plantilla_mail = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	private static final String plantilla_ciudad = "^[a-zA-Z]*$";
	private static final String plantilla_codigopostal = "^[0-9]{5}$";
	private static final String plantilla_pais = "^[a-zA-Z]*$";
	private static final String plantilla_movil = "^[0-9]{2,3}-? ?[0-9]{6,7}$";
	private static final String plantilla_numero_visitas = "^[0-9]{1,6}$";
	private static final String plantilla_fecha = "\\d{1,2}/\\d{1,2}/\\d{4}";
	private static final String plantilla_fecha0 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)\\d{2}$";
	private static final String plantilla_fecha1 = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)\\d{2}$";
	private static final String plantilla_fecha2 = "^(19|20)\\d{2}/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])$";
	private static final String plantilla_fecha3 = "^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
	//private static final String plantilla_comentarios = "^[0-9]{1,2,3,4,5,6}$";

	// validadores campos
	public static boolean validadni(String dni) {
		boolean val = true;
		String dni2 = "", caracteres = "TRWAGMYFPDXBNJZSQVHLCKET";
		int dni1 = 0, modulo = 0;
		for (int i = 0; i < 8; i++)
			dni2 += dni.charAt(i);
		char letra = dni.charAt(8);
		dni1 = Integer.parseInt(dni2);
		modulo = dni1 % 23;
		char let = caracteres.charAt(modulo);
		if (let == letra)
			val = true;
		else
			val = false;
		return val;
		/*
		 * Pattern pattern=Pattern.compile(plantilla_dni); Matcher matcher =
		 * pattern.matcher(dni); if(matcher.matches()){ return true; } return
		 * false;
		 */
	}
	public static char monedas () {
		char moneda=' ';
		String [] monedas = { "Euros", "Dolares", "dolares" };
		int menu = 0;
		
		menu = funciones.menubuttons(monedas, "elige una moneda"," ");
		
		switch (menu) {
			case 0:
				moneda = '€';
				break;
			case 1:
				moneda = '$';
				break;
			case 2:
				moneda = '@';
				break;
		}
		return moneda;
	}
	public static boolean fecha (String fecha,String formato) {
		String s="";
		switch (formato) {
			case "dd/mm/yyyy":
				s = plantilla_fecha0;
				break;
			case "dd-mm-yyyy":
				s = plantilla_fecha1;
				break;
			case "yyyy/mm/dd":
				s = plantilla_fecha2;
				break;
			case "yyyy-mm-dd":
				s = plantilla_fecha3;
				break;
		}	
		return fecha.matches(s);
	}

	public static boolean validafecha(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha0);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validafecha1(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha1);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean validafecha2(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha2);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean validafecha3(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha3);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean validacomentarios(String comentarios) {
		Pattern pattern = Pattern.compile(plantilla_fecha);
		Matcher matcher = pattern.matcher(comentarios);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean valida_puntos(String puntos) {
		Pattern pattern = Pattern.compile(plantilla_fecha);
		Matcher matcher = pattern.matcher(puntos);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validanombre(String nombre) {
		Pattern pattern = Pattern.compile(plantilla_nombre);
		Matcher matcher = pattern.matcher(nombre);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validaedad(String edad) {
		Pattern pattern = Pattern.compile(plantilla_edad);
		Matcher matcher = pattern.matcher(edad);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validaapellidos(String apellidos) {
		Pattern pattern = Pattern.compile(plantilla_apellidos);
		Matcher matcher = pattern.matcher(apellidos);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validadireccion(String direccion) {
		Pattern pattern = Pattern.compile(plantilla_direccion);
		Matcher matcher = pattern.matcher(direccion);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validasexe(String sexe) {
		Pattern pattern = Pattern.compile(plantilla_sexe);
		Matcher matcher = pattern.matcher(sexe);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validausuario(String usuario) {
		Pattern pattern = Pattern.compile(plantilla_usuario);
		Matcher matcher = pattern.matcher(usuario);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validacontraseña(String contraseña) {
		Pattern pattern = Pattern.compile(plantilla_contraseña);
		Matcher matcher = pattern.matcher(contraseña);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validadescuento(String descuento) {
		Pattern pattern = Pattern.compile(plantilla_descuento);
		Matcher matcher = pattern.matcher(descuento);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validapuntos(String puntos) {
		Pattern pattern = Pattern.compile(plantilla_puntos);
		Matcher matcher = pattern.matcher(puntos);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validamail(String mail) {
		Pattern pattern = Pattern.compile(plantilla_mail);
		Matcher matcher = pattern.matcher(mail);
		if (matcher.matches()) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_email"));
			return false;
		}
	}

	public static boolean validaciudad(String ciudad) {
		Pattern pattern = Pattern.compile(plantilla_ciudad);
		Matcher matcher = pattern.matcher(ciudad);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean valida_codigopostal(String codigo_postal) {
		Pattern pattern = Pattern.compile(plantilla_codigopostal);
		Matcher matcher = pattern.matcher(codigo_postal);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validapais(String pais) {
		Pattern pattern = Pattern.compile(plantilla_pais);
		Matcher matcher = pattern.matcher(pais);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validamovil(String movil) {
		Pattern pattern = Pattern.compile(plantilla_movil);
		Matcher matcher = pattern.matcher(movil);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean valida_numerovisitas(String numero_visitas) {
		Pattern pattern = Pattern.compile(plantilla_numero_visitas);
		Matcher matcher = pattern.matcher(numero_visitas);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	// modificar plantillla de numero visitas por una nueva para validar fecha//

	// edad, nombre, apellidos, dni, direccion, sexe, usuario, contrase�a,
	// descuento, puntos,
	// mail, ciudad, codigo_postal,pais,movil,numero_visitas.
}
