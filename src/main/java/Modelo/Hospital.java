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
public class Hospital {
    
    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    ArrayList<Medico> medicos = new ArrayList<Medico>();
    ArrayList<Cita> citas = new ArrayList<Cita>();
    
    public void registrarPaciente(Paciente paciente){
        pacientes.add( paciente);
    }
    public void registrarMedico(Medico medico){
        medicos.add( medico);
    }
    public void registrarCita(Cita cita){
        citas.add( cita);
    }
}
