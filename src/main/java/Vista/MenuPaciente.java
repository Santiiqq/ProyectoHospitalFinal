/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author santi
 */
import Modelo.*;
import java.util.Scanner;
import java.util.ArrayList;
public class MenuPaciente {
    
    Scanner entrada = new Scanner(System.in);
    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    Paciente paciente;
    

    
    public Paciente registrarPaciente(){
        System.out.println("REGISTRE EL PACIENTE");
        
        System.out.println("Ingrese el nombre");
        System.out.println(">>");
        String nombre = entrada.next();
        
        
        System.out.println("Ingrese la edad");
        System.out.println(">>");
        int edad = entrada.nextInt();
        
        System.out.println("Ingrese el numero de identificacion");
        System.out.println(">>");
        int numIdentificacion = entrada.nextInt();
        
        System.out.println("Ingrese el genero");
        System.out.println(">>");
        String genero = entrada.next();
        
        System.out.println("El paciente ha sido agregado");
        
        Paciente paciente = new Paciente(nombre,edad,numIdentificacion,genero);
        
        return paciente;
    }
    
    /*public void mostrarPacientes(){
        int i = 1;
        System.out.println("LISTA DE PACIENTES");
        for(Paciente item:pacientes){
        System.out.println(i+"."+paciente.getNombre());
    }
    }*/
    
    
}
