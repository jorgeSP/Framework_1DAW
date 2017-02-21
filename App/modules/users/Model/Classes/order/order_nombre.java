package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;

public class order_nombre implements Comparator <users>{
	
	public int compare (users u1, users u2) {
		if(u1.getnombre().compareTo(u2.getnombre())>0)
			return 1;
		if(u1.getnombre().compareTo(u2.getnombre())<0)
			return -1;
		return 0;
	}
}
