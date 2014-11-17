package modelos;

import java.util.ArrayList;
import java.util.List;

import dao.DepartamentosDao;
import dto.DepartamentosDTO;
import Entity.DepartamentosEntidad;

public class DepartamentosModelo {
	
	public List<DepartamentosDTO> consultar(){
		DepartamentosDao dd = new DepartamentosDao();
		List<DepartamentosEntidad> enti = dd.consultar();
		List<DepartamentosDTO> dto = new ArrayList<DepartamentosDTO>();
		System.out.println(enti.size()+" trajo......&&&&&&&&&&&&&");
		for (DepartamentosEntidad e : enti) {
			DepartamentosDTO s = new DepartamentosDTO();
			s.setDepartamento(e.getDepartamento());
			s.setEstado(e.getEstado());
			s.setIddepartamentos(e.getIddepartamentos());
			dto.add(s);
		}
		return dto;
	}
	
	public boolean crear(DepartamentosEntidad de){
		DepartamentosDao dd = new DepartamentosDao();
		dd.crear(de);
		return true;
	}

}
