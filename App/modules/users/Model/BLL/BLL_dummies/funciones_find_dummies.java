package App.modules.users.Model.BLL.BLL_dummies;

import App.modules.users.Model.Classes.*;

public class funciones_find_dummies {

	public static int find_admin(admin admin) { 
		for (int i = 0; i<=(singleton.usuarioadmin.size()-1); i++){
			if((singleton.usuarioadmin.get(i)).equals(admin) )
				return i;
		}
		return -1;
	}
	
	public static int find_client(cliente cliente) { 
		for (int i = 0; i<=(singleton.usuariocliente.size()-1); i++){
			if((singleton.usuariocliente.get(i)).equals(cliente) )
				return i;
		}
		return -1;
	}
	
	public static int find_normal(normal normal) { 
		for (int i = 0; i<=(singleton.usuarionormal.size()-1); i++){
			if((singleton.usuarionormal.get(i)).equals(normal) )
				return i;
		}
		return -1;
	}
	
	
}
