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
public class MenuPrincipal  {
    
    public int displayMenu(){
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("BIENVENIDO.");
        System.out.println("1. Registrar paciente.");
        System.out.println("2. Registrar medico.");
        System.out.println("3. Ver informacion de medico o paciente.");
        System.out.println("4. Programar cita medica.");
        System.out.println("5. Cancelar cita medica.");
        System.out.println("6. Ver citas programadas.");
        System.out.println("7. Ver historial medico.");
        System.out.println("8. Salir");
        
        opcion = entrada.nextInt();
        return opcion;
    }
   
    
}
