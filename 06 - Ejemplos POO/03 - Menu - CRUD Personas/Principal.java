import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {

		// Lectura por Teclado
		Scanner entradaNumero = new Scanner(System.in);
		Scanner entradaTexto = new Scanner(System.in);
		
		// Para condicionar el ciclo del Menu
		int opcion = 0;

		// Para almacenar las personas
		Persona listado [] = new Persona [100];
		int indice = 0;

		while(opcion!=11){
			System.out.println("+----------------------------+");
			System.out.println("|            MENU            |");
			System.out.println("+----------------------------+");
			System.out.println("|  1. Crear Persona.         |");
			System.out.println("|  2. Listar Personas.       |");
			System.out.println("|  3. Editar Persona.        |");
			System.out.println("|  4. Eliminar Persona.      |");
			System.out.println("|  5. Persona mas Alta.      |");
			System.out.println("|  6. Persona mas Baja.      |");
			System.out.println("|  7. Persona mas Pesada.    |");
			System.out.println("|  8. Persona menos Pesada.  |");
			System.out.println("|  9. Promedio de Altura.    |");
			System.out.println("| 10. Promedio de Peso.      |");
			System.out.println("| 11. Salir.                 |");
			System.out.println("+----------------------------+");
			System.out.print("  => Ingrese una opcion: ");
			opcion = entradaNumero.nextInt();

			if(opcion==1){
				// Solicitar los datos al usuario
				System.out.print("  => Ingrese Cedula: ");
				int cedula = entradaNumero.nextInt();

				System.out.print("  => Ingrese Nombres: ");
				String nombres = entradaTexto.nextLine();

				System.out.print("  => Ingrese Edad: ");
				int edad = entradaNumero.nextInt();

				System.out.print("  => Ingrese Altura: ");
				double altura = entradaNumero.nextDouble();

				System.out.print("  => Ingrese Peso: ");
				double peso = entradaNumero.nextDouble();

				// Crear una instancia de la Persona
				Persona temporal = new Persona(cedula, nombres, edad, altura, peso);

				// Almacenarlo en el arreglo
				listado[indice] = temporal;

				// Aumentar el indice
				indice++;
			}else if(opcion==2){

				for (int i=0; i<indice; i++) {
					System.out.println( (i+1)+" => "+listado[i].detallePersona() );
				}

			}else if(opcion==3){

			}else if(opcion==4){

			}else if(opcion==5){

			}else if(opcion==6){

			}else if(opcion==7){

			}else if(opcion==8){

			}else if(opcion==9){

			}else if(opcion==10){

			}else if(opcion==11){

			}else{
				System.out.println("+----------------------------+");
				System.out.println("|       OPCION INVALIDA      |");
				System.out.println("+----------------------------+");
				System.out.println("\n");
			}
		}
		
	}
}