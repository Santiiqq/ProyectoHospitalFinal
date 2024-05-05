/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Persona {
    private String nombre;
    private int numIdentificacion;
    
    public Persona(String nombre, int numIdentificacion){
        this.nombre=nombre;
        this.numIdentificacion=numIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getNumIdentificacion() {
        return numIdentificacion;
    }
    
    
    
}
