/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import aleatorio.SimulacionPeriodica;
import datos.Poblacion;

/**
 *
 * @author BrandonRG
 */
public class Graficador extends javax.swing.JFrame {

    /**
     * Creates new form Graficador
     */
    public static int dias;
    public static String region;
    public Graficador(int d, String r) {
        initComponents();
        dias =d;
        region = r;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DuracionM = new javax.swing.JTextField();
        tazaI = new javax.swing.JTextField();
        ProContagio = new javax.swing.JTextField();
        TasaR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Mortalidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Duración media de la enfermedad :");

        jLabel2.setText("Tasa diaria de interacción :");

        jLabel3.setText("Probabilidad de contagio (%):");

        jLabel4.setText("Tasa de recuperación (%):");

        DuracionM.setText("14");

        tazaI.setText("2");
        tazaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tazaIActionPerformed(evt);
            }
        });

        ProContagio.setText("14");
        ProContagio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProContagioActionPerformed(evt);
            }
        });

        TasaR.setText("95");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Graficador");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lineal" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("TIPO DE GRAFICO:");

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Mortalidad.setText("5");

        jLabel7.setText("Mortalidad (%):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TasaR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addComponent(ProContagio, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tazaI, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DuracionM, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(Mortalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DuracionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tazaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProContagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TasaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mortalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tazaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tazaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tazaIActionPerformed

    private void ProContagioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProContagioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProContagioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        SimulacionPeriodica sp = new SimulacionPeriodica(region);
        Poblacion p = new Poblacion(region);
        int diasenfermo = Integer.parseInt(DuracionM.getText()); ///dias  enfermo
        int tasaDInf = Integer.parseInt(tazaI.getText());//taza diariade infeccion
        int procon= Integer.parseInt(ProContagio.getText()); //pro contagios
        int tr = Integer.parseInt(TasaR.getText()); //taza de recuperados
        int mor = Integer.parseInt(Mortalidad.getText());
        int  raizI = p.getInfectados();
       ///// procentajes
        double tasaDiaInf = (double) tasaDInf;
        double procontagio= (double) procon /100;
        double tazaR =(double)tr/100;
        double mortalidad =(double)mor/100;
        
        
     double Susceptibles=sp.nuevosSuceptibles(dias);
     double Infectados= sp.nuevosInfectados(dias);
     double Recuperados= sp.nuevosRecuperados(dias);
     double Fallecidos=sp.nuevosFallecidos(dias);
     double Contagios=sp.contagios(dias);
     double Recuperaciones=sp.recuperaciones(dias);
     double Fallecimientos=sp.fallecimientos(dias);
       ////totales 
        int totalrecuperados;
        int totalfallecidos;
        int totalcontagiagios;
        
        System.out.println(procontagio+ " "+ Infectados);
        for(int i=0;i<dias;i++)
{
  
    Contagios = Infectados*tasaDiaInf*((Susceptibles/(Susceptibles-Infectados-Recuperados))*procontagio);
    Recuperaciones =  Infectados* tazaR/ (double)diasenfermo ;
    Fallecimientos =  Infectados* mortalidad/ (double)diasenfermo;
   
    System.out.println(Fallecimientos+ " "+ Infectados);
    Susceptibles=Susceptibles-Contagios;
    Infectados=Infectados+Contagios-Recuperaciones-Fallecimientos; 
    Recuperados=Recuperados+Recuperaciones;
    Fallecidos=Fallecidos+Fallecimientos;
    if(Contagios>0){
datos.addValue(Infectados,"Infectados","dia" + i);
    }

}
        
        String tipoGrafica = jComboBox1.getSelectedItem().toString();
        if(tipoGrafica.equals("Barras")){
            grafico = ChartFactory.createBarChart("Grafica Prueba", "Eje X", "Eje Y",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Lineal")){

            grafico = ChartFactory.createLineChart("Grafica Prueba", "Dias", "personas",datos ,PlotOrientation.VERTICAL, true, true, false);
        }
        if(tipoGrafica.equals("Pastel")){
            DefaultPieDataset datosPie = new DefaultPieDataset();
            datosPie.setValue("Uno", 5);
            datosPie.setValue("Dos",6);
            datosPie.setValue("Tres",7 );
            datosPie.setValue("Cuatro", 9);        
            grafico = ChartFactory.createPieChart("Grafica Prueba", datosPie, true, true, false);
        }
        
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        informacion.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficador(dias,region).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DuracionM;
    private javax.swing.JTextField Mortalidad;
    private javax.swing.JTextField ProContagio;
    private javax.swing.JTextField TasaR;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tazaI;
    // End of variables declaration//GEN-END:variables
}
