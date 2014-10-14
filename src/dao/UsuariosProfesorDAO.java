package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Usuarios;
import modelo.UsuariosProfesor;

public class UsuariosProfesorDAO {
	
	EntityManager em;
	
	public UsuariosProfesorDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<UsuariosProfesor> getDepartamentos(){
		Query q = em.createQuery("Select x from usuariosprofesor x");
		return (List<UsuariosProfesor>)q.getResultList();
	}
	
	public void guardarUsuarioProfesor(int usuario,int departamento, int tipodocumento, String documento){
		em.getTransaction().begin();
		addUsuarioProfesor(usuario,departamento,tipodocumento,documento);
		em.getTransaction().commit();
	}
	
	public void addUsuarioProfesor(int usuario,int departamento, int tipodocumento, String documento){
		UsuariosProfesor d = new UsuariosProfesor();
		d.setIdusuairo(usuario);
		d.setIddepartamento(departamento);
		d.setIdtipodocumento(tipodocumento);
		d.setDocumento(documento);
		em.persist(d);
	}

}
