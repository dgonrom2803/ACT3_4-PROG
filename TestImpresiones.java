package Interfaz;

public class TestImpresiones {
    public static void main(String[] args) {
        System.out.println("IMPRESORA");
        Impresora impresora1 = new Impresora();
        impresora1.imprime();
        impresora1.borrar();
        impresora1.establecerContenido("Contenido de la impresora 1");
        System.out.println("CONSOLA");
        Consola consola1 = new Consola();
        consola1.imprime();
        consola1.borrar();
        consola1.establecerContenido("Contenido de la consola 1");
    }
}
