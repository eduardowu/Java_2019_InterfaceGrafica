/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cesumar;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Werner
 */
public class JogoDaVelha extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;

    /**
     * Creates new form JogoDaVelha
     */
    public JogoDaVelha() {
        initComponents();
        lInformacao.setText("Jogador 1");
        lInformacao.setForeground(new Color(50,200,50));
    }

    public void JogadorAtivo() {
        
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
            lInformacao.setText("Jogador 2");
            lInformacao.setForeground(Color.RED);
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
            lInformacao.setText("Jogador 1");
            lInformacao.setForeground(new Color(50,200,50));
        }
        
        JogadorVencedor("X");
        JogadorVencedor("0");
        
    }
    
    public void JogadorVencedor(String Jogador) {//testa se houve vencedor e indica quem foi
        
            // verificando vitórias (diagonais):
            
            if (jButton1.getText().equals(Jogador) &&//diagonal esquerda - direita
                jButton5.getText().equals(Jogador) &&
                jButton9.getText().equals(Jogador)) {
            
            if (jButton1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            }
        
            if (jButton3.getText().equals(Jogador) &&//diagonal direita - esquerda
                jButton5.getText().equals(Jogador) &&
                jButton7.getText().equals(Jogador)) {
            
            if (jButton3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
            }
            
            // verificando vitória (linhas):
            
            if (jButton1.getText().equals(Jogador) &&// verificando a 1ª linha
                jButton2.getText().equals(Jogador) &&
                jButton3.getText().equals(Jogador)) {
            
                if (jButton1.getText().equals("X"))
                    Vencedor("Jogador 1");
                else
                    Vencedor("Jogador 2");
            }
        
            if (jButton4.getText().equals(Jogador) &&//verificando a 2ª linha
                jButton5.getText().equals(Jogador) &&
                jButton6.getText().equals(Jogador)) {
            
                if (jButton4.getText().equals("X"))
                    Vencedor("Jogador 1");
                else
                    Vencedor("Jogador 2");
            }
                
            if (jButton7.getText().equals(Jogador) &&//verificando a 3ª linha
                jButton8.getText().equals(Jogador) &&
                jButton9.getText().equals(Jogador)) {
            
                if (jButton7.getText().equals("X"))
                    Vencedor("Jogador 1");
                else
                    Vencedor("Jogador 2");
            }
        
            // verificando vitória (colunas):
            
            if (jButton1.getText().equals(Jogador) &&//verificando a 1ª coluna
                jButton4.getText().equals(Jogador) &&
                jButton7.getText().equals(Jogador)) {
            
                if (jButton1.getText().equals("X"))
                    Vencedor("Jogador 1");
                else
                    Vencedor("Jogador 2");
            }
        
            if (jButton2.getText().equals(Jogador) &&//verificando a 2ª coluna
                jButton5.getText().equals(Jogador) &&
                jButton8.getText().equals(Jogador)) {
            
                if (jButton2.getText().equals("X"))
                    Vencedor("Jogador 1");
                else
                    Vencedor("Jogador 2");
            }
        
            if (jButton3.getText().equals(Jogador) &&//verificando a 3ª coluna
                jButton6.getText().equals(Jogador) &&
                jButton9.getText().equals(Jogador)) {
            
                if (jButton3.getText().equals("X"))
                    Vencedor("Jogador 1");
                else
                    Vencedor("Jogador 2");
            }
        
        // verificando empates:
            if (!jButton1.getText().equals("") &&
                !jButton2.getText().equals("") &&
                !jButton3.getText().equals("") &&
                !jButton4.getText().equals("") &&
                !jButton5.getText().equals("") &&
                !jButton6.getText().equals("") &&
                !jButton7.getText().equals("") &&
                !jButton8.getText().equals("") &&
                !jButton9.getText().equals("") ) {
            
                Vencedor("Empate");
            }
    }

    public void Vencedor(String JogadorVencedor) {
        
        if (JogadorVencedor.equals("Jogador 1")) {
            lInformacao.setText("Jogo encerrado!");
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Parabéns Jogador 1. Você venceu o Jogo!");
            LimparCampos();
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Jogue novamente!");
        }
           
        if (JogadorVencedor.equals("Jogador 2")) {
            lInformacao.setText("Jogo encerrado!");
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Parabéns Jogador 2. Você venceu o Jogo!");
            LimparCampos();
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Jogue novamente!");
            
        }
            
        if (JogadorVencedor.equals("Empate")) {
            lInformacao.setText("Jogo encerrado!");
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Deu velha!!!! Joguem Novamente!");
            LimparCampos();
            JOptionPane.showMessageDialog(JogoDaVelha.this, "Jogue novamente!");
        }
        
    }

    public void LimparCampos() {
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setEnabled(false);//desabilita os botões para impedir que continuem manipulando a interface
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
            
        Jogador1Ativo = true;
        Jogador2Ativo = false;
        
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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        NovoJogo = new javax.swing.JButton();
        lInformacao = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha Cesumar");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        NovoJogo.setText("Novo Jogo");
        NovoJogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        lInformacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lInformacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInformacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vez do Jogador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lInformacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(NovoJogo)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton7.getText().equals("")) {
                jButton7.setText("X");
                jButton7.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton7.getText().equals("")) {
                jButton7.setText("0");
                jButton7.setEnabled(false);
                JogadorAtivo();
            }
        }               
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton9.getText().equals("")) {
                jButton9.setText("X");
                jButton9.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton9.getText().equals("")) {
                jButton9.setText("0");
                jButton9.setEnabled(false);
                JogadorAtivo();
            }
        }          
    }//GEN-LAST:event_jButton9ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        // TODO add your handling code here:
            LimparCampos();//Limpa os campos
            
            jButton1.setEnabled(true);//habilita os botões desabilitados
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            
            lInformacao.setText("Jogador 1");//mostra quem vai jogar na lable informativa
            lInformacao.setForeground(new Color(50,200,50));
            
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton1.getText().equals("")) {
                jButton1.setText("X");
                jButton1.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton1.getText().equals("")) {
                jButton1.setText("0");
                jButton1.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton2.getText().equals("")) {
                jButton2.setText("X");
                jButton2.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton2.getText().equals("")) {
                jButton2.setText("0");
                jButton2.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
            
            if (jButton3.getText().equals("")) {
                jButton3.setText("X");
                jButton3.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton3.getText().equals("")) {
                jButton3.setText("0");
                jButton3.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton4.getText().equals("")) {
                jButton4.setText("X");
                jButton4.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton4.getText().equals("")) {
                jButton4.setText("0");
                jButton4.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton5.getText().equals("")) {
                jButton5.setText("X");
                jButton5.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton5.getText().equals("")) {
                jButton5.setText("0");
                jButton5.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton6.getText().equals("")) {
                jButton6.setText("X");
                jButton6.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton6.getText().equals("")) {
                jButton6.setText("0");
                jButton6.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         if (Jogador1Ativo == true) {
            
            if (jButton8.getText().equals("")) {
                jButton8.setText("X");
                jButton8.setEnabled(false);
                JogadorAtivo();
            }
            } else {
                if (jButton8.getText().equals("")) {
                jButton8.setText("0");
                jButton8.setEnabled(false);
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NovoJogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lInformacao;
    // End of variables declaration//GEN-END:variables
}
