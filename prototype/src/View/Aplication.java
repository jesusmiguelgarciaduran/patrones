package View;

import Model.Camiseta;

public class Aplication {

	public static void main(String[] args) {
		
		Camiseta camiseta1= new Camiseta("M","Verde","Adidas");
		camiseta1.toString();
		Camiseta camiseta2=camiseta1.clone();
		camiseta2.setsColor("Azul");
		camiseta2.toString();
		Camiseta camiseta3=camiseta1.clone();
		camiseta3.setsMarca("Puma");
		camiseta3.toString();
		Camiseta camiseta4=camiseta1.clone();
		camiseta4.setsTalla("L");
		camiseta4.toString();
		Camiseta camiseta5=camiseta1.clone();
		camiseta5.setsTalla("XL");
		camiseta5.toString();
		Camiseta camiseta6=camiseta1.clone();
		camiseta6.setsColor("Amarillo");
		camiseta6.toString();

	}

}
