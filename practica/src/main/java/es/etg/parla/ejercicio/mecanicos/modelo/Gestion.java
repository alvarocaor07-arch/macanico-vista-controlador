package es.etg.parla.ejercicio.mecanicos.modelo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Gestion {
    List<Vehiculo> vehiculos = new ArrayList<>();
    public List<Reparacion> reparacions = new ArrayList<>();
    

    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void abrirOrden(Reparacion reparacion){
        reparacions.add(reparacion);
    }   

       public static void guardar(String mecanico, String dato) {

        try (FileOutputStream fos = new FileOutputStream(mecanico)) {
            fos.write(dato.getBytes());
        } catch (IOException e) {
            System.out.println("Error al guardar");
        }
    }
    public Vehiculo buscarVehiculo(String matricula){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            } 
            
        }
        return null;
    }
}
