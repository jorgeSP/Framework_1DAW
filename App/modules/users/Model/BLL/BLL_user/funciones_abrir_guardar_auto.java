package App.modules.users.Model.BLL.BLL_user;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import com.google.gson.JsonParser;

import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import App.modules.users.Model.Classes.*;
import App.modules.users.Model.Classes.singleton;
import App.utils.json_auto_ajustes;



@SuppressWarnings("deprecation")
public class funciones_abrir_guardar_auto {

	private static final String ENCODING = "UTF-8";

	/*
	 * -------------------------------FUNCIONES GENERICAS ABRIR GUARDAR
	 * JSON,TXT,XML-------------------------------------
	 */

	public static void abrir_ficheros_auto() {

		int archivo = json_auto_ajustes.openfichero_config();
		
		switch (archivo) {
		case 0:
			singleton.usuarioadmin = funciones_abrir_guardar_auto.abrirxml_usuario_admin_auto();
			singleton.usuarionormal = funciones_abrir_guardar_auto.abrirxml_usuario_normal_auto();
			singleton.usuariocliente = funciones_abrir_guardar_auto.abrirxml_usuario_cliente_auto();
			break;
		case 1:
			singleton.usuarioadmin = funciones_abrir_guardar_auto.abrirjson_usuario_admin_auto();

			break;
		case 2:
			singleton.usuarioadmin = funciones_abrir_guardar_auto.abretxt_usuario_admin_auto();
			singleton.usuarionormal = funciones_abrir_guardar_auto.abretxt_usuario_normal_auto();
			singleton.usuariocliente = funciones_abrir_guardar_auto.abretxt_usuario_cliente_auto();
			break;

		}

	}

	public static void guardar_ficheros_auto() {
		int archivo = json_auto_ajustes.openfichero_config();

		switch (archivo) {
		case 0:
			funciones_abrir_guardar_auto.guardarxml_usuario_admin_auto();
			funciones_abrir_guardar_auto.guardarxml_usuario_normal_auto();
			funciones_abrir_guardar_auto.guardarxml_usuario_cliente_auto();
			break;
		case 1:
			funciones_abrir_guardar_auto.guardar_Json_usuario_admin_auto();
			funciones_abrir_guardar_auto.guardar_Json_usuario_cliente_auto();
			funciones_abrir_guardar_auto.guardar_Json_usuario_normal_auto();
			break;
		case 2:
			funciones_abrir_guardar_auto.guardartxt_usuario_admin_auto();
			funciones_abrir_guardar_auto.guardartxt_usuario_cliente_auto();
			funciones_abrir_guardar_auto.guardartxt_usuario_normal_auto();
			break;

		}
	}

	/*
	 * -----------------------------------------GUARDAR
	 * JSON,TXT,XML------------------------------------------------
	 */

	public static void guardar_Json_usuario_admin_auto() {

		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/utils/admin/archivos/admin.json";
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {

			Gson gson = new Gson();
			String json = gson.toJson(singleton.usuarioadmin.toString());
			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void guardar_Json_usuario_cliente_auto() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/App/modules/users/utils/cliente/archivos/cliente.json";
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {

			Gson gson = new Gson();
			String json = gson.toJson(singleton.usuariocliente.toString());
			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void guardar_Json_usuario_normal_auto() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/App/modules/users/utils/normal/archivos/normal.json";
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {

			Gson gson = new Gson();
			String json = gson.toJson(singleton.usuarionormal.toString());
			FileWriter fileXml = new FileWriter(PATH);
			fileXml.write(json.toString());
			fileXml.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	// -----------------------------------------------------------------------------\\

	public static void guardartxt_usuario_admin_auto() {

		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/admin/archivos/admin.txt";
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (singleton.usuarioadmin.size() > 0) {
		try {
			File f;
			f = new File(PATH);
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(singleton.usuarioadmin);
			o.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}else {
		try {
			File f;
			f = new File(PATH);
			singleton.usuarioadmin = new ArrayList<admin>();
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(singleton.usuarioadmin);
			o.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	}

	public static void guardartxt_usuario_cliente_auto() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/App/modules/users/Model/ficheros_usuarios/cliente/archivos/cliente.txt";
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (singleton.usuariocliente.size() > 0) {
		try {

			File f;
			f = new File(PATH);
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(singleton.usuariocliente);
			o.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}else {
		try {
			File f;
			f = new File(PATH);
			singleton.usuariocliente = new ArrayList<cliente>();
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(singleton.usuariocliente);
			o.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		}
	}

	public static void guardartxt_usuario_normal_auto() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/normal/archivos/normal.txt";
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (singleton.usuarionormal.size() > 0) {
		
		try {
			File f;

			f = new File(PATH);

			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(singleton.usuarionormal);
			o.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}else {

		try {
			File f;
			f = new File(PATH);
			singleton.usuarionormal = new ArrayList<normal>();
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(fo);
			o.writeObject(singleton.usuarionormal);
			o.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
		
		
	}

	// -----------------------------------------------------------------------------\\

	public static void guardarxml_usuario_admin_auto() {
		String PATH = null;

		
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/admin/archivos/admin.xml";
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (singleton.usuarioadmin.size() > 0) {
			try {
				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, admin.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(singleton.usuarioadmin, osw);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(os.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
			} catch (IOException e) {
		
			}
		} else {
			try {
				@SuppressWarnings("unused")
				File path = new File(PATH);
				singleton.usuarioadmin = new ArrayList<admin>();
				OutputStream oss = new ByteArrayOutputStream();
				OutputStreamWriter osws = new OutputStreamWriter(oss);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, admin.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(singleton.usuarioadmin, osws);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(oss.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osws.close();
				oss.close();
			} catch (IOException e) {
			
			}

		}
	}

	public static void guardarxml_usuario_cliente_auto() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/App/modules/users/Model/ficheros_usuarios/cliente/archivos/cliente.xml";
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (singleton.usuariocliente.size() > 0) {
			try {
				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, cliente.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(singleton.usuariocliente, osw);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(os.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				
			}
		} else {
			try {
				@SuppressWarnings("unused")
				File path = new File(PATH);
				singleton.usuariocliente = new ArrayList<cliente>();
				OutputStream oss = new ByteArrayOutputStream();
				OutputStreamWriter osws = new OutputStreamWriter(oss);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, cliente.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(singleton.usuariocliente, osws);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(oss.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osws.close();
				oss.close();
			} catch (IOException e) {
			
			}

		}
	}

	public static void guardarxml_usuario_normal_auto() {
		String PATH = null;

		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/normal/archivos/normal.xml";
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (singleton.usuarionormal.size() > 0) {
			try {
				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, normal.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(singleton.usuarionormal, osw);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(os.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();
			} catch (IOException e) {
				// JOptionPane.showMessageDialog(null, "Error al grabar el XML",
				// "Error", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			try {
				@SuppressWarnings("unused")
				File path = new File(PATH);
				singleton.usuarionormal = new ArrayList<normal>();
				OutputStream oss = new ByteArrayOutputStream();
				OutputStreamWriter osws = new OutputStreamWriter(oss);
				XStream xstream = new XStream();

				Annotations.configureAliases(xstream, normal.class);
				String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";
				xstream.toXML(singleton.usuarionormal, osws);
				StringBuffer xml = new StringBuffer();
				xml.append(header);
				xml.append(oss.toString());

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osws.close();
				oss.close();
			} catch (IOException e) {
				
			}

		}
	}

	/*
	 * -----------------------------------------ABRIR
	 * JSON,TXT,XML------------------------------------------------
	 */

	@SuppressWarnings("unchecked")
	public static ArrayList<admin> abrirxml_usuario_admin_auto() {
		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, admin.class);

			// PATH = new
			// java.io.File("C:/Users/jordi/workspace/App/src/App/modules/users/utils/admin/archivos/admin.xml").getAbsolutePath()
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/admin/archivos/admin.xml";

			File path = new File(PATH);

			if (path.exists()) {
				singleton.usuarioadmin = (ArrayList<admin>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarioadmin;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<cliente> abrirxml_usuario_cliente_auto() {
		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, cliente.class);

			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/App/modules/users/Model/ficheros_usuarios/cliente/archivos/cliente.xml";

			File path = new File(PATH);

			if (path.exists()) {
				singleton.usuariocliente = (ArrayList<cliente>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuariocliente;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<normal> abrirxml_usuario_normal_auto() {
		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, normal.class);
			PATH = new java.io.File(".").getCanonicalPath() +"/src/App/modules/users/Model/ficheros_usuarios/normal/archivos/normal.xml";
			File path = new File(PATH);
			if (path.exists()) {
				singleton.usuarionormal = (ArrayList<normal>) xstream.fromXML(new FileReader(PATH));
			}
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarionormal;
	}

	// -----------------------------------------------------------------------------\\

	@SuppressWarnings("unchecked")
	public static ArrayList<admin> abretxt_usuario_admin_auto() {
		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/admin/archivos/admin.txt";
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			File f;

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			singleton.usuarioadmin = (ArrayList<admin>) oi.readObject();
			oi.close();

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarioadmin;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<cliente> abretxt_usuario_cliente_auto() {
		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/App/modules/users/Model/ficheros_usuarios/cliente/archivos/cliente.txt";
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			File f;

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			singleton.usuariocliente = (ArrayList<cliente>) oi.readObject();
			oi.close();

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuariocliente;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<normal> abretxt_usuario_normal_auto() {
		String PATH = null;
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/normal/archivos/normal.txt";
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			File f;

			f = new File(PATH);

			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);
			singleton.usuarionormal = (ArrayList<normal>) oi.readObject();
			oi.close();

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarionormal;
	}

	// -----------------------------------------------------------------------------\\

	public static ArrayList<admin> abrirjson_USU() {

		String PATH = null;
		admin e1 = new admin("");
		try {
			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/admin/archivos/admin.json";

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("empleafijo", admin.class);

			JsonReader lector = new JsonReader(new FileReader(PATH));
			JsonParser parseador = new JsonParser();
			JsonElement raiz = parseador.parse(lector);

			Gson json = new Gson();
			JsonArray lista = raiz.getAsJsonArray();
			for (JsonElement elemento : lista) {
				e1 = json.fromJson(elemento, admin.class);
				singleton.usuarioadmin.add(e1);
			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarioadmin;

	}

	@SuppressWarnings({ "unchecked" })
	public static ArrayList<admin> abrirjson_usuario_admin_auto() {

		String PATH;

		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, admin.class);

			PATH = new java.io.File(".").getCanonicalPath() + "/src/App/modules/users/Model/ficheros_usuarios/admin/archivos/admin.json";

			File path = new File(PATH);

			if (path.exists()) {
				singleton.usuarioadmin = (ArrayList<admin>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}

		return singleton.usuarioadmin;
	}

}
