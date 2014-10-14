package beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="usuariosaprobar")
@SessionScoped  
public class UsuariosAprobarBean {
	
	static private List<Usuarios> usuarios;
	private UsuarioBean selectedUsuario;
	
	  public  UsuariosAprobarBean() {
	       usuarios = new ArrayList<Usuarios>();
	       usuarios.add(new Usuarios("Luisa Quiroga","luferquisa@gmail.com","1032369782","kibyrana"));
	       usuarios.add(new Usuarios("Laura Orjuela","laura@gmail.com","103232323","1221"));
	       System.out.println("Aca en init "+usuarios.get(0).cedula);
	    }
	
	@PostConstruct
    public void init() {
       usuarios = new ArrayList<Usuarios>();
       usuarios.add(new Usuarios("Luisa Quiroga","luferquisa@gmail.com","1032369782","kibyrana"));
       usuarios.add(new Usuarios("Laura Orjuela","laura@gmail.com","103232323","1221"));
       System.out.println("Aca en init "+usuarios.get(0).cedula);
    }
	
	public List getUsuarios(){
		System.out.println(" paso por el get list "+usuarios.get(0).getCedula());
		return usuarios;
	}

	public UsuarioBean getSelectedUsuario() {
		return selectedUsuario;
	}

	public void setSelectedUsuario(UsuarioBean selectedUsuario) {
		this.selectedUsuario = selectedUsuario;
	}
	
	@ManagedBean(name = "usuarios")
	@ApplicationScoped
	public class Usuarios{
		
		private String usuario;
		private String correo;
		private String cedula;
		private String clave;
		
		public Usuarios(String usuario, String correo,String cedula, String clave) {
	        // TODO Auto-generated constructor stub
	    	this.usuario=usuario;
	    	this.correo=correo;
	    	this.cedula=cedula;
	    	this.clave=clave;
	    }

		public String getCedula() {
			System.out.println("la cedula "+cedula);
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getClave() {
			return clave;
		}

		public void setClave(String clave) {
			this.clave = clave;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}
	}

}
