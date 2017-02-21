package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.admin;
import App.modules.users.Model.Classes.users;

public class order_fnac_admin  implements Comparator <admin>{
	public int compare (admin u1, admin u2) {
		int n=u1.getfnac().compararfechas3(u2.getfnac());
		//JOptionPane.showMessageDialog(null,n);
		return n ;
	}

}