/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.util.Random;


public class PorcentajeInf {

    private double suceptibles ;
    private double  muertos ;

    public PorcentajeInf() {
        this.suceptibles= suceptibles;
        this. muertos  =  muertos ;
    }

    public double calSuceptibles() {
       double suceptibles = 0;
       int i;
        Random rnd = new Random();
        double suma = 0;
        double varianza = 0;
        double sumatoria;
        double desviacion;
        double n;
        double Aleatorio[] = new double[20];
        double min = 0;
        double max = 0;
        double rango = 0;
        double interS;
        double interR;
        double tamInter;
        double limInf = 0;
        double limSup = 0;
        double chiCal = 10;
        double chiTab = 28.8693;
        double totalCo = 27000;
        double s = 0;
        double fr;
        double tfo = 0;
        double fe=0;
        double fefo=0;
        double sma=0;

        int fo = 0;

        for (i = 0; i < Aleatorio.length; i++) {
            n = rnd.nextDouble();
            Aleatorio[i] = n;
            min = Aleatorio[0];
            max = Aleatorio[0];
            suma = suma + Aleatorio[0];
            if (Aleatorio[i] <= min) {
                min = Aleatorio[i];
            }
            if (Aleatorio[i] >= max) {
                max = Aleatorio[i];

            }
        }
        rango = max - min;

        
        double media = suma / 20;
        
        for (int j = 0; j < Aleatorio.length; j++) {
            sumatoria = (double) Math.pow(Aleatorio[j] - media, 2);
            varianza += sumatoria;
        }
        double res = (varianza / Aleatorio.length);
        desviacion = Math.sqrt(res);
        
        interS = (1 + 3.3 * Math.log10(20));
        interR = Math.sqrt(20);
        tamInter = rango / interR;
     
        for (int h = 1; h < interR; h++) {
            if (h <= 1) {
                limInf = min;
                limSup = min + tamInter;
                 
            } else if (h >= 2) {
                limInf = limSup;
                limSup = limInf + tamInter;
                   
            }
        }
        
        for (int x = 0; x < 20; x++) {
            if (Aleatorio[x] >= limInf && Aleatorio[x] <= limSup) {

                tfo++;

            }
        
       }
        fe=20/interR;
        fr = tfo / 20;
        fefo=Math.pow(tfo-fe,2)/fe;
        sma=sma+fefo;
        
  ;
        chiCal=sma;
        if (chiCal < chiTab) {

            n = (int) (Math.random() * 20);
            s = (totalCo * n) / 100 + totalCo;
            suceptibles = s;
            
        }
        

        return suceptibles;
    }

    public double calMuertos () {
        double  muertos  = 0;
        double porcentajeMuer[] = {1, 2, 3.5, 7, 10};
        double probabilidad[] = {0.15, 0.3, 0.25, 0.1, 0.05};
        double media[] = new double[5];
        media[0] = 0.225;
        media[1] = 0.275;
        media[2] = 0.2;
        media[3] = 0.125;
        media[4] = 0.075;
        int aleatorio[] = new int[50];
        
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.floor(Math.random() * (10 - 1) + 1));
            if (aleatorio[i] == 1 || aleatorio[i] == 2) {
                muertos = media[0]*100;
            } else {
                if (aleatorio[i] == 3) {
                    muertos = media[1]*100;
                } else {
                    if (aleatorio[i] == 4 || aleatorio[i] == 5) {
                         muertos  = media[2]*100;
                    } else {
                        if (aleatorio[i] == 6 || aleatorio[i] == 7) {
                             muertos  = media[3]*100;
                        } else {
                            if (aleatorio[i] == 8 || aleatorio[i] == 9 || aleatorio[i] == 10) {
                                 muertos  = media[4]*100;
                            }
                        }
                    }
                }
            }
        }

        return  muertos ;
    }

    public Object calSuceptible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
