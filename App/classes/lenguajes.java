package App.classes;

import java.io.IOException;
import java.util.Properties;

public class lenguajes extends Properties {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static lenguajes instance;

	public lenguajes(String lenguaje) {
		switch (Settings.getInstance().getlenguajes()) {
		case "en":
			getProperties("en.properties");
			break;
		case "ita":
			getProperties("ita.properties");
			break;
		case "es":
			getProperties("es.properties");
		}
	}

	public lenguajes getInstance() {
		if (instance == null) {
			instance = new lenguajes("es");
		}
		return instance;
	}

	public void setlenguaje() {

		switch (Settings.getInstance().getlenguajes()) {
		case "en":
			getProperties("en.properties");
			break;
		case "ita":
			getProperties("ita.properties");
			break;
		case "es":
			getProperties("es.properties");
			break;
		}

	}

	public void getProperties(String lenguaje) {

		try {
			this.load(getClass().getResourceAsStream(lenguaje));
		} catch (IOException ex) {
		}

	}
}