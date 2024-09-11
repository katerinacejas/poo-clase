public class Actividad {
    private String nombre;
    private String descripcion;
    private TipoActividad tipoActividad;

    public Actividad(String unNombre,
                     String unaDescripcion,
                     TipoActividad unTipoActividad) {
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
        this.tipoActividad = unTipoActividad;
    }

    public TipoActividad getTipoActividad() {
        return this.tipoActividad;
    }
}
