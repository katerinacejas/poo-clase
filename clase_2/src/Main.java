public class Main {
    public static void main(String[] args) {
        Perro chispi = new Perro();

        chispi.setNombre("Chispita");
        String nombreDeFlash = chispi.getNombre();
        System.out.println("El nombre de chispi es: " + nombreDeFlash);

        chispi.setRaza("Caniche");
        System.out.println("La raza de chispi es: " + chispi.getRaza());

        chispi.comer(45);

        chispi.setEdad(14);
        System.out.println("La edad de chispi es: " + chispi.getEdad());

        System.out.println("Chispi es viejito? : " + chispi.esViejito());

        chispi.setTamanio(5.7);
        System.out.println("El tamanio de chispi es: " + chispi.getTamanio() + " kilos");

        Collar unCollar = new Collar();
        unCollar.setColor("Azul");
        chispi.setMiCollar(unCollar);
        System.out.println("el color del collar de chispi es: " + chispi.colorDeMiCollar());

        unCollar.setColor("Negro");
        System.out.println("el color del collar de chispi luego de cambiarlo es : " + chispi.colorDeMiCollar());

    }
}