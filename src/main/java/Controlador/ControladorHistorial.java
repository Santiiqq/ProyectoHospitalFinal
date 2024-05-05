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
public class ControladorHistorial {
    
    private Paciente paciente;
    private MenuHistorial menuHistorial;

    public ControladorHistorial(Paciente paciente, MenuHistorial menuHistorial) {
        this.paciente = paciente;
        this.menuHistorial = menuHistorial;
    }
    
    public void analizaOpcionHistorial(ArrayList<Paciente>pacientes){
        
        int opcion=0;
        int IDpaciente;
        
        while(opcion!=3){
            
            opcion=menuHistorial.displayMenuHistorial( pacientes);
            
            if(opcion==1){
                IDpaciente= menuHistorial.mostrarPaciente(pacientes);
                menuHistorial.registrarHistorial();
            }
            if(opcion==2){
                IDpaciente= menuHistorial.mostrarPaciente(pacientes);
                menuHistorial.mostrarHistorial();
            }
            else{
                
            }
        }
        
    }
}    
    

