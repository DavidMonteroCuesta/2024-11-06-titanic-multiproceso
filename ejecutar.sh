#!/bin/bash

cd src/main/java/

javac es/etg/psp/dmc/ttnc/Titanic.java
javac es/etg/psp/dmc/ttnc/brc/Barca.java
javac es/etg/psp/dmc/ttnc/comandos/Comando.java
javac es/etg/psp/dmc/ttnc/gestor/GestorTitanic.java
javac es/etg/psp/dmc/ttnc/imprimibles/impresora/Impresora.java
javac es/etg/psp/dmc/ttnc/imprimibles/impresora/ImpresoraFactory.java
javac es/etg/psp/dmc/ttnc/imprimibles/impresora/ImpresoraFichero.java
javac es/etg/psp/dmc/ttnc/imprimibles/impresora/ImpresoraVisual.java
javac es/etg/psp/dmc/ttnc/imprimibles/impresora/ImpresoraFicheroVisual.java
javac es/etg/psp/dmc/ttnc/imprimibles/fichero/FicheroFactory.java
javac es/etg/psp/dmc/ttnc/imprimibles/TipoFichero.java
javac es/etg/psp/dmc/ttnc/imprimibles/TipoImpresion.java
javac es/etg/psp/dmc/ttnc/util/Escritura.java
javac es/etg/psp/dmc/ttnc/util/Lectura.java
javac es/etg/psp/dmc/ttnc/util/Texto.java

java es.etg.psp.dmc.ttnc.Titanic

cd ../../..