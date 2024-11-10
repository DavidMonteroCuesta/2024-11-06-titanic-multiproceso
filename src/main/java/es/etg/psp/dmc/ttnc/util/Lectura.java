package es.etg.psp.dmc.ttnc.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static es.etg.psp.dmc.ttnc.util.Texto.*;

public interface Lectura {

    static String leer(File fichero) {
        String contenido = VACIO;
        try (Scanner sc = new Scanner(fichero)){
            while (sc.hasNextLine()) 
                contenido += sc.nextLine() + SEPARADOR;
        } catch (FileNotFoundException e) {
            System.err.println(MSG_ERROR_ENCONTRAR_F);
        }
        return contenido;
    }
}
