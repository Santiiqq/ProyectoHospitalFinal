/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
import java.time.*;
public class Medico extends Persona {
    private String especialidad; 
    private LocalDate horarioTrabajo;

    public Medico(String nombre,int numIdentificacion,String especialidad  ) {
        super(nombre, numIdentificacion);
        this.especialidad = especialidad;
        
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public LocalDate getHorarioTrabajo() {
        return horarioTrabajo;
    }
    
    public void mostrarInfo(){
        System.out.println("El nombre del medico es: "+getNombre());
        System.out.println("El numero de identificacion es: "+getNumIdentificacion());
        System.out.println("La especialidad del medico es: "+especialidad);
        //System.out.println("La fecha y hora de la cita es: "+horarioTrabajo);
    }
    

    

    
    
    
}
