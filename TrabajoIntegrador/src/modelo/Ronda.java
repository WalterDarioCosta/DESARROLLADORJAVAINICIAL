package modelo;

public class Ronda {
    private String numero;
    private Partido[] partidos;
    private int puntos;
	
    public Ronda() {
		super();
	}

	public Ronda(String numero, Partido[] partidos, int puntos) {
		super();
		this.numero = numero;
		this.partidos = partidos;
		this.puntos = puntos;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Partido[] getPartidos() {
		return partidos;
	}

	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
    
    
    
}
