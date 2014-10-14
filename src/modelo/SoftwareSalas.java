package modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="softwaresalas")
public class SoftwareSalas {
	
	@Id
	private int idsala;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idsala")
	private Salas sala;
	
	private int idsoftware;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idsoftware")
	private Software software;
	
	private String estado;

	public int getIdsala() {
		return idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

	public Salas getSala() {
		return sala;
	}

	public void setSala(Salas sala) {
		this.sala = sala;
	}

	public int getIdsoftware() {
		return idsoftware;
	}

	public void setIdsoftware(int idsoftware) {
		this.idsoftware = idsoftware;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}
