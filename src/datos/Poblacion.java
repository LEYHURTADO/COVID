/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author yazmin
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import dba.Mysql;
import java.util.Date;

public class Poblacion {
    
static Connection conn;
static Statement sent;
static int ids;
static String nombre;
static int poblacion;
static int infectados;
static int recuperados;
static int decesos;
static int activos;
static String departamento;

public Poblacion(String dpto) 
{
    departamento = dpto;
    nombre = "e";
    poblacion = 0;
    conn = Mysql.getConnection();
}

    public static int getIds() {
        return ids;
    }

 public static int getActivos() {
    int res=0;
    try{
        String sql = "SELECT activos FROM "+departamento + " ORDER BY id DESC LIMIT 1"; //cuenta.getSelectedItem().toString() ;
        sent=conn.createStatement();
        ResultSet rs = sent.executeQuery(sql);
        while(rs.next())
        {
            res = rs.getInt("ACTIVOS");
        }   
    }catch(Exception e){
        System.out.println(e);
    }
    return res;
}
    public static int getDecesos() {
        int res=0;
    try{
        String sql = "SELECT decesos FROM "+departamento; //cuenta.getSelectedItem().toString() ;
        sent=conn.createStatement();
        ResultSet rs = sent.executeQuery(sql);
        while(rs.next())
        {
            res += rs.getInt("decesos");
        }   
    }catch(Exception e){
        System.out.println(e);
    }
        return res;
    }

    public static int getInfectados() {
        int res=0;
    try{
        String sql = "SELECT infectados_t FROM "+departamento + " ORDER BY id DESC LIMIT 1"; //cuenta.getSelectedItem().toString() ;
        sent=conn.createStatement();
        ResultSet rs = sent.executeQuery(sql);
        while(rs.next())
        {
            res = rs.getInt("INFECTADOS_T");
        }   
    }catch(Exception e){
        System.out.println(e);
    }
    return res;
    }

    public static String getNombre() {
        return departamento;
    }   

    public static int getRecuperados() {
        int res=0;
    try{
        String sql = "SELECT recuperados FROM "+departamento; //cuenta.getSelectedItem().toString() ;
        sent=conn.createStatement();
        ResultSet rs = sent.executeQuery(sql);
        while(rs.next())
        {
            res += rs.getInt("RECUPERADOS");
        }   
    }catch(Exception e){
        System.out.println(e);
    }
    return res;
    }

    public static void setActivos(int activos) {
        Poblacion.activos = activos;
    }

    public static void setDecesos(int decesos) {
        Poblacion.decesos = decesos;
    }

    public static void setInfectados(int infectados) {
        Poblacion.infectados = infectados;
    }

    public static void setRecuperados(int recuperados) {
        Poblacion.recuperados = recuperados;
    }

    public static void setNombre(String nombre) {
        Poblacion.nombre = nombre;
    }

    public static void setPoblacion(int poblacion) {
        Poblacion.poblacion = poblacion;
    }  
    
   public static String getnombre() {
        return nombre;
    }

    public static int getPoblacion(){
    int res=0;
    try 
    {
        String sql = "SELECT poblacion FROM pais where nombre = '" + departamento + "'"; //cuenta.getSelectedItem().toString() ;
        sent=conn.createStatement();
        ResultSet rs = sent.executeQuery(sql);
        while(rs.next())
        {
            res = rs.getInt("POBLACION");
        }   
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return res;
  }
    public static void main(String[] args) {
        Poblacion p = new Poblacion("bolivia");
        int a = getPoblacion();
        System.out.println("poblacion: " + a);
    }
}