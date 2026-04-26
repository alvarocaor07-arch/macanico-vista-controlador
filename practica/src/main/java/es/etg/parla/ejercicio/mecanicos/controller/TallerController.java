package es.etg.parla.ejercicio.mecanicos.controller;

import es.etg.parla.ejercicio.mecanicos.modelo.*;
import es.etg.parla.ejercicio.mecanicos.vista.Interfaz;

public class TallerController {

    private Gestion model;
    private Interfaz view;

    public TallerController(Gestion model, Interfaz view) {
        this.model = model;
        this.view = view;
    }

  
    public void init() {

        int opcion;

        do {
            view.mostrarMenu();
            opcion = view.leerEntero("Elige opción");

            switch (opcion) {

                case Interfaz.OPC_REGISTRAR:
                    registrarVehiculo();
                    break;

                case Interfaz.OPC_ABRIR:
                    abrirOrden();
                    break;

                case Interfaz.OPC_LISTAR:
                    listarReparaciones();
                    break;

                case Interfaz.OPC_SALIR:
                    view.imprimir("Saliendo...");
                    break;

                default:
                    view.imprimir("Opción no válida");
            }

        } while (opcion != Interfaz.OPC_SALIR);
    }

    
    private void registrarVehiculo() {

        String matricula = view.leerString("Matrícula");
        String marca = view.leerString("Marca");
        String modelo = view.leerString("Modelo");
        String propietario = view.leerString("Propietario");

        Vehiculo v = new Vehiculo(matricula, marca, modelo, propietario);

        model.registrarVehiculo(v);

        view.imprimir("Vehículo registrado correctamente");
    }

    private void abrirOrden() {

        String matricula = view.leerString("Matrícula del vehículo");

        Vehiculo v = model.buscarVehiculo(matricula);

        if (v == null) {
            view.imprimir("Vehículo no encontrado");
            return;
        }

        String descripcion = view.leerString("Descripción del fallo");

        Reparacion r = new Reparacion(
                generarId(),
                descripcion,
                new java.sql.Date(System.currentTimeMillis()),
                EstadoReparacion.PENDIENTE,
                v,
                null
        );

        model.abrirOrden(r);

        view.imprimir("Orden de trabajo creada");
    }

    
    private void listarReparaciones() {
        view.imprimirReparaciones(model.getReparacions());
    }

   
    private int generarId() {
        return model.getReparacions().size() + 1;
    }
}