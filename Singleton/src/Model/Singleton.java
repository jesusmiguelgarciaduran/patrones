package Model;

public class Singleton {
	public static Singleton usuario;
	public String sNombre;
	
	private Singleton(String sNombre) {
		this.sNombre=sNombre;
	}
	
	public static Singleton getSingleton(String sNombre) {
		if(usuario == null) {
			 usuario = new Singleton(sNombre);
		}else {
			System.out.println("El usuario com�n se llama "+sNombre);
		}
		return usuario;
	}
}
