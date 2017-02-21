package App.modules.users.Model.funciones;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.classes.fecha;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.Classes.admin;
import App.modules.users.Model.Classes.cliente;
import App.modules.users.Model.Classes.normal;
import App.utils.funciones;
import App.utils.validador;

public class funciones_datos_users {
	// funciones para pedir campos i validarlos
	public static String pide_edad() {
		boolean resultado;
		String edad;
		do {
			edad = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_edad"), " ");
			resultado = validador.validaedad(edad);
		} while (resultado == false);
		return edad;
	}

	public static String pide_nombre() {
		boolean resultado = false;
		String nombre;
		do {
			nombre = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_nombre"), " ");
			resultado = validador.validanombre(nombre);
		} while (resultado == false);
		return nombre;
	}

	public static String pide_dni() {
		boolean resultado = false;
		String dni;
		do {
			dni = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_dni"), " ");
			
			resultado = validador.validadni(dni);
		} while (resultado == false);
		return dni;
	}
	public static String pide_dni_update_admin() {
		admin a2 = null;
		int location = -1;
		String dni="";
		boolean continuar=false;
		do {
			a2 = (admin) funciones_users.create_users_dni(2);
			location = Funciones_find.find_admin((admin) a2);
			if (location != -1) {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("dni_existente"), "",//Settings.lenguaje.getProperty("usererror2")
						JOptionPane.ERROR_MESSAGE);
				continuar=false;
			} else {
			dni=a2.getdni();
			continuar=true;
			}
			
		}while(continuar==false);
		
		return dni;
	
	}
	public static String pide_dni_update_cliente() {
		cliente a2 = null;
		int location = -1;
		String dni="";
		boolean continuar=false;
		do {
			a2 = (cliente) funciones_users.create_users_dni(1);
			location = Funciones_find.find_client((cliente) a2);
			if (location != -1) {
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("dni_existente"), "",
						JOptionPane.ERROR_MESSAGE);
				continuar=false;
			} else {
			dni=a2.getdni();
			continuar=true;
			}
			
		}while(continuar==false);
		
		return dni;
	
	}
	public static String pide_dni_update_normal() {
		normal a2 = null;
		int location = -1;
		String dni="";
		boolean continuar=false;
		do {
			a2 = (normal) funciones_users.create_users_dni(3);
			location = Funciones_find.find_normal((normal) a2);
			if (location != -1) {
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("dni_existente"), "",
						JOptionPane.ERROR_MESSAGE);
				continuar=false;
			} else {
			dni=a2.getdni();
			continuar=true;
			}
			
		}while(continuar==false);
		
		return dni;
	
	}
	public static String pide_dni1() {
		boolean resultado = false;
		String dni;
		
		do {
			dni = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_dni"), " ");
			
			resultado = validador.validadni(dni);
		} while (resultado == false);
		return dni;
	}


	public static String pide_apellidos() {
		boolean resultado = false;
		String apellidos;
		do {
			apellidos = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_apellidos"), " ");
			resultado = validador.validaapellidos(apellidos);
		} while (resultado == false);
		return apellidos;
	}

	public static String pide_direccion() {
		boolean resultado = false;
		String direccion;
		do {
			direccion = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_direccion"), " ");
			resultado = validador.validadireccion(direccion);
		} while (resultado == false);
		return direccion;
	}

	public static String pide_sexe() {
		boolean resultado = false;
		String sexe;
		do {
			sexe = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_sexo"), " ");
			resultado = validador.validasexe(sexe);
		} while (resultado == false);
		return sexe;
	}

	public static String pide_usuario() {
		boolean resultado = false;
		String usuario;
		do {
			usuario = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_usuario"), " ");
			resultado = validador.validausuario(usuario);
		} while (resultado == false);
		return usuario;
	}

	public static String pide_contraseña() {
		boolean resultado = false;
		String contraseña;
		do {
			contraseña = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_contraseña"), " ");
			resultado = validador.validacontraseña(contraseña);
		} while (resultado == false);
		return contraseña;
	}

	public static String pide_descuento() {
		boolean resultado = false;
		String descuento;
		do {
			descuento = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_descuento"), " ");
			resultado = validador.validadescuento(descuento);
		} while (resultado == false);
		return descuento;
	}

	public static int pide_comentarios() {
		int comentarios;
		comentarios = funciones.valnumInt(Settings.lenguaje.getProperty("pregunta_comentarios"), " ");
		return comentarios;
	}

	public static int pide_compras() {
		int compras;
		compras = funciones.valnumInt(Settings.lenguaje.getProperty("pregunta_compras"), " ");
		return compras;
	}

	public static String pide_puntos() {
		boolean resultado = false;
		String puntos;
		do {
			puntos = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_puntos"), " ");
			resultado = validador.validapuntos(puntos);
		} while (resultado == false);
		return puntos;
	}

	public static String pide_mail() {
		boolean resultado = false;
		String mail;
		do {
			mail = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_email"), " ");
			resultado = validador.validamail(mail);
		} while (resultado == false);
		return mail;
	}

	public static String pide_ciudad() {
		boolean resultado = false;
		String ciudad;
		do {
			ciudad = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_ciudad"), " ");
			resultado = validador.validaciudad(ciudad);
		} while (resultado == false);
		return ciudad;
	}

	public static String pide_codigpostal() {
		boolean resultado = false;
		String codigo_postal;
		do {
			codigo_postal = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_codigo_postal"), " ");
			resultado = validador.valida_codigopostal(codigo_postal);
		} while (resultado == false);
		return codigo_postal;
	}

	public static String pide_pais() {
		boolean resultado = false;
		String pais;
		do {
			pais = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_pais"), " ");
			resultado = validador.validapais(pais);
		} while (resultado == false);
		return pais;
	}

	public static String pide_movil() {
		boolean resultado = false;
		String movil;
		do {
			movil = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_movil"), " ");
			resultado = validador.validamovil(movil);
		} while (resultado == false);
		return movil;
	}

	public static String pide_numerovisitas() {
		boolean resultado = false;
		String numero_visitas;
		do {
			numero_visitas = funciones.valcadena(Settings.lenguaje.getProperty("pregunta_visitas"), " ");
			resultado = validador.valida_numerovisitas(numero_visitas);
		} while (resultado == false);
		return numero_visitas;
	}

	public static fecha cambia_fecha_nacimiento(admin u) {
		int edad = 0;
		int antiguedad;
		fecha fecha_naixement = null;
		boolean continuar = false;
		
		do {
			fecha_naixement = funciones_fecha_users.pidefecha_nacimiento();
			edad = funciones_fecha_users.saca_la_edad(fecha_naixement);
			antiguedad = ((admin) u).getantiguedad();	
			continuar = funciones_fecha_users.comparador(edad, antiguedad);
		} while (continuar == false);
		((admin) u).setfnac(fecha_naixement);
		return fecha_naixement;
	}

	public static fecha cambia_fecha_contratacion(admin u) {
		fecha fnac = null;
		fecha f_contratacion = null;
		fnac = ((admin) u).getfnac();
		f_contratacion = funciones_fecha_users.pidefecha_contratacion(fnac);
		((admin) u).setfcont(f_contratacion);
		return f_contratacion;
	}

}