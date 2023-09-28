/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.List;

/**
 *
 * @author Liz
 */
public class Curso {
    private String codigo;
    private int creditos;
    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
 
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the credito
     */
    public int getCredito() {
        return creditos;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(int credito) {
        this.creditos = credito;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public Curso(String codigo, int credito, String nombre) {
        this.codigo = codigo;
        this.creditos = credito;
        this.nombre = nombre;
    }
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public String getTexto(){
        return this.nombre+" | "
                +" | "+this.codigo 
                +" | Cred:"+this.creditos;  
    }
    
    public void agregarProfesor(Profesor profe){
        if (this.profesores!=null &&
                this.profesores.size()>=0){
            profesores.add(profe);
        }
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        if (this.estudiantes!=null &&
                this.estudiantes.size()>=0){
            estudiantes.add(estudiante);
        }
    }
}

