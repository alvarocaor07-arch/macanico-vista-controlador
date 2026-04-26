package es.etg.parla.ejercicio.mecanicos.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FicheroUtil {
    public static byte[] read(String nombreFichero) throws IOException {
        File fichero = new File(nombreFichero);
        byte[] contenido = Files.readAllBytes(fichero.toPath());
        return contenido;
    }
}
