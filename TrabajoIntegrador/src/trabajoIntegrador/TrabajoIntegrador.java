package trabajoIntegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TrabajoIntegrador {

	public static void main(String[] args) {
		
		 try {
	            
	                       
	            for (String linea : Files.readAllLines(Paths.get("G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL"
	            		+ "\\TrabajoIntegrador\\src\\modelo\\resultados.csv"))) {
	                System.out.println(linea);
	            }

	            for (String linea : Files.readAllLines(Paths.get("G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL"
	            		+ "\\TrabajoIntegrador\\src\\modelo\\pronostico.csv"))) {
	                System.out.println(linea);
	            }

	        } catch (IOException ex) {
	            System.out.println("no se encontro el archivo");
	        }
		
	}

}
