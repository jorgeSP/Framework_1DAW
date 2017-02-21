package App.modules.users.Model.BLL.BLL_dummies.CRUD;

import javax.swing.JOptionPane;

import App.classes.*;
import App.modules.users.Model.BLL.BLL_dummies.funciones_dummies;
import App.modules.users.Model.BLL.BLL_dummies.funciones_find_dummies;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.Funciones_find;



public class Funciones_cambiar_datos_dummies {
	
	public static void update_admin (admin a1) {
		int location = -1;
		if(a1==null) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"));
		}else {
		
		if(singleton.usuarioadmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"), Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		}else{
			a1 = Funciones_find.IDadmin();
			location = -1;
//			a1 = (admin) funciones_dummies.create_users_dni(2);
			location = funciones_find_dummies.find_admin(a1);
			if (location != -1) {
				a1 = singleton.usuarioadmin.get(location);
				funciones_dummies.update_users_generics(a1);
				singleton.usuarioadmin.set(location, a1);
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"), Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			}
		}
		}
	}
	
	public static void update_cliente (cliente a2) {
		int location = -1;
		if(a2==null) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"));
		}else {
		
		if(singleton.usuariocliente.isEmpty()){
			
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"), Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		}else{
			a2 = Funciones_find.IDclient();
			location = -1;
			location = funciones_find_dummies.find_client(a2);
			//a2 = (cliente) funciones_dummies.create_users_dni(1);
			//location = funciones_find_dummies.find_client(a2);
			if (location != -1) {
				a2 = singleton.usuariocliente.get(location);
				funciones_dummies.update_users_generics(a2);
				singleton.usuariocliente.set(location, a2);
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"), Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			}
		}
		}
	}

	public static void update_normal (normal a3) {
		int location = -1;
		if(a3==null) {
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"));
		}else {
		
		if(singleton.usuarionormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"), Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
		}else{
			a3 = Funciones_find.IDuserregister();
			location = -1;
			//a3 = (normal) funciones_dummies.create_users_dni(3);
			location = funciones_find_dummies.find_normal(a3);
			if (location != -1) {
				a3 = singleton.usuarionormal.get(location);
				funciones_dummies.update_users_generics(a3);
				singleton.usuarionormal.set(location, a3);
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_cambio_datos"), Settings.lenguaje.getProperty("errortitle"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
		
	}
}
