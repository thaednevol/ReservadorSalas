package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="salas")
public class Salas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalas;
	
	@Column
	private String sala;
	
	@Column
	private int capacidad;
	
	@Column
	private String estado;

	public int getIdSalas() {
		return idSalas;
	}

	public void setIdSalas(int idSalas) {
		this.idSalas = idSalas;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
