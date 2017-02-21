package App.modules.users.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import App.classes.*;
import App.modules.users.Model.funciones.funciones_recalcular_datos;


@SuppressWarnings("serial")
@XStreamAlias("normal")
public class normal extends users {
	// declaraciones/atributos users normalmodules.
	@XStreamAlias("comentarios")
	private int comentarios;
	@XStreamAlias("numero_visitas")
	private String numero_visitas;
	@XStreamAlias("puntos")
	private int puntos;

	// constructor users normal
	public normal(String nombre, String apellidos, String dni, String direccion, String sexe, fecha fnac,
			int comentarios, String numero_visitas) {
		super(nombre, apellidos, dni, direccion, sexe, fnac);
		this.comentarios = comentarios;
		this.numero_visitas = numero_visitas;
	}
	public normal(String dni) {
		super(dni);
	}
	public normal() {
		super();
	}

	// getters users normal
	public int getcomentarios() {
		return this.comentarios;
	}

	public int getpuntos() {

		int puntuacion = funciones_recalcular_datos.karma(this.getcomentarios());
		this.puntos = puntuacion;
		return this.puntos;
	}

	public String getnumeros_visitas() {
		return this.numero_visitas;
	}

	// setters users normal
	public void setcomentarios(int comentarios) {
		this.comentarios = comentarios;
	}

	public void setnumero_visitas(String numero_visitas) {
		this.numero_visitas = numero_visitas;
	}

	
	// toString users normal
	public String toString() {
		String cad = "";
		boolean dummies =Settings.getInstance().getdummies();
		if (dummies == false) {
			cad = (Settings.lenguaje.getProperty("nombre") + " " + this.getnombre() + "\n"
					+ Settings.lenguaje.getProperty("apellidos") + " " + this.getapellidos() + "\n"
					+ Settings.lenguaje.getProperty("dni") + " " + this.getdni() + "\n"
					+ Settings.lenguaje.getProperty("direccion") + " " + this.getdireccion() + "\n"
					+ Settings.lenguaje.getProperty("sexo") + " " + this.getsexe() + "\n"
					+ Settings.lenguaje.getProperty("fecha_nacimiento") + " "
					+ funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac()) + "\n"
					+ Settings.lenguaje.getProperty("comentarios") + " " + this.getcomentarios() + "\n"
					+ Settings.lenguaje.getProperty("numero_visitas") + " " + this.getnumeros_visitas() + "\n"
					+ Settings.lenguaje.getProperty("puntos") + " " + this.getpuntos());
		}
		if (dummies == true) {
			cad = (Settings.lenguaje.getProperty("nombre") + " " + this.getnombre() + "\n"
					+ Settings.lenguaje.getProperty("apellidos") + " " + this.getapellidos() + "\n"
					+ Settings.lenguaje.getProperty("dni") + " " + this.getdni() + "\n"
					+ Settings.lenguaje.getProperty("direccion") + " " + this.getdireccion() + "\n"
					+ Settings.lenguaje.getProperty("sexo") + " " + this.getsexe() + "\n"
					+ Settings.lenguaje.getProperty("fecha_nacimiento") + " "
					+ funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac()) + "\n"
					+ Settings.lenguaje.getProperty("comentarios") + " " + this.getcomentarios() + "\n"
					+ Settings.lenguaje.getProperty("numero_visitas") + " " + this.getnumeros_visitas() + "\n"
					+ Settings.lenguaje.getProperty("puntos") + " " + this.getpuntos());
		}

		return cad;
	}

}
