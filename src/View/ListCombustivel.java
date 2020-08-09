/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModeloDao.CombustivelDao;
import Modelos.CombustivelModelo;
import static View.LancamentoCombustivel.txtcom;
import static View.LancamentoCombustivel.txtsec;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rauan Hiago
 */
public class ListCombustivel extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListCombustivel
     */
    public ListCombustivel() {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/gas-station.png")));
        readTabela();
    }
     public void readTabela() {
        
        DefaultTableModel produtos = (DefaultTableModel) jtcombustiveis.getModel();
        CombustivelDao cdao = new CombustivelDao();

        produtos.setNumRows(0);
        
        for (CombustivelModelo com : cdao.readListCombustivel()) {

            produtos.addRow(new Object[]{
                com.getId(),
                com.getNome(),
                com.getValor(),
                com.getData()
            });
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcombustiveis = new javax.swing.JTable();
        jbadiciona = new javax.swing.JButton();

        setClosable(true);

        jtcombustiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Data cad."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtcombustiveis);

        jbadiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        jbadiciona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbadicionaMouseEntered(evt);
            }
        });
        jbadiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbadicionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jbadiciona)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbadiciona)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbadicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbadicionaActionPerformed
        txtcom.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 1).toString());
        dispose();
    }//GEN-LAST:event_jbadicionaActionPerformed

    private void jbadicionaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbadicionaMouseEntered
       jbadiciona.setToolTipText("Selecionar nome do combustível!"); 
    }//GEN-LAST:event_jbadicionaMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbadiciona;
    private javax.swing.JTable jtcombustiveis;
    // End of variables declaration//GEN-END:variables
}
