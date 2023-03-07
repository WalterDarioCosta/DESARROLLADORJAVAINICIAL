public class Ejercicio2 {
	public static void main(String[] args) {
		float ing=489084;
		int v=4;
		int ant=4;
		int inm=4;
		boolean emb=true;
		
		if ( (ing >= 489083) && (v>3) && (ant<5) 
				&& (inm>3) && (emb==true)) {
			System.out.print("Pertenece al Segmento de ingresos Altos");
		}else
			System.out.print("No Pertenece al Segmento de ingresos Altos");
	}
}
