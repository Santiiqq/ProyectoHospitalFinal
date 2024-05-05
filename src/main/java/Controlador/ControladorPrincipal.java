/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author santi
 */
import java.util.Scanner;
import java.util.ArrayList;

import Modelo.*;
import Vista.*;

public class ControladorPrincipal {
    
    Medico medico;
    Paciente paciente;
    Cita cita;
    HistorialMedico historialMedico;
    
    ControladorDetalles controladorDetalles;
    ControladorHistorial controladorHistorial;
    
    ArrayList<Paciente>pacientes = new ArrayList<Paciente>();
    ArrayList<Medico>medicos = new ArrayList<Medico>();
    ArrayList<Cita>citas = new ArrayList<Cita>();
    
    
    MenuDetalles menuDetalles = new MenuDetalles();
    MenuCita menuCita=new MenuCita();
    MenuHistorial menuHistorial=new MenuHistorial();
    
    
    
    public void analizaOpcion(int opcion){
        
         MenuPaciente menuPaciente=new MenuPaciente();
         MenuMedico menuMedico = new MenuMedico();
         
         int IDmedico;
         int IDpaciente;
         int IDcita;
         
         
         switch(opcion){
             
             case 1:
                    paciente = menuPaciente.registrarPaciente();
                    pacientes.add(paciente);
                 break;
             case 2:
                    medico = menuMedico.registrarMedico();
                    medicos.add(medico);
                 break;
             case 3:
                    controladorDetalles = new ControladorDetalles(medico,paciente,menuDetalles);
                    controladorDetalles.analizaOpcionDetalles(medicos, pacientes);
                 break;
             case 4:
                 IDmedico=menuCita.mostrarMedico(medicos);
                 IDpaciente=menuCita.mostrarPaciente(pacientes);
                 cita= menuCita.programarCita(medicos, pacientes);
                 citas.add(cita);
                 menuCita.mostrarCita();
                 break;
             case 5:
                 IDcita= menuCita.seleccionarCita(citas);
                 menuCita.cancelarCita(citas);
                 break;
             case 6:
                 IDcita = menuCita.verCitasDisponibles(citas);
                 menuCita.mostrarCita();
                 break;
             case 7:
                 controladorHistorial=new ControladorHistorial(paciente,menuHistorial);
                 controladorHistorial.analizaOpcionHistorial(pacientes);
                 break;
         }
    }
    
}
