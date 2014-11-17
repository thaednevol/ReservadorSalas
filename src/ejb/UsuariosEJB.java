package ejb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dto.UsuariosDTO;
import modelos.UsuariosModelo;
import Entity.UsuariosEntidad;

@ManagedBean(name="usuario")
@SessionScoped  
public class UsuariosEJB {
	
	
	private UsuariosDTO ud = new UsuariosDTO();
	
	
	public void register(){
		UsuariosEntidad ue = new UsuariosEntidad();
		ue.setApellido(ud.apellido);
		ue.setNombre(ud.name);
		ue.setCorreo(ud.correo);
		ue.setPassword(ud.password);
		ue.setPerfil("Profesor");
		ue.setEstado("Creado");
		UsuariosModelo um = new UsuariosModelo();
		um.registro(ue);
	}


	public UsuariosDTO getUd() {
		return ud;
	}


	public void setUd(UsuariosDTO ud) {
		this.ud = ud;
	}
	
	
	
}

	class usuarios{
		
		
	}
