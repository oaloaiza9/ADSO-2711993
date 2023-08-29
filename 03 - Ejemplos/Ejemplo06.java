import java.util.Scanner;

public class Ejemplo06{
	public static void main(String[] args) {
		
		// Crear variable de entrada
		Scanner entrada = new Scanner(System.in);

		System.out.print("=> Ingrese numero para calcular Sumatoria: ");
		int numero = entrada.nextInt();

		// Caso en que sea Par
		if (numero%2==0) {
			int suma = 1 + numero;
			int producto = numero/2;
			int resultado = suma*producto;
			System.out.println(" => La sumatoria sin Ciclos es: "+resultado);
		}else{
			int suma = 1 + numero;
			int producto = (numero/2);
			int resultado = (suma*producto) + (producto+1);
			System.out.println(" => La sumatoria sin Ciclos es: "+resultado);
		}

		int contador = 1;
		int sumatoria = 0;
		while(contador<=numero){
			sumatoria += contador;
			contador++;
		}
		System.out.println(" => La sumatoria con Ciclos es: "+sumatoria);
	}
}