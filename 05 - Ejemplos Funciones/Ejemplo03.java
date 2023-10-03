
public class Ejemplo03{

	public static void main(String[] args) {
		int listado [] = {1,2,3,4,5,6};
		int listado2 [] = {1,2,3,1,2,3,1,2,3};

		imprimirArreglo( listado );
		imprimirArreglo( listado2 );
	}

	public static void imprimirArreglo(int[] arreglo){
		for (int i=0; i<arreglo.length; i++) {
			System.out.print("["+arreglo[i]+"]");
		}		
	}

}