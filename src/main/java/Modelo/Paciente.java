/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
import java.util.ArrayList;
public class Paciente extends Persona{
    
    private int edad;
    private String genero;
    
  

    public Paciente( String nombre,int edad,int numIdentificacion,String genero  ) {
        super(nombre, numIdentificacion);
        this.edad = edad;
        this.genero = genero;
        }

    
    
    
    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
    
    public void mostrarInfo(){
        System.out.println("El nombre del paciente es: "+getNombre());
        System.out.println("El numero de identificacion es: "+getNumIdentificacion());
        System.out.println("La edad del paciente es: "+edad);
        System.out.println("El genero del paciente: "+genero);
    }

   

}