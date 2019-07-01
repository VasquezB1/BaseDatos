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
    private double sueldo;
    private String telefono;
    private Date fechaNacimiento;
    private int codigo;

    public Persona() {
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fechaNacimiento, String telefono, double sueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;

    }

    @Override
    public String toString() {
        return "Persona{" + "\n cedula= " + cedula
                + "\n nombre= " + nombre
                + "\n apellido= " + apellido
                + "\n edad= " + edad
                + "\n sueldo= " + sueldo
                + "\n telefono= " + telefono
                + "\n fechaNacimiento= " + fechaNacimiento
                + "\n codigo= " + codigo + "\n" + '}';
    }

}
