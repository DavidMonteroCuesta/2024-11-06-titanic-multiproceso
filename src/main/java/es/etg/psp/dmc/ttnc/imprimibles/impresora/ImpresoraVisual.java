package es.etg.psp.dmc.ttnc.imprimibles.impresora;

public class ImpresoraVisual extends Impresora{

    @Override
    public void imprimir(String rutaFichero, String contenido) {
        System.out.print(contenido);
    }

}