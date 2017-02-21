package App.modules.users.Model.BLL.BLL_dummies.CRUD;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.modules.users.Model.BLL.BLL_dummies.funciones_dummies;
import App.modules.users.Model.BLL.BLL_dummies.funciones_find_dummies;
import App.modules.users.Model.Classes.*;



public class Funciones_borrar_usuarios_dummies {

	public static void borrar_admin (admin a1) {
		int location = -1;
		
		if(singleton.usuarioadmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a1 = (admin) funciones_dummies.create_users_dni(2);
			location = funciones_find_dummies.find_admin(a1);
			if (location != -1) {
				singleton.usuarioadmin.remove(location);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void borrar_cliente (cliente a2) {
		int location = -1;
		
		if(singleton.usuariocliente.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a2 = (cliente) funciones_dummies.create_users_dni(1);
			location = funciones_find_dummies.find_client(a2);
			if (location != -1) {
				singleton.usuariocliente.remove(location);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void borrar_normal (normal a3) {
		int location = -1;
		
		if(singleton.usuarionormal.isEmpty()){
			JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a3 = (normal) funciones_dummies.create_users_dni(3);
			location = funciones_find_dummies.find_normal(a3);
			if (location != -1) {
				singleton.usuarionormal.remove(location);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
			}else {
				JOptionPane.showMessageDialog(null,Settings.lenguaje.getInstance().getProperty("usuario_borrado"));
			}
		}
	}
}
