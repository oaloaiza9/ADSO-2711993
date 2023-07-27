import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Ejemplo02{
	public static void main(String[] args) {

		// Creacion de variable para leer por teclado
		Scanner entrada = new Scanner(System.in);
		Scanner entrada_texto = new Scanner(System.in);

		// Ejemplo Instruccion de Salida
		System.out.println("Hola Mundo");

		// Ejemplo entrada de datos
		System.out.print("Ingrese edad: ");
		byte edad = entrada.nextByte();

		System.out.print("Ingrese turno: ");
		short turno = entrada.nextShort();

		System.out.print("Ingrese total vendido: ");
		int total_vendido = entrada.nextInt();

		System.out.print("Ingrese Poblacion Mundial: ");
		long poblacion_mundial = entrada.nextLong();

		System.out.print("Ingrese Estatura: ");
		float estatura = entrada.nextFloat();

		System.out.print("Ingrese valor de PI: ");
		double pi = entrada.nextDouble();

		System.out.print("Ingrese valor de Bandera (true - false): ");
		boolean bandera = entrada.nextBoolean();

		System.out.print("Ingrese letra: ");
		char letra = entrada.next().charAt(0);

		System.out.print("Ingrese nombre completo: ");
		String nombre = entrada_texto.nextLine();

		System.out.print("Ingrese direccion residencia: ");
		String direccion = entrada_texto.nextLine();

		// Impresion de variables
		System.out.println("La edad ingresada fue: "+edad);
		System.out.println("El turno ingresado fue: "+turno);
		System.out.println("El Total Vendido fue: "+total_vendido);
		System.out.println("La Poblacion Mundial fue: "+poblacion_mundial);
		System.out.println("La Estatura fue: "+estatura);
		System.out.println("El valor de PI fue: "+pi);
		System.out.println("El valor de la bandera fue: "+bandera);
		System.out.println("La letra fue: "+letra);
		System.out.println("El nombre fue: "+nombre);
		System.out.println("La direccion fue: "+direccion);

	}
}