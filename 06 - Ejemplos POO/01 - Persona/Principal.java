
public class Principal{
	public static void main(String[] args) {
		
		// Creacion de Instancia
		Persona pe01 = new Persona(108800, "Oscar", "Loaiza", "3000000", "oscar@mail.com");
		Persona pe02 = new Persona(108801, "Juan", "Lopez", "3000001", "juan@mail.com");
		Persona pe03 = new Persona(108802, "Andres", "Gomez", "3000002", "andres@mail.com");
		Persona pe04 = new Persona(108803, "Ana", "Marin", "3000003", "ana@mail.com");
		Persona pe05 = new Persona(108804, "Daniel", "Garcia", "3000004", "daniel@mail.com");
		
		pe01.imprimirDetalle();
		pe02.imprimirDetalle();
		pe03.imprimirDetalle();
		pe04.imprimirDetalle();
		pe05.imprimirDetalle();
		
	}
}