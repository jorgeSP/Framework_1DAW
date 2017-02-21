package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;

public class order_apellidos implements Comparator <users>{
	public int compare (users u1, users u2) {
		if(u1.getapellidos().compareTo(u2.getapellidos())>0)
			return 1;
		if(u1.getapellidos().compareTo(u2.getapellidos())<0)
			return -1;
		return 0;
	}
}

