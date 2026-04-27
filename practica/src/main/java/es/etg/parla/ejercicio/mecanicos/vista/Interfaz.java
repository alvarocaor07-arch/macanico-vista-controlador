package es.etg.parla.ejercicio.mecanicos.vista;

import java.util.List;
import java.util.Scanner;

import es.etg.parla.ejercicio.mecanicos.modelo.Reparacion;

public class Interfaz {

    // 🔹 MENÚ
    public final static String MENU_TITULO = "=== MENÚ TALLER ===";
    public final static String MENU_REGISTRAR = "Registrar vehículo";
    public final static String MENU_ABRIR = "Abrir orden de trabajo";
    public final static String MENU_LISTAR = "Listar reparaciones";
    public final static String MENU_SALIR = "Salir";

    public final static int OPC_REGISTRAR = 1;
    public final static int OPC_ABRIR = 2;
    public final static int OPC_LISTAR = 3;
    public final static int OPC_SALIR = 4;

    private Scanner sc = new Scanner(System.in);

    // 🔹 MOSTRAR MENÚ
    public void mostrarMenu() {
        System.out.println(MENU_TITULO);
        System.out.println("1. " + MENU_REGISTRAR);
        System.out.println("2. " + MENU_ABRIR);
        System.out.println("3. " + MENU_LISTAR);
        System.out.println("4. " + MENU_SALIR);
    }


    public String leerString(String msg) {
        System.out.print(msg + ": ");
        return sc.nextLine();
    }

    public int leerEntero(String msg) {
        return Integer.parseInt(leerString(msg));
    }

  
    public void imprimir(String msg) {
        System.out.println(msg);
    }

    public void imprimirReparaciones(List<Reparacion> reparacions){
        System.out.println("Total de Reparaciones: " + reparacions.size());

    }

}
