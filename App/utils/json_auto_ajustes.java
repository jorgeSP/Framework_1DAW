package App.utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import App.classes.Settings;

public class json_auto_ajustes {
	public static void savejson_config() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/fichero_info_justes/ajustes.json";
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("Settings", Settings.class);
			Gson gson = new Gson();
			String json = gson.toJson(Settings.getInstance());
			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error al guardar json", " ", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void openjson_config() {
		String PATH = null;
		Settings config = null;

		try {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("Settings", Settings.class);

			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/fichero_info_justes/ajustes.json";

			JsonReader reader = new JsonReader(new FileReader(PATH));
			JsonParser parser = new JsonParser();
			JsonElement root = parser.parse(reader);

			Gson json = new Gson();
			config = json.fromJson(root, Settings.class);
			Settings.getInstance().setmoneda(config.getmoneda());
			Settings.getInstance().setformato_fecha(config.getformato_fecha());
			Settings.getInstance().setdecimales(config.getdecimales());
			Settings.getInstance().setlenguaje(config.getlenguajes());
			//Settings.getInstance().setTema(config.getTema());
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "error al abrir json"," ",
			// JOptionPane.ERROR_MESSAGE);
		}
	}

	public static int openfichero_config() {
		String PATH = null;
		Settings config = null;
		int fitch = 0;
		try {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("Settings", Settings.class);

			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/fichero_info_justes/ajustes.json";

			JsonReader reader = new JsonReader(new FileReader(PATH));
			JsonParser parser = new JsonParser();
			JsonElement root = parser.parse(reader);

			Gson json = new Gson();
			config = json.fromJson(root, Settings.class);
			fitch = config.getficheros();

		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "error al abrir json"," ",
			// JOptionPane.ERROR_MESSAGE);
		}
		return fitch;
	}
	
	public static String opentema_config() {
		String PATH = null;
		Settings config = null;
		String fitch = "";
		try {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("Settings", Settings.class);

			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/fichero_info_justes/ajustes.json";

			JsonReader reader = new JsonReader(new FileReader(PATH));
			JsonParser parser = new JsonParser();
			JsonElement root = parser.parse(reader);

			Gson json = new Gson();
			config = json.fromJson(root, Settings.class);
			fitch = config.getTema();

		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "error al abrir json"," ",
			// JOptionPane.ERROR_MESSAGE);
		}
		return fitch;
	}
}
