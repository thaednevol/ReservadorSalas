package dao;

import Entity.UsuariosEntidad;

public class UsuariosDao extends Conexion {
	
	public UsuariosDao(){
		
	}
	
	public void crearUsuario(UsuariosEntidad u){
		this.conectar();
		this.getEm().getTransaction().begin();		
		this.getEm().persist(u);
		this.getEm().getTransaction().commit();		
		this.getEm().close();
	}
	
	public static void main(String args[]){
		UsuariosDao u= new UsuariosDao();
		UsuariosEntidad ue = new UsuariosEntidad();

		ue.setApellido("luisa");
		ue.setNombre("luisa");
		ue.setCorreo("luisa");
		ue.setPassword("luisa");
		ue.setPerfil("Profesor");
		ue.setEstado("Creado");
		u.crearUsuario(ue);
	}

}
