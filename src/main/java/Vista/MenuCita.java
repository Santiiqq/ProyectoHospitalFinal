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

public class MenuCita {
    private Medico medico;
    private Paciente paciente;
    private Cita cita;
    private int IDmedico;
    private int IDpaciente;
    private int IDcita;
    
    ArrayList<Paciente>pacientes = new ArrayList<Paciente>();
    ArrayList<Medico>medicos = new ArrayList<Medico>();
    ArrayList<Cita>citas = new ArrayList<Cita>();
    
    Scanner entrada = new Scanner(System.in);
    
    
    public int mostrarMedico(ArrayList<Medico> medicos){
        System.out.println("Seleccione el medico:");
        
        int i=1;
        
        for(Medico item:medicos){
            System.out.println(i+"."+item.getNombre());
            i++;
        }
        
         IDmedico = entrada.nextInt();
        return IDmedico;
    }
    
    public int mostrarPaciente(ArrayList<Paciente>pacientes){
        System.out.println("Seleccione el paciente:");
        
        int i =1;
        
        for(Paciente item:pacientes){
        System.out.println(i+"."+item.getNombre());
        i++;
        }
        
         IDpaciente = entrada.nextInt();
        return IDpaciente;
    }
    public Cita programarCita(ArrayList<Medico> medicos,ArrayList<Paciente>pacientes){
        
        //medicos.add(medico);
        //pacientes.add(paciente);
        medico = medicos.get(IDmedico - 1);// Pasar los objetos medico y paciente al constructor de Cita
        paciente = pacientes.get(IDpaciente - 1);
        
        System.out.println("Escriba el codigo de la cita");
        String codigo= entrada.next();
        System.out.println("Escriba el dia de la cita");
        String diaCita = entrada.next();
        System.out.println("Escriba el mes de la cita");
        String mesCita = entrada.next();
        System.out.println("Escriba la hora de la cita");
        String horaCita = entrada.next();
        System.out.println("");
        System.out.println("Su cita ha sido programada");
        
        
        Cita cita=new Cita(codigo,medico,paciente,diaCita,mesCita,horaCita);
        this.cita=cita;
        citas.add(cita);
        return cita;
        
    }
    public int verCitasDisponibles(ArrayList<Cita> citas){
        System.out.println("*****CITAS PROGRAMADAS");
        int i = 1;
        for(Cita item:citas){
            System.out.println(i+". "+item.getCodigo());
            i++;
        }
        IDcita = entrada.nextInt();
        return IDcita;
    }
    public void mostrarCita(){
        
         
        
        
        System.out.println("*********BIENVENIDO A SU CITA");
        System.out.println("");
        System.out.println("El codigo de la cita es: "+cita.getCodigo());
        System.out.println("La fecha de la cita es "+cita.getDiaCita()+"-"+cita.getMesCita()+ "a las"+cita.getHoraCita());
        System.out.println("medico: "+medico.getNombre());
        System.out.println("Paciente: "+paciente.getNombre());
        System.out.println("");
    }
    
    public int seleccionarCita(ArrayList<Cita> citas){
        System.out.println("Seleccione la cita que va a cancelar");
         int i=1;
         for(Cita item:citas){
             System.out.println(i+"."+item.getCodigo());
             i++;
             
         }
        
        IDcita = entrada.nextInt();
        return IDcita;
        
    }
    public void cancelarCita(ArrayList<Cita>citas){
        int id=0;
        if(id==id){
            citas.remove(cita);
            System.out.println("La cita ha sido eliminada");
        }
        
    }
}

