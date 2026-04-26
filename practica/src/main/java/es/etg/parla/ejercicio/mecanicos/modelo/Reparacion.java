package es.etg.parla.ejercicio.mecanicos.modelo;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Reparacion {


    private int id;
    private String descripcion;
    private Date fecha;
    private EstadoReparacion estado;
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    

    public void actualizar(EstadoReparacion nuevoEstado){
        this.estado = nuevoEstado;
    }

    public void asignar(Mecanico mecanico){
        this.mecanico = mecanico;
    }
}
