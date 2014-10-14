package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Departamentos;
import modelo.TipoDocumentos;

public class TipoDocumentosDAO {
	
EntityManager em;
	
	public TipoDocumentosDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<TipoDocumentos> getTipoDocumentos(){
		Query q = em.createQuery("Select x from tipodocumentos x");
		return (List<TipoDocumentos>)q.getResultList();
	}
	
	public void addTipoDocumento(String documento, String abreviatura, String estado){
		em.getTransaction().begin();
		guardarTipoDocumento(documento, abreviatura, estado);
		em.getTransaction().commit();
	}
	
	public void guardarTipoDocumento(String documento, String abreviatura, String estado){
		TipoDocumentos td = new TipoDocumentos();
		td.setDocumento(documento);
		td.setAbreviatura(abreviatura);
		td.setEstado(estado);
		em.persist(td);
	}

}
