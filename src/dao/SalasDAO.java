package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Salas;
import modelo.TipoDocumentos;

public class SalasDAO {
	
	EntityManager em;
	
	public SalasDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<Salas> getTipoDocumentos(){
		Query q = em.createQuery("Select x from salas x");
		return (List<Salas>)q.getResultList();
	}
	
	public void addSalas(String nombre, int capacidad, String estado){
		em.getTransaction().begin();
		guardarSalas(nombre, capacidad, estado);
		em.getTransaction().commit();
	}
	
	public void guardarSalas(String nombre, int capacidad, String estado){
		Salas td = new Salas();
		td.setSala(nombre);
		td.setCapacidad(capacidad);
		td.setEstado(estado);
		em.persist(td);
	}
}
