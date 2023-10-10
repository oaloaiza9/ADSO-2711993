
public class CajeroElectronico{

	// Atributos
	int capacidad_total;
	int dinero_disponible;
	int cant_10;
	int cant_20;
	int cant_50;
	int cant_100;
	String nombre_banco;
	String usuario_admin;
	String clave_admin;

	// Metodos
	public CajeroElectronico(int dato1, int dato3, int dato4, int dato5, int  dato6, String dato7, String dato8, String dato9){
		capacidad_total = dato1;
		cant_10 = dato3;
		cant_20 = dato4;
		cant_50 = dato5;
		cant_100 = dato6;
		nombre_banco = dato7;
		usuario_admin = dato8;
		clave_admin = dato9;

		dinero_disponible = (cant_10*10000) + (cant_20*20000) + (cant_50*50000) + (cant_100*100000);

		if (capacidad_total < dinero_disponible) {
			capacidad_total = dinero_disponible;
		}
	}

	public void imprimirDetalleCajero(){
		System.out.println("+------------------------------------------+");
		System.out.println("+            DETALLE DEL CAJERO            +");
		System.out.println("+------------------------------------------+");
		System.out.println("| capacidad_total: "+capacidad_total);
		System.out.println("| dinero_disponible: "+dinero_disponible);
		System.out.println("| cant_10: "+cant_10);
		System.out.println("| cant_20: "+cant_20);
		System.out.println("| cant_50: "+cant_50);
		System.out.println("| cant_100: "+cant_100);
		System.out.println("| nombre_banco: "+nombre_banco);
		System.out.println("| usuario_admin: "+usuario_admin);
		System.out.println("| clave_admin: "+clave_admin);
		System.out.println("+------------------------------------------+");
	}

	public void abastecerCajero(String user, String password, int cantidad_10, int cantidad_20, int cantidad_50, int cantidad_100){
		if ( usuario_admin.equals(user) && clave_admin.equals(password) ) {	
			int total = (cantidad_10*10000) + (cantidad_20*20000) + (cantidad_50*50000) + (cantidad_100*100000);
			if ( total <= capacidad_total  ) {	
				dinero_disponible = total;
				cant_10 = cantidad_10;
				cant_20 = cantidad_20;
				cant_50 = cantidad_50;
				cant_100 = cantidad_100;
				System.out.println("----- PROCESO REALIZADO CON EXITO -----");
			}else{
				System.out.println("----- ERROR EN CANTIDAD INGRESADA - EXCEDE TOTAL -----");
			}
		}else{
			System.out.println("----- ACCESO DENEGADO - ERROR DE USUARIO -----");
		}
	}

	public void cambiarClaveCajero(String user, String password, String new_password){
		if ( usuario_admin.equals(user) && clave_admin.equals(password) ) {	
			this.clave_admin = new_password;
			System.out.println("----- PROCESO REALIZADO CON EXITO -----");
		}else{
			System.out.println("----- ACCESO DENEGADO - ERROR DE USUARIO -----");
		}
	}

	public void cambiarClaveTarjeta(TarjetaDebito tarjeta, String clave_actual, String clave_nueva){
		boolean proceso = tarjeta.cambiarClave(clave_actual, clave_nueva);
		if ( proceso ) {
			System.out.println("------- CLAVE CAMBIADA CON EXITO --------");
		}else{
			System.out.println("------- ERROR EN DATOS --------");
		}
	}

}