package Model;

public class Camiseta {
	
	public String sTalla,sColor,sMarca;
	
	public Camiseta(String sTalla,String sColor,String sMarca) {
		
	}
	public String getsTalla() {
		return sTalla;
	}
	public void setsTalla(String sTalla) {
		this.sTalla = sTalla;
	}
	public String getsColor() {
		return sColor;
	}
	public void setsColor(String sColor) {
		this.sColor = sColor;
	}
	public String getsMarca() {
		return sMarca;
	}
	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}
	public Camiseta clone() {
		return new Camiseta(this.sTalla,this.sColor,this.sMarca);
	}
	public String toString() {
		String sConcat="";
		sConcat=sConcat+"La Talla es: "+this.sTalla+"/n";
		sConcat=sConcat+"El color es: "+this.sColor+"/n";
		sConcat=sConcat+"La Marca es: "+this.sMarca+"/n";
		
		return sConcat;
	}
}
