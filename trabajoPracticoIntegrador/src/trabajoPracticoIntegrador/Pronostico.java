package trabajoPracticoIntegrador;

public class Pronostico {

	Partido partido;
	Equipo equipo;
	ResultadoEnum resultado;
	int puntos;
		
	
	public Pronostico() {
		super();
	}


	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado, int puntos) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
		this.puntos = puntos;
	}


	public Partido getPartido() {
		return partido;
	}


	public void setPartido(Partido partido) {
		this.partido = partido;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	public ResultadoEnum getResultado() {
		return resultado;
	}


	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
}
