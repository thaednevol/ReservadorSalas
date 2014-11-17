package modelos;

import dao.UsuariosDao;
import Entity.UsuariosEntidad;

public class UsuariosModelo {
	
	public boolean registro(UsuariosEntidad ue){
		UsuariosDao ud = new UsuariosDao();
		ud.crearUsuario(ue);
		return true;
	}

}
