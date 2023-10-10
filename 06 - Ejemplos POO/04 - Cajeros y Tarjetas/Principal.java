
public class Principal{
	public static void main(String[] args) {
		
		CajeroElectronico cajero_01 = new CajeroElectronico(0, 10, 10, 10, 10, "Davivienda", "andres12345", "12345");
		CajeroElectronico cajero_02 = new CajeroElectronico(300000000, 100, 100, 100, 100, "Bancolombia", "daniela54321", "12345");
		
		cajero_02.imprimirDetalleCajero();
		cajero_02.abastecerCajero("daniela54321", "12345", 200, 200, 500, 500);
		cajero_02.imprimirDetalleCajero();

		

	}
}