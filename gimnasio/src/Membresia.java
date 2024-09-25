public abstract class Membresia {
    private int dni;
    private String titular;

    public void setTitular(String unTitular) {
        this.titular = unTitular;
    }
    public void setDni(int unDni) {
        this.dni = unDni;
    }

    public abstract boolean poderRealizarUnaActividad (Actividad unaActividad);
}