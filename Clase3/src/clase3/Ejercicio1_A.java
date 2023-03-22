package clase3;
public class Ejercicio1_A {

	public static void main(String[] args) {
		String texto = "hola mundo";
	    char letra = 'o';
	    int i;
	    int cont=0;
	         
	    i=texto.indexOf(letra);
	        
	    while(i != -1){
	    	cont++;
	        i=texto.indexOf(letra,i+1);
	    }
	    System.out.print(" La letra: " +letra+ 
	    		"\n Se repite "+ cont+ " Veces");
	}

}
