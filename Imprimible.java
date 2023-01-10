package Interfaz;

public interface Imprimible {
    final String TEXTO_POR_DEFECTO = "Página de Prueba";
    void imprime();
    void establecerContenido(String contenido);
}
