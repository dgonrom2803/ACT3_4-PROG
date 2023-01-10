package Interfaz;

public class Impresora implements Imprimible, Borrable{
    String pagina = TEXTO_POR_DEFECTO;

    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido(String contenido) {
        System.out.println(contenido);
    }

    @Override
    public void borrar() {
        System.out.println(" ");
    }
}

