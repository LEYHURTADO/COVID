
package aleatorio;
import java.util.Random;

public class Contagiados  {
    public static int contagiadosMuertos[];
    public static int contagioadosRecuperados[];
    private static int contagiadosInfectados[];

    public static Object calContagiadosJ() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object calContagiadoE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object calContagiadoA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Contagiados (){
      
    }
     
    public static int calContagiadosMuertos()
    {
        int aux;
         int a = 9000, b = 11000, c = 11800;
        Random rm = new Random();
        int r1=rm.nextInt(200);
        int r2=rm.nextInt(200);
        if(r1<(b-a)/(c-a)){
                    aux =(int)( a+(b-a)*Math.sqrt(r1));
                }else{
                    aux=(int)(c-(c-b)*Math.sqrt(r2));
                }
        return aux;
        
    }
    
      public static int calContagiadosInfectados()
    {
        int aux;
         int a = 4100, b = 2500, c = 2100  ;
        Random rm = new Random();
        int r1=rm.nextInt(200);
        int r2=rm.nextInt(200);
        if(r1<(b-a)/(c-a)){
                    aux =(int)( a+(b-a)*Math.sqrt(r1));
                }else{
                    aux=(int)(c-(c-b)*Math.sqrt(r2));
                }
        return aux;
        
    }
    
   
    public static int mostarDatoA(){
        int contagios,u;
        Random dem = new Random();
       contagios = dem.nextInt(199);
        int a=calContagiadosInfectados();
        System.out.println("Mostrar Contagiados Infectados  "+ a);
        return u=a;
     }
    public static int mostarDatoJ(){
        int contagios,u;
        Random dem = new Random();
        int contagio = dem.nextInt(199);
        int a=calContagiadosMuertos();
        System.out.println("Mostrar Contagiados Muertos  "+ a);
        return a;
     }
    public static int mostarDatoEsp(){
        int contagiodos,u;
        Random dem = new Random();
        int contagios = dem.nextInt(199);
        int a[]=calContagioadosRecuperados();
        System.out.println("Mostrar Recuperados "+ a[contagios]);
        return u=a[contagios];
     }
    public static int [] calContagioadosRecuperados(){
        int casosRecuperados =0;
        int i,p;
        Random prob = new Random();
        p = prob.nextInt(199);
        double aleatorio[]= new double[200];
        double probabilidad[] = new double[200];
        int aux []= new int [200];
        
        double nro;
        for(i=0;i<aleatorio.length;i++){
            nro = Math.floor(Math.random()*(901-699+1)+699);
            aleatorio[i] = nro;
            System.out.println(i+"="+aleatorio[i]);
            if(aleatorio[i]==700){
                probabilidad[i]=0.2;
                aux[i]=(int)aleatorio[i];
                System.out.println(i+"="+aleatorio[i]);
            }else{
                if(aleatorio[i]>700 && aleatorio[i] <=800){
                   probabilidad[i]=0.35;
                   aux[i]=(int)aleatorio[i];
               System.out.println(i+"="+probabilidad[i]);
                }else{
                    if(aleatorio[i]>800 && aleatorio[i]<900){
                        probabilidad[i]=0.4;
                        aux[i]=(int)aleatorio[i];
                  System.out.println(i+"="+probabilidad[i]+":"+aleatorio[i]);
                    }else{
                        if(aleatorio[i]==900)
                        probabilidad[i]=0.3;
                        aux[i]=(int)aleatorio[i];
                       System.out.println(i+"="+probabilidad[i]+":"+aleatorio[i]);
                    }
                }
            }
             
    
       return aux;
    }
        return null;
    }
    public int[] getContagiadosMuertos (){
        return contagiadosMuertos;
    }

    public void setContagiadosMuertos(int[] contagiadosMuertos) {
        this.contagiadosMuertos = contagiadosMuertos;
    }

    public int[] getContagioadosRecuperados() {
        return contagioadosRecuperados;
    }

    public void setContagioadosRecuperados(int[] contagioadosRecuperados) {
        this.contagioadosRecuperados = contagioadosRecuperados;
    }

    public int[] getContagiadosInfectados() {
        return contagiadosInfectados;
    }

    public void setContagiadosInfectados(int[] contagiadosInfectados) {
        this.contagiadosInfectados =contagiadosInfectados;
    }


    
}

