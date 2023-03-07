public class Ejercicio1_c {
	public static void main(String[] args) {
		int a=5;
		int b=14;
		boolean c = false; 
		
		while( a<=b ) {
			if((a%2==0) && (c == true)) { 
				System.out.print(a+" ");
			} if((a%2==1) && (c == false)) { 
				System.out.print(a+" ");	
			  }
			a=a+1;
		}
	}
}
