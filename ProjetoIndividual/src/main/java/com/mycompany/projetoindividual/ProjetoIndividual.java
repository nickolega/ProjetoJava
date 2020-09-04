/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetoindividual;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Aluno
 */
public class ProjetoIndividual extends javax.swing.JFrame {
    //CONTADOR
    Integer contador = 0;
    //MAX, MIN E MED DA CPU, DISCO E MEMÓRIA
        Integer maxCPU = 0;
        Integer minCPU = 100;
        Double medCPU = 0.0;
        
        Integer maxDisco = 0;
        Integer minDisco = 100;
        Double medDisco = 0.0;
        
        Integer maxMemoria = 0;
        Integer minMemoria = 100;
        Double medMemoria = 0.0;

    /**
     * Creates new form ProjetoIndividual
     */
    public ProjetoIndividual() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjetoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ProjetoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ProjetoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ProjetoIndividual.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblText3 = new javax.swing.JLabel();
        pbgBarra1 = new javax.swing.JProgressBar();
        pbgBarra2 = new javax.swing.JProgressBar();
        pbgBarra3 = new javax.swing.JProgressBar();
        lblText4 = new javax.swing.JLabel();
        lblText5 = new javax.swing.JLabel();
        lblText6 = new javax.swing.JLabel();
        lblText7 = new javax.swing.JLabel();
        lblText8 = new javax.swing.JLabel();
        lblText9 = new javax.swing.JLabel();
        bntAcao1 = new javax.swing.JButton();
        lblText10 = new javax.swing.JLabel();
        lblText11 = new javax.swing.JLabel();
        lblText12 = new javax.swing.JLabel();
        lblText13 = new javax.swing.JLabel();
        lblText14 = new javax.swing.JLabel();
        lblText15 = new javax.swing.JLabel();
        lblText16 = new javax.swing.JLabel();
        lblText17 = new javax.swing.JLabel();
        lblText18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblText1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setText("CPU");

        lblText2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setText("Disco");

        lblText3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblText3.setForeground(new java.awt.Color(255, 255, 255));
        lblText3.setText("Memória");

        pbgBarra1.setBackground(new java.awt.Color(204, 204, 204));
        pbgBarra1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pbgBarra1.setForeground(new java.awt.Color(0, 153, 255));
        pbgBarra1.setStringPainted(true);

        pbgBarra2.setBackground(new java.awt.Color(204, 204, 204));
        pbgBarra2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pbgBarra2.setForeground(new java.awt.Color(51, 204, 0));
        pbgBarra2.setStringPainted(true);

        pbgBarra3.setBackground(new java.awt.Color(204, 204, 204));
        pbgBarra3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pbgBarra3.setForeground(new java.awt.Color(204, 0, 204));
        pbgBarra3.setStringPainted(true);

        lblText4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText4.setForeground(new java.awt.Color(255, 255, 255));
        lblText4.setText("0%");

        lblText5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText5.setForeground(new java.awt.Color(255, 255, 255));
        lblText5.setText("100%");

        lblText6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText6.setForeground(new java.awt.Color(255, 255, 255));
        lblText6.setText("0%");

        lblText7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText7.setForeground(new java.awt.Color(255, 255, 255));
        lblText7.setText("100%");

        lblText8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText8.setForeground(new java.awt.Color(255, 255, 255));
        lblText8.setText("0Gb");

        lblText9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText9.setForeground(new java.awt.Color(255, 255, 255));
        lblText9.setText("8Gb");

        bntAcao1.setBackground(new java.awt.Color(255, 255, 255));
        bntAcao1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bntAcao1.setText("Fazer leitura dos dados");
        bntAcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAcao1ActionPerformed(evt);
            }
        });

        lblText10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText10.setForeground(new java.awt.Color(255, 255, 255));
        lblText10.setText("Mínimo:");

        lblText11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText11.setForeground(new java.awt.Color(255, 255, 255));
        lblText11.setText("Média:");

        lblText12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText12.setForeground(new java.awt.Color(255, 255, 255));
        lblText12.setText("Máximo:");

        lblText13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText13.setForeground(new java.awt.Color(255, 255, 255));
        lblText13.setText("Mínimo:");

        lblText14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText14.setForeground(new java.awt.Color(255, 255, 255));
        lblText14.setText("Média:");

        lblText15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText15.setForeground(new java.awt.Color(255, 255, 255));
        lblText15.setText("Máximo:");

        lblText16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText16.setForeground(new java.awt.Color(255, 255, 255));
        lblText16.setText("Mínimo:");

        lblText17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText17.setForeground(new java.awt.Color(255, 255, 255));
        lblText17.setText("Média:");

        lblText18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblText18.setForeground(new java.awt.Color(255, 255, 255));
        lblText18.setText("Máximo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblText3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pbgBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblText8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblText9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblText16)
                                .addGap(80, 80, 80)
                                .addComponent(lblText17))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblText2)
                            .addComponent(lblText1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblText6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblText7))
                                .addComponent(pbgBarra1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pbgBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblText4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblText5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblText18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblText15)
                                        .addComponent(lblText12)))))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblText13)
                        .addGap(72, 72, 72)
                        .addComponent(lblText14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblText10)
                        .addGap(72, 72, 72)
                        .addComponent(lblText11)))
                .addGap(0, 240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntAcao1)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText1)
                    .addComponent(pbgBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText4)
                    .addComponent(lblText5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblText10)
                        .addComponent(lblText11))
                    .addComponent(lblText12))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText2)
                    .addComponent(pbgBarra2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText6)
                    .addComponent(lblText7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblText13)
                        .addComponent(lblText14))
                    .addComponent(lblText15))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText3)
                    .addComponent(pbgBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText8)
                    .addComponent(lblText9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblText16)
                        .addComponent(lblText17))
                    .addComponent(lblText18))
                .addGap(28, 28, 28)
                .addComponent(bntAcao1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAcao1ActionPerformed
        // TODO add your handling code here:
        
        Random aleatorio = new Random();
        
        Integer numeroAleatorio1 = aleatorio.nextInt(101);
        Integer numeroAleatorio2 = aleatorio.nextInt(101);
        Integer numeroAleatorio3 = aleatorio.nextInt(101);
        
        pbgBarra1.setValue(numeroAleatorio1);
        pbgBarra2.setValue(numeroAleatorio2);
        pbgBarra3.setValue(numeroAleatorio3);
        
        Integer num1 = numeroAleatorio1;
        Integer num2 = numeroAleatorio2;
        Integer num3 = numeroAleatorio3;
        
        
        //PARA CPU
        if (num1 > maxCPU) {
            maxCPU = num1;
        }
        if (num1 < minCPU) {
            minCPU = num1;
        }
        //PARA DISCO
        if (num2 > maxDisco) {
            maxDisco = num2;
        }
        if (num2 < minDisco) {
            minDisco = num2;
        }
        //PARA MEMORIA
        if (num3 > maxMemoria) {
            maxMemoria = num3;
        }
        if (num3 < minMemoria) {
            minMemoria = num3;
        } 
        
        contador += 1;
        medCPU = (medCPU + num1);
        medDisco = (medDisco + num2);
        medMemoria = (medMemoria + num3);
        
        Double mediaCPU = medCPU/contador;
        Double mediaDisco = medDisco/contador;
        Double mediaMemoria = medMemoria/contador;
        
        //BARRA1 CPU
        lblText10.setText(String.valueOf("Minimo: " + minCPU));
     
        lblText11.setText(String.valueOf(String.format("Média: %.2f",mediaCPU)));
        
        lblText12.setText(String.valueOf("Máximo: " + maxCPU));
        
        
        //BARRA2 DISCO
        lblText13.setText(String.valueOf("Minimo: " + minDisco));
        
        lblText14.setText(String.valueOf(String.format("Média: %.2f",mediaDisco)));
        
        lblText15.setText(String.valueOf("Máximo: " + maxCPU));
      
        
        //BARRA3 MEMORIA
        lblText16.setText(String.valueOf("Minimo: "+ minMemoria));
        
        lblText17.setText(String.valueOf(String.format("Média: %.2f",mediaMemoria)));
        
        lblText18.setText(String.valueOf("Máximo: " + maxMemoria));    
    }//GEN-LAST:event_bntAcao1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAcao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText10;
    private javax.swing.JLabel lblText11;
    private javax.swing.JLabel lblText12;
    private javax.swing.JLabel lblText13;
    private javax.swing.JLabel lblText14;
    private javax.swing.JLabel lblText15;
    private javax.swing.JLabel lblText16;
    private javax.swing.JLabel lblText17;
    private javax.swing.JLabel lblText18;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    private javax.swing.JLabel lblText4;
    private javax.swing.JLabel lblText5;
    private javax.swing.JLabel lblText6;
    private javax.swing.JLabel lblText7;
    private javax.swing.JLabel lblText8;
    private javax.swing.JLabel lblText9;
    private javax.swing.JProgressBar pbgBarra1;
    private javax.swing.JProgressBar pbgBarra2;
    private javax.swing.JProgressBar pbgBarra3;
    // End of variables declaration//GEN-END:variables
}
