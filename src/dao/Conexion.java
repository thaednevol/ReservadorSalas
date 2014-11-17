package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
	
	private EntityManager em;
	
	public Conexion(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Reservas");
		em = emf.createEntityManager();
	}
	
	public void conectar(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Reservas");
		em = emf.createEntityManager();
	}


	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	

}