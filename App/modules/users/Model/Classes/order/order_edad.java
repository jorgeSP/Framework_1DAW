package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;

public class order_edad implements Comparator <users>{
	
	public int compare (users u1, users u2) {
		if(u1.getedad()>u2.getedad())
			return 1;
		if(u1.getedad()<u2.getedad())
			return -1;
		return 0;
	}
}
