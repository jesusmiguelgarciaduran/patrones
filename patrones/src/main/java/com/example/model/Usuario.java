package com.example.model;

public class Usuario {
	
	private String sNombre,sApellidos,sTelefono,sDireccion,sCodigoPostal;
	
	public Usuario(String sNombre,String sApellidos,String sTelefono,String sDireccion,String sCodigoPostal) {
		this.setsApellidos(sApellidos);
		this.setsNombre(sNombre);
		this.setsTelefono(sTelefono);
		this.setsCodigoPostal(sCodigoPostal);
		this.setsDireccion(sDireccion);
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellidos() {
		return sApellidos;
	}

	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}

	public String getsTelefono() {
		return sTelefono;
	}

	public void setsTelefono(String sTelefono) {
		this.sTelefono = sTelefono;
	}

	public String getsDireccion() {
		return sDireccion;
	}

	public void setsDireccion(String sDireccion) {
		this.sDireccion = sDireccion;
	}

	public String getsCodigoPostal() {
		return sCodigoPostal;
	}

	public void setsCodigoPostal(String sCodigoPostal) {
		this.sCodigoPostal = sCodigoPostal;
	}
	
}
