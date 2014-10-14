package dao;

import java.util.List;

import modelo.Departamentos;
import modelo.TipoDocumentos;
import modelo.Usuarios;


public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DepartamentosDAO d = new DepartamentosDAO();
//		d.guardarDepartamento("Matemáticas", "Habilitado");
//		List<Departamentos> departamentos = d.getDepartamentos();
//		for(int i=0; i < departamentos.size();i++){
//			System.out.println("Departamento: "+departamentos.get(i).getDepartamento());
//		}
		
//		TipoDocumentosDAO td = new TipoDocumentosDAO();
//		td.addTipoDocumento("Cédula", "CC", "Habilitado");
//		
//		List<TipoDocumentos> tipodoc = td.getTipoDocumentos();
//		for(int i=0; i < tipodoc.size();i++){
//			System.out.println("Tipo doc: "+tipodoc.get(i).getDocumento());
//		}
		
//		UsuariosDAO u = new UsuariosDAO();
//		u.guardarUsuario("luferquisa@gmail.com", "luisa", "luisa", "quiroga", "Creado", "Profesor");
//		List<Usuarios> usuarios = u.getUsuarios();
//		for(int i=0; i < usuarios.size();i++){
//			System.out.println("Usuario: "+usuarios.get(i).getCorreo());
//		}
//		UsuariosProfesorDAO up = new UsuariosProfesorDAO();
//		up.guardarUsuarioProfesor(1, 154,1,"1032369782");
		
//		SalasDAO up = new SalasDAO();
//		up.guardarSalas("Sala 1", 25, "Habilitada");
		
//		SoftwareDAO sd = new SoftwareDAO();
//		sd.guardarSoftware("Oracle", "Motor de base de datos", "Habilitar");
		
		SoftwareSalasDAO ss = new SoftwareSalasDAO();
		ss.addSoftwareSalas(1, 1,	"Habilitado");
	}

}
