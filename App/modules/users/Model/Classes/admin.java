package App.modules.users.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import App.classes.*;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.funciones.funciones_recalcular_datos;
import App.utils.format;

@SuppressWarnings("serial")
@XStreamAlias("admin")
public class admin extends users {
	// declaraciones/atributos users admin
	@XStreamAlias("usuario")
	private String usuario;
	@XStreamAlias("contraseña")
	private String contraseña;
	@XStreamAlias("sueldo")
	private float sueldo;
	@XStreamAlias("email")
	private String email;
	@XStreamAlias("pais")
	private String pais;
	@XStreamAlias("ciudad")
	private String ciudad;
	@XStreamAlias("codigo_postal")
	private String codigo_postal;
	@XStreamAlias("movil")
	private String movil;
	@XStreamAlias("fcont")
	private fecha fcont;
	@XStreamAlias("antiguedad")
	private int antiguedad;
	@XStreamAlias("decimales")
	private int decimales;
	@XStreamAlias("moneda")
	private char moneda;
	@XStreamAlias("sueldo1")
	String sueldo1;

	// constructor
	public admin(String nombre, String apellidos, String dni, String direccion, String sexe, fecha fnac, String usuario,
			String contraseña, String email, String pais, String ciudad, String codigo_postal, String movil,
			fecha fcont, char moneda) {
		super(nombre, apellidos, dni, direccion, sexe, fnac);
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.email = email;
		this.pais = pais;
		this.ciudad = ciudad;
		this.codigo_postal = codigo_postal;
		this.movil = movil;
		this.fcont = fcont;
		this.moneda = moneda;
		this.sueldo = funciones_recalcular_datos.saca_sueldo(this.getantiguedad());

	}

	public admin(String dni) {
		super(dni);
	}

	public admin() {
		super();
	}

	// getters
	public String getusuario() {
		return this.usuario;
	}

	public String getcontraseña() {
		return this.contraseña;
	}

	public String getemail() {
		return this.email;
	}

	public String getpais() {
		return this.pais;
	}

	public String getciudad() {
		return this.ciudad;
	}

	public String getcodigo_postal() {
		return this.codigo_postal;
	}

	public String getmovil() {

		return this.movil;
	}

	public fecha getfcont() {
		return this.fcont;
	}

	public char getmoneda() {
		char valor = funciones_recalcular_datos.devuelve_formato_moneda();
		this.moneda = valor;
		return this.moneda;
	}

	public int getantiguedad() {
		int resto = funciones_recalcular_datos.calculaantiguedad(fcont);
		this.antiguedad = resto;
		return this.antiguedad;
	}

	public String getsueldo() {
		String nuevo_sueldo = format.formatomoneda(this.sueldo);
		this.sueldo1 = nuevo_sueldo;
		return this.sueldo1;
	}

	public int getdecimales() {
		int resultado = funciones_users.decimales_defecto;
		this.decimales = resultado;
		return this.decimales;
	}

	// setters
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}

	public void setcontraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setpais(String pais) {
		this.pais = pais;
	}

	public void setciudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setcodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public void setmovil(String movil) {
		this.movil = movil;
	}

	public void setfcont(fecha fcont) {
		this.fcont = fcont;
	}

	public void setmoneda(char moneda) {
		this.moneda = moneda;
	}

	public String toString() {
		String cad = "";
		boolean dummies = Settings.getInstance().getdummies();
		if (dummies == false) {
			cad = (Settings.lenguaje.getProperty("nombre") + " " + this.getnombre() + "\n"
					+ Settings.lenguaje.getProperty("apellidos") + " " + this.getapellidos() + "\n"
					+ Settings.lenguaje.getProperty("dni") + " " + this.getdni() + "\n"
					+ Settings.lenguaje.getProperty("direccion") + " " + this.getdireccion() + "\n"
					+ Settings.lenguaje.getProperty("sexo") + " " + this.getsexe() + "\n"
					+ Settings.lenguaje.getProperty("fecha_nacimiento") + " "
					+ funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac()) + "\n"
					+ Settings.lenguaje.getProperty("edad") + " " + this.getedad() + "\n"
					+ Settings.lenguaje.getProperty("usuario") + " " + this.getusuario() + "\n"
					+ Settings.lenguaje.getProperty("contraseña") + " " + this.getcontraseña() + "\n"
					+ Settings.lenguaje.getProperty("email") + " " + this.getemail() + "\n"
					+ Settings.lenguaje.getProperty("pais") + " " + this.getpais() + "\n"
					+ Settings.lenguaje.getProperty("ciudad") + " " + this.getciudad() + "\n"
					+ Settings.lenguaje.getProperty("cod_postal") + " " + this.getcodigo_postal() + "\n"
					+ Settings.lenguaje.getProperty("movil") + " " + this.getmovil() + "\n"
					+ Settings.lenguaje.getProperty("fecha_contratacion") + " "
					+ funciones_recalcular_datos.devuelve_formato_contratacion(getfcont()) + "\n"
					+ Settings.lenguaje.getProperty("antiguedad_contratacion") + " " + this.getantiguedad()) + "años \n"
					+ Settings.lenguaje.getProperty("sueldo") + " " + this.getsueldo() + this.getmoneda() + "\n"
					+ Settings.lenguaje.getProperty("moneda") + " " + this.getmoneda();
		}
		if (dummies == true) {
			cad = (Settings.lenguaje.getProperty("nombre") + " " + this.getnombre() + "\n"
					+ Settings.lenguaje.getProperty("apellidos") + " " + this.getapellidos() + "\n"
					+ Settings.lenguaje.getProperty("dni") + " " + this.getdni() + "\n"
					+ Settings.lenguaje.getProperty("direccion") + " " + this.getdireccion() + "\n"
					+ Settings.lenguaje.getProperty("sexo") + " " + this.getsexe() + "\n"
					+ Settings.lenguaje.getProperty("fecha_nacimiento") + " "
					+ funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac()) + "\n"
					+ Settings.lenguaje.getProperty("edad") + " " + this.getedad() + "\n"
					+ Settings.lenguaje.getProperty("usuario") + " " + this.getusuario() + "\n"
					+ Settings.lenguaje.getProperty("contraseña") + " " + this.getcontraseña() + "\n"
					+ Settings.lenguaje.getProperty("email") + " " + this.getemail() + "\n"
					+ Settings.lenguaje.getProperty("pais") + " " + this.getpais() + "\n"
					+ Settings.lenguaje.getProperty("ciudad") + " " + this.getciudad() + "\n"
					+ Settings.lenguaje.getProperty("cod_postal") + " " + this.getcodigo_postal() + "\n"
					+ Settings.lenguaje.getProperty("movil") + " " + this.getmovil() + "\n"
					+ Settings.lenguaje.getProperty("fecha_contratacion") + " "
					+ funciones_recalcular_datos.devuelve_formato_contratacion(getfcont()) + "\n"
					+ Settings.lenguaje.getProperty("antiguedad_contratacion") + " " + this.getantiguedad()) + "años \n"
					+ Settings.lenguaje.getProperty("sueldo") + " " + this.getsueldo() + this.getmoneda() + "\n"
					+ Settings.lenguaje.getProperty("moneda") + " " + this.getmoneda();
		}
		// format.formatomoneda(this.getsueldo(), moneda,this.getdecimales())
		return cad;
	}
}
