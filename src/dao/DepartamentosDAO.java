package dao;

import java.util.List;

import javax.persistence.TypedQuery;

import Entity.DepartamentosEntidad;

public class DepartamentosDao extends Conexion{
	
	public void crear(DepartamentosEntidad de){
			this.conectar();
			this.getEm().getTransaction().begin();		
			this.getEm().persist(de);
			this.getEm().getTransaction().commit();		
			this.getEm().close();
	}
	
	public List<DepartamentosEntidad> consultar(){
		this.conectar();
		 TypedQuery<DepartamentosEntidad> q2 = this.getEm().createQuery("SELECT d FROM departamentos d", DepartamentosEntidad.class);
		 List<DepartamentosEntidad> r = q2.getResultList();
		 this.getEm().close();
		 return r;
	}

}
