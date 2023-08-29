import java.util.Scanner;

public class Ejemplo02{
	public static void main(String[] args) {
		
		// Variable para entrada de datos
		Scanner entrada = new Scanner(System.in);

		// Solicitar al usuario un numero N
		System.out.print("Ingrese un numero N: ");
		int numero = entrada.nextInt();

		// Crear el arreglo
		int pares [] = new int [numero];

		// Llenar el arreglo
		int cont = 2;
		for (int i=0; i<pares.length; i++) {
			pares[i] = cont;
			cont = cont + 2;
		}

		// Imprimir el arreglo
		for (int i=0; i<pares.length; i++) {
			System.out.println(" Pos "+i+": "+pares[i]);
		}
	}
}