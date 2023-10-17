
public class Principal{
	public static void main(String[] args) {
		
		CajeroElectronico cajero_01 = new CajeroElectronico(0, 10, 10, 10, 10, "Davivienda", "andres12345", "12345");
		CajeroElectronico cajero_02 = new CajeroElectronico(300000000, 500, 500, 500, 500, "Bancolombia", "daniela54321", "12345");
		
		TarjetaDebito tarjeta_01 = new TarjetaDebito("0001 0001 0001 0001", "1234", "Oscar Loaiza", "Davivienda", 1500000, 500000 );
		TarjetaDebito tarjeta_02 = new TarjetaDebito("0002 0002 0002 0002", "4321", "Daniel Garcia", "Bancolombia", 24000000, 25000000 );

	
		cajero_02.imprimirDetalleCajero();
		tarjeta_02.imprimirDetalleTarjeta();		

		cajero_02.retirarDineroTarjeta( tarjeta_02, 80000000, "3212" );
		cajero_02.retirarDineroTarjeta( tarjeta_02, 80000000, "4321" );
		cajero_02.retirarDineroTarjeta( tarjeta_02, 24500000, "4321" );
		cajero_02.retirarDineroTarjeta( tarjeta_02, 100000, "4321" );

		cajero_02.imprimirDetalleCajero();
		tarjeta_02.imprimirDetalleTarjeta();		
	}
}