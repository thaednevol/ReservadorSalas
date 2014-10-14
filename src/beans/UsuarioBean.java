package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped; 



/**
 * Session Bean implementation class UsuariosBean
 */
@ManagedBean(name="usuario")
@SessionScoped  
public class UsuarioBean {   
	
	private String usuario;
	private String correo;
	private String cedula;
	private String clave;

    /**
     * Default constructor. 
     */
    public UsuarioBean() {
        // TODO Auto-generated constructor stub
    }
    
    public UsuarioBean(String usuario, String correo,String cedula, String clave) {
        // TODO Auto-generated constructor stub
    	this.usuario=usuario;
    	this.correo=correo;
    	this.cedula=cedula;
    	this.clave=clave;
    }

	public String getCedula() {
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
