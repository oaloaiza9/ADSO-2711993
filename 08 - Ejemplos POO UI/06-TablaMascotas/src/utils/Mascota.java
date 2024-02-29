package utils;

public class Mascota {
    
    private String nombre;
    private String tipo;
    private String edad;
    public Medicamento listaMedicamentos [];
    
    public Mascota(String nombre, String tipo, String edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        
        listaMedicamentos = new Medicamento[100];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void addMedicamento(Medicamento medicamento){
        for (int i=0; i<listaMedicamentos.length; i++) {
            if (listaMedicamentos[i]==null) {
                listaMedicamentos[i] = medicamento;
                break;
            }
        }
    }
    
    public void removeMedicamento(Medicamento medicamento){
        for (int i=0; i<listaMedicamentos.length; i++) {
            if (listaMedicamentos[i].equals(medicamento)) {
                for (int j=i; j<listaMedicamentos.length-1; j++) {
                    listaMedicamentos[j] = listaMedicamentos[j+1];
                }
                listaMedicamentos[listaMedicamentos.length-1] = null;
                break;
            }
        }
    }
    
}
