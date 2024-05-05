/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectohospitalfinal;

/**
 *
 * @author santi
 */
import Modelo.*;
import Vista.*;
import Controlador.*;

public class ProyectoHospitalFinal {

    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
        
        
        int opcion=0;
        
                
        while(opcion!=8){
            opcion = menuPrincipal.displayMenu();
            controladorPrincipal.analizaOpcion(opcion);
        }
    }
}
