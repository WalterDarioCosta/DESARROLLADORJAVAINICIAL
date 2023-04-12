package trabajoPracticoIntegrador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		
		String partidos = "G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL\\trabajoPracticoIntegrador\\src\\trabajoPracticoIntegrador\\resultados.csv";
		BufferedReader leerArchivo = null;
		String line = "";
		
		
		//ArrayList<Partido> partido1 = new ArrayList<>();
		
		
		try {
			leerArchivo = new BufferedReader(new FileReader(partidos));
		    while ((line = leerArchivo.readLine()) != null) { 
		    	
		       String[] datos = line.split(";"); //separador 
		
				
				String equipo1 = datos[0];
				String equipo2 = datos[3];
				int n = Integer.parseInt(datos[1]);
				int m = Integer.parseInt(datos[2]);
				
				System.out.println(datos[0] + " "+ datos[1] + " "+datos[2]+" "+datos[3]);
				//partido1.add(new Partido(equipo1,equipo2,n,m));
			
				
			        if (n > m) {
			            System.out.println("gana "+equipo1);
			            
			        } else if(n == m) {
			        	System.out.println("empate ");	
			            }else {
			            	System.out.println("gana "+equipo2);
			            }
			            
			        
		    	}
			} catch (IOException e) {
			    e.printStackTrace();
			}
		
	}
	
}
