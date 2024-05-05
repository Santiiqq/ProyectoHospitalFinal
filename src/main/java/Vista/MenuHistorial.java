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
public class MenuHistorial {
    
    private Paciente paciente;
    private HistorialMedico historialMedico;
    private int IDpaciente;
    
     Scanner entrada = new Scanner(System.in);
     
     ArrayList<Paciente>pacientes = new ArrayList<Paciente>();
     
     public int displayMenuHistorial( ArrayList<Paciente>pacientes){
        int opcion;
        
        System.out.println("Seleccione la opcion");
        System.out.println("1. Registra historial medico");
        System.out.println("2. Ver historial medico");
        System.out.println("3. Salir");
        
        opcion = entrada.nextInt();
        return opcion;
    }
     public int mostrarPaciente(ArrayList<Paciente>pacientes){
         
        System.out.println("Seleccione el paciente:");
        
        int i =1;
        
        for(Paciente item:pacientes){
        System.out.println(i+"."+item.getNombre());
        i++;
        }
        
        int IDpaciente = entrada.nextInt();
        return IDpaciente;
    }
     
    public HistorialMedico registrarHistorial(){
       
        
        System.out.println("Ingrese el diagnostico del paciente");
        System.out.println(">>");
        String diagnostico=entrada.next();
        
        entrada.nextLine(); // Consume la nueva línea pendiente después de leer el diagnóstico
        
        System.out.println("Ingrese comentarios sobre el paciente");
        System.out.println(">>");
        String comentario=entrada.nextLine();
        
        HistorialMedico historialMedico = new HistorialMedico(diagnostico,comentario);
        
        this.historialMedico=historialMedico;
        return historialMedico;
    }
    public void mostrarHistorial(){
        System.out.println("El diagnostico del paciente es: "+historialMedico.getDiagnostico());
        System.out.println("Comentarios: "+historialMedico.getComentarios());
    }
}
