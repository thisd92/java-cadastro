/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    private CadCondutor cadCondutor;
    private CadVeic cadVeiculo;
    private RelatorioVeiculos relVeic;
    private RelatorioCondutor relCond;

    public TelaInicial() throws IOException, SQLException {
        initComponents();
        cadCondutor = new CadCondutor();
        cadVeiculo = new CadVeic();
        relVeic = new RelatorioVeiculos();
        relCond = new RelatorioCondutor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuCadCond = new javax.swing.JMenuItem();
        menuItemRemoveCond = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemRelCond = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCadVeic = new javax.swing.JMenuItem();
        menuItemRemoveVeic = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemRelVeic = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPainel.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Condutor");

        menuCadCond.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCadCond.setText("Cadastrar Condutor");
        menuCadCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCondActionPerformed(evt);
            }
        });
        jMenu3.add(menuCadCond);

        menuItemRemoveCond.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemRemoveCond.setText("Remover Condutor");
        menuItemRemoveCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemoveCondActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemRemoveCond);
        jMenu3.add(jSeparator2);

        menuItemRelCond.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemRelCond.setText("Relatorio Condutores");
        menuItemRelCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelCondActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemRelCond);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Veiculos");

        menuCadVeic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCadVeic.setText("Cadastrar Veiculo");
        menuCadVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadVeicActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadVeic);

        menuItemRemoveVeic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemRemoveVeic.setText("Remover Veiculo");
        menuItemRemoveVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemoveVeicActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRemoveVeic);
        jMenu2.add(jSeparator1);

        menuItemRelVeic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemRelVeic.setText("Relatorio de Veiculos");
        menuItemRelVeic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelVeicActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemRelVeic);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuCadCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCondActionPerformed
        jdpPainel.add(cadCondutor);
        cadCondutor.setVisible(true);
    }//GEN-LAST:event_menuCadCondActionPerformed

    private void menuCadVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadVeicActionPerformed
        jdpPainel.add(cadVeiculo);
        cadVeiculo.setVisible(true);
    }//GEN-LAST:event_menuCadVeicActionPerformed

    private void menuItemRelCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelCondActionPerformed
        jdpPainel.add(relCond);
        relCond.setVisible(true);
    }//GEN-LAST:event_menuItemRelCondActionPerformed

    private void menuItemRelVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelVeicActionPerformed
        if (relCond.isVisible()) {
            relCond.setVisible(false);
        }
        jdpPainel.add(relVeic);
        relVeic.setVisible(true);
    }//GEN-LAST:event_menuItemRelVeicActionPerformed

    private void menuItemRemoveCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemoveCondActionPerformed
        JOptionPane.showMessageDialog(null, "Condutores excluídos com sucesso.");

    }//GEN-LAST:event_menuItemRemoveCondActionPerformed

    private void menuItemRemoveVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemoveVeicActionPerformed
        JOptionPane.showMessageDialog(null, "Veículos excluídos com sucesso.");
    }//GEN-LAST:event_menuItemRemoveVeicActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaInicial().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDesktopPane jdpPainel;
    private javax.swing.JMenuItem menuCadCond;
    private javax.swing.JMenuItem menuCadVeic;
    private javax.swing.JMenuItem menuItemRelCond;
    private javax.swing.JMenuItem menuItemRelVeic;
    private javax.swing.JMenuItem menuItemRemoveCond;
    private javax.swing.JMenuItem menuItemRemoveVeic;
    private javax.swing.JMenuItem menuItemSair;
    // End of variables declaration//GEN-END:variables
}
