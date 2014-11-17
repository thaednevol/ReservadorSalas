package Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="usuarios")
@Table(name="usuarios")
public class UsuariosEntidad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idusuario;
	
	@Column( length = 45)
	private String correo;
	@Column( length = 45)
	private String password;
	@Column( length = 45)
	private String nombre;
	@Column( length = 45)
	private String apellido;
	@Column( length = 12)
	private String estado;
	@Column( length = 13)
	private String perfil;
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusaurios) {
		this.idusuario = idusaurios;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	
}
