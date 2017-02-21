package App.utils;

import javax.swing.JOptionPane;

import App.classes.*;
import App.modules.users.Model.BLL.BLL_user.funciones_users;

public class funciones {
	
	
	//-------------------------------------INT-------------------------------------
	//Funcion validar numero int
	public static int valnumInt(String mensaje, String titulo){
		String string="";
		int num = 0;
		boolean correct=false;
	
		do{
			try{
				string=JOptionPane.showInputDialog(null, mensaje, titulo,JOptionPane.QUESTION_MESSAGE);
				num=Integer.parseInt(string);
				correct=true;
				if(string==null)
					correct=false;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,Settings.lenguaje.getProperty("error_num_entero")," ",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		
		
		return num;
	}
	
	//Funcion validar numero int distinto a cero
	
	public static int valnumInt_nozero(){
		int num=0;
		boolean goon = false;
		
		do{
			num= valnumInt(Core_mensajes.error_num_nocero(funciones_users.lenguajes), " ");
			if(num!=0)
				goon=true;
			else
				JOptionPane.showMessageDialog(null,Settings.lenguaje.getProperty("error_raro")," ", JOptionPane.ERROR_MESSAGE);
		}while(goon==false);
		
		return num;
	}
	
	//-------------------------------------FLOAT-------------------------------------
	// funcion validar numero float
	
	public static float valnumfloat(String mensage, String titulo){
		String s = "";
		float num = 0.0f;
		boolean correct = false;
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, mensage, titulo,JOptionPane.QUESTION_MESSAGE);
				
				if(s==null){
					JOptionPane.showMessageDialog(null,Settings.lenguaje.getProperty("salir_aplicacion")," ",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					num=Float.parseFloat(s);
					correct=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_nonumero"), "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		
		return num;
	}
	

	// funcion validar numero float distinto a cero
	public static float valnumfloat_nozero(){
		float num=0.0f;
		boolean continuar = false;
		
		do{
			num= valnumfloat(Settings.lenguaje.getProperty("error_num_nocero"), " ");
			if(num!=0)
				continuar=true;	
			else
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_raro"), " ", JOptionPane.ERROR_MESSAGE);
		}while(continuar==false);
		
		return num;
	}
	
	//-------------------------------------CHAR---------------------------------------------
	// funcion para validar char
	
	public static char valcaracter(String mensaje, String titulo){
		char n=' ';
		String s="";
		boolean correct=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, mensaje, titulo,JOptionPane.QUESTION_MESSAGE);
				n=s.charAt(0);
				correct=true;
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_noletra"), "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
	
		return n;
	}
		
	//-------------------------------------CADENA(STRING)-------------------------------------
	//funcion para validar una cadena
	
	public static String valcadena(String mensaje, String titulo){
		String string="";
		boolean correct=false;
		
		do{
			try{
				string = JOptionPane.showInputDialog(null, mensaje , titulo , JOptionPane.QUESTION_MESSAGE);
				correct = true;
				if(string.equals("")){
					JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_datos"),"Error",JOptionPane.ERROR_MESSAGE);
					correct=false;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, Settings.lenguaje.getProperty("error_nocadena"), "Error",JOptionPane.ERROR_MESSAGE);
				correct=false;
			}
		}while(correct==false);
		
		return string;
		
	}
	
	//-------------------------------------MENUS-------------------------------------
	//Menu  combobox(desplegable)-------------------------------------
	public static String menucombo_box(String[] opciones, String mensaje, String titulo){
		String option;
		
		option=(String) JOptionPane.showInputDialog(null,mensaje, titulo, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		return option;
	}
	
	//Menu de botones-------------------------------------
	public static int menubuttons(String[] opciones, String mensaje, String titulo){
		int option=0;
		
		option=JOptionPane.showOptionDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
		
		return option;
	}
	
	//----------------------------------------SHOW----------------------------------------
	//Function show string
	public static void showString( String message, String title){
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	public static boolean YES_NO(String mensboton) {
		boolean valor=false;
		int option=0;
		String [] menu_yes_no= {"SI",
				"NO"};
		
		option=funciones.menubuttons(menu_yes_no, "Desea utilizar dummies","");
		if (option==0){
			valor=true;
		}
		if (option==1){
			valor=false;
		}
		
		return valor;
	}
	
}
