public class MembresiaDePrueba  extends Membresia{
    private boolean estaActiva = true;

    @Override
    public boolean poderRealizarUnaActividad (Actividad unaActividad) {
        if(this.estaActiva){
            this.estaActiva = false;
            return true;
        }
        return false;
    }
}
