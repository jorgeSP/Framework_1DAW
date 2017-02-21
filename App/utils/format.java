package App.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import App.classes.Settings;
import App.modules.users.Model.funciones.funciones_recalcular_datos;


public class format {
	public static String FormatEuro(String sueldo) {
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.FRANCE);// Euro
		return coin.format(sueldo);
	}

	public static String formato1_decimales(float sueldo) {
		DecimalFormat format1 = new DecimalFormat(".0");
		return format1.format(sueldo);
	}

	public static String formato2_decimales(float sueldo) {
		DecimalFormat format1 = new DecimalFormat(".00");
		return format1.format(sueldo);
	}

	public static String formato3_decimales(float sueldo) {
		DecimalFormat format1 = new DecimalFormat(".000");
		return format1.format(sueldo);
	}

	public static String formato4_decimales(float sueldo) {
		DecimalFormat format1 = new DecimalFormat(".0000");
		return format1.format(sueldo);
	}

	public static String formato5_decimales(float sueldo) {
		DecimalFormat format1 = new DecimalFormat(".00000");
		return format1.format(sueldo);
	}

	public static String decimales(float sueldo) {
		NumberFormat sueldo1 = null;
		String sueldo2 = "";
		int valor = Settings.getInstance().getdecimales();
		switch (valor) {
		case 2:
			sueldo1 = NumberFormat.getCurrencyInstance();
			sueldo2 = format.formato2_decimales(sueldo);
			break;
		case 3:
			sueldo1 = NumberFormat.getCurrencyInstance();
			sueldo2 = format.formato3_decimales(sueldo);
			break;
		case 4:
			sueldo1 = NumberFormat.getCurrencyInstance();
			sueldo2 = format.formato4_decimales(sueldo);
			break;

		}
		return sueldo1.format(sueldo2);
	}

	public static String formatomoneda(float sueldo) {
		String resultado_final = "";
		float sueldo1 = 0;
		char moneda = funciones_recalcular_datos.devuelve_formato_moneda();
		int decimales=Settings.getInstance().getdecimales();
		
		boolean dummies=Settings.getInstance().getdummies();
		if(dummies==true) {
		int decimales1=Settings.getInstance().getdecimales();
		switch (moneda) {
		case '$':
			switch (decimales1) {
			case 1:
				sueldo1 = sueldo * 1.0844f;
				resultado_final = format.formato1_decimales(sueldo1);
				break;
			case 2:
				sueldo1 = sueldo * 1.0844f;
				resultado_final = format.formato2_decimales(sueldo1);
				break;
			case 3:
				sueldo1 = sueldo * 1.0844f;
				resultado_final = format.formato3_decimales(sueldo1);
				break;
			case 4:
				sueldo1 = sueldo * 1.0844f;
				resultado_final = format.formato4_decimales(sueldo1);
				break;
			case 5:
				sueldo1 = sueldo * 1.0844f;
				resultado_final = format.formato5_decimales(sueldo1);
				break;
			}
			break;
		case '£':
			switch (decimales1) {
			case 1:
				sueldo1 = sueldo * 0.72686f;
				resultado_final = format.formato1_decimales(sueldo1);
				break;
			case 2:
				sueldo1 = sueldo * 0.72686f;
				resultado_final = format.formato2_decimales(sueldo1);
				break;
			case 3:
				sueldo1 = sueldo * 0.72686f;
				resultado_final = format.formato3_decimales(sueldo1);
				break;
			case 4:
				sueldo1 = sueldo * 0.72686f;
				resultado_final = format.formato4_decimales(sueldo1);
				break;
			case 5:
				sueldo1 = sueldo * 0.72686f;
				resultado_final = format.formato5_decimales(sueldo1);
				break;
			}

			break;
		case '€':

			resultado_final = format.formato1_decimales(sueldo);

			switch (decimales1) {
			case 1:
				sueldo1 = sueldo;
				resultado_final = format.formato1_decimales(sueldo1);
				break;
			case 2:
				sueldo1 = sueldo;
				resultado_final = format.formato2_decimales(sueldo1);
				break;
			case 3:
				sueldo1 = sueldo;
				resultado_final = format.formato3_decimales(sueldo1);
				break;
			case 4:
				sueldo1 = sueldo;
				resultado_final = format.formato4_decimales(sueldo1);
				break;
			case 5:
				sueldo1 = sueldo;
				resultado_final = format.formato5_decimales(sueldo1);
				break;
			}
			break;
		case 'Ƀ':
			switch (decimales1) {
			case 1:
				sueldo1 = sueldo*0.0014f;
				resultado_final = format.formato1_decimales(sueldo1);
				break;
			case 2:
				sueldo1 = sueldo*0.0014f;
				resultado_final = format.formato2_decimales(sueldo1);
				break;
			case 3:
				sueldo1 = sueldo*0.0014f;
				resultado_final = format.formato3_decimales(sueldo1);
				break;
			case 4:
				sueldo1 = sueldo*0.0014f;
				resultado_final = format.formato4_decimales(sueldo1);
				break;
			case 5:
				sueldo1 = sueldo*0.0014f;
				resultado_final = format.formato5_decimales(sueldo1);
				break;
			}
			break;
		}
		}else {
			switch (moneda) {
			case '$':
				switch (decimales) {
				case 1:
					sueldo1 = sueldo * 1.0844f;
					resultado_final = format.formato1_decimales(sueldo1);
					break;
				case 2:
					sueldo1 = sueldo * 1.0844f;
					resultado_final = format.formato2_decimales(sueldo1);
					break;
				case 3:
					sueldo1 = sueldo * 1.0844f;
					resultado_final = format.formato3_decimales(sueldo1);
					break;
				case 4:
					sueldo1 = sueldo * 1.0844f;
					resultado_final = format.formato4_decimales(sueldo1);
					break;
				case 5:
					sueldo1 = sueldo * 1.0844f;
					resultado_final = format.formato5_decimales(sueldo1);
					break;
				}
				break;
			case '£':
				switch (decimales) {
				case 1:
					sueldo1 = sueldo * 0.72686f;
					resultado_final = format.formato1_decimales(sueldo1);
					break;
				case 2:
					sueldo1 = sueldo * 0.72686f;
					resultado_final = format.formato2_decimales(sueldo1);
					break;
				case 3:
					sueldo1 = sueldo * 0.72686f;
					resultado_final = format.formato3_decimales(sueldo1);
					break;
				case 4:
					sueldo1 = sueldo * 0.72686f;
					resultado_final = format.formato4_decimales(sueldo1);
					break;
				case 5:
					sueldo1 = sueldo * 0.72686f;
					resultado_final = format.formato5_decimales(sueldo1);
					break;
				}

				break;
			case '€':

				resultado_final = format.formato1_decimales(sueldo);

				switch (decimales) {
				case 1:
					sueldo1 = sueldo;
					resultado_final = format.formato1_decimales(sueldo1);
					break;
				case 2:
					sueldo1 = sueldo;
					resultado_final = format.formato2_decimales(sueldo1);
					break;
				case 3:
					sueldo1 = sueldo;
					resultado_final = format.formato3_decimales(sueldo1);
					break;
				case 4:
					sueldo1 = sueldo;
					resultado_final = format.formato4_decimales(sueldo1);
					break;
				case 5:
					sueldo1 = sueldo;
					resultado_final = format.formato5_decimales(sueldo1);
					break;
				}
				break;
			case 'Ƀ':
				//resultado_final = format.formato1_decimales(sueldo);
				switch (decimales) {
				case 1:
					sueldo1 = sueldo*0.0014f;
					resultado_final = format.formato1_decimales(sueldo1);
					break;
				case 2:
					sueldo1 = sueldo*0.0014f;
					resultado_final = format.formato2_decimales(sueldo1);
					break;
				case 3:
					sueldo1 = sueldo*0.0014f;
					resultado_final = format.formato3_decimales(sueldo1);
					break;
				case 4:
					sueldo1 = sueldo*0.0014f;
					resultado_final = format.formato4_decimales(sueldo1);
					break;
				case 5:
					sueldo1 = sueldo*0.0014f;
					resultado_final = format.formato5_decimales(sueldo1);
					break;
				}
				break;
			}
			
		}
		return resultado_final;
	}
	/*
	 * public static String formato_fecha(fecha fecha,String formato) { String
	 * fecha1=""; switch (formato) { case "dd/mm/yyyy": fecha1 =fecha.getdia() +
	 * "/" + fecha.getmes() + "/" + fecha.getanyo(); break; case "dd-mm-yyyy":
	 * fecha1 =fecha.getdia() + "-" + fecha.getmes() + "-" + fecha.getanyo();
	 * break; case "yyyy/mm/dd": fecha1 =fecha.getanyo() + "/" + fecha.getmes()
	 * + "/" + fecha.getdia(); break; case "yyyy-mm-dd": fecha1 =fecha.getanyo()
	 * + "-" + fecha.getmes() + "-" + fecha.getdia(); break; } return fecha1; }
	 */
}
