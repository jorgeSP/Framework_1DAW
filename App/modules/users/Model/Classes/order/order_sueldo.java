package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;

public class order_sueldo implements Comparator <users>{
	
	public int compare (users u1, users u2) {
		if(((admin)u1).getsueldo().compareTo(((admin)u2).getsueldo())>0)
			return 1;
		if(((admin)u1).getsueldo().compareTo(((admin)u2).getsueldo())<0)
			return -1;
		return 0;
	}
}
