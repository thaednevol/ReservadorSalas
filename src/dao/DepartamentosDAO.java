package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Departamentos;

public class DepartamentosDAO {
	
	EntityManager em;
	
	public DepartamentosDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<Departamentos> getDepartamentos(){
		Query q = em.createQuery("Select x from departamentos x");
		return (List<Departamentos>)q.getResultList();
	}
	
	public void guardarDepartamento(String nombre, String estado){
		em.getTransaction().begin();
		addDepartamento(nombre, estado);
		em.getTransaction().commit();
	}
	
	public void addDepartamento(String nombre, String estado){
		Departamentos d = new Departamentos();
		d.setDepartamento(nombre);
		d.setEstado(estado);
		em.persist(d);
	}

}
