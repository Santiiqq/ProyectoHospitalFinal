/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author santi
 */
import Modelo.*;
import Vista.*;
import java.util.ArrayList;
public class ControladorDetalles {
    private Paciente paciente;
    private Medico medico;
    private MenuDetalles menuDetalles;
    
    ControladorDetalles(Medico medico, Paciente paciente, MenuDetalles menuDetalles){
        this.medico=medico;
        this.paciente=paciente;
        this.menuDetalles=menuDetalles;
    }
    
    public void analizaOpcionDetalles(ArrayList<Medico> medicos,ArrayList<Paciente>pacientes){
        
        int opcion=0;
        int IDmedico;
        int IDpaciente;
        
        while(opcion!=3){
            
            opcion=menuDetalles.displayMenuDetalles(medicos, pacientes);
            
            if(opcion==1){
                IDmedico= menuDetalles.mostrarMedico(medicos);
                medico.mostrarInfo();
            }
            if(opcion==2){
                IDpaciente= menuDetalles.mostrarPaciente(pacientes);
                paciente.mostrarInfo();
            }
            else{
                
            }
        }
        
    }
    
    
}
