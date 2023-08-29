import java.util.Scanner;

public class Ejemplo01{
	public static void main(String[] args) {
		
		// Variable para entrada de datos.
		Scanner entrada = new Scanner(System.in);

		// Creando arreglos vacios.
		int listaEdades [] = new int [10];

		// Agregar/Modificar datos en el arreglo
		listaEdades[0] = 25;
		listaEdades[1] = 30;
		listaEdades[5] = 6;
		listaEdades[9] = 33;

		// Imprimir el contenido del arreglo
		System.out.print("[");
		for (int i=0; i<listaEdades.length ; i++) {
			System.out.print(listaEdades[i]);
			if ( i<listaEdades.length-1 ) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		


	}
}