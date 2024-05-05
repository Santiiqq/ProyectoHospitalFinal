/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class HistorialMedico {
    
    private String diagnostico;
    private String comentarios;

    public HistorialMedico(String diagnostico, String comentarios) {
        this.diagnostico = diagnostico;
        this.comentarios = comentarios;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getComentarios() {
        return comentarios;
    }
    
    
    
}
