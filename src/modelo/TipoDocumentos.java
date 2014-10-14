package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tipodocumentos")
public class TipoDocumentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipodocumentos;
	
	@Column
	private String documento;
	
	@Column
	private String abreviatura;
	
	@Column
	private String estado;

	public int getIdtipodocumentos() {
		return idtipodocumentos;
	}

	public void setIdtipodocumentos(int idtipodocumentos) {
		this.idtipodocumentos = idtipodocumentos;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
