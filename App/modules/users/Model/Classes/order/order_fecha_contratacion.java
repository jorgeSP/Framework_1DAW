package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;

public class order_fecha_contratacion implements Comparator <users>{
	
	public int compare (users u1, users u2) {
		return ((admin)u1).getfcont().compararfechas3(((admin)u2).getfcont());
	}
}
