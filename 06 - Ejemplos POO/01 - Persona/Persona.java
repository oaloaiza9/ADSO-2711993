public class Persona{

	// Atributos
	int cedula;
	String nombres;
	String apellidos;
	String telefono;
	String email;

	// Metodos
	//  - Constructor
	public Persona(int dato1, String dato2, String dato3, String dato4, String dato5){
		cedula = dato1;
		nombres = dato2;
		apellidos = dato3;
		telefono = dato4;
		email = dato5;
	}

	//  - Getters
	public int getCedula(){
		return cedula;
	}

	public String getNombres(){
		return nombres;
	}

	public String getApellidos(){
		return apellidos;
	}

	public String getTelefono(){
		return telefono;
	}

	public String getEmail(){
		return email;
	}

	//  - Setters
	public void setCedula(int dato){
		cedula = dato;
	}

	public void setNombres(String dato){
		nombres = dato;
	}

	public void setApellidos(String dato){
		apellidos = dato;
	}

	public void setTelefono(String dato){
		telefono = dato;
	}

	public void setEmail(String dato){
		email = dato;
	}

	public void imprimirDetalle(){
		System.out.println("\n");
		System.out.println("|-----------------------------|");
		System.out.println("|       DETALLE PERSONA       |");
		System.out.println("|-----------------------------|");
		System.out.println("| cedula: " + cedula);
		System.out.println("| nombres: " + nombres);
		System.out.println("| apellidos: " + apellidos);
		System.out.println("| telfono: " + telefono);
		System.out.println("| email: " + email);
		System.out.println("|-----------------------------|");
	}

}