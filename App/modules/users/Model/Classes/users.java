package App.modules.users.Model.Classes;




import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import App.classes.*;
import App.modules.users.Model.funciones.funciones_recalcular_datos;

@SuppressWarnings("serial")
@XStreamAlias("users")
public abstract class users implements Comparable<users>,Serializable{
	/// declaraciones/atributos users
	@XStreamAlias("edad")
	public int edad;
	@XStreamAlias("nombre")
	private String nombre;
	@XStreamAlias("apellidos")
	private String apellidos;
	@XStreamAlias("dni")
	private String dni;
	@XStreamAlias("direccion")
	private String direccion;
	@XStreamAlias("sexe")
	private String sexe;
	@XStreamAlias("cad")
	String cad = "";
	@XStreamAlias("fnac")
	private fecha fnac;

	/// constructor users
	public users(String nombre, String apellidos, String dni, String direccion, String sexe, fecha fnac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.sexe = sexe;
		this.fnac = fnac;
	}
	public users(String dni) {
		this.dni = dni;
	}
	public users() {
		
	}
	/// getters users

	public int getedad() {
		int valor = this.calculaedad();
		this.edad = valor;
		return this.edad;
	}
	

	public String getnombre() {
		return nombre;
	}

	public String getapellidos() {
		return apellidos;
	}

	public String getdni() {
		return dni;
	}

	public String getdireccion() {
		return direccion;
	}

	public String getsexe() {
		return sexe;
	}

	public fecha getfnac() {
		return fnac;
	}

	// setters users
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public void setapellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setdni(String dni) {
		this.dni = dni;
	}

	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setsexe(String sexe) {
		this.sexe = sexe;
	}

	public void setfnac(fecha fnac) {
		this.fnac = fnac;
	}

	// provar
	public int calculaedad() {
		int anyo_nac=fnac.getanyo();
		int anyo_actual=fnac.anyoactual();	
		int valor=anyo_actual-anyo_nac;
		// int valor = this.fnac.RestaFechas();
		return valor;
	}
	
	public int compareTo(users param) {//para ordenar los empleados por dni
		if(this.getdni().compareTo(param.getdni())>0)
			return 1;
		if(this.getdni().compareTo(param.getdni())<0)
			return -1;
		return 0;
	  }
	
	public boolean equals(Object param){ //serveix peral find
		return getdni().equals(((users)param).getdni());
	}	
	public String Valor (){
		String e=funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac());
		return e;
	}
	// toString users
	public abstract String toString();
}