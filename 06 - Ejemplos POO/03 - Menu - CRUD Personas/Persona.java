public class Persona{

	int cedula;
	String nombres;
	int edad;
	double altura;
	double peso;

	public Persona(int dato1, String dato2, int dato3, double dato4, double dato5){
		cedula = dato1;
		nombres = dato2;
		edad = dato3;
		altura = dato4;
		peso = dato5;
	}

	public int getCedula(){
		return cedula;
	}
	public String getNombres(){
		return nombres;
	}
	public int getEdad(){
		return edad;
	}
	public double getAltura(){
		return altura;
	}
	public double getPeso(){
		return peso;
	}
	public void setCedula(int dato){
		cedula = dato;
	}
	public void setNombres(String dato){
		nombres = dato;
	}
	public void setEdad(int dato){
		edad = dato;
	}
	public void setAltura(double dato){
		altura = dato;
	}
	public void setPeso(double dato){
		peso = dato;
	}

	public String detallePersona(){
		return cedula+" - "+nombres+" - "+edad+" anios - "+altura+" cm - "+peso+" Kg";
	}

}