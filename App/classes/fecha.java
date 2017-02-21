package App.classes;

import java.util.Calendar;
import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import App.modules.users.Model.BLL.BLL_user.funciones_users;

@XStreamAlias("fecha")
public class fecha implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// atributos
	@XStreamAlias("fecha")
	private String fecha;
	@XStreamAlias("dia")
	private int dia;
	@XStreamAlias("mes")
	private int mes;
	@XStreamAlias("anyo")
	private int anyo;
	// constructor

	public SimpleDateFormat formato = new SimpleDateFormat(funciones_users.defecto);

	public fecha() {

	}

	public fecha(String fecha) {
		String[] array = null;
		String formafecha = null;

		array = fecha.split("/");
		this.dia = Integer.parseInt(array[0]);
		this.mes = Integer.parseInt(array[1]);
		this.anyo = Integer.parseInt(array[2]);
		formafecha = dia + "/" + mes + "/" + anyo;
		this.fecha = formafecha;
	}

	public fecha(String fecha, String formato) {
		String[] array = new String[3];
		switch (formato) {
		case "dd/mm/yyyy":
			array = fecha.split("/");
			this.dia = Integer.parseInt(array[0]);
			this.mes = Integer.parseInt(array[1]);
			this.anyo = Integer.parseInt(array[2]);
			this.fecha = dia + "/" + mes + "/" + anyo;
			break;

		case "dd-mm-yyyy":
			array = fecha.split("-");
			this.dia = Integer.parseInt(array[0]);
			this.mes = Integer.parseInt(array[1]);
			this.anyo = Integer.parseInt(array[2]);
			this.fecha = dia + "-" + mes + "-" + anyo;
			break;

		case "yyyy/mm/dd":
			array = fecha.split("/");
			this.dia = Integer.parseInt(array[2]);
			this.mes = Integer.parseInt(array[1]);
			this.anyo = Integer.parseInt(array[0]);
			this.fecha = anyo + "/" + mes + "/" + dia;
			break;

		case "yyyy-mm-dd":
			array = fecha.split("-");
			this.dia = Integer.parseInt(array[2]);
			this.mes = Integer.parseInt(array[1]);
			this.anyo = Integer.parseInt(array[0]);
			this.fecha = anyo + "-" + mes + "-" + dia;
			break;
		}
	}

	// getters/setters
	public String getfecha() {
		return this.fecha;
	}

	public int getdia() {
		return this.dia;
	}

	public int getmes() {
		return this.mes;
	}

	public int getanyo() {
		return this.anyo;
	}

	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	// metodos
	public Calendar deStringToCalendar(String fecha) {
		Date fechadata = new Date();
		Calendar fechacalendar = new GregorianCalendar();
		SimpleDateFormat formato;
		try {
			formato = this.formato;
			fechadata = formato.parse(fecha);
			fechacalendar.setTime(fechadata);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fechacalendar;
	}
	/*
	 * Calendar fechacalendario = new GregorianCalendar(); try {
	 * fechacalendario.set(this.anyo, this.mes, this.dia); } catch (Exception e)
	 * { e.printStackTrace(); } return fechacalendario;
	 */

	public String deCalendartoString() {
		Calendar calendario = Calendar.getInstance();
		return (calendario.getTime().toString());
	}

	public int compararfechas(String fecha1) {
		Calendar calendario1 = this.deStringToCalendar(fecha);
		Calendar calendario2 = this.deStringToCalendar(fecha1.toString());
		if (calendario1.before(calendario2))
			return 1;
		else if (calendario1.after(calendario2))
			return 2;
		else
			return 3;
	}

	public int compararfechas1(fecha fecha1) {
		Calendar calendario1 = this.deStringToCalendar(fecha);
		Calendar calendario2 = this.deStringToCalendar(fecha1.toString());
		if (calendario1.before(calendario2))
			return 1;
		else if (calendario1.after(calendario2))
			return 2;
		else
			return 3;
	}

	public int compararfechas3(fecha fecha1) {
		Calendar calendario1 = this.deStringToCalendar(this.fecha);
		Calendar calendario2 = this.deStringToCalendar(fecha1.toString());
		if (calendario1.before(calendario2))
			return -1;
		else if (calendario1.after(calendario2))
			return 1;
		else if (calendario1.equals(calendario2))
			return 0;
		else {
			return 0;
		}
	}

	public int RestaFechas() {
		int diferencia;
		int anyo1;
		int anyosistema;
		Calendar calendario1 = new GregorianCalendar();

		calendario1 = (deStringToCalendar(fecha));
		anyo1 = calendario1.get(Calendar.YEAR);
		anyosistema = this.anyoactual();
		diferencia = anyosistema - anyo1;

		return diferencia;
	}

	public boolean ValidarFecha() {
		int dia;
		int mes;
		int anyo;
		boolean continuar = false;
		dia = this.dia;
		mes = this.mes;
		anyo = this.anyo;
		if ((anyo > 1930) && (anyo <= this.anyoactual())) {
			if ((mes >= 1) && (mes <= 12)) {
				switch (mes) {
				case 1: // Enero
					if ((dia > 0) && (dia <= 31))

						continuar = true;
					break;
				case 2:

					if ((((anyo % 100 == 0) && (anyo % 400 == 0)) || ((anyo % 100 != 0) && (anyo % 4 == 0)))
							&& (dia > 0) && (dia <= 29))
						continuar = true;
					else if ((dia > 0) && (dia <= 28))
						continuar = true;
					break;
				case 3: // Marzo
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 4: // Abril
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 5: // Mayo
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 6: // Junio
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 7: // Julio
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 8: // Agosto
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 9: // Septiembre
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 10: // Octubre
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 11: // Noviembre
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 12: // Diciembre

					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;

				default:
					continuar = false;
				}
			} else
				continuar = false;
		} else
			continuar = false;
		return continuar;
	}

	public boolean ValidarFecha_posterior_actual() {
		int dia;
		int mes;
		int anyo;
		boolean continuar = false;
		String[] Array = null;

		Array = this.fecha.split("/");
		dia = Integer.parseInt(Array[0]);
		mes = Integer.parseInt(Array[1]);
		anyo = Integer.parseInt(Array[2]);

		if ((anyo > 1930) && (anyo <= 2100)) {
			if ((mes >= 1) && (mes <= 12)) {
				switch (mes) {
				case 1: // Enero
					if ((dia > 0) && (dia <= 31))

						continuar = true;
					break;
				case 2: // Febrero
					// A�o Bisiesto
					if ((((anyo % 100 == 0) && (anyo % 400 == 0)) || ((anyo % 100 != 0) && (anyo % 4 == 0)))
							&& (dia > 0) && (dia <= 29))
						continuar = true;
					else if ((dia > 0) && (dia <= 28))
						continuar = true;
					break;
				case 3: // Marzo
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 4: // Abril
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 5: // Mayo
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 6: // Junio
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 7: // Julio
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 8: // Agosto
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 9: // Septiembre
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 10: // Octubre
					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;
				case 11: // Noviembre
					if ((dia > 0) && (dia <= 30))
						continuar = true;
					break;
				case 12: // Diciembre

					if ((dia > 0) && (dia <= 31))
						continuar = true;
					break;

				default:
					continuar = false;
				}
			} else
				continuar = false;
		} else
			continuar = false;
		return continuar;
	}

	@SuppressWarnings("static-access")
	public String fechaactual() {
		String fecha = null;
		Calendar fecha1 = new GregorianCalendar();
		fecha = Integer.toString(fecha1.get(fecha1.DAY_OF_MONTH));
		fecha += "/" + Integer.toString(fecha1.get(fecha1.MONTH) + 1);
		fecha += "/" + Integer.toString(fecha1.get(fecha1.YEAR));

		return fecha;
	}

	public String fechaactual1() {
		String fecha = null;
		Calendar fecha1 = new GregorianCalendar();
		fecha = Integer.toString(fecha1.get(fecha1.DAY_OF_MONTH));
		fecha += "-" + Integer.toString(fecha1.get(fecha1.MONTH) + 1);
		fecha += "-" + Integer.toString(fecha1.get(fecha1.YEAR));

		return fecha;
	}

	public int diaactual() {
		Calendar fecha = new GregorianCalendar();
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		return dia;
	}

	public int anyoactual() {
		Calendar fecha = new GregorianCalendar();
		int anyo = fecha.get(Calendar.YEAR);
		return anyo;
	}

	public int mesactual() {
		Calendar fecha = new GregorianCalendar();
		int mes = fecha.get(Calendar.MONTH);
		return mes + 1;
	}

	/*
	 * public String toString() { String fecha = null; fecha = this.dia + "/" +
	 * this.mes + "/" + this.anyo; return fecha;
	 * 
	 * }
	 */

	public String toString() {
		String fecha = this.dia + "/" + this.mes + "/" + this.anyo;
		return fecha;
	}

	public String toString(String formato) {
		String fecha = "";
		// formato=funciones_users.defecto;
		switch (formato) {
		case "dd/mm/yyyy":
			fecha = this.dia + "/" + this.mes + "/" + this.anyo;
			break;
		case "dd-mm-yyyy":
			fecha = this.dia + "-" + this.mes + "-" + this.anyo;
			break;
		case "yyyy/mm/dd":
			fecha = this.anyo + "/" + this.mes + "/" + this.dia;
			break;
		case "yyyy-mm-dd":
			fecha = this.anyo + "-" + this.mes + "-" + this.dia;
			break;
		}
		return fecha;
	}

}