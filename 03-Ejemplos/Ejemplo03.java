import java.util.Scanner;

public class Ejemplo03{
	public static void main(String[] args) {
		
		// Crear variable de entrada
		Scanner entrada = new Scanner(System.in);

		// Solicitar Notas al Usuario
		System.out.print(" Ingrese Nota 01: ");
		float nota_01 = entrada.nextFloat();

		System.out.print(" Ingrese Nota 02: ");
		float nota_02 = entrada.nextFloat();

		System.out.print(" Ingrese Nota 03: ");
		float nota_03 = entrada.nextFloat();

		System.out.print(" Ingrese Nota 04: ");
		float nota_04 = entrada.nextFloat();

		System.out.print(" Ingrese Nota 05: ");
		float nota_05 = entrada.nextFloat();

		// Aplicar Formula del Promedio
		float promedio = (nota_01+nota_02+nota_03+nota_04+nota_05)/5;

		// Imprimir resultado Final
		System.out.println(" PROMEDIO ES: "+promedio);
	}
}