/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import datos.Poblacion;

public class Calcular {
    
   public static int cantPoblacionb;
   public static int nroDias;
   private static double infectadosJ;
   private static double infectadosE;
   private static double infectadosA;
   private static double infectadosF;
   private static double suceptiblesa;
   private static double porcMuertos;
   private static int   recuperadosJ;
   private static int   recuperadosE;
   private static int   recuperadosA;
   private static double fallecidosJ;
   private static double fallecidosE;
   private static double fallecidosA;
   private static int anio;
   private static int duracionCOVID;
   private static double tasaDI;//tasa diaria de interaccion
   private static double probContagio;//probabilidad de contagio
   private static double probRecu;//probabilidad de recuperacion
   private static double mortalidad;
    //para poder llamar a la clase interfaz
 
  
    public Calcular(){
        
    }
    public static int getCantPoblacion () {
        System.out.println("poblacion ");
        return cantPoblacionb;
    }

       public static void setCantPoblacion (int aCantPoblacion) {
        
        cantPoblacionb = aCantPoblacion;
    }

    public static int getNroDias() {
       //System.out.println("hectarea"+nroHectarea);

        return nroDias;
    }

 
    public static void setNroDias(int aNroDias) {
        System.out.println("Dias"+nroDias);
        nroDias = aNroDias;
    }

    public static double getInfectadosJ(){
        System.out.println("INFECTADOS "+infectadosJ);
        return infectadosJ ;
    }

  
    public static void setinfectadosJ(double ainfectadosJ) {
       infectadosJ = ainfectadosJ;
    }

    public static double getInfectadosE() {
        return infectadosE;
    }

    public static void setinfectadosE(double aInfectadosJE) {
        infectadosE = aInfectadosJE;
    }

    public static double getInfectadosA() {
        return infectadosA;
    }

 
    public static void setInfectadosA(double aInfectadosA) {
        infectadosA = aInfectadosA;
    }

    public static double getInfectadosF() {
        return infectadosF;
    }

 
    public static void setInfectadosF(double aInfectadosF) {
        infectadosF = aInfectadosF;
    }

 
    public static double getSuceptiblesa() {
        return suceptiblesa;
    }

 
    public static void setSuceptiblesa(double aSuceptiblesa) {
        suceptiblesa = aSuceptiblesa;
    }

    public static double getPorcMuertos() {
        return porcMuertos;
    }

  
    public static void setPorcMuertos (double aPorcMuertos) {
        porcMuertos = aPorcMuertos;
    }

    public static int getRecuperadosJ() {
        return recuperadosJ ;
    }

  
    public static void setRecuperadosJ(int aRecuperadosJ) {
        recuperadosJ= aRecuperadosJ;
    }

   
    public static int getRecuperadosE() {
        return recuperadosE;
    }

    public static void setRecuperadosE(int aRecuperadosE) {
        recuperadosE = aRecuperadosE;
    }

  
    public static int getRecuperadosA() {
        return recuperadosA;
    }

  
    public static void setRecuperadosA(int aRecuperadosA) {
        recuperadosA= aRecuperadosA;
    }
 
    

 
    public static double getFallecidosJ() {
        return fallecidosJ;
    }

    public static void setFallecidosJ(double aFallecidosJ) {
        fallecidosJ = aFallecidosJ;
    }

  
    public static double getFallecidosE() {
        return fallecidosE;
    }

    public static void setFallecidosE(double aFallecidosE) {
        fallecidosE = aFallecidosE;
    }

  
    public static double getFallecidosA() {
        return fallecidosA;
    }

    public static void setFallecidosA(double aFallecidosA) {
        fallecidosA = aFallecidosA;
    }

    public static int getAnio() {
        return anio;
    }

    public static void setAnio(int aAnio) {
        anio = aAnio;
    }
    
    public int totalPoblacionb(){
        int cant=11353142;
        
        return cant;
       
    }

    public double selecionar(){
        double selec=0;
        return selec = getSuceptiblesa ()-(getSuceptiblesa()*getPorcMuertos()/100);
       
        
    }
    
    public double Mosto(){
        double prep=0;
       return prep = (selecionar()*Math.floor(Math.random()*(830-749+1)+749))/1000;
       
    }
    public double crearcontagioadosRecuperados(){
        double esp=0;
        return esp = Mosto()*0.10;
         
    }
  
    public double maduracion(){
        double mad=0;
        mad = (Mosto()-crearcontagioadosRecuperados())*(Math.floor(Math.random()*(70-59+1)+59)/100);
 
        return mad;
    }

    public  double crearcontagiadosInfectados(){
        double aniejo =0;
        return aniejo = getRecuperadosA();
    }
    public  double crearcontagiadosMuertos(){
        double jov=0;
        return jov = maduracion()-crearcontagiadosInfectados();
        
    }
    //calculando costos dea produccion
    public double costoVinoJ(){
        double cj = 0;
       return cj = crearcontagiadosMuertos()*getInfectadosJ();
        
        
    }
    public double costocontagioadosRecuperados(){
        double cesp =0;
        return cesp = crearcontagioadosRecuperados()*getInfectadosE();
    }
    public double costocontagiadosInfectados(){
        double cani = 0;
        return cani = crearcontagiadosInfectados()*getInfectadosA();
    }
    
    public  double totalCostocontagios(){
        double cP =0; 
        return cP = costoVinoJ()+costocontagioadosRecuperados()+costocontagiadosInfectados()+(getInfectadosF()*3);
    }
   
    public double fallecidosJ(){
        double pvj = 0;
        
        return pvj = getInfectadosJ()*Contagiados.mostarDatoJ();
    }
    public double fallecidosE(){
        double pve = 0;
        return pve = getFallecidosE()*Contagiados.mostarDatoEsp();
    }
    public double fallecidosA(){
        double pva=0;
        return pva = getFallecidosA()*Contagiados.mostarDatoA();
        
    }
    
    //metodo ganancia de vino
    public double contagiostotJ(){
        double ganJ=0;
        ganJ=(getInfectadosJ()*Contagiados.mostarDatoJ())-(costoVinoJ()*crearcontagiadosMuertos())-getInfectadosF();
        System.out.println("contagiadosMuertos "+ ganJ);
        return ganJ;
    }
  
    public double contagiostotE(){
        double ganEsp=0;
        return ganEsp= (getFallecidosE()*Contagiados.mostarDatoEsp())-(costocontagioadosRecuperados()*crearcontagioadosRecuperados())-getInfectadosF();
    }
    public double contagiostotA(){
        double ganA=0;
        return ganA = (getFallecidosA()*Contagiados.mostarDatoA()) -(costocontagiadosInfectados()*crearcontagiadosInfectados())+getInfectadosF();
    }
    public double infectadosTotal(){
        double ganT=0;
        return ganT = (contagiostotJ()+contagiostotE()+contagiostotA())-totalCostocontagios();
    }
//    public static void main(String []args){
//    Calcular sc=new Calcular();
//    System.out.println(sc.contagiostotE());
//    System.out.println(sc.contagiostotA());
//    System.out.println(sc.contagiostotJ());
//  
//    }
}