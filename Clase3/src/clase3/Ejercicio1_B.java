package clase3;

public class Ejercicio1_B {

	public static void main(String[] args) {
		 int a=5;
         int b=7;
         int c=1;
         int aux;
         int v[]= {a, b, c};
        
         for(int i=0; i<v.length-1; ++i){
             for(int j=i+1; j<v.length; ++j){
                 if(v[j] < v[i]){
                    aux=v[j];
                    v[j]=v[i];
                    v[i]=aux;
                 }
            }
         }
         
         System.out.print(" Vector Ordenado \n");
         for(int j=0; j<v.length; ++j)
            System.out.print(" " +v[j]);
	}

}
