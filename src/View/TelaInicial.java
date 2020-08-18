/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



import java.awt.Image;
import Conexao.Conexao;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Rauan Hiago
 */
public class TelaInicial extends javax.swing.JFrame {

    Connection con = null;
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        con = Conexao.getConnection();
        
        Toolkit kit = getDefaultToolkit();
        Image icone = kit.getImage("");
        this.setIconImage(icone);
        this.setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdinterno = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        relatoriolancamentos = new javax.swing.JMenuItem();
        relatorioveiculo = new javax.swing.JMenuItem();
        relatoriomotorista = new javax.swing.JMenuItem();
        relatoriosecretaria = new javax.swing.JMenuItem();
        relatoriocombustiveis = new javax.swing.JMenuItem();
        relatoriousuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gas-station (1).png"))); // NOI18N

        jdinterno.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdinternoLayout = new javax.swing.GroupLayout(jdinterno);
        jdinterno.setLayout(jdinternoLayout);
        jdinternoLayout.setHorizontalGroup(
            jdinternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdinternoLayout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel1)
                .addGap(180, 180, 180))
        );
        jdinternoLayout.setVerticalGroup(
            jdinternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdinternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/notebook.png"))); // NOI18N
        jMenu3.setText("Arquivos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/man.png"))); // NOI18N
        jMenu1.setText("Usuários");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenuItem2.setText("Cadastrar");
        jMenuItem2.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
                jMenuItem2MenuDragMouseDragged(evt);
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gas-station.png"))); // NOI18N
        jMenu4.setText("Combustíveis");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        jMenuItem5.setText("Cadastrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/check.png"))); // NOI18N
        jMenu5.setText("Lançamentos");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        jMenuItem8.setText("Lançamento");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/school-bus.png"))); // NOI18N
        jMenu7.setText("Veículos");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        jMenuItem10.setText("Cadastrar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        jMenu6.setText("Secretaria");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        jMenuItem9.setText("Cadastrar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/taxi-driver.png"))); // NOI18N
        jMenu8.setText("Motoristas");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/plus.png"))); // NOI18N
        jMenuItem11.setText("cadastrar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuBar1.add(jMenu8);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/growth.png"))); // NOI18N
        jMenu2.setText("Relatórios");

        relatoriolancamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        relatoriolancamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/newspaper.png"))); // NOI18N
        relatoriolancamentos.setText("Lançamentos");
        relatoriolancamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriolancamentosActionPerformed(evt);
            }
        });
        jMenu2.add(relatoriolancamentos);

        relatorioveiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/school-bus.png"))); // NOI18N
        relatorioveiculo.setText("Veículos");
        relatorioveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioveiculoActionPerformed(evt);
            }
        });
        jMenu2.add(relatorioveiculo);

        relatoriomotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/taxi-driver.png"))); // NOI18N
        relatoriomotorista.setText("Motoristas");
        relatoriomotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriomotoristaActionPerformed(evt);
            }
        });
        jMenu2.add(relatoriomotorista);

        relatoriosecretaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        relatoriosecretaria.setText("Secretarias");
        relatoriosecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosecretariaActionPerformed(evt);
            }
        });
        jMenu2.add(relatoriosecretaria);

        relatoriocombustiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/gas-station.png"))); // NOI18N
        relatoriocombustiveis.setText("Combustíveis");
        relatoriocombustiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriocombustiveisActionPerformed(evt);
            }
        });
        jMenu2.add(relatoriocombustiveis);

        relatoriousuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/man.png"))); // NOI18N
        relatoriousuarios.setText("Usuários");
        relatoriousuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriousuariosActionPerformed(evt);
            }
        });
        jMenu2.add(relatoriousuarios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdinterno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdinterno)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CadCombustivel com = new CadCombustivel();
        jdinterno.add(com);
        com.setLocation(jdinterno.getWidth()/2 - com.getWidth()/2, jdinterno.getHeight()/2 - com.getHeight()/2);
       
        com.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        cadLancamento lan = new cadLancamento();
        jdinterno.add(lan);
        lan.setLocation(jdinterno.getWidth()/2 - lan.getWidth()/2, jdinterno.getHeight()/2 - lan.getHeight()/2);
        lan.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2MenuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_jMenuItem2MenuDragMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MenuDragMouseDragged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadFuncionario cad = new CadFuncionario();
        jdinterno.add(cad);
        cad.setLocation(jdinterno.getWidth()/2 - cad.getWidth()/2, jdinterno.getHeight()/2 - cad.getHeight()/2);
        cad.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CadSecretaria sec = new CadSecretaria();
        jdinterno.add(sec);
        sec.setLocation(jdinterno.getWidth()/2 - sec.getWidth()/2, jdinterno.getHeight()/2 - sec.getHeight()/2);
        sec.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CadVeiculo veiculo = new CadVeiculo();
        jdinterno.add(veiculo);
        veiculo.setLocation(jdinterno.getWidth()/2 - veiculo.getWidth()/2, jdinterno.getHeight()/2 - veiculo.getHeight()/2);
        veiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void relatoriolancamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriolancamentosActionPerformed
        
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if(confirma == JOptionPane.YES_OPTION){
            
            try {
                JasperPrint print = JasperFillManager.fillReport("relatorios/lancamentos.jasper", null, con);
                 JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
        }
    }//GEN-LAST:event_relatoriolancamentosActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
      CadMotorista veiculo = new CadMotorista();
        jdinterno.add(veiculo);
        veiculo.setLocation(jdinterno.getWidth()/2 - veiculo.getWidth()/2, jdinterno.getHeight()/2 - veiculo.getHeight()/2);
        veiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void relatorioveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioveiculoActionPerformed
int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if(confirma == JOptionPane.YES_OPTION){
            
            try {
                JasperPrint print = JasperFillManager.fillReport("relatorios/veiculos.jasper", null, con);
                 JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioveiculoActionPerformed

    private void relatoriomotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriomotoristaActionPerformed
      int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if(confirma == JOptionPane.YES_OPTION){
            
            try {
                JasperPrint print = JasperFillManager.fillReport("relatorios/motoristas.jasper", null, con);
                 JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
        }
    }//GEN-LAST:event_relatoriomotoristaActionPerformed

    private void relatoriosecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosecretariaActionPerformed
int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if(confirma == JOptionPane.YES_OPTION){
            
            try {
                JasperPrint print = JasperFillManager.fillReport("relatorios/secretarias.jasper", null, con);
                 JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_relatoriosecretariaActionPerformed

    private void relatoriocombustiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriocombustiveisActionPerformed
int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if(confirma == JOptionPane.YES_OPTION){
            
            try {
                JasperPrint print = JasperFillManager.fillReport("relatorios/combustíveis.jasper", null, con);
                 JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_relatoriocombustiveisActionPerformed

    private void relatoriousuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriousuariosActionPerformed
int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if(confirma == JOptionPane.YES_OPTION){
            
            try {
                JasperPrint print = JasperFillManager.fillReport("relatorios/usuarios.jasper", null, con);
                 JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_relatoriousuariosActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JDesktopPane jdinterno;
    private javax.swing.JMenuItem relatoriocombustiveis;
    private javax.swing.JMenuItem relatoriolancamentos;
    private javax.swing.JMenuItem relatoriomotorista;
    private javax.swing.JMenuItem relatoriosecretaria;
    private javax.swing.JMenuItem relatoriousuarios;
    private javax.swing.JMenuItem relatorioveiculo;
    // End of variables declaration//GEN-END:variables

    
}
