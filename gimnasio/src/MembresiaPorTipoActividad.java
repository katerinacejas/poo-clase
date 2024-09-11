public class MembresiaPorTipoActividad extends Membresia{
    private TipoActividad tipoActividad;

    @Override
    public boolean poderRealizarUnaActividad (Actividad unaActividad) {
        return this.tipoActividad == unaActividad.getTipoActividad();
    }

    public void setTipoActividad(TipoActividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
}
