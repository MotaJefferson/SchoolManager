/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmanager.view.gui;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import schoolmanager.view.gui.panels.JPanel_Aluno;

/**
 *
 * @author jeffe
 */
public class GuiMode extends javax.swing.JFrame {

    /**
     * Creates new form GuiMode
     */
    public GuiMode() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        menuFechar = new javax.swing.JMenuItem();
        jMenuAluno = new javax.swing.JMenu();
        menuAluno = new javax.swing.JMenuItem();
        jMenuAdministrativo = new javax.swing.JMenu();
        menuConfig = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jMenuPrincipal.setText("Principal");

        menuFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuFechar.setText("Fechar");
        menuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFecharActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(menuFechar);

        jMenuBar1.add(jMenuPrincipal);

        jMenuAluno.setText("Gerenciamento");

        menuAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAluno.setText("Aluno");
        menuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlunoActionPerformed(evt);
            }
        });
        jMenuAluno.add(menuAluno);

        jMenuBar1.add(jMenuAluno);

        jMenuAdministrativo.setText("Administrativo");

        menuConfig.setText("Configurações");
        menuConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfigActionPerformed(evt);
            }
        });
        jMenuAdministrativo.add(menuConfig);

        jMenuBar1.add(jMenuAdministrativo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlunoActionPerformed
        
        String tabTitle = "Aluno ";
        
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            if (jTabbedPane1.getTitleAt(i).equals(tabTitle)) {
                jTabbedPane1.setSelectedIndex(i);
                return;
            }
        }
        
        TabbedPaneWithCloseButton janela = new TabbedPaneWithCloseButton(jTabbedPane1);
        JPanel_Aluno jPanelAluno = new JPanel_Aluno();    

        janela.addTab(tabTitle, jPanelAluno);
        
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);

    }//GEN-LAST:event_menuAlunoActionPerformed

    private void menuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFecharActionPerformed

    private void menuConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfigActionPerformed
        
        String tabTitle = "Configurações ";
        
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            if (jTabbedPane1.getTitleAt(i).equals(tabTitle)) {
                jTabbedPane1.setSelectedIndex(i);
                return;
            }
        }
        
        TabbedPaneWithCloseButton janela = new TabbedPaneWithCloseButton(jTabbedPane1);
        JPanel_Aluno jPanelAluno = new JPanel_Aluno();    

        janela.addTab(tabTitle, jPanelAluno);
        
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount() - 1);
    }//GEN-LAST:event_menuConfigActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMode().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdministrativo;
    private javax.swing.JMenu jMenuAluno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem menuAluno;
    private javax.swing.JMenuItem menuConfig;
    private javax.swing.JMenuItem menuFechar;
    // End of variables declaration//GEN-END:variables
}
