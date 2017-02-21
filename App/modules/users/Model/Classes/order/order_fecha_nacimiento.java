package App.modules.users.Model.Classes.order;

import java.util.Comparator;
import App.modules.users.Model.Classes.*;



public class order_fecha_nacimiento  implements Comparator <users>{
	public int compare (users u1, users u2) {
		int n=u1.getfnac().compararfechas3(u2.getfnac());
		return n ;
	}

}
