
public class Ejemplo01{

	public static void main(String[] args) {

		int edad = 20;
		imprimirEdad( edad );

		// Invocando Funcion
		System.out.println("Resultado suma:"+sumar(5, 4) );
		System.out.println("Resultado suma:"+sumar(2, 3) );
		System.out.println("Resultado suma:"+sumar(7, 8) );
		System.out.println("Resultado suma:"+sumar(-1, 20) );
	}

	public static int sumar(int a, int b){
		int respuesta = a + b;
		return respuesta;
	}

	public static void imprimirEdad(int a){
		System.out.println("La edada es: "+a);
	}

}