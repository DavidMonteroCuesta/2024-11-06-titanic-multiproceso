package es.etg.psp.dmc.ttnc.imprimibles.impresora;

import es.etg.psp.dmc.ttnc.util.Escritura;

public class ImpresoraFicheroVisual extends Impresora{
    @Override
    public void imprimir(String rutaFichero, String contenido) {
        Escritura.escribir(rutaFichero, contenido);
        System.out.print(contenido);
    }
}
