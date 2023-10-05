
public class Principal{
	public static void main(String[] args) {

		// Crear Arreglo de Personas
		Persona listado [] = new Persona [10];		
		listado[0] = new Persona(108800, "Oscar", 44, 130, 240);
		listado[1] = new Persona(108801, "Juan", 20, 120, 389);

		// Imprimir Personas del Arreglo
		for (int i=0; i<listado.length; i++ ) {
			if ( listado[i] != null) {
				System.out.println(" => " + listado[i].getCedula() + " - " + listado[i].getNombres() );
			}
		}


	}
}