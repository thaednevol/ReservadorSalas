package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="software")
public class Software {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idsoftware;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@Column
	private String estado;

	public int getIdsoftware() {
		return idsoftware;
	}

	public void setIdsoftware(int idsoftware) {
		this.idsoftware = idsoftware;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
