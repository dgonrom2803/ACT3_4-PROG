package Interfaz;

public class Impresora implements Imprimible, Borrable{
    String pagina;

    Impresora(){
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

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
        pagina = " ";
        System.out.println(" ");
    }
}

