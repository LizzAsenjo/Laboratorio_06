/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Liz
 */
public class Profesor extends Persona {

    public Profesor(String nombre) {
        super(nombre);
    }
    public String getTexto(){
        return this.getNombre();
    }
    
    
}
