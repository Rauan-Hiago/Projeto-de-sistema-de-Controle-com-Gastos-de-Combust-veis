/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modelos.Combu;
import ModeloDao.CombustivelDao;
import ModeloDao.UsuarioDao;
import Modelos.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rauan Hiago
 */
public class CadCombustivel extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroDeCombustivel
     */
    public CadCombustivel() {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/gas-station.png")));
        readTabelaCom();
    }

    public void readTabelaCom() {
        DefaultTableModel produtos = (DefaultTableModel) jtcom.getModel();
        CombustivelDao cdao = new CombustivelDao();

        produtos.setNumRows(0);

        for (Combu com : cdao.readCom()) {

            produtos.addRow(new Object[]{
                com.getId(),
                com.getNome(),
                com.getPreco(),
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

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtdata = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcom = new javax.swing.JTable();

        jTextField3.setText("jTextField3");

        setClosable(true);
        setTitle("Gerenciador de Combustível");

        jLabel1.setText("Nome do Combustível:");

        jLabel2.setText("Preço / Litro:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/confirm.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rectification.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recycle-bin.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Data de Cadastro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpreco))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jtcom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Combustível", "Preço", "Data de Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtcom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtcomMouseClicked(evt);
            }
        });
        jtcom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtcomKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtcom);
        if (jtcom.getColumnModel().getColumnCount() > 0) {
            jtcom.getColumnModel().getColumn(0).setPreferredWidth(3);
            jtcom.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Cargo.");
        } else if (txtpreco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo CPF.!");

        } else {
            CombustivelDao dao = new CombustivelDao();
            Combu com = new Combu();

            com.setNome(txtnome.getText());

            com.setPreco(Double.parseDouble(txtpreco.getText()));
            com.setData(txtdata.getText());
            dao.createCombu(com);
            readTabelaCom();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtcomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtcomKeyReleased
        if (jtcom.getSelectedRow() != -1) {
            txtnome.setText(jtcom.getValueAt(jtcom.getSelectedRow(), 1).toString());
            txtpreco.setText(jtcom.getValueAt(jtcom.getSelectedRow(), 2).toString());
            txtdata.setText(jtcom.getValueAt(jtcom.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jtcomKeyReleased

    private void jtcomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtcomMouseClicked
        if (jtcom.getSelectedRow() != -1) {
            txtnome.setText(jtcom.getValueAt(jtcom.getSelectedRow(), 1).toString());
            txtpreco.setText(jtcom.getValueAt(jtcom.getSelectedRow(), 2).toString());
            txtdata.setText(jtcom.getValueAt(jtcom.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jtcomMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente editar esses dados?", title, JOptionPane.YES_NO_OPTION);
        
         if(confirme == JOptionPane.YES_OPTION){ 
        if (jtcom.getSelectedRow() != -1) {
            Combu commo = new Combu();
            CombustivelDao dao = new CombustivelDao();

            commo.setNome(txtnome.getText());
            commo.setPreco(Double.parseDouble(txtpreco.getText()));
            commo.setData(txtdata.getText());
            commo.setId((int) jtcom.getValueAt(jtcom.getSelectedRow(), 0));
            dao.atualizarCombu(commo);

            txtnome.setText("");
            txtpreco.setText("");
            txtdata.setText("");

            readTabelaCom();
        } else{JOptionPane.showMessageDialog(null, "Selecione algum registro para editar!!!!");
            }
         
         }else if(confirme == JOptionPane.NO_OPTION){
                  JOptionPane.showMessageDialog(null, "Atualização cancelada!!!");
         }
                 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);
        if(confirme == JOptionPane.YES_OPTION){ 
            if (jtcom.getSelectedRow() != -1) {
            Combu commo = new Combu();
            CombustivelDao dao = new CombustivelDao();

            commo.setId((int) jtcom.getValueAt(jtcom.getSelectedRow(), 0));
            dao.deletarCombustivel(commo);
            txtnome.setText("");
            txtpreco.setText("");
            txtpreco.setText("");
            txtdata.setText("");

            readTabelaCom();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione algum registro para excluir!!!!");
        } 
        }else if(confirme == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Exclusão cancelada!!!");}// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    jButton1.setToolTipText("Cadastsar Combustível!");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
      jButton1.setToolTipText("Editar Combustível!");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
jButton1.setToolTipText("Excluir Combustível!");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable jtcom;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}