/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Byron PC
 */
public class Persona {
  private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fecha;
    private String celular;
    private Double salario;

    public Persona() {
        
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fecha, String celular, Double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha = fecha;
        this.celular = celular;
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

 
    

    @Override
    public String toString() {
        return "Persona{" + "\n cedula= " + cedula
                + "\n nombre= " + nombre
                + "\n apellido= " + apellido
                + "\n edad= " + edad
                + "\n sueldo= " + salario
                + "\n telefono= " + celular
                + "\n fechaNacimiento= " + fecha;
               
    }

}
