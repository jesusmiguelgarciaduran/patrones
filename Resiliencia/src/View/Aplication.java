package View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aplication {

	public static void main(String[] args) {
		String sCadena;
		String sRespuesta="";
		int iCuenta=0;
		boolean bValidado=true;
		while(sRespuesta!="-80" || !bValidado) {
			System.out.println("Por favor diga el resultado de esta operación: 10 - 10 x 10 + 10 ");
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

			try {
				sCadena=teclado.readLine();
			}catch (Exception e) {
				sCadena = "";
			}
			
			if(sRespuesta!="-80") {
				System.out.println("Esta respuesta es incorrecta.");
				iCuenta++;
				if(iCuenta==3) {
					System.out.println("Lo sentimos pero ha superado el número máximo de errores");
					bValidado=false;
					break;
				}
			}else {
				System.out.println("Si, correcto ha pasado usted la prueba");
				sRespuesta=sCadena;
			}
			
			 
		}
		
	}

}
