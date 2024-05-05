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
import java.time.*;
public class MenuMedico {
    
    Scanner entrada = new Scanner(System.in);
    ArrayList<Medico> medicos = new ArrayList<Medico>();
    
   
    public Medico registrarMedico(){
        System.out.println("REGISTRE EL MEDICO");
        
        System.out.println("Ingrese el nombre");
        System.out.println(">>");
        String nombre = entrada.next();
        
        System.out.println("Ingrese el numero de identificacion");
        System.out.println(">>");
        int numIdentificacion = entrada.nextInt();
        
        
        System.out.println("Ingrese la especialidad");
        System.out.println(">>");
        String especialidad = entrada.next();
        
        System.out.println("El medico ha sido agregado");
        
        Medico medico = new Medico(nombre,numIdentificacion,especialidad);
        
        return medico;
    }
}
