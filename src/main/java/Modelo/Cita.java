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
import java.util.ArrayList;
public class Cita  {
    
    private Medico medico;
    private Paciente paciente;
    private String mesCita;
    private String diaCita;
    private String horaCita;
    private String codigo;
    
    ArrayList<Medico>medicos = new ArrayList<Medico>();
    ArrayList<Paciente>pacientes = new ArrayList<Paciente>();

    public Cita(String codigo,Medico medico, Paciente paciente, String diaCita, String mesCita,String horaCita) {
        this.codigo=codigo;
        this.medico = medico;
        this.paciente = paciente;
        this.diaCita = diaCita;
        this.horaCita = horaCita;
        this.mesCita = mesCita;
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public String getDiaCita() {
        return diaCita;
    }
    
    public String getHoraCita() {
        return horaCita;
    }
    public String getMesCita() {
        return mesCita;
    }
    public String getCodigo(){
        return codigo;
    }
    
    
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }       
    
    
    
    
    
}
