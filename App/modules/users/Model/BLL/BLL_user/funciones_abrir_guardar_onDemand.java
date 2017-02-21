package App.modules.users.Model.BLL.BLL_user;

import java.awt.HeadlessException;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import App.classes.singleton_login;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.Classes.singleton;
import App.utils.funciones;
import App.utils.json_auto_ajustes;

@SuppressWarnings("deprecation")
public class funciones_abrir_guardar_onDemand {
	private static final String ENCODING = null;

	// FUNCIONES GENERICAS ABRIR_GUARDAR_ON_DEMAND
	public static void guardar_ficheros_OnDemand() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {
		case 0:
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_admin_onDemand();
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_cliente_onDemand();
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_normal_onDemand();
			break;
		case 1:
			funciones_abrir_guardar_onDemand.guarda_json_usuario_admin_onDemand();
			break;
		case 2:
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_admin_onDemand();
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_cliente_onDemand();
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_normal_onDemand();
			break;

		}
	}
	

	public static void abrir_ficheros_OnDemand() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {
		case 0:
			funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_admin();
			funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_normal();
			funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_cliente();
			break;
		case 1:

			break;
		case 2:
			funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_admin();
			funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_normal();
			funciones_abrir_guardar_onDemand.abrir_ficheros_onDemand_cliente();
			break;

		}
	}
	public static void guardar_ficheros_onDemand_admin() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {

		case 0:
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_admin_onDemand();
			break;
		case 1:
			break;
		case 2:
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_admin_onDemand();
			break;

		}
	}
	
	public static void guardar_ficheros_onDemand_admin_cliente() {
		String[]opciones={"admin","cliente"};
		int tipo_usuario=funciones.menubuttons(opciones,"¿de que tipo de usuarios desea realizar una copia de seguridad?"," ");
		int archivo = json_auto_ajustes.openfichero_config();
		if(tipo_usuario==0) {
		switch (archivo) {
		case 0:
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_admin_onDemand();
			break;
		case 1:
			break;
		case 2:
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_admin_onDemand();
			break;

		}
	}else if(tipo_usuario==1) {
		switch (archivo) {
		case 0:
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_cliente_onDemand();
			break;
		case 1:
			break;
		case 2:
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_cliente_onDemand();
			break;

		}
		
	}
	}
	public static void guardar_ficheros_onDemand_cliente() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {

		case 0:
			funciones_abrir_guardar_onDemand.guardar_xml_usuario_cliente_onDemand();
			break;
		case 1:
			break;
		case 2:
			funciones_abrir_guardar_onDemand.guarda_txt_usuario_cliente_onDemand();
			break;

		}
	}

	public static void abrir_ficheros_onDemand_normal() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {

		case 0:
			singleton.usuarionormal = funciones_abrir_guardar_onDemand.abrir_xml_usuario_normal_on_demand();
			break;
		case 1:
			break;
		case 2:
			singleton.usuarionormal = funciones_abrir_guardar_onDemand.abrir_txt_usuario_normal_onDemand();
			break;

		}
	}

	public static void abrir_ficheros_onDemand_admin() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {

		case 0:
			singleton.usuarioadmin = funciones_abrir_guardar_onDemand.abrir_xml_usuario_admin_on_demand();
			break;
		case 1:

			break;
		case 2:
			singleton.usuarioadmin = funciones_abrir_guardar_onDemand.abrir_txt_usuario_admin_onDemand();
			break;

		}
	}
	public static void abrir_ficheros_onDemand_admin_cliente() {
		String[]opciones={"admin","cliente"};
int tipo_usuario=funciones.menubuttons(opciones,"¿de que tipo de usuario desea abrir la copia de seguridad?"," ");
		int archivo = json_auto_ajustes.openfichero_config();
		if(tipo_usuario==0) {
		switch (archivo) {
		case 0:
			singleton.usuarioadmin = funciones_abrir_guardar_onDemand.abrir_xml_usuario_admin_on_demand();
			break;
		case 1:

			break;
		case 2:
			singleton.usuarioadmin = funciones_abrir_guardar_onDemand.abrir_txt_usuario_admin_onDemand();
			break;

		}
	}else if(tipo_usuario==1){
		switch (archivo) {
		case 0:
			singleton.usuariocliente = funciones_abrir_guardar_onDemand.abrir_xml_usuario_cliente_on_demand();
			break;
		case 1:

			break;
		case 2:
			singleton.usuariocliente = funciones_abrir_guardar_onDemand.abrir_txt_usuario_cliente_onDemand();
			break;

		}
	}
	}

	public static void abrir_ficheros_onDemand_cliente() {

		int archivo = json_auto_ajustes.openfichero_config();
		switch (archivo) {

		case 0:
			singleton.usuariocliente = funciones_abrir_guardar_onDemand.abrir_xml_usuario_cliente_on_demand();
			break;
		case 1:

			break;
		case 2:
			singleton.usuariocliente = funciones_abrir_guardar_onDemand.abrir_txt_usuario_cliente_onDemand();
			break;

		}
	}

	/*
	 * -----------------------------------------ABRIR Y GUARDAR
	 * XML------------------------------------------------
	 */

	@SuppressWarnings("unchecked")
	public static ArrayList<admin> abrir_xml_usuario_admin_on_demand() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, admin.class);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				JOptionPane.showMessageDialog(null, PATH);
				singleton.usuarioadmin = (ArrayList<admin>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarioadmin;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<cliente> abrir_xml_usuario_cliente_on_demand() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, cliente.class);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				JOptionPane.showMessageDialog(null, PATH);
				singleton.usuariocliente = (ArrayList<cliente>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuariocliente;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<normal> abrir_xml_usuario_normal_on_demand() {
		String PATH = null;
		try {
			XStream xstream = new XStream();
			Annotations.configureAliases(xstream, normal.class);

			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				JOptionPane.showMessageDialog(null, PATH);
				singleton.usuarionormal = (ArrayList<normal>) xstream.fromXML(new FileReader(PATH));
			}

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarionormal;
	}

	// -----------------------------------------------------------------------------\\

	public static void guardar_xml_usuario_admin_onDemand() {
		String PATH;

		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			@SuppressWarnings("unused")
			XStream xstream = new XStream();

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";

			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			JFileChooser fileChooser = new JFileChooser();

			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));

			int seleccion = fileChooser.showSaveDialog(null);

			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();

				JOptionPane.showMessageDialog(null, "Archivo XML guardado con éxito", "Archivo XML",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (HeadlessException | IOException e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void guardar_xml_usuario_cliente_onDemand() {
		String PATH;

		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			@SuppressWarnings("unused")
			XStream xstream = new XStream();

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";

			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			JFileChooser fileChooser = new JFileChooser();

			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));

			int seleccion = fileChooser.showSaveDialog(null);

			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();

				JOptionPane.showMessageDialog(null, "Archivo XML guardado con éxito", "Archivo XML",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (HeadlessException | IOException e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void guardar_xml_usuario_normal_onDemand() {
		String PATH;

		try {
			OutputStream os = new ByteArrayOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			@SuppressWarnings("unused")
			XStream xstream = new XStream();

			String header = "<?xml version=\"1.0\" encoding=\"" + ENCODING + "\"?>\n";

			StringBuffer xml = new StringBuffer();
			xml.append(header);
			xml.append(os.toString());

			JFileChooser fileChooser = new JFileChooser();

			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));

			int seleccion = fileChooser.showSaveDialog(null);

			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();

				if (!PATH.endsWith(".xml")) {
					PATH = PATH + ".xml";
				}

				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(xml.toString());
				fileXml.close();
				osw.close();
				os.close();

				JOptionPane.showMessageDialog(null, "Archivo XML guardado con éxito", "Archivo XML",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (HeadlessException | IOException e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/*
	 * -----------------------------------------ABRIR Y GUARDAR
	 * TXT-----------------------------------------------
	 */

	public static void guarda_txt_usuario_admin_onDemand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();

			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT (*.txt)", "txt"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);
				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(singleton.usuarioadmin);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void guarda_txt_usuario_cliente_onDemand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT (*.txt)", "txt"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);
				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(singleton.usuariocliente);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void guarda_txt_usuario_normal_onDemand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT (*.txt)", "txt"));
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".txt";
				f = new File(PATH);
				FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream o = new ObjectOutputStream(fo);
				o.writeObject(singleton.usuarionormal);
				o.close();
				JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// -----------------------------------------------------------------------------\\

	@SuppressWarnings("unchecked")
	public static ArrayList<admin> abrir_txt_usuario_admin_onDemand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT (*.txt)", "txt"));
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);
				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				singleton.usuarioadmin = (ArrayList<admin>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarioadmin;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<cliente> abrir_txt_usuario_cliente_onDemand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT (*.txt)", "txt"));
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);
				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				singleton.usuariocliente = (ArrayList<cliente>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuariocliente;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<normal> abrir_txt_usuario_normal_onDemand() {
		String PATH = null;
		try {
			File f;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT (*.txt)", "txt"));
			int seleccion = fileChooser.showOpenDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				f = new File(PATH);
				FileInputStream fi = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(fi);
				singleton.usuarionormal = (ArrayList<normal>) oi.readObject();
				oi.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return singleton.usuarionormal;
	}

	/*
	 * -----------------------------------------ABRIR Y GUARDAR
	 * JSON------------------------------------------------
	 */

	public static void guarda_json_usuario_admin_onDemand() {
		String PATH = null;
		try {
			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("admin", admin.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".json";

				Gson gson = new Gson();
				String json = gson.toJson(singleton.usuarioadmin);
				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(json.toString());
				fileXml.close();

				JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void guarda_json_usuario_cliente_onDemand() {
		String PATH = null;
		try {
			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("cliente", cliente.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".json";

				Gson gson = new Gson();
				String json = gson.toJson(singleton.usuariocliente);
				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(json.toString());
				fileXml.close();

				JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void guarda_json_usuario_normal_onDemand() {
		String PATH = null;
		try {
			XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
			xstreamjson.setMode(XStream.NO_REFERENCES);
			xstreamjson.alias("normal", normal.class);

			JFileChooser fileChooser = new JFileChooser();
			int seleccion = fileChooser.showSaveDialog(null);
			if (seleccion == JFileChooser.APPROVE_OPTION) {
				File JFC = fileChooser.getSelectedFile();
				PATH = JFC.getAbsolutePath();
				PATH = PATH + ".json";

				Gson gson = new Gson();
				String json = gson.toJson(singleton.usuarionormal);
				FileWriter fileXml = new FileWriter(PATH);
				fileXml.write(json.toString());
				fileXml.close();

				JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
