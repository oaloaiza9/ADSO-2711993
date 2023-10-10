import java.util.Date;

public class TarjetaDebito{

	// Atributos
	String numero_tarjeta;
	String clave;
	String propietario;
	String nombre_banco;
	int dinero_disponible;
	int permitido_retirar;
	String ultimas_transacciones [];

	// Metodos
	public TarjetaDebito(String dato1, String dato2, String dato3, String dato4, int dato5, int dato6){
		numero_tarjeta = dato1;
		clave = dato2;
		propietario = dato3;
		nombre_banco = dato4;
		dinero_disponible = dato5;
		permitido_retirar = dato6;
		
		ultimas_transacciones = new String [5];
	}

	public void imprimirDetalleTarjeta(){
		System.out.println("+-----------------------------------------+");
		System.out.println("+              DETALLE TARJETA            +");
		System.out.println("+-----------------------------------------+");
		System.out.println("| numero_tarjeta: "+numero_tarjeta);
		System.out.println("| clave: "+clave);
		System.out.println("| propietario: "+propietario);
		System.out.println("| nombre_banco: "+nombre_banco);
		System.out.println("| dinero_disponible: "+dinero_disponible);
		System.out.println("| permitido_retirar: "+permitido_retirar);
		System.out.println("| Ultimas transacciones: ");
		for (int i=0; i<ultimas_transacciones.length; i++) {
			System.out.println("   - " + ultimas_transacciones[i]);
		}
		System.out.println("+-----------------------------------------+\n");
	}

	public boolean cambiarClave(String clave_actual, String clave_nueva){
		if ( clave.equals(clave_actual) ) {
			clave = clave_nueva;
			registrarTransaccion("CAMBIOCLAVE", 0, "OK");
			return true;
		}else{
			registrarTransaccion("CAMBIOCLAVE", 0, "ERROR");
			return false;
		}
	}

	public void registrarTransaccion(String tipo, int monto, String estado){
		Date fecha = new Date();
		String texto = fecha.toString()+" - "+tipo+" - $"+monto+" - "+estado;

		int indice = -1;
		for (int i=0; i<ultimas_transacciones.length; i++) {
			if (ultimas_transacciones[i]==null) {
				indice = i;
				break;
			}
		}

		ultimas_transacciones[indice] = texto;
	}


}