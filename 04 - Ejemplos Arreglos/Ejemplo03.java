import java.util.*;

public class Ejemplo03{
	public static void main(String[] args) {
		
		// Entrada por Teclado
		Scanner entrada = new Scanner(System.in);

		System.out.print("=> Ingrese numero N:");
		int n = entrada.nextInt();

		int arreglo [] = new int [n];

		int contador = 0;
		int numero = 4;
		while(contador < n){

			for (int i=2; i<numero; i++) {
				if (numero%i == 0) {
					int div1 = i;
					int div2 = numero/i;

					int contDiv1 = 0;
					for (int j=1; j<=div1; j++) {
						if (div1%j==0) {
							contDiv1++;
						}
					}

					int contDiv2 = 0;
					for (int j=1; j<=div2; j++) {
						if (div2%j==0) {
							contDiv2++;
						}
					}

					if (contDiv1==2 && contDiv2==2) {
						arreglo[contador] = numero;
						contador++;
						break;
					}
				}
			}

			numero++;
		}


		for (int i=0; i<arreglo.length; i++) {
			System.out.print("["+arreglo[i]+"] ");
		}

	}
}