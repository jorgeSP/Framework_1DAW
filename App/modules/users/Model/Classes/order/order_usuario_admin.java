package App.modules.users.Model.Classes.order;

import java.util.Comparator;

import App.modules.users.Model.Classes.*;



	public class order_usuario_admin implements Comparator <users>{
		
		public int compare (users u1, users u2) {
		
			if(((admin)u1).getusuario().compareTo(((admin)u2).getusuario())>0)
				return 1;
			if(((admin)u1).getusuario().compareTo(((admin)u2).getusuario())<0)
				return -1;

			return 0;
		}


	}

