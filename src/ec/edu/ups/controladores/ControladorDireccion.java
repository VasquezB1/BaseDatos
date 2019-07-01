/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.BaseDatos;
import ec.edu.ups.clases.Direccion;
import ec.edu.ups.clases.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Edison
 */

public class ControladorDireccion {
    private int codigo;
    private BaseDatos miBaseDeDatos;
    public ControladorDireccion() {
        miBaseDeDatos = new BaseDatos();
        codigo = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void create(Direccion d) throws SQLException {

        String sql = "INSERT INTO\"DIRECCION\" VALUES(" + d.getCodigo() + ",'" + d.getCallepreincipal() + "','" + d.getCalleSecundaria() + "', " + d.getNumero() + ",'" + d.getPersonaCedula()+"')";
        System.out.println(sql);
        miBaseDeDatos.conectar();
        try {
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Direccion BuscarCodigo(int codigo) {
        Direccion d = new Direccion();
        try {
            String sql = "SELECT * FROM \"DIRECCION\" WHERE \"DIR_CODIGO\"=" + codigo + ";";
            System.out.println(sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                d.setCodigo(codigo);
                d.setCallepreincipal(rs.getString("DIR_CALLEPRINCIPAL"));
                d.setCalleSecundaria(rs.getString("DIR_CALLESECUNDARIA"));
                d.setNumero(rs.getInt("DIR_NUMERO"));
                d.setPersonaCedula(rs.getString("DIR_PERSONA"));               
            }
            miBaseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return d;
    }

    public void modificar(Direccion d) throws SQLException {
        String sql = "UPDATE \"DIRECCION\" SET \"DIR_CALLEPRINCIPAL\" = '" + d.getCallepreincipal() + "',\"DIR_CALLESECUNDARIA\" = '" + d.getCalleSecundaria() + "',\"DIR_NUMERO\" = " + d.getNumero() +",\"DIR_PERSONA\" = '"+d.getPersonaCedula()+"' WHERE \"DIR_CODIGO\" = "+d.getCodigo()+";";
        miBaseDeDatos.conectar();
        try {
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliminar(int codigo) throws SQLException{
        String sql = "DELETE FROM \"DIRECCION\" WHERE \"DIR_CODIGO\" = "+codigo+";";
        System.out.println(sql);
        miBaseDeDatos.conectar();
        try {
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Set Listar() {

        Set<Direccion> lista = new HashSet<>();
        try {
            String sql = "SELECT * FROM \"DIRECCION\";";
            System.out.println(sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                Direccion d = new Direccion();
                d.setCodigo(rs.getInt("DIR_CODIGO"));
                d.setCallepreincipal(rs.getString("DIR_CALLEPRINCIPAL"));
                d.setCalleSecundaria(rs.getString("DIR_CALLESECUNDARIA"));
                d.setNumero(rs.getInt("DIR_NUMERO"));
                d.setPersonaCedula(rs.getString("DIR_PERSONA"));   
                lista.add(d);
            }

            miBaseDeDatos.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public int maxcodeigo(){
        int codigo1 = 0;
        try {
            String sql = "SELECT MAX (\"DIR_CODIGO\") FROM \"DIRECCION\";";          
            miBaseDeDatos.conectar();
            System.out.println(sql);
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet rs = sta.executeQuery(sql);   
            while (rs.next()) {
               codigo1=rs.getInt("max");
            }              
          miBaseDeDatos.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return codigo1;
    }
    
    public Set listarDireccion(String cedula){
        Set<Direccion> lista = new HashSet<>();
        try {
            String sql = "SELECT * FROM \"DIRECCION\" WHERE \"DIR_PERSONA\"='" + cedula + "';";
            System.out.println(sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                Direccion d = new Direccion();
                d.setCodigo(rs.getInt("DIR_CODIGO"));
                d.setCallepreincipal(rs.getString("DIR_CALLEPRINCIPAL"));
                d.setCalleSecundaria(rs.getString("DIR_CALLESECUNDARIA"));
                d.setNumero(rs.getInt("DIR_NUMERO"));
                d.setPersonaCedula(rs.getString("DIR_PERSONA"));   
                lista.add(d);
            }

            miBaseDeDatos.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public void eliminarDireccionCedula(String cedula) throws SQLException{
        String sql = "DELETE FROM \"DIRECCION\" WHERE \"DIR_PERSONA\" = '"+cedula+"';";
        System.out.println(sql);
        miBaseDeDatos.conectar();
        try {
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
