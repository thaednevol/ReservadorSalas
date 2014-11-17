package dto;

import javax.persistence.Column;

public class DepartamentosDTO {
	
	public int iddepartamentos;
	public String departamento;
	public String estado;
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
