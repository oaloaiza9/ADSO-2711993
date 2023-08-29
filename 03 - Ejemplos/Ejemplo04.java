import java.util.Scanner;

public class Ejemplo04{
	public static void main(String[] args) {
		
		// Crear la variable para leer por teclado
		Scanner entrada = new Scanner(System.in);

		// Pedir los datos (Notas y Creditos)
		System.out.print(" => Ingrese Nota 01: ");
		float nota_01 = entrada.nextFloat();

		System.out.print(" => Ingrese Creditos Nota 01: ");
		float credito_01 = entrada.nextFloat();

		System.out.print(" => Ingrese Nota 02: ");
		float nota_02 = entrada.nextFloat();

		System.out.print(" => Ingrese Creditos Nota 02: ");
		float credito_02 = entrada.nextFloat();

		System.out.print(" => Ingrese Nota 03: ");
		float nota_03 = entrada.nextFloat();

		System.out.print(" => Ingrese Creditos Nota 03: ");
		float credito_03 = entrada.nextFloat();

		System.out.print(" => Ingrese Nota 04: ");
		float nota_04 = entrada.nextFloat();

		System.out.print(" => Ingrese Creditos Nota 04: ");
		float credito_04 = entrada.nextFloat();

		System.out.print(" => Ingrese Nota 05: ");
		float nota_05 = entrada.nextFloat();

		System.out.print(" => Ingrese Creditos Nota 05: ");
		float credito_05 = entrada.nextFloat();

		// Aplicar la formula
		float sumatoria_notas = (nota_01*credito_01)+(nota_02*credito_02)+(nota_03*credito_03)+(nota_04*credito_04)+(nota_05*credito_05);
		float sumatoria_creditos = credito_01+credito_02+credito_03+credito_04+credito_05;
		float promedio_ponderado = sumatoria_notas/sumatoria_creditos;

		// Imprimir el Resultado
		System.out.println(" => PROMEDIO PONDERADO: "+promedio_ponderado);

	}
}