package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Salas;
import modelo.Software;
import modelo.SoftwareSalas;

public class SoftwareSalasDAO {
	
EntityManager em;
	
	public SoftwareSalasDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<SoftwareSalas> getTipoDocumentos(){
		Query q = em.createQuery("Select x from softwaresalas x");
		return (List<SoftwareSalas>)q.getResultList();
	}
	
	public void addSoftwareSalas(int sala, int software, String estado){
		em.getTransaction().begin();
		guardarSoftwareSalas(sala, software, estado);
		em.getTransaction().commit();
	}
	
	public void guardarSoftwareSalas(int sala, int software,  String estado){
		SoftwareSalas td = new SoftwareSalas();
		td.setIdsala(sala);
		td.setIdsoftware(software);
		td.setEstado(estado);
		em.persist(td);
	}

}
