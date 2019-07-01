/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Byron PC
 */
public class ControladorPersona {

    private BaseDatos baseDatos;
    private int codigo;
    private Set<Persona> lista;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Set<Persona> getLista() {
        return lista;
    }

    public void setLista(Set<Persona> lista) {
        this.lista = lista;
    }

    public ControladorPersona() {
        lista = new HashSet<>();
        codigo = 1;
        baseDatos = new BaseDatos();
    }

    public void create(Persona persona) {
       // SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
       // String fechaBD = formato.format(persona.getFechaNacimiento());
        String sql = "INSERT INTO \"PERSONAS\" VALUES('" + persona.getCedula() + "','"
                + persona.getNombre() + "','"
                + persona.getApellido() + "',"
                + persona.getEdad() + ",'"
                + persona.getFechaNacimiento() + "','"
                + persona.getTelefono() + "',"
                + persona.getSueldo() + ");";

        System.out.println(sql);
        baseDatos.conectar();
        try {
            Statement sta = baseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDatos.desconectar();
        } catch (SQLException error) {
            error.printStackTrace();
        }
        persona.setCodigo(codigo);
        codigo++;
        lista.add(persona);
    }

    public void delete(String cedula) {
        String sql = "DELETE FROM \"PERSONA\" WHERE \"PER_CEDULA\" = '" + cedula + "';";
        baseDatos.conectar();
        try {
            Statement sta = baseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(Persona persona) {
        Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFechaNacimiento());
        String sql = "UPDATE \"PERSONA\" SET \"PER_NOMBRES\" = '" + persona.getNombre() + "',"
                + "\"PER_APELLIDOS\" = '" + persona.getApellido() + "',"
                + "\"PER_EDAD\" = " + persona.getEdad() + ","
                + "\"PER_FECHA_NACIMIENTO\" = '" + fecha + "',"
                + "\"PER_CELULAR\" = '" + persona.getTelefono() + "',"
                + "\"PER_SALARIO\" = " + persona.getSueldo()
                + "WHERE \"PER_CEDULA\" = '" + persona.getCedula() + "';";
        baseDatos.conectar();
        try {
            Statement sta = baseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Persona BuscarCedula(String cedula) {
        Persona persona = new Persona();
        try {
            String sql = "SELECT * FROM \"PERSONAS\" WHERE \"PER_CEDULA\"='" + cedula + "';";

            baseDatos.conectar();
            Statement sta = baseDatos.getConexionBD().createStatement();
            ResultSet respuesta = sta.executeQuery(sql);
            while (respuesta.next()) {

                persona.setCedula(cedula);
                persona.setNombre(respuesta.getString("PER_NOMBRES"));
                persona.setApellido(respuesta.getString("PER_APELLIDOS"));
                persona.setEdad(respuesta.getInt("PER_EDAD"));
                persona.setFechaNacimiento(respuesta.getDate("PER_FECHA"));
                persona.setTelefono(respuesta.getString("PER_CELULAR"));
                persona.setSueldo(respuesta.getDouble("PER_SUELDO"));
            }
            //Siempre hay que desconectar
            respuesta.close();
            sta.close();
            baseDatos.desconectar();
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return persona;
    }

    public Persona listar(Persona persona) {
        Persona persona1 = new Persona();
        try {
            String sql = "SELECT * FROM \"PERSONAS\";";
            System.out.println(sql);
            baseDatos.conectar();
            Statement sta = baseDatos.getConexionBD().createStatement();
            ResultSet respuesta = sta.executeQuery(sql);
            while (respuesta.next()) {

                persona.setCedula(respuesta.getString("PER_CEDULA"));
                //System.out.println(cedula);
                persona.setNombre(respuesta.getString("PER_NOMBRES"));
                //System.out.println(respuesta.getString("PER_NOMBRES"));
                persona.setApellido(respuesta.getString("PER_APELLIDOS"));
                persona.setEdad(respuesta.getInt("PER_EDAD"));
                persona.setFechaNacimiento(respuesta.getDate("PER_FECHA"));
                persona.setTelefono(respuesta.getString("PER_CELULAR"));
                persona.setSueldo(respuesta.getDouble("PER_SUELDO"));
            }
            //Siempre hay que desconectar
            respuesta.close();
            sta.close();
            baseDatos.desconectar();
        } catch (SQLException error) {
            error.printStackTrace();
        }

        return persona1;
    }

}
