package es.etg.psp.dmc.ttnc.brc;

import java.util.Random;
import static es.etg.psp.dmc.ttnc.util.Texto.*;

public class Barca {
    public static void main(String[] args) {

        int pasajeros = random(MIN_PASAJEROS,MAX_PASAJEROS);
        int threadMiliseconds = random(MIN_TIEMPO_EJEC,MAX_TIEMPO_EJEC);

        try {
            Thread.sleep(threadMiliseconds);
        } catch (InterruptedException e) {
            System.err.println(MSG_ERR_THREAD);
        }

        System.out.println((pasajeros < 10)? CERO + pasajeros : pasajeros);
    }

    private static int random(int menor, int mayor){
        Random random = new Random();
        return menor + random.nextInt(mayor-1);
    }
}