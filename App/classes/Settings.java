package App.classes;


import java.io.Serializable;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import App.utils.funciones;
import App.utils.json_auto_ajustes;
import App.main_dummies;
import App.classes.lenguajes;

@SuppressWarnings("serial")
@XStreamAlias("Settings")
public class Settings implements Serializable{
	@XStreamAlias("moneda")
	private char moneda;
	@XStreamAlias("formato_fecha")
	private String formato_fecha;
	@XStreamAlias("lenguajes")
	private  String lenguajes;
	@XStreamAlias("decimales")
	private int decimales;
	@XStreamAlias("dummies")
	private boolean dummies;
	@XStreamAlias("ficheros")
	private int ficheros;
	private String tema;
	@XStreamAlias("lenguaje")
	public static lenguajes lenguaje;
	@XStreamAlias("instance")
	public static Settings instance;

	private static String[] args;
	public Settings(char moneda, String formato_fecha, String lenguajes, int decimales, boolean dummies,int ficheros,String lenguaje) {
		this.moneda = moneda;
		this.formato_fecha = formato_fecha;
		
		this.decimales = decimales;
		this.dummies = dummies;
		this.ficheros=ficheros;
	}

	public Settings() {
		this.moneda = '€';
		this.formato_fecha = "dd/mm/yyyy";
		this.decimales = 1;
		this.dummies = false;
		this.ficheros=0;
		this.lenguajes = "es";
		this.tema="METAL";
	}
	public static Settings getInstance () {
		if (instance == null){
			
			instance = new Settings ();
			json_auto_ajustes.openjson_config();
			lenguaje = new lenguajes("es");
//			singleton.usuariocliente = new ArrayList <cliente> ();
//			singleton.usuariocliente = new ArrayList <cliente> ();
//			singleton.usuarionormal = new ArrayList <normal> ();
		boolean dummies = funciones.YES_NO("¿activar dummies?");
			if (dummies == true) {
				//Settings.getInstance().setdummies(true);
				
				main_dummies.main(args);
			}
		}
	return instance;
	}
	public String getTema() {
		return this.tema;
	}
	public String getlenguaje() {
		return this.lenguajes;
	}
	
	public int getficheros() {
		return this.ficheros;
	}

	public char getmoneda() {
		return this.moneda;
	}

	public boolean getdummies() {
		return this.dummies;
	}

	public String getlenguajes() {
		return this.lenguajes;
	}

	public String getformato_fecha() {
		return this.formato_fecha;
	}

	public int getdecimales() {
		return this.decimales;
	}

	public void setficheros(int ficheros) {
		this.ficheros = ficheros;

	}
	public void setlenguaje(String lenguajes) {
		this.lenguajes = lenguajes;
		lenguaje.getInstance().setlenguaje();
	}

	public void setmoneda(char moneda) {
		this.moneda = moneda;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setdummies(boolean dummies) {
		this.dummies = dummies;
	}

	public void setdecimales(int decimales) {
		this.decimales = decimales;
	}

	public void setformato_fecha(String formato_fecha) {
		this.formato_fecha = formato_fecha;
	}

	public String toString() {
		String cad = "";
		cad = ("moneda " + this.getmoneda() + "decimales " + this.getdecimales() + " formato_fecha "
				+ this.getformato_fecha() + " lenguajes " + this.getlenguajes() + "dummies " + this.getdummies() + "ficheros " + this.getficheros());
		return cad;
	}

}
