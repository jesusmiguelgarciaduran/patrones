package View;

import Model.Singleton;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton=Singleton.getSingleton("Jesús");
		Singleton singleton2=Singleton.getSingleton("yo");
		
		System.out.println(singleton.sNombre);
		System.out.println(singleton2.sNombre);
		
	}

}
