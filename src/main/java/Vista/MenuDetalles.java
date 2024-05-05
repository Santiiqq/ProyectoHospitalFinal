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
import java.util.ArrayList;
import java.util.Scanner;
public class MenuDetalles {
    
    Scanner entrada = new Scanner(System.in);
    
    public int displayMenuDetalles(ArrayList<Medico> medicos, ArrayList<Paciente>pacientes){
        int opcion;
        
        System.out.println("Seleccione la informacion");
        System.out.println("1. Medico");
        System.out.println("2. Paciente");
        System.out.println("3. Salir");
        
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public int mostrarMedico(ArrayList<Medico> medicos){
        System.out.println("Seleccione el medico:");
        
        int i=1;
        
        for(Medico item:medicos){
            System.out.println(i+"."+item.getNombre());
            i++;
        }
        
        int IDmedico = entrada.nextInt();
        return IDmedico;
    }
    
    public int mostrarPaciente(ArrayList<Paciente>pacientes){
        System.out.println("Seleccione el paciente:");
        
        int i =1;
        
        for(Paciente item:pacientes){
        System.out.println(i+"."+item.getNombre());
        }
        
        int IDpaciente = entrada.nextInt();
        return IDpaciente;
    }
}
