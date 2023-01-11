package Interfaz;

public class Consola implements Imprimible, Borrable {
    String pantalla = "$";
    @Override
    public void imprime() {
        System.out.printf("%S", pantalla + "\n");
    }

    @Override
    public void establecerContenido(String contenido) {

        System.out.printf("%S", contenido + " " + pantalla);
    }

    @Override
    public void borrar() {
        System.out.println("*********************");
    }
}
