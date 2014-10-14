package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="departamentos")
public class Departamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddepartamentos;

	@Column
	private String departamento;
	
	@Column
	private String estado;

	public int getIddepartamentos() {
		return iddepartamentos;
	}

	public void setIddepartamentos(int iddepartamentos) {
		this.iddepartamentos = iddepartamentos;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
