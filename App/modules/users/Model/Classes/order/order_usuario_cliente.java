package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;

public class order_usuario_cliente implements Comparator <users>{
	
	public int compare (users u1, users u2) {
	
		if(((cliente)u1).getusuario().compareTo(((cliente)u2).getusuario())>0)
			return 1;
		if(((cliente)u1).getusuario().compareTo(((cliente)u2).getusuario())<0)
			return -1;

		return 0;
	}


}
