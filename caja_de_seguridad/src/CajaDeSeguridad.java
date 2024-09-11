public class CajaDeSeguridad {
    //abierta: puerta bierta & poner y sacar pertenencias
    //cerrada: puerta cerrada con clave
    //bloqueada: 3 veces o más clave incorrecta. solo se la puede desbloquear y abrir/cerrar usando la llave
    private boolean abierta;
    private boolean cerrada;
    private boolean bloqueada;


    public boolean estaBloqueada() {
        //TODO
        return false;
    }

    public boolean estaAbierta() {
        //TODO
        return false;
    }

    public boolean estaCerrada() {
        //TODO
        return false;
    }

    private boolean validarClave(String unaClave) {
        //TODO
        return false;
    }

    public boolean abrirConClave(String unaClave) {
        if(this.estaCerrada()) {
            int cantidadIntentos = 0;
            while(cantidadIntentos < 3){
                if(this.validarClave(unaClave)){
                    //abrir
                    this.abierta = true;
                    this.bloqueada = false;
                    this.cerrada = false;
                    break;
                }
                cantidadIntentos++;
            }
            if(cantidadIntentos == 2) {
                //bloquear
                this.abierta = false;
                this.bloqueada = true;
                this.cerrada = false;
            }
        }
        else {
            return false;
        }
    }


}
