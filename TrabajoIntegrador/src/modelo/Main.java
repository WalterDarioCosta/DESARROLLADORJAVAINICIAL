package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {


	public static Partido cargarPartidos(Equipo equipo1, Equipo equipo2, String[] arrayResultado){//metodo cargar partidos
		Partido partido1 = new Partido();//creo el partido
		//seteamos el partido con datos  de la linea de archivo
		partido1.setEquipo1(equipo1);
		partido1.setEquipo2(equipo2);
		partido1.setGolesEquipo1(Integer.parseInt(arrayResultado[1]));//convertimos gol de string a int
		partido1.setGolesEquipo2(Integer.parseInt(arrayResultado[2]));
		return partido1;
	}
	public static String leerArchivos(String archivo){//metodo estatico leer archivos
		String arc = archivo;
		return arc;
	}
	public static int obtenerPuntos(Pronostico[] pronosticoRonda, int indicePronostico){//metodo estatico obtener puntos
		int totalPuntos=0;
		for(int i=0; i<indicePronostico;i++){//recorro los pronosticos
			totalPuntos+=pronosticoRonda[i].puntos();//llamamos al metodo de la clase pronostico que asigna los puntos
		}
		return totalPuntos;
	}
	public static Pronostico cargarPronosticos(int x,List<String>pronosticos,Partido [] partidosRonda,Pronostico[] pronosticosRonda){
		Pronostico pronostico = new Pronostico();//creo el pronostico
		ResultadoEnum resultadoPronostico;
		if ( pronosticos.get(x).split(";")[1].isEmpty()) {//obtenemos la linea que estamos recorriendo separando por ;  y obteniendo la posicion 1,IsEmpty. Devuelve el valor 1 (true) si hay un campo vacío; de lo contrario, devuelve el valor 0 (false).Si el espacio 1 esta vacio puede que sea un empate o que perdio el equipo 1
			if (pronosticos.get(x).split(";")[3].isEmpty()) {
				resultadoPronostico = ResultadoEnum.EMPATE;//empate si en la posicion 3 da 0
			} else {//pierde el equipo1
				resultadoPronostico = ResultadoEnum.PERDEDOR;
			}
		} else {
			resultadoPronostico = ResultadoEnum.GANADOR;//Si el espacio 1 no esta vacio es porque el equipo 1 GAN (ahi esta la cruz)
		}
		//Asignamos los valores de las variables mediante los set al pronostico
		pronostico.setPartido(partidosRonda[x]);
		pronostico.setEquipo(partidosRonda[x].getEquipo1());//Asignamos al equipo y luego su resultado
		pronostico.setResultado(resultadoPronostico);//seteamos el resultado
		pronosticosRonda[x] = pronostico;//Almacenamos el pronostico en el array
		return pronostico;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resultado = leerArchivos("G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL\\TrabajoIntegrador\\src\\modelo\\resultado.csv");//archivo resultados
		String archivo2 = leerArchivos("G:\\DESARROLLADOR JAVA INICIAL GitHub\\DESARROLLADORJAVAINICIAL\\TrabajoIntegrador\\src\\modelo\\pronostico.csv");//archivo pronosticos persona
		List<String> partidos = new ArrayList<>();
		List<String> pronosticos = new ArrayList<>();
		Partido partidosRonda[] = new  Partido[3];
		Pronostico pronosticosRonda[] = new  Pronostico[3];
		try {
			pronosticos = Files.readAllLines(Paths.get(archivo2));
			partidos = Files.readAllLines(Paths.get(resultado));
			partidos.remove(0);//removemos primera linea del archivo resultados
			pronosticos.remove(0);//removemos primera linea del archivo pronosticos
			int i =0;
			for ( String linea: partidos  ){ //recorro cada linea del archivo resultados
				String[] arrayResultado = linea.split(";");
				//creamos el partido con (equipo,goles)
				Equipo equipo1 =new Equipo();//creo el equipo1
				equipo1.setNombre(arrayResultado[0]);//seteo el nombre del equipo 1 en el array
				Equipo equipo2 = new Equipo();//creo el equipo 2
				equipo2.setNombre(arrayResultado[3]);//seteo el nombre de equipo 2 en el array
				Partido partido1 = cargarPartidos(equipo1,equipo2,arrayResultado);
				//agregamos el  partido seteado en el metodo estatico cargarPaartidos al array partidosRonda
				partidosRonda[i] = partido1;
				i++;
			}
			// recorro partidos e invoco a  metodo estatico cargarPronosticos
			for (int x =0; x < pronosticos.size() ; x++) {//recorre partidos
				Pronostico pronostico = cargarPronosticos( x, pronosticos, partidosRonda, pronosticosRonda);
				pronosticosRonda[i]=pronostico;
			}
			//invoco a metodo estatico obtener puntos
			int totalPuntos= obtenerPuntos(pronosticosRonda,pronosticos.size());
			System.out.println("El puntaje de acuerdo al pronostico que seteo es: "+ totalPuntos);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}		


	}

}
