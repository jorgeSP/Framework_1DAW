package App.modules.users.Model.funciones;

import App.classes.Settings;
import App.classes.fecha;

public class funciones_recalcular_datos {
	public static float saca_sueldo(int antiguedad) {
		float sueldo = 0;
		int antig = 0;
		antig = antiguedad;
		if (antig < 1) {
			sueldo = 1200.20f;
		}
		if ((antig >= 1) && (antig <= 5)) {
			sueldo = 1500.50f;
		}
		if ((antig > 5) && (antig <= 10)) {
			sueldo = 2000.60f;
		}
		if ((antig > 10)) {
			sueldo = 2701.70f;
		}
		return sueldo;
	}

	public static int karma(int comentarios) {
		int puntos = 0;
		int comentarios1 = comentarios;
		if ((comentarios1 > 0) && (comentarios1 <= 10)) {
			puntos = 100;
		}
		if ((comentarios1 > 10) && (comentarios1 <= 20)) {
			puntos = 200;
		}
		if ((comentarios1 > 20) && (comentarios1 <= 30)) {
			puntos = 300;
		}
		if ((comentarios1 > 30) && (comentarios1 <= 40)) {
			puntos = 400;
		}
		if ((comentarios1 > 40) && (comentarios1 <= 50)) {
			puntos = 500;
		}
		if ((comentarios1 > 50) && (comentarios1 <= 60)) {
			puntos = 600;
		}
		if ((comentarios1 > 60) && (comentarios1 <= 70)) {
			puntos = 700;
		}
		if ((comentarios1 > 70) && (comentarios1 <= 80)) {
			puntos = 800;
		}
		if ((comentarios1 > 80) && (comentarios1 <= 90)) {
			puntos = 900;
		}
		if ((comentarios1 > 90) && (comentarios1 <= 100)) {
			puntos = 1000;
		}
		if (comentarios1 > 100) {
			puntos = 1500;
		}
		return puntos;
	}

	public static int calculaantiguedad(fecha fcont) {
		int actual = fcont.anyoactual();
		int contratacion = fcont.getanyo();
		int antiguedad = actual - contratacion;
		return antiguedad;
	}

	public static int calcula_descuento(int compras) {
		int descuento = 0;
		int compras1 = compras;
		if (compras1 <= 1) {
			descuento = 0;
		}
		if ((compras1 > 1) && (compras1 <= 5)) {
			descuento = 3;
		}
		if ((compras1 > 5) && (compras1 <= 10)) {
			descuento = 5;
		}
		if ((compras1 > 10) && (compras1 <= 15)) {
			descuento = 7;
		}
		if (compras1 > 15) {
			descuento = 10;
		}
		return descuento;
	}

	public static char devuelve_formato_moneda() {
		char monedas = Settings.getInstance().getmoneda();

		char final_moneda = ' ';
		boolean dummies = Settings.getInstance().getdummies();
		if (dummies == true) {
			char monedas1 = Settings.getInstance().getmoneda();
			switch (monedas1) {
			case '€':
				final_moneda = '€';
				break;
			case '$':
				final_moneda = '$';
				break;
			case '£':
				final_moneda = '£';
				break;
			case 'Ƀ':
				final_moneda = 'Ƀ';
				break;
			}
		} else {
			switch (monedas) {
			case '€':
				final_moneda = '€';
				break;
			case '$':
				final_moneda = '$';
				break;
			case '£':
				final_moneda = '£';
				break;
			case 'Ƀ':
				final_moneda = 'Ƀ';
				break;
			}
		}
		return final_moneda;
	}

	public static String devuelve_formato_nacimiento(fecha fnac) {
		String format = "";
		boolean dummies = Settings.getInstance().getdummies();
		String formato = Settings.getInstance().getformato_fecha();
		if (dummies == true) {
			String formato1 = Settings.getInstance().getformato_fecha();
			switch (formato1) {
			case "dd/mm/yyyy":
				format = +fnac.getdia() + "/" + fnac.getmes() + "/" + fnac.getanyo();

				break;
			case "dd-mm-yyyy":
				format = +fnac.getdia() + "-" + fnac.getmes() + "-" + fnac.getanyo();

				break;
			case "yyyy/mm/dd":
				format = +fnac.getanyo() + "/" + fnac.getmes() + "/" + fnac.getdia();

				break;
			case "yyyy-mm-dd":
				format = +fnac.getanyo() + "-" + fnac.getmes() + "-" + fnac.getdia();

				break;
			}
		}
		if (dummies == false) {
			switch (formato) {
			case "dd/mm/yyyy":
				format = +fnac.getdia() + "/" + fnac.getmes() + "/" + fnac.getanyo();

				break;
			case "dd-mm-yyyy":
				format = +fnac.getdia() + "-" + fnac.getmes() + "-" + fnac.getanyo();

				break;
			case "yyyy/mm/dd":
				format = +fnac.getanyo() + "/" + fnac.getmes() + "/" + fnac.getdia();

				break;
			case "yyyy-mm-dd":
				format = +fnac.getanyo() + "-" + fnac.getmes() + "-" + fnac.getdia();

				break;
			}
		}
		return format;
	}

	public static String devuelve_formato_contratacion(fecha fcont) {
		String format = "";
		boolean dummies = Settings.getInstance().getdummies();
		String formato = Settings.getInstance().getformato_fecha();
		if (dummies == true) {
			String formato1 = Settings.getInstance().getformato_fecha();
			switch (formato1) {
			case "dd/mm/yyyy":
				format = +fcont.getdia() + "/" + fcont.getmes() + "/" + fcont.getanyo();

				break;
			case "dd-mm-yyyy":
				format = +fcont.getdia() + "-" + fcont.getmes() + "-" + fcont.getanyo();

				break;
			case "yyyy/mm/dd":
				format = +fcont.getanyo() + "/" + fcont.getmes() + "/" + fcont.getdia();

				break;
			case "yyyy-mm-dd":
				format = +fcont.getanyo() + "-" + fcont.getmes() + "-" + fcont.getdia();

				break;
			}
		}
		if (dummies == false) {
			switch (formato) {
			case "dd/mm/yyyy":
				format = +fcont.getdia() + "/" + fcont.getmes() + "/" + fcont.getanyo();

				break;
			case "dd-mm-yyyy":
				format = +fcont.getdia() + "-" + fcont.getmes() + "-" + fcont.getanyo();

				break;
			case "yyyy/mm/dd":
				format = +fcont.getanyo() + "/" + fcont.getmes() + "/" + fcont.getdia();

				break;
			case "yyyy-mm-dd":
				format = +fcont.getanyo() + "-" + fcont.getmes() + "-" + fcont.getdia();

				break;
			}
		}
		return format;
	}

	public static String devuelve_formato_alta(fecha fechaalta) {
		String format = " ";
		boolean dummies = Settings.getInstance().getdummies();
		String formato = Settings.getInstance().getformato_fecha();
		if (dummies == true) {
			String formato1 = Settings.getInstance().getformato_fecha();
			switch (formato1) {
			case "dd/mm/yyyy":
				format = +fechaalta.getdia() + "/" + fechaalta.getmes() + "/" + fechaalta.getanyo();

				break;
			case "dd-mm-yyyy":
				format = +fechaalta.getdia() + "-" + fechaalta.getmes() + "-" + fechaalta.getanyo();

				break;
			case "yyyy/mm/dd":
				format = +fechaalta.getanyo() + "/" + fechaalta.getmes() + "/" + fechaalta.getdia();

				break;
			case "yyyy-mm-dd":
				format = +fechaalta.getanyo() + "-" + fechaalta.getmes() + "-" + fechaalta.getdia();

				break;
			}
		}
		if (dummies == false) {
			switch (formato) {
			case "dd/mm/yyyy":
				format = +fechaalta.getdia() + "/" + fechaalta.getmes() + "/" + fechaalta.getanyo();

				break;
			case "dd-mm-yyyy":
				format = +fechaalta.getdia() + "-" + fechaalta.getmes() + "-" + fechaalta.getanyo();

				break;
			case "yyyy/mm/dd":
				format = +fechaalta.getanyo() + "/" + fechaalta.getmes() + "/" + fechaalta.getdia();

				break;
			case "yyyy-mm-dd":
				format = +fechaalta.getanyo() + "-" + fechaalta.getmes() + "-" + fechaalta.getdia();

				break;
			}
		}

		return format;
	}

}