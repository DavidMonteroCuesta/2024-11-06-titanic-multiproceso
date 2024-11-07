package es.etg.psp.dmc.ttnc;

import es.etg.psp.dmc.ttnc.comandos.Comando;
import es.etg.psp.dmc.ttnc.gestor.GestorTitanic;
import es.etg.psp.dmc.ttnc.imprimibles.fichero.FicheroFactory;
import es.etg.psp.dmc.ttnc.imprimibles.impresora.Impresora;
import es.etg.psp.dmc.ttnc.imprimibles.impresora.ImpresoraFactory;
import es.etg.psp.dmc.ttnc.util.Escritura;
import es.etg.psp.dmc.ttnc.util.Lectura;
import static es.etg.psp.dmc.ttnc.util.Texto.*;

public class Titanic implements Escritura, Lectura, ImpresoraFactory, FicheroFactory{
    public static void main(String[] args) {
        Impresora impresora = ImpresoraFactory.definir(TIPO_IMPRESORA);
        Comando comandosFecha = new Comando(COMANDO1, PARAMETROS_1);
        Comando comandosBarca = new Comando(COMANDO2, PARAMETROS_2);
        String rutaFichero = FicheroFactory.definir(TIPO_FICHERO, RUTA_FICHERO);

        Escritura.vaciar(rutaFichero);
        impresora.imprimir(rutaFichero, comandosFecha.ejecutar());

        for (int i = VALOR_INICIAL; i < VALOR_FINAL; i++) {
            if (i < MINIMO_CON_DOS_CIFRAS) 
                impresora.imprimir(rutaFichero, PREFIJO + VALOR_CERO + i + DOS_PUNTOS + ESPACIO_EN_BLANCO + comandosBarca.ejecutar());
            else 
                impresora.imprimir(rutaFichero, PREFIJO + i + DOS_PUNTOS + ESPACIO_EN_BLANCO + comandosBarca.ejecutar());
        }

        impresora.imprimir(rutaFichero, TOTAL + DOS_PUNTOS + ESPACIO_EN_BLANCO + String.valueOf(GestorTitanic.contarPersonas(rutaFichero)) + SALTO_DE_LINEA);
    }
}