package App.modules.users.Model.BLL.BLL_dummies;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import App.classes.fecha;
import App.modules.users.Model.Classes.admin;
import App.modules.users.Model.Classes.singleton;
import App.modules.users.Model.Classes.*;


public class Make_dummies {
	
	public static int valor=0;

	public static String dni(int dni) {
		String dnii = String.valueOf(dni);
		if (dnii.length() < 8) {
			do {
				dnii += '9';
			} while (dnii.length() != 8);
		}
		int dni1 = Integer.parseInt(dnii);
		String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
		return String.valueOf(dni1) + NIF_STRING_ASOCIATION.charAt(dni1 % 23);
	}
	
	public static String dni() {
		String cad = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (cad.length() < 8) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c <= '9')) {
				cad += c;
			}
		}
		int numberdni = Integer.parseInt(cad);
		return dni(numberdni);
	}

	public static String usuario() {
		@SuppressWarnings("unused")
		String user = "";
		String[] users = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe", "jaume",
				"sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe", "oscar",
				"lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena", "beltran",
				"pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return user = users[position];
	}

	public static String contraseña() {
		@SuppressWarnings("unused")
		String pass = "";
		String[] passwords = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe",
				"jaume", "sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe",
				"oscar", "lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena",
				"beltran", "pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return pass = passwords[position];
	}

	public static String sexe() {
		@SuppressWarnings("unused")
		String sexe;
		String[] sexes = { "hombre", "mujer" };

		int position = (int) (Math.random() * 222) % 2;
		return sexe = sexes[position];
	}

	public static String nombre() {
		@SuppressWarnings("unused")
		String name = "";
		String[] names = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe", "jaume",
				"sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe", "oscar",
				"lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena", "beltran",
				"pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return name = names[position];
	}

	public static String apellidos() {
		@SuppressWarnings("unused")
		String surname = "";
		String[] surnames = { "alfonso", "aliaga", "bas", "bataller", "boluda", "conesa", "camarena", "cucart", "doria",
				"ferrero", "garcia", "figuera", "tormo", "montagud", "gramage", "ubeda", "revert", "cordoba", "sempere",
				"martinez", "lopez", "albuixech", "torro", "belda", "mateu", "ribera", "satorres", "rubio", "cifuentes",
				"frances", "gomez", "mico", "ferrandiz", "casanova" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String ciudad() {
		@SuppressWarnings("unused")
		String surname = "";
		String[] surnames = { "alicante", "valencia", "malaga", "barcelona", "madrid", "granada", "alcoy", "muro",
				"cocentaina", "benillup", "cela", "ontinyent", "albaida", "montaverner", "gandia", "denia",
				"montitxelvo", "cordoba", "ourense", "Coruña", "alcorcon" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String pais() {
		@SuppressWarnings("unused")
		String surname = "";
		String[] surnames = { "España", "Francia", "Italia", "Andorra", "Grecia", "Noruega", "Rusia", "China",
				"Alemania", "Abu dabi" };

		int position = (int) (Math.random() * 222) % 10;
		return surname = surnames[position];
	}

	public static String email() {
		@SuppressWarnings("unused")
		String email = "";
		String[] emails = { "vicent", "walter", "joan", "maria", "daniel", "josep", "sara", "pepa", "felipe", "jaume",
				"sergio", "paco", "emilio", "nando", "alfons", "eduard", "atalia", "veronica", "fina", "pepe", "oscar",
				"lorelay", "jim", "lola", "laia", "ismael", "jordi", "ramon", "javier", "nuria", "elena", "beltran",
				"pablo", "juanjo" };

		int position = (int) (Math.random() * 222) % 10;
		return email = emails[position] + "@gmail.com";
	}

	public static String movil() {
		String mobilephone = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (mobilephone.length() < 9) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c <= '9')) {
				mobilephone += c;
			}
		}
		return mobilephone;
	}

	public static String codigo_postal() {
		String mobilephone = "";
		long time = new java.util.GregorianCalendar().getTimeInMillis();
		Random random = new Random(time);
		while (mobilephone.length() < 5) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c == '5')) {
				mobilephone += c;
			}
		}
		return mobilephone;
	}

	public static String visitas() {
		String[] years = { "19", "20" };
		int year3 = (int) (Math.random() * (1 - 90) + 90);
		int position = (int) (Math.random() * 222) % 2;
		String year2 = years[position] + year3;
		
		return year2;
	}

	public static fecha fechanacimiento() {
		String[] years = { "19", "20" };
		int dia = (int) (Math.random() * (1 - 31) + 31);
		int mes = (int) (Math.random() * (1 - 12) + 12);
		int year3 = (int) (Math.random() * (1 - 90) + 90);
		int position = (int) (Math.random() * 222) % 2;
		String year2 = years[position] + year3;
		int anyo = Integer.parseInt(year2);
		String fecha = (dia + "/" + mes + "/" + anyo);
		return new fecha(fecha);

	}

	public static fecha fnac() {
		int dia = ThreadLocalRandom.current().nextInt(1, 31 + 1);
		int mes = ThreadLocalRandom.current().nextInt(1, 12 + 1);
		int anyo = ThreadLocalRandom.current().nextInt(1945, 1998 + 1);
		valor=anyo;
		String fecha = (dia + "/" + mes + "/" + anyo);
		fecha fnac = new fecha(fecha);
		return fnac;
	}

	public static fecha fcont() {
		fecha fcont = null;
		int resultado=valor+18;
		int dia = ThreadLocalRandom.current().nextInt(1, 31 + 1);
		int mes = ThreadLocalRandom.current().nextInt(1, 12 + 1);
		int anyo = ThreadLocalRandom.current().nextInt((resultado), 2016 + 1);
		String fecha = (dia + "/" + mes + "/" + anyo);
		fcont = new fecha(fecha);
		return fcont;
	}

	/*
	 * Admin
	 * 
	 */
	public static String direccion() {
		@SuppressWarnings("unused")
		String calle = "";
		String[] calles = { "bernat fenollar", "pare lluis ", "av albaida", "el torrater", "calle valencia", "cale bcn",
				"camarena", "cucart", "doria", "ferrero roche", "av almaig", "calle cantonera" };

		int position = (int) (Math.random() * 222) % 10;
		return calle = calles[position];
	}

	public static char moneda() {
		@SuppressWarnings("unused")
		char moneda = ' ';
		char[] calles = { '€', '$', 'b' };

		int position = (int) (Math.random() * 222) % 2;
		return moneda = calles[position];
	}

	public static fecha fechacontratacion() {
		String[] years = { "19", "20" };
		int day = (int) (Math.random() * (1 - 31) + 31);
		int month = (int) (Math.random() * (1 - 12) + 12);
		int year3 = (int) (Math.random() * (18 - 80) + 80);
		int position = (int) (Math.random() * 222) % 2;
		String year2 = years[position] + year3;
		int year = Integer.parseInt(year2);
		String fecha = (day + "/" + month + "/" + year);
		return new fecha(fecha);
	}

	public static float sueldo() {
		float salary = (float) (Math.random() * (600 - 2000) + 2000);
		return (float) Math.rint(salary * 100) / 100;
	}

	public static int comentarios() {
		int activity = (int) (Math.random() * (10 - 100) + 100);
		return (int) Math.rint(activity * 100) / 100;
	}

	/*
	 * Client
	 * 
	 */

	public static int compras() {
		int shopping = (int) (Math.random() * (50 - 1000) + 1000);
		return (int) Math.rint(shopping * 100) / 100;
	}

	public static int descuentos() {
		int dtos = (int) (Math.random() * (5 - 100) + 100);
		return (int) Math.rint(dtos * 100) / 100;
	}

	public static boolean premium() {
		@SuppressWarnings("unused")
		boolean premium;
		boolean[] premiums = { true, false };

		int position = (int) (Math.random() * 222) % 2;
		return premium = premiums[position];
	}

	public static String typeclient() {
		@SuppressWarnings("unused")
		String typeclient = "";
		String[] typeclients = { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "B1", "B2", "B3", "B4",
				"B5", "B6", "B7", "B8", "B9", "B10", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "D1",
				"D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", };

		int position = (int) (Math.random() * 222) % 10;
		return typeclient = typeclients[position];
	}

	/*
	 * User_register
	 * 
	 */
	public static int movement() {
		int movement = (int) (Math.random() * (10 - 100) + 100);
		return (int) Math.rint(movement * 100) / 100;
	}

	public static int puntos() {
		int point = (int) (Math.random() * (5 - 50) + 50);
		return (int) Math.rint(point * 100) / 100;
	}

	/*
	 * BUILDER
	 * 
	 */
	public static users makedummies_admin() {
		singleton.usuarioadmin.clear();
		users a1 = null;
		for (int i = 0; i < 5; i++) {
			a1 = new admin(nombre(), apellidos(), dni(), direccion(), sexe(), fnac(), usuario(), contraseña(), email(),
					pais(), ciudad(), codigo_postal(), movil(), fcont(), moneda());
			singleton.usuarioadmin.add((admin) a1);
		}
		return a1;
	}

	public static users makedummies_client() {
		singleton.usuariocliente.clear();
		users c1 = null;
		for (int i = 0; i < 5; i++) {
			c1 = new cliente(nombre(), apellidos(), dni(), direccion(), sexe(), fnac(), usuario(),
					contraseña(), compras(), email(), ciudad(), codigo_postal());
			singleton.usuariocliente.add((cliente) c1);
		}
		return c1;
	}

	public static users makedummies_userregister() {
		singleton.usuarionormal.clear();
		users u1 = null;
		for (int i = 0; i < 5; i++) {
			u1 = new normal(nombre(), apellidos(), dni(), direccion(), sexe(), fnac(), comentarios(),
					visitas());
			singleton.usuarionormal.add((normal) u1);
		}
		return u1;
	}
}
