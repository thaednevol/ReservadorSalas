package modelo;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="usuariosprofesor")
public class UsuariosProfesor {

	@Id
	private int idusuairo;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idusuario")
	private Usuarios usuario;
	
	@Column
	private int iddepartamento;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iddepartamento")
	private Departamentos departamento;
	
	@Column
	private int idtipodocumento;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idtipodocumento")
	private TipoDocumentos tipodocumento;
	
	@Column
	private String documento;

	public int getIdusuairo() {
		return idusuairo;
	}

	public void setIdusuairo(int idusuario) {
		this.idusuairo = idusuario;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public int getIdtipodocumento() {
		return idtipodocumento;
	}

	public void setIdtipodocumento(int idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
}
