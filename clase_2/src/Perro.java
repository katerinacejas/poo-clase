public class Perro {
    // atributos
    private String nombre;
    private double tamanio;
    private String raza;
    private int edad;
    private boolean tieneHambre = true;

    // métodos
    public String ladra() {
        return "Guau";
    }

    public void comer(int gramosComida) {
        if(gramosComida > 20) {
            this.tieneHambre = false;
        }
    }

    public boolean esViejito() {
        return this.edad > 10;
    }

    // setters y getters
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setRaza(String unaRaza) {
        this.raza = unaRaza;
    }
    public String getRaza() {
        return this.raza;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setTamanio(double unTamanio) {
        this.tamanio = unTamanio;
    }
    public double getTamanio() {
        return this.tamanio;
    }
}
