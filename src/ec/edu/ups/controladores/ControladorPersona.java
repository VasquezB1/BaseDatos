/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.BaseDatos;
import ec.edu.ups.clases.Persona;
import java.awt.List;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edison
 */
public class ControladorPersona {

    private BaseDatos baseDeDatos;
    SimpleDateFormat formato;

    public ControladorPersona() {
        baseDeDatos = new BaseDatos();
        formato = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void create(Persona persona) throws SQLException {
        String fecha = formato.format(persona.getFecha());
        String sql = "INSERT INTO \"PERSONA\" VALUES('" + persona.getCedula() + "','" + persona.getNombre() + "','" + persona.getApellido() + "'," + persona.getEdad() + ",'" + fecha + "','" + persona.getCelular()+ "'," + persona.getSalario()+ ");";
        System.out.println(sql);
        baseDeDatos.conectar();
        try {
            Statement sta = baseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public Persona BuscarCedula(String cedula) {
        Persona p = new Persona();
        try {
            String sql = "SELECT * FROM \"PERSONA\" WHERE \"PER_CEDULA\"='" + cedula + "';";
            System.out.println(sql);

            baseDeDatos.conectar();
            Statement sta = baseDeDatos.getConexionBD().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                p.setCedula(rs.getString("PER_CEDULA"));
                p.setApellido(rs.getString("PER_APELLIDO"));
                p.setNombre(rs.getString("PER_NOMBRE"));
                p.setEdad(rs.getInt("PER_EDAD"));
                p.setFecha(rs.getDate("PER_NACIMIENTO"));
                p.setCelular(rs.getString("PER_TELEFONO"));
                p.setSalario(rs.getDouble("PER_SALARIO"));
            }

            baseDeDatos.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }

    public void modificar(Persona p) throws SQLException {
        String sql = "UPDATE \"PERSONA\" SET \"PER_NOMBRE\" = '" + p.getNombre() + "',\"PER_APELLIDO\" = '" + p.getApellido() + "',\"PER_EDAD\" = " + p.getEdad() + ",\"PER_NACIMIENTO\" = '" + formato.format(p.getFecha())+"',\"PER_TELEFONO\" = '"+p.getCelular()+"',\"PER_SALARIO\" = "+p.getSalario()+" WHERE \"PER_CEDULA\" = '"+p.getCedula()+"';";
        System.out.println(sql);
        baseDeDatos.conectar();
        try {
            Statement sta = baseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
      
    }
    
    public void eliminar(String cedula) throws SQLException{
        String sql = "DELETE FROM \"PERSONA\" WHERE \"PER_CEDULA\" = '"+cedula+"';";
        System.out.println(sql);
        baseDeDatos.conectar();
        try {
            Statement sta = baseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            baseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Set Listar() {

        Set<Persona> lista = new HashSet<>();
        try {
            String sql = "SELECT * FROM \"PERSONA\";";
            System.out.println(sql);

            baseDeDatos.conectar();
            Statement sta = baseDeDatos.getConexionBD().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                Persona p = new Persona();
                p.setCedula(rs.getString("PER_CEDULA"));
                p.setApellido(rs.getString("PER_APELLIDO"));
                p.setNombre(rs.getString("PER_NOMBRE"));
                p.setEdad(rs.getInt("PER_EDAD"));
                p.setFecha(rs.getDate("PER_NACIMIENTO"));
                p.setCelular(rs.getString("PER_TELEFONO"));
                p.setSalario(rs.getDouble("PER_SALARIO"));
                lista.add(p);
            }

            baseDeDatos.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

}
