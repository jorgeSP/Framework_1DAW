package App.modules.users.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import App.classes.Settings;
import App.modules.users.Model.BLL.BLL_user.funciones_users;
import App.modules.users.Model.Classes.*;
import App.modules.users.Model.funciones.Funciones_find;
import App.utils.funciones;



public class Funciones_borrar_usuarios {

	public static void borrar_admin (admin a1,cliente a2) {
		int menu;
		String[] opciones= {Settings.lenguaje.getInstance().getProperty("borrar_admin"),Settings.lenguaje.getInstance().getProperty("borrar_cliente")};
		menu = funciones.menubuttons(opciones,Settings.lenguaje.getInstance().getProperty("elije_opcion"), "");
		switch(menu) {
		case 0:
		int location = -1,location1=-1;	
		boolean continuar=true;
		a1 = Funciones_find.IDadmin();
		if(singleton.usuarioadmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			
		}else{
			location = -1;
			//a1 = (admin) funciones_users.create_users_dni(2);
			location = Funciones_find.find_admin(a1);
			
			if (location != -1) {
				
				singleton.usuarioadmin.remove(location);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("usuario_borrado"));
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}
		}
		break;
		case 1:
			a2 = Funciones_find.IDclient();
			if(singleton.usuariocliente.isEmpty()){
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}else{
				location = -1;
				//a2 = (cliente) funciones_users.create_users_dni(1);
				location = Funciones_find.find_client(a2);
				if (location != -1) {
					singleton.usuariocliente.remove(location);
					JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("usuario_borrado"));
				}else {
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
				}
			}
			//break;
		}
	}
	
	public static void borrar_cliente (cliente a2) {
		int location = -1;
	
		if(singleton.usuariocliente.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
		//	a2 = (cliente) funciones_users.create_users_dni(1);
			location = Funciones_find.find_client(a2);
			if (location != -1) {
				singleton.usuariocliente.remove(a2);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("usuario borrado"));
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void borrar_cliente_unico () {
		int location = -1;
		cliente a1=null;
		if(singleton.usuariocliente.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
		//	a2 = (cliente) funciones_users.create_users_dni(1);
			location = Funciones_find.find_nombre();
			a1=singleton.usuariocliente.get(location);
			if (location != -1) {
				singleton.usuariocliente.remove(a1);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("usuario_borrado"));
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void borrar_normal (normal a3) {
		int location = -1;
		
		if(singleton.usuarionormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a3 = (normal) funciones_users.create_users_dni(3);
			location = Funciones_find.find_normal(a3);
			if (location != -1) {
				singleton.usuarionormal.remove(location);
				JOptionPane.showMessageDialog(null,  Settings.lenguaje.getProperty("usuario_borrado"));
			}else {
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_borrar_datos"),"", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
