import java.util.Scanner;

public class Ejemplo14{
	public static void main(String[] args) {
		
		// Crear la variable de entrada
		Scanner entrada = new Scanner(System.in);

		// Pedir al usuario los datos N y M
		System.out.print("=> Ingrese numero N:");
		int n = entrada.nextInt();

		System.out.print(" => Ingrese numero M: ");
		float m = entrada.nextFloat();

		// Crear el arreglo
		float arreglo [] = new float [n];

		// Llenarlo con datos aleatorios
		for (int i=0; i<arreglo.length; i++) {
			arreglo[i] = ((float) Math.random())*10;
		}

		// Imprimir el arreglo y el Numero M
		System.out.println("Buscando el numero: "+m);
		for (int i=0; i<arreglo.length; i++) {
			System.out.print("["+arreglo[i]+"] ");
		}
		System.out.println("");

		// Buscar el numero mas cercano a M
		// 

	}
}