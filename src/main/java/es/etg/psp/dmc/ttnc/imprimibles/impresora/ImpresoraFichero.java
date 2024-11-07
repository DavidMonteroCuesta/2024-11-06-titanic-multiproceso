package es.etg.psp.dmc.ttnc.imprimibles.impresora;

import es.etg.psp.dmc.ttnc.util.Escritura;

public class ImpresoraFichero extends Impresora implements Escritura{
    @Override
    public void imprimir(String rutaFichero, String contenido) {
        Escritura.escribir(rutaFichero, contenido);
    }

}
