/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

/**
 *
 * @author julia
 */
public class TrabalhoFinalUI extends javax.swing.JFrame {

    /**
     * Creates new form TrabalhoFinalUI
     */
    public TrabalhoFinalUI() {
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

        mainPanel = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dadosPanel = new javax.swing.JPanel();
        nomeLabel1 = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        telefoneLabel1 = new javax.swing.JLabel();
        rendaLabel1 = new javax.swing.JLabel();
        fonteRendaLabel1 = new javax.swing.JLabel();
        nomeLabel2 = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        telefoneLabel2 = new javax.swing.JLabel();
        rendaLabel2 = new javax.swing.JLabel();
        fonteRendaLabel2 = new javax.swing.JLabel();
        alteraNome = new javax.swing.JButton();
        alteraEmail = new javax.swing.JButton();
        alteraTelefone = new javax.swing.JButton();
        alteraFonteRenda = new javax.swing.JButton();
        alteraRenda = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        planejamentoPanel = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        saldoButton = new javax.swing.JButton();
        despesasButton = new javax.swing.JButton();
        entradasButton = new javax.swing.JButton();
        dicasPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        saldoPanel = new javax.swing.JPanel();
        despesasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());

        startPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jButton1.setText("Meus Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Meu Planejamento Financeiro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dicas Para Planejamento Financeiro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(100, 100, 100)
                .addComponent(jButton2)
                .addGap(103, 103, 103)
                .addComponent(jButton3)
                .addGap(179, 179, 179))
        );

        mainPanel.add(startPanel, "card2");

        dadosPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        nomeLabel1.setText("Nome:");

        emailLabel1.setText("Email:");

        telefoneLabel1.setText("Telefone:");

        rendaLabel1.setText("Renda Fixa:");

        fonteRendaLabel1.setText("Fonte de Renda:");

        nomeLabel2.setText("nome do usuario");

        emailLabel2.setText("email do usuario");

        telefoneLabel2.setText("telefone do usuario");

        rendaLabel2.setText("renda fixa");

        fonteRendaLabel2.setText("fonte de renda");

        alteraNome.setText("Alterar");

        alteraEmail.setText("Alterar");

        alteraTelefone.setText("Alterar");

        alteraFonteRenda.setText("Alterar");

        alteraRenda.setText("Alterar");

        jButton4.setText("Apagar Conta");

        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosPanelLayout = new javax.swing.GroupLayout(dadosPanel);
        dadosPanel.setLayout(dadosPanelLayout);
        dadosPanelLayout.setHorizontalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addComponent(telefoneLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alteraTelefone))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosPanelLayout.createSequentialGroup()
                        .addComponent(nomeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alteraNome))
                    .addGroup(dadosPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alteraEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosPanelLayout.createSequentialGroup()
                        .addComponent(fonteRendaLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fonteRendaLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 468, Short.MAX_VALUE)
                        .addComponent(alteraFonteRenda))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosPanelLayout.createSequentialGroup()
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(rendaLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addComponent(rendaLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alteraRenda))
                            .addGroup(dadosPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4)))))
                .addGap(38, 38, 38))
        );
        dadosPanelLayout.setVerticalGroup(
            dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel1)
                    .addComponent(nomeLabel2)
                    .addComponent(alteraNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel1)
                    .addComponent(emailLabel2)
                    .addComponent(alteraEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel1)
                    .addComponent(telefoneLabel2)
                    .addComponent(alteraTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fonteRendaLabel1)
                    .addComponent(fonteRendaLabel2)
                    .addComponent(alteraFonteRenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendaLabel1)
                    .addComponent(rendaLabel2)
                    .addComponent(alteraRenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addGroup(dadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        mainPanel.add(dadosPanel, "card2");

        planejamentoPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        saldoButton.setText("Saldo");
        saldoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoButtonActionPerformed(evt);
            }
        });

        despesasButton.setText("Despesas");
        despesasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despesasButtonActionPerformed(evt);
            }
        });

        entradasButton.setText("Entradas");
        entradasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout planejamentoPanelLayout = new javax.swing.GroupLayout(planejamentoPanel);
        planejamentoPanel.setLayout(planejamentoPanelLayout);
        planejamentoPanelLayout.setHorizontalGroup(
            planejamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planejamentoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planejamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(saldoButton)
                    .addComponent(despesasButton)
                    .addComponent(entradasButton))
                .addContainerGap(709, Short.MAX_VALUE))
        );
        planejamentoPanelLayout.setVerticalGroup(
            planejamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planejamentoPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(saldoButton)
                .addGap(100, 100, 100)
                .addComponent(despesasButton)
                .addGap(112, 112, 112)
                .addComponent(entradasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        mainPanel.add(planejamentoPanel, "card2");

        dicasPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dicasPanelLayout = new javax.swing.GroupLayout(dicasPanel);
        dicasPanel.setLayout(dicasPanelLayout);
        dicasPanelLayout.setHorizontalGroup(
            dicasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dicasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addContainerGap(734, Short.MAX_VALUE))
        );
        dicasPanelLayout.setVerticalGroup(
            dicasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dicasPanelLayout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        mainPanel.add(dicasPanel, "card2");

        saldoPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout saldoPanelLayout = new javax.swing.GroupLayout(saldoPanel);
        saldoPanel.setLayout(saldoPanelLayout);
        saldoPanelLayout.setHorizontalGroup(
            saldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        saldoPanelLayout.setVerticalGroup(
            saldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mainPanel.add(saldoPanel, "card2");

        despesasPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout despesasPanelLayout = new javax.swing.GroupLayout(despesasPanel);
        despesasPanel.setLayout(despesasPanelLayout);
        despesasPanelLayout.setHorizontalGroup(
            despesasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        despesasPanelLayout.setVerticalGroup(
            despesasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        mainPanel.add(despesasPanel, "card2");

        getContentPane().add(mainPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dadosPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(planejamentoPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dicasPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(startPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(startPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(startPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void saldoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(saldoPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_saldoButtonActionPerformed

    private void despesasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despesasButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(despesasPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_despesasButtonActionPerformed

    private void entradasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradasButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(despesasPanel);
        mainPanel.revalidate();
    }//GEN-LAST:event_entradasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TrabalhoFinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabalhoFinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabalhoFinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabalhoFinalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrabalhoFinalUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alteraEmail;
    private javax.swing.JButton alteraFonteRenda;
    private javax.swing.JButton alteraNome;
    private javax.swing.JButton alteraRenda;
    private javax.swing.JButton alteraTelefone;
    private javax.swing.JPanel dadosPanel;
    private javax.swing.JButton despesasButton;
    private javax.swing.JPanel despesasPanel;
    private javax.swing.JPanel dicasPanel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JButton entradasButton;
    private javax.swing.JLabel fonteRendaLabel1;
    private javax.swing.JLabel fonteRendaLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JLabel nomeLabel2;
    private javax.swing.JPanel planejamentoPanel;
    private javax.swing.JLabel rendaLabel1;
    private javax.swing.JLabel rendaLabel2;
    private javax.swing.JButton saldoButton;
    private javax.swing.JPanel saldoPanel;
    private javax.swing.JPanel startPanel;
    private javax.swing.JLabel telefoneLabel1;
    private javax.swing.JLabel telefoneLabel2;
    // End of variables declaration//GEN-END:variables
}