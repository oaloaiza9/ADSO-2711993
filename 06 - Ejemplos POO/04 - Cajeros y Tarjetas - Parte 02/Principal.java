
public class Principal{
	public static void main(String[] args) {
		
		CajeroElectronico cajero_01 = new CajeroElectronico(0, 10, 10, 10, 10, "Davivienda", "andres12345", "12345");
		CajeroElectronico cajero_02 = new CajeroElectronico(300000000, 100, 100, 100, 100, "Bancolombia", "daniela54321", "12345");
		
		TarjetaDebito tarjeta_01 = new TarjetaDebito("0001 0001 0001 0001", "1234", "Oscar Loaiza", "Davivienda", 1500000, 500000);
		TarjetaDebito tarjeta_02 = new TarjetaDebito("0002 0002 0002 0002", "4321", "Daniel Garcia", "Bancolombia", 24000000, 2500000);

		tarjeta_01.imprimirDetalleTarjeta();
		cajero_02.cambiarClaveTarjeta( tarjeta_01, "3333", "2288" );
		cajero_02.cambiarClaveTarjeta( tarjeta_01, "2393", "2288" );
		cajero_02.cambiarClaveTarjeta( tarjeta_01, "1234", "2288" );
		tarjeta_01.imprimirDetalleTarjeta();


	}
}