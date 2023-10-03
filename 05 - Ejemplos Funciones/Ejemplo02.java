

public class Ejemplo02{
	
	public static void main(String[] args) {
		int lista [] = new int [10];
		lista = llenarArreglo( lista );
		
		for (int i=0; i<lista.length; i++) {
			System.out.print("["+lista[i]+"]");
		}
	}

	public static int[] llenarArreglo(int[] arreglo){
		for (int i=0; i<arreglo.length; i++) {
			arreglo[i] = (int) (Math.random()*100);
		}
		return arreglo;
	}

}