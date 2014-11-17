package ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.DepartamentosModelo;
import Entity.DepartamentosEntidad;
import dto.DepartamentosDTO;

@ManagedBean(name="departamentos")
@SessionScoped 
public class DepartamentosEJB {
	
	private DepartamentosDTO dd = new DepartamentosDTO();
	private List<DepartamentosDTO> listadep;
	
	public void crear(){
		DepartamentosEntidad de = new DepartamentosEntidad();
		de.setEstado("Habilitado");
		de.setDepartamento(dd.departamento);
		DepartamentosModelo dm = new DepartamentosModelo();
		dm.crear(de);
	}
	
	@PostConstruct 
	public  void init(){
		DepartamentosModelo dm = new DepartamentosModelo();
		this.listadep=dm.consultar();
	}

	public DepartamentosDTO getDd() {
		return dd;
	}

	public void setDd(DepartamentosDTO dd) {
		this.dd = dd;
	}

	public List<DepartamentosDTO> getListadep() {
		return listadep;
	}

	public void setListadep(List<DepartamentosDTO> listadep) {
		this.listadep = listadep;
	}
	
	
	
}
