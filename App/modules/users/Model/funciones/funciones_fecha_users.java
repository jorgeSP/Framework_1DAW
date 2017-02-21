package App.modules.users.Model.funciones;

import javax.swing.JOptionPane;
import App.classes.Settings;
import App.classes.fecha;
import App.utils.funciones;
import App.utils.validador;

public class funciones_fecha_users {

	public static String fecha_alta_sistema(fecha fnac) {
		String fecha;
		fecha f_actual = new fecha();
		fecha = f_actual.fechaactual();
		fecha fechaalta = new fecha(fecha);

		String format = "";
		String formato1 =Settings.getInstance().getformato_fecha();
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
	
		return format;
		
	}

	public static fecha pidefecha_nacimiento() {
		int edad = 0;
		boolean continuar = true;
		fecha fnac = new fecha();
		String formato = Settings.getInstance().getformato_fecha();
		switch (formato) {
		case "dd/mm/yyyy":
			do {
				String fechanacimiento = funciones.valcadena(Settings.lenguaje.getProperty("formato_fecha1"),
						" ");
				boolean result1 = validador.validafecha(fechanacimiento);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, (Settings.lenguaje.getProperty("error_formato_fecha1")));
					continuar = false;
				} else {
					fnac = new fecha(fechanacimiento, formato);
					boolean result2 = fnac.ValidarFecha();
					if (result2 == true) {
						int anyo_actual=fnac.anyoactual();
						int anyo_fnac=fnac.getanyo();
						edad=anyo_actual-anyo_fnac;
						//edad = fnac.RestaFechas();
						if ((edad < 18) || (edad > 90)) {
							JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("menor_edad"));
							continuar = false;
						} else
							continuar = true;

					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}
				}

			} while (continuar == false);
			break;
		case "dd-mm-yyyy":
			do {
				String fechanacimiento = funciones.valcadena(Settings.lenguaje.getProperty("formato_fecha2"),
						" ");
				boolean result1 = validador.validafecha1(fechanacimiento);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha2"));
					continuar = false;
				} else {
					fnac = new fecha(fechanacimiento, formato);
					boolean result2 = fnac.ValidarFecha();
					if (result2 == true) {
						int anyo_actual=fnac.anyoactual();
						int anyo_fnac=fnac.getanyo();
						edad=anyo_actual-anyo_fnac;
						//edad = fnac.RestaFechas();
						//JOptionPane.showMessageDialog(null,edad);
						if ((edad < 18) || (edad > 90)) {
							JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("menor_edad"));
							continuar = false;
						} else
							continuar = true;

					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}
				}

			} while (continuar == false);
			break;
		case "yyyy/mm/dd":
			do {
				String fechanacimiento = funciones.valcadena(Settings.lenguaje.getProperty("formato_fecha3"),
						" ");
				boolean result1 = validador.validafecha2(fechanacimiento);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha3"));
					continuar = false;
				} else {
					fnac = new fecha(fechanacimiento, formato);
					boolean result2 = fnac.ValidarFecha();
					if (result2 == true) {
						int anyo_actual=fnac.anyoactual();
						int anyo_fnac=fnac.getanyo();
						edad=anyo_actual-anyo_fnac;
						//edad = fnac.RestaFechas();
						if ((edad < 18) || (edad > 90)) {
							JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("menor_edad"));
							continuar = false;
						} else
							continuar = true;

					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}
				}

			} while (continuar == false);
			break;
		case "yyyy-mm-dd":
			do {
				String fechanacimiento = funciones.valcadena(Settings.lenguaje.getProperty("formato_fecha4"),
						" ");
				boolean result1 = validador.validafecha3(fechanacimiento);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha4"));
					continuar = false;
				} else {
					fnac = new fecha(fechanacimiento, formato);
					boolean result2 = fnac.ValidarFecha();
					if (result2 == true) {
						int anyo_actual=fnac.anyoactual();
						int anyo_fnac=fnac.getanyo();
						edad=anyo_actual-anyo_fnac;
						//edad = fnac.RestaFechas();
						if ((edad < 18) || (edad > 90)) {
							JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("menor_edad"));
							continuar = false;
						} else
							continuar = true;

					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}
				}

			} while (continuar == false);
			break;
		}
		return fnac;

	}

	public static int saca_la_edad(fecha fnac) {
		int edad = 0;
		int actual=fnac.anyoactual();
		int nacimiento=fnac.getanyo();
		//edad = fnac.RestaFechas();
		edad=actual-nacimiento;
		return edad;
	}

	public static fecha pidefecha_contratacion(fecha fnac) {
		int antiguedad = 0;
		int resultado = 0;
		int resultado1 = 0;
		int edad = 0;
		int valor = 0;
		boolean continuar = true;
		String fecha = "";
		fecha fcont = new fecha();
		String formato = Settings.getInstance().getformato_fecha();
		switch (formato) {
		case "dd/mm/yyyy":
			do {
				String fechacontratacion = funciones
						.valcadena(Settings.lenguaje.getProperty("formato1_fecha_contratacion"), " ");
				boolean result1 = validador.validafecha(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha1"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new fecha(fechacontratacion, formato);
					boolean result2 = fcont.ValidarFecha();
					if (result2 == true) {
						antiguedad = fcont.RestaFechas();
						// compara/controla fechas contratacion y nacimiento
						resultado = fcont.compararfechas1(fnac);
						if (resultado == 2) {

							continuar = true;
						} else {
							continuar = false;
						}
						// comprueba que la fecha de contratacion no sea
						// superior a
						// la
						// actual
						fecha = fcont.fechaactual();
						fecha comparador = new fecha(fecha);
						resultado1 = fcont.compararfechas1(comparador);
						if (resultado1 == 1) {
							continuar = true;

						}
						if (resultado1 == 2) {
							continuar = false;
							JOptionPane.showMessageDialog(null,
									Settings.lenguaje.getProperty("error_fecha_contratacion"));
						}
						if (resultado1 == 3) {
							continuar = true;
						}
						// comprueba que sea mayor de edad para poder ser
						// contratado;
						int anyo_actual=fnac.anyoactual();
						int anyo_fnac=fnac.getanyo();
						edad=anyo_actual-anyo_fnac;
						//edad = fnac.RestaFechas();
						
						valor = edad - antiguedad;
						if (valor < 18) {
							JOptionPane.showMessageDialog(null,
									Settings.lenguaje.getProperty("error1_contratacion_nacimiento"));
							continuar = false;
						} else {
							continuar = true;
						}
					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}

				}

			} while (continuar == false);
			break;
		case "dd-mm-yyyy":
			do {
//			
				String fechacontratacion = funciones
						.valcadena(Settings.lenguaje.getProperty("formato2_fecha_contratacion"), " ");
				boolean result1 = validador.validafecha1(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha2"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new fecha(fechacontratacion, formato);
					boolean result2 = fcont.ValidarFecha();
					if (result2 == true) {
						
						// compara/controla fechas contratacion y nacimiento
						int edad_fnac=fnac.getanyo();
						int edad_fnac_mayor_edad=edad_fnac+18;
						int anyo_fcont=fcont.getanyo();
						if(anyo_fcont>edad_fnac_mayor_edad) {
							continuar = true;
						}else {
							continuar = false;
						}						
						if (result2 == true) {
							int anyo_actual=fnac.anyoactual();
							int anyo_fnac=fcont.getanyo();
							antiguedad=anyo_actual-anyo_fnac;
							// compara/controla fechas contratacion y nacimiento
							int edad_fnac2=fnac.getanyo();
							int edad_fnac_mayor_edad2=edad_fnac2+18;
							int anyo_fcont2=fcont.getanyo();
							if(anyo_fcont2>edad_fnac_mayor_edad2) {
								continuar = true;
							}else {
								continuar = false;
							}
							int anyo_actual1=fnac.anyoactual();
							int anyo_fnac1=fnac.getanyo();
							edad=anyo_actual1-anyo_fnac1;
						
							valor = edad - antiguedad;
							if (valor < 18) {
								JOptionPane.showMessageDialog(null,
										Settings.lenguaje.getProperty("error1_contratacion_nacimiento"));
								continuar = false;
							} else {
								continuar = true;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}
					

				}
				//comprueba que la fecha introducida no sea superior a la actual

			} while (continuar == false);

			break;
		case "yyyy/mm/dd":
			do {
				String fechacontratacion = funciones
						.valcadena(Settings.lenguaje.getProperty("formato3_fecha_contratacion"), " ");
				boolean result1 = validador.validafecha2(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha3"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new fecha(fechacontratacion, formato);
					boolean result2 = fcont.ValidarFecha();
					if (result2 == true) {
						// compara/controla fechas contratacion y nacimiento
						int edad_fnac=fnac.getanyo();
						int edad_fnac_mayor_edad=edad_fnac+18;
						int anyo_fcont=fcont.getanyo();
						if(anyo_fcont>edad_fnac_mayor_edad) {
							continuar = true;
						}else {
							continuar = false;
						}

						if (result2 == true) {
							int anyo_actual=fnac.anyoactual();
							int anyo_fnac=fcont.getanyo();
							antiguedad=anyo_actual-anyo_fnac;
							
							//antiguedad = fcont.RestaFechas();
							// compara/controla fechas contratacion y nacimiento
							int edad_fnac2=fnac.getanyo();
							int edad_fnac_mayor_edad2=edad_fnac2+18;
							int anyo_fcont2=fcont.getanyo();
							if(anyo_fcont2>edad_fnac_mayor_edad2) {
								continuar = true;
							}else {
								continuar = false;
							}

							int anyo_actual1=fnac.anyoactual();
							int anyo_fnac1=fnac.getanyo();
							edad=anyo_actual1-anyo_fnac1;
							//edad = fnac.RestaFechas();
							valor = edad - antiguedad;
							if (valor < 18) {
								JOptionPane.showMessageDialog(null,
										Settings.lenguaje.getProperty("error1_contratacion_nacimiento"));
								continuar = false;
							} else {
								continuar = true;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}

				}
			} while (continuar == false);
			break;
		case "yyyy-mm-dd":
			do {
				String fechacontratacion = funciones
						.valcadena(Settings.lenguaje.getProperty("formato4_fecha_contratacion"), " ");
				boolean result1 = validador.validafecha3(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_formato_fecha4"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new fecha(fechacontratacion, formato);
					boolean result2 = fcont.ValidarFecha();
					if (result2 == true) {
						//antiguedad = fcont.RestaFechas();
						
						// compara/controla fechas contratacion y nacimiento
						int edad_fnac=fnac.getanyo();
						int edad_fnac_mayor_edad=edad_fnac+18;
						int anyo_fcont=fcont.getanyo();
						if(anyo_fcont>edad_fnac_mayor_edad) {
							continuar = true;
						}else {
							continuar = false;
						}					
						
						if (result2 == true) {
							int anyo_actual=fnac.anyoactual();
							int anyo_fnac=fcont.getanyo();
							antiguedad=anyo_actual-anyo_fnac;
							
							//antiguedad = fcont.RestaFechas();
							// compara/controla fechas contratacion y nacimiento
							int edad_fnac2=fnac.getanyo();
							int edad_fnac_mayor_edad2=edad_fnac2+18;
							int anyo_fcont2=fcont.getanyo();
							if(anyo_fcont2>edad_fnac_mayor_edad2) {
								continuar = true;
							}else {
								continuar = false;
							}

							// comprueba que sea mayor de edad para poder ser
							// contratado;
							int anyo_actual1=fnac.anyoactual();
							int anyo_fnac1=fnac.getanyo();
							edad=anyo_actual1-anyo_fnac1;
							//edad = fnac.RestaFechas();
							valor = edad - antiguedad;
							if (valor < 18) {
								JOptionPane.showMessageDialog(null,
										Settings.lenguaje.getProperty("error1_contratacion_nacimiento"));
								continuar = false;
							} else {
								continuar = true;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_fecha"));
						continuar = false;

					}

				}
			} while (continuar == false);

			break;
		}
		return fcont;

	}

	public static int saca_la_antiguedad_contratacion(fecha fcont) {
		int antiguedad = 0;
		antiguedad = fcont.RestaFechas();
		return antiguedad;
	}

	public static boolean comparador(int edad, int antiguedad) {
		int valor = edad - antiguedad;
		boolean continuar = true;
		if (valor > 18) {
			continuar = true;
		} else {
			continuar = false;
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("Error_comparador"));
		}
		return continuar;
	}

	public static fecha pidefecha_finalizacion_contratacion(fecha fcont) {
		boolean continuar = true;
		int resultado = 0;
		String f_contratacion;
		f_contratacion = fcont.getfecha();
		fecha f = null;
		do {
			String finalizacion_contratacion = funciones.valcadena("Dime la fecha de finalizacion de contrato",
					"fecha");
			boolean result1 = validador.validafecha(finalizacion_contratacion);
			if (result1 == false) {
				JOptionPane.showMessageDialog(null, "Debe introducir la fecha en formato yy/MM/xxxx");
				continuar = false;
			} else {
				f = new fecha(finalizacion_contratacion);
				boolean result2 = f.ValidarFecha_posterior_actual();
				if (result2 != true) {
					JOptionPane.showMessageDialog(null, "Fecha incorrecta,debe introducir una fecha coherente");
					continuar = false;
				} else {
					continuar = true;
				}
				resultado = f.compararfechas(f_contratacion);
				if (resultado == 1) {
					continuar = false;
					JOptionPane.showMessageDialog(null,
							"la fecha de finalizacion de contratacion no puede ser inferior a la fecha de contratacion");
				}
				if (resultado == 2) {
					continuar = true;
				}
				if (resultado == 3) {
					JOptionPane.showMessageDialog(null,
							"la fecha de finalizacion no puede ser igual a la fecha de contratacion");
					continuar = false;
				}
			}
		} while (continuar == false);
		return f;

	}
}




