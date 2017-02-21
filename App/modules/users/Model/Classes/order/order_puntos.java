package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;
public class order_puntos implements Comparator <users>{


	public int compare(users u1, users u2) {
		if(((normal)u1).getpuntos() > ((normal)u2).getpuntos())
			return 1;
		if(((normal)u1).getpuntos() < ((normal)u2).getpuntos())
			return -1;
		return 0;
	}

}
