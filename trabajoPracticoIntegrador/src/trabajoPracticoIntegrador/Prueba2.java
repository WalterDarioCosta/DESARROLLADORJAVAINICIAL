package trabajoPracticoIntegrador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ----------------Lectura archivo partidos----------------------
		String partidos = "G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL\\trabajoPracticoIntegrador\\src\\trabajoPracticoIntegrador\\resultados.csv";
		BufferedReader leerArchivo = null;
		String line = "";

		Partido[] partido = new Partido[4];

		// ----------------Lectura archivo pronosticos----------------------
		String pronostico = "G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL\\trabajoPracticoIntegrador\\src\\trabajoPracticoIntegrador\\pronostico.csv";
		BufferedReader leerArchivo2 = null;
		String line2 = "";

		Pronostico[] pronosticos = new Pronostico[5];

		// -------------------------------------------------------------------

		try {

			// -------------------------------------------------------------------
			int i = 0;
			leerArchivo = new BufferedReader(new FileReader(partidos));
			boolean esPrimeraLinea = true;
			while ((line = leerArchivo.readLine()) != null) {

				// Si es la primera línea, continuamos con la siguiente
				if (esPrimeraLinea) {
					esPrimeraLinea = false;
					continue;
				}

				String[] datos = line.split(";");

				// ------------Instancio / creo los equipos---------
				Equipo equipo1 = new Equipo();
				equipo1.setNombre(datos[0]);

				Equipo equipo2 = new Equipo();
				equipo2.setNombre(datos[3]);

				// ----------Instancio / creo el partido-------------
				Partido p = new Partido();
				p.setEquipo1(equipo1);
				p.setEquipo2(equipo2);
				p.setGolesEquipo1(Integer.parseInt(datos[1]));
				p.setGolesEquipo1(Integer.parseInt(datos[2]));

				partido[i] = p;
				i++;

			} // --fin while--

			for (int m = 0; m < partido.length; m++) { // Recorre el arreglo partido
				System.out.println(partido[m]);
			}

			// --------------------------------------------------------------
			int n = 0;
			leerArchivo2 = new BufferedReader(new FileReader(pronostico));
			while ((line2 = leerArchivo2.readLine()) != null) {

				// Si es la primera línea, continuamos con la siguiente
				if (esPrimeraLinea) {
					esPrimeraLinea = false;
					continue;
				}

				String[] datos2 = line2.split(";"); // separador

				Equipo equipoA = new Equipo(); // creo los equipos
				equipoA.setNombre(datos2[0]);

				Equipo equipoB = new Equipo();
				equipoB.setNombre(datos2[4]);

				Pronostico pron = new Pronostico(); // creo objeto ponostico
				pron.setEquipo(equipoA);
				pron.setEquipo(equipoB);

				pronosticos[n] = pron;
				n++;

			} // --fin while

			for (Pronostico o : pronosticos) { // recorre arreglo pronosticos
				System.out.println(o);
			}

		} // --fin try

		catch (IOException e) {
			e.printStackTrace();
		}				
					
				
		
	}
		

}
