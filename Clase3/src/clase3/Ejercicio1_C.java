package clase3;

public class Ejercicio1_C {

	public static void main(String[] args) {
		int v[]= {10, 11, 13, 8, 5, 3, 20, 1};
        int x=12;
        int sum=0;
        
        for(int i=0; i<v.length; ++i){
           if(v[i]>x){
               sum=sum+v[i];
           }
        }
        System.out.print(" La Sumatoria es: " +sum);

	}

}
