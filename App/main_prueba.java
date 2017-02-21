package App;



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import App.modules.users.classes.admin;
import App.classes.*;
import App.modules.users.utils.funciones_fecha_users;
import App.modules.users.utils.funciones_users;
import App.utils.format;
import App.utils.funciones;
import App.utils.validador;


public class main_preueba {

	public static void main(String[] args) {
		admin u1 = null;
		admin u2 = null;
	//	ClassConfig config = new ClassConfig();
		
		u2=(admin) App.modules.users.utils.funciones_users.create_users_dni(2);
		u1=(admin) funciones_users.create_users_genericos(2);
		
		JOptionPane.showMessageDialog(null, u2.toString());
		JOptionPane.showMessageDialog(null, u1.toString());

	}
}
//
/*
 * JOptionPane.showMessageDialog(null, edad); //////////////////
 * 
 * String fechacont = funciones.valcadena("Dime tu fecha de nacimiento","fecha"); 
 * result1 = validador.validafecha(fechacont);
 *  fecha fcont = new fecha(fechacont); 
 *  JOptionPane.showMessageDialog(null, fcont.toString()); 
 *  int antiguedad = fcont.RestaFechas(); // result2 = fcont.ValidarFecha();
 * JOptionPane.showMessageDialog(null, antiguedad);
 *  ///////////////// int compara = fnac.compararfechas(fcont); // }
 */

/*
 * String fecha1; 
 * fecha f=null; 
 * String fecha2; 
 * fecha f1=null;
 * 
 * fecha1=JOptionPane.showInputDialog("fecha actual"); f=new fecha(fecha1);
 * 
 * fecha2=JOptionPane.showInputDialog("dime una fecha al azar"); f1=new
 * fecha(fecha2); JOptionPane.showMessageDialog(null,f1.compararfechas(f)); }
 */

/*
 * 
 * String
 * fechanacimiento=funciones.valcadena("Dime tu fecha de nacimiento","fecha");
 * boolean result1=validador.validafecha(fechanacimiento); fecha fnac=new
 * fecha(fechanacimiento); JOptionPane.showMessageDialog(null,fnac.toString());
 * int edad=fnac.RestaFechas(); // boolean result2=fnac.ValidarFecha();
 * JOptionPane.showMessageDialog(null,edad); //////////////////
 * 
 * 
 * 
 * 
 * String fechacont=funciones.valcadena("Dime tu fecha de nacimiento","fecha");
 * result1=validador.validafecha(fechacont); fecha fcont=new fecha(fechacont);
 * JOptionPane.showMessageDialog(null,fcont.toString()); int
 * antiguedad=fcont.RestaFechas(); // result2=fcont.ValidarFecha();
 * JOptionPane.showMessageDialog(null,antiguedad); ///////////////// int
 * compara=fnac.compararfechas(fcont); //
 * 
 */