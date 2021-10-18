package com.example.model;

public class UsuarioBuilder {
	
	public UsuarioBuilder() {
		
	}
	
	public Usuario build(String sNombre,String sApellidos,String sTelefono,String sDireccion,String sCodigoPostal) {
		 Usuario usuario= new Usuario(sNombre,sApellidos,sTelefono,sDireccion,sCodigoPostal);
		 return usuario;
	}

}
