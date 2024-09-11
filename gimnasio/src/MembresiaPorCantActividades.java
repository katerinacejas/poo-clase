public class MembresiaPorCantActividades extends Membresia{
    private int cantidadActividades;

    public void setCantidadActividades(int unaCantidadActividades) {
        this.cantidadActividades = unaCantidadActividades;
    }

    @Override
    public boolean poderRealizarUnaActividad (Actividad unaActividad) {
        if(this.cantidadActividades >= 1){
            this.cantidadActividades --;
            return true;
        }
        return false;
    }
}
