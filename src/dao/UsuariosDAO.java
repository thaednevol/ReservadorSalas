package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Departamentos;
import modelo.Usuarios;

public class UsuariosDAO {

	
	EntityManager em;
	
	public UsuariosDAO(){
		EntityManagerFactory factory = Persistence.
			    createEntityManagerFactory("Reservas", System.getProperties());
		em = factory.createEntityManager();
	}
	
	public List<Usuarios> getUsuarios(){
		Query q = em.createQuery("Select x from usuarios x");
		return (List<Usuarios>)q.getResultList();
	}
	
	public void guardarUsuario(String correo, String password, String nombre, String apellido, String estado, String perfil){
		em.getTransaction().begin();
		addUsuario(correo, password, nombre, apellido, estado, perfil);
		em.getTransaction().commit();
	}
	
	public void addUsuario(String correo, String password, String nombre, String apellido, String estado, String perfil){
		Usuarios d = new Usuarios();
		d.setCorreo(correo);
		d.setPassword(password);
		d.setNombre(nombre);
		d.setApellido(apellido);
		d.setEstado(estado);
		d.setPerfil(perfil);
		em.persist(d);
	}
}
