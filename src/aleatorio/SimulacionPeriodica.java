/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;
import aleatorio.VariablesAleatorias;
import datos.Poblacion;
import aleatorio.Calcular;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author yazmin
 */

public class SimulacionPeriodica {
   private static int duracionCOVID;
   private static double tasaDI;//tasa diaria de interaccion
   private static double tasaContagio;//tasa de contagio
   private static double tasaRecu;//tasa de recuperacion
   private static double mortalidad;
   private static int suceptibles;
   private static int infectados;
   private static int recuperados;
   private static int fallecidos;
   private static Poblacion pob;
   private static int poblacion;
   private static int cont;
   private int nroDias;
   private static VariablesAleatorias va;
   private static int diasEnfe;
   
    public SimulacionPeriodica(String dpto){
        pob = new Poblacion(dpto);
        poblacion=Poblacion.getPoblacion();
        duracionCOVID = 14; //dias
        tasaDI = 0.025; 
        tasaContagio=0.14;
        tasaRecu=0.95;
        mortalidad=0.05;
        infectados = Poblacion.getInfectados();
        recuperados = Poblacion.getRecuperados();
        fallecidos = Poblacion.getDecesos();
        cont = (int)(infectados*tasaDI);
        suceptibles = poblacion-infectados;
    }

    public static int contagios(int dias){
    int res=0;
        int i =0;
        while(i != dias){
            tasaContagio = VariablesAleatorias.uniforme(0.05, 0.141);
            tasaDI= VariablesAleatorias.uniforme(0.01, 0.0251);
            res = (int)(infectados*tasaDI*suceptibles/((suceptibles+infectados+recuperados)*tasaContagio));
            i++;
            cont = infectados+res;
            infectados = infectados+ res;
            
        //System.out.println("infectados en " + i + " dias: " + cont);
        }
        if(dias == 0 ){
            res = cont;
        }
       // System.out.println("infectados totales: " + infectados);
    return res;
    }
    
    public static int recuperaciones(int dias){
        int i =0;
        int res=0;
        while(i != dias){
            res = (int) (infectados*tasaRecu/duracionCOVID);
            tasaRecu = VariablesAleatorias.uniforme(0.1, 0.951);
            recuperados = recuperados + res;
            infectados = contagios(i);
            i++;
        }
        if(dias == 0){
            res = recuperados;
        }
        return res;
    }
    
    public static int fallecimientos(int dias){
        int i=0;
        int res = 0;
        while(i != dias){
            res = (int) Math.round(infectados*mortalidad/duracionCOVID);
            mortalidad = VariablesAleatorias.uniforme(0.04, 0.051);
            fallecidos = fallecidos + res;
            poblacion = poblacion - fallecidos;
            i++;
        }        
        if(dias == 0){
            res = fallecidos;
        }        
        return fallecidos;
    }
    public static int nuevosSuceptibles(int dias){
        // pobla== suceptibles totales
        int cant=0; //cantidad de contagios
        int sucep=0; // cantidad de suceptibles en X dias
//        while(i != dias){
            cant= contagios(dias);
            sucep = (suceptibles - cant - fallecimientos(dias) - infectados);
            suceptibles= poblacion - sucep;
//            i++;
//        }
       return sucep;
    }
    
    public static int nuevosInfectados(int dias){
        int infectadosEnDias = 0;//(int)suc - pob.getInfectados();   numeero de infectados en dias dias    
        //int i =0;
            infectadosEnDias = infectados + contagios(dias) - recuperaciones(dias) - fallecimientos(dias);
            infectados = infectados+infectadosEnDias;
            
        return infectadosEnDias;
    }
    public static int nuevosFallecidos(int dias){
        int fallecidosEnDias = 0;//(int)suc - pob.getInfectados();   numeero de infectados en dias dias    
//        int i =0;
//        while(i != dias){
            fallecidosEnDias = (fallecidos + fallecimientos(dias));
            fallecidos = fallecidos + fallecidosEnDias;
//            i++;
//        }
        return fallecidosEnDias;
    }
    public static int nuevosRecuperados(int dias){
        int recuperadosEnDias = 0;//(int)suc - pob.getInfectados();   numeero de infectados en dias dias    
//        int i =0;
//        while(i != dias){
            recuperadosEnDias = (recuperados + recuperaciones(dias));
            recuperados= recuperados+recuperadosEnDias;
//            i++;
//        }
        return recuperadosEnDias;
    }
    public static void main(String[] args) {
        SimulacionPeriodica sp = new SimulacionPeriodica("bolivia");
        int a = nuevosInfectados(20);
        int d = nuevosFallecidos(20);
        int c = nuevosRecuperados(20);
        int b = nuevosSuceptibles(20);
//        fallecimientos(3);
//        contagios(3);
//        recuperaciones(3);
        System.out.println("poblacion : " + poblacion);
        System.out.println("infectados : " + a);
        System.out.println("suceptibles : " + b);
        System.out.println("recuperados : " + c);
        System.out.println("fallecidos : " + d);   
    }
}
