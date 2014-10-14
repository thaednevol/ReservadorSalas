package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Salas;
import modelo.Software;

public class SoftwareDAO {
	
	EntityManager em;
	
	public SoftwareDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<Salas> getTipoDocumentos(){
		Query q = em.createQuery("Select x from software x");
		return (List<Salas>)q.getResultList();
	}
	
	public void addSoftware(String nombre, String descripcion, String estado){
		em.getTransaction().begin();
		guardarSoftware(nombre, descripcion, estado);
		em.getTransaction().commit();
	}
	
	public void guardarSoftware(String nombre, String descripcion, String estado){
		Software td = new Software();
		td.setNombre(nombre);
		td.setDescripcion(descripcion);
		td.setEstado(estado);
		em.persist(td);
	}

}
