package es.etg.parla.ejercicio;

import es.etg.parla.ejercicio.mecanicos.controller.*;
import es.etg.parla.ejercicio.mecanicos.modelo.Gestion;
import es.etg.parla.ejercicio.mecanicos.vista.Interfaz;

public class Main {

    public static void main(String[] args) {

        Gestion model = new Gestion();
        Interfaz view = new Interfaz();

        TallerController controller = new TallerController(model, view);

        controller.init();
    }
}