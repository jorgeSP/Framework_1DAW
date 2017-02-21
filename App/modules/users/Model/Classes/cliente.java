package App.modules.users.Model.Classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import App.classes.Settings;
import App.classes.fecha;
import App.modules.users.Model.funciones.funciones_fecha_users;
import App.modules.users.Model.funciones.funciones_recalcular_datos;

@SuppressWarnings("serial")
@XStreamAlias("cliente")
public class cliente extends users {
	/// declaraciones/atributos users
	@XStreamAlias("usuario")
	private String usuario;
	@XStreamAlias("contraseña")
	private String contraseña;
	@XStreamAlias("descuento")
	private int descuento;
	@XStreamAlias("compras")
	private int compras;
	@XStreamAlias("email")
	private String email;
	@XStreamAlias("ciudad")
	private String ciudad;
	@XStreamAlias("codigo_postal")
	private String codigo_postal;
	@XStreamAlias("alta")
	private String alta;

	// constructor users cliente
	public cliente(String nombre, String apellidos, String dni, String direccion, String sexe, fecha fnac,
			String usuario, String contraseña, int compras, String email, String ciudad, String codigo_postal) {
		super(nombre, apellidos, dni, direccion, sexe, fnac);

		this.usuario = usuario;
		this.contraseña = contraseña;
		this.compras = compras;
		this.email = email;
		this.ciudad = ciudad;
		this.codigo_postal = codigo_postal;
	}

	public cliente(String dni) {
		super(dni);
	}

	public cliente() {
		super();
	}

	// getters users cliente
	public String getusuario() {
		return this.usuario;
	}

	public String getcontraseña() {
		return this.contraseña;
	}

	public int getdescuento() {
		int resultado = funciones_recalcular_datos.calcula_descuento(compras);
		this.descuento = resultado;
		return this.descuento;
	}

	public int getcompras() {
		return this.compras;
	}

	public String getemail() {
		return this.email;
	}

	public String getciudad() {
		return this.ciudad;
	}

	public String getcodigo_postal() {
		return this.codigo_postal;
	}

	public String getalta(String formato) {
		String fechaalta;
		fechaalta = funciones_fecha_users.fecha_alta_sistema(this.getfnac());
		this.alta = fechaalta;
		return this.alta;
	}

	// setters users cliente
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}

	public void setcontraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void setcompras(int compras) {
		this.compras = compras;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public void setciudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setcodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	// toString users cliente
	public String toString() {
		String cad = " ";
		boolean dummies = Settings.getInstance().getdummies();
		if (dummies == false) {
			cad = (Settings.lenguaje.getProperty("nombre") + " " + this.getnombre() + "\n"
					+ Settings.lenguaje.getProperty("apellidos") + " " + this.getapellidos() + "\n"
					+ Settings.lenguaje.getProperty("dni") + " " + this.getdni() + "\n"
					+ Settings.lenguaje.getProperty("direccion") + " " + this.getdireccion() + "\n"
					+ Settings.lenguaje.getProperty("sexo") + " " + this.getsexe() + "\n"
					+ Settings.lenguaje.getProperty("usuario") + " " + this.getusuario() + "\n"
					+ Settings.lenguaje.getProperty("contraseña") + " " + this.getcontraseña() + " \n"
					+ Settings.lenguaje.getProperty("descuento") + " " + this.getdescuento() + "%\n"
					+ Settings.lenguaje.getProperty("compras") + " " + this.getcompras() + "\n"
					+ Settings.lenguaje.getProperty("email") + " " + this.getemail() + "\n"
					+ Settings.lenguaje.getProperty("ciudad") + " " + this.getciudad() + "\n"
					+ Settings.lenguaje.getProperty("cod_postal") + " " + this.getcodigo_postal() + "\n"
					+ Settings.lenguaje.getProperty("fecha_nacimiento") + " "
					+ funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac()) + "\n"
					+ Settings.lenguaje.getProperty("edad") + " " + this.getedad() + " \n"
					+ Settings.lenguaje.getProperty("fecha_alta") + " " + this.getalta(alta));
		}
		if (dummies == true) {
			cad = (Settings.lenguaje.getProperty("nombre") + " " + this.getnombre() + "\n"
					+ Settings.lenguaje.getProperty("apellidos") + " " + this.getapellidos() + "\n"
					+ Settings.lenguaje.getProperty("dni") + " " + this.getdni() + "\n"
					+ Settings.lenguaje.getProperty("direccion") + " " + this.getdireccion() + "\n"
					+ Settings.lenguaje.getProperty("sexo") + " " + this.getsexe() + "\n"
					+ Settings.lenguaje.getProperty("usuario") + " " + this.getusuario() + "\n"
					+ Settings.lenguaje.getProperty("contraseña") + " " + this.getcontraseña() + " \n"
					+ Settings.lenguaje.getProperty("descuento") + " " + this.getdescuento() + "%\n"
					+ Settings.lenguaje.getProperty("compras") + " " + this.getcompras() + "\n"
					+ Settings.lenguaje.getProperty("email") + " " + this.getemail() + "\n"
					+ Settings.lenguaje.getProperty("ciudad") + " " + this.getciudad() + "\n"
					+ Settings.lenguaje.getProperty("cod_postal") + " " + this.getcodigo_postal() + "\n"
					+ Settings.lenguaje.getProperty("fecha_nacimiento") + " "
					+ funciones_recalcular_datos.devuelve_formato_nacimiento(getfnac()) + "\n"
					+ Settings.lenguaje.getProperty("edad") + " " + this.getedad() + " \n"
					+ Settings.lenguaje.getProperty("fecha_alta") + " " + this.getalta(alta));
		}
		return cad;
	}

}