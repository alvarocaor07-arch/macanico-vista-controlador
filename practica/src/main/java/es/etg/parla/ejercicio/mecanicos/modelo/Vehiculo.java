package es.etg.parla.ejercicio.mecanicos.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String propietario;
}
