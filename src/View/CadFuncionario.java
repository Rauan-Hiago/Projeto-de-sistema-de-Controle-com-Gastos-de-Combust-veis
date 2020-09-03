/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import ModeloDao.UsuarioDao;
import Modelos.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rauan Hiago
 */
public class CadFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadFuncionario
     */
    public CadFuncionario() {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/man.png")));
        readTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtfunc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtnome = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcpd = new javax.swing.JFormattedTextField();
        txtdata = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        jLabel6.setText("jLabel6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setTitle("Gerenciador de Usuário");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de dados dos Usuários"));

        jtfunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "CPF", "Cargo", "Data de cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtfunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfuncMouseClicked(evt);
            }
        });
        jtfunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfuncKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jtfunc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setPreferredSize(new java.awt.Dimension(71, 50));
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(71, 50));
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

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Excluir");
        jButton2.setPreferredSize(new java.awt.Dimension(71, 50));
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

        BotaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.setPreferredSize(new java.awt.Dimension(71, 52));
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Email:");

        jLabel4.setText("Cargo:");

        try {
            txtcpd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Data de Cadastro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(txtemail)
                            .addComponent(txtcargo))
                        .addGap(124, 124, 124)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(txtcpd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void readTabela() {
        DefaultTableModel produtos = (DefaultTableModel) jtfunc.getModel();
        UsuarioDao cdao = new UsuarioDao();

        produtos.setNumRows(0);

        for (Usuario com : cdao.read()) {

            produtos.addRow(new Object[]{
                com.getId(),
                com.getNome(),
                com.getEmail(),
                com.getCpf(),
                com.getCargo(),
                com.getData()

            });
        }

    }
    private void jtfuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfuncKeyReleased
        if (jtfunc.getSelectedRow() != -1) {
            txtnome.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 1).toString());
            txtemail.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 2).toString());
            txtcpd.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 3).toString());
            txtcargo.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 4).toString());
            txtdata.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jtfuncKeyReleased

    private void jtfuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfuncMouseClicked
        if (jtfunc.getSelectedRow() != -1) {
            txtnome.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 1).toString());
            txtemail.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 2).toString());
            txtcpd.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 3).toString());
            txtcargo.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 4).toString());
            txtdata.setText(jtfunc.getValueAt(jtfunc.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jtfuncMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);

        if(confirme == JOptionPane.YES_OPTION){
            if (jtfunc.getSelectedRow() != -1) {
                Usuario commo = new Usuario();
                UsuarioDao dao = new UsuarioDao();

                commo.setId((int) jtfunc.getValueAt(jtfunc.getSelectedRow(), 0));
                dao.deletar(commo);
                txtcargo.setText("");
                txtcpd.setText("");
                txtemail.setText("");
                txtnome.setText("");
                txtdata.setText("");

                readTabela();

            } else {
                JOptionPane.showMessageDialog(null, "Selecione algum registro para excluir!!!!");
            }
        }else if(confirme == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!!");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton1.setToolTipText("Excluir Funcionário!");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente editar os dados?", title, JOptionPane.YES_NO_OPTION);

        if(confirme == JOptionPane.YES_OPTION){

            if (txtcargo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Cargo!!!!!");
            } else if (txtcpd.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo CPF!!!!!");

            } else if (txtemail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Email!!!!!");
            } else if (txtnome.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Nome!!!!!");
            } else {
                if (jtfunc.getSelectedRow() != -1) {
                    Usuario commo = new Usuario();
                    UsuarioDao dao = new UsuarioDao();

                    commo.setNome(txtnome.getText());
                    commo.setCpf(txtcpd.getText());
                    commo.setEmail(txtemail.getText());
                    commo.setCargo(txtcargo.getText());
                    commo.setData(txtdata.getText());

                    commo.setId((int) jtfunc.getValueAt(jtfunc.getSelectedRow(), 0));
                    dao.atualizar(commo);
                    txtcargo.setText("");
                    txtcpd.setText("");
                    txtemail.setText("");
                    txtnome.setText("");
                    txtdata.setText("");

                    readTabela();

                }else {
                    JOptionPane.showMessageDialog(null, "Selecione algum registro para editar!!!!");
                }
            }
        }else if(confirme == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Atualização cancelada!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setToolTipText("Editar Funcionário!");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtcargo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Cargo.");
        } else if (txtcpd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo CPF.!");

        } else if (txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Email.");
        } else if (txtnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome.");
        } else if (txtdata.getText().length() != 10 ) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Data de Cadastro!");
        }
        else if(txtcpd.getText().length()!= 14){
            JOptionPane.showMessageDialog(null, "O número de CPF não está completo! Digite novamente.");
        } else {
            UsuarioDao dao = new UsuarioDao();
            if (dao.chekarUser(txtnome.getText())) {
                JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado");
            } else {
                Usuario user = new Usuario();

                user.setCargo(txtcargo.getText());
                user.setCpf(txtcpd.getText());
                user.setEmail(txtemail.getText());
                user.setNome(txtnome.getText());
                user.setData(txtdata.getText());

                dao.create(user);
                readTabela();

                txtcargo.setText("");
                txtcpd.setText("");
                txtemail.setText("");
                txtnome.setText("");
                txtdata.setText("");

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setToolTipText("Cadastsar Funcionário!");
    }//GEN-LAST:event_jButton1MouseEntered

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
                txtcargo.setText("");
                txtcpd.setText("");
                txtemail.setText("");
                txtnome.setText("");
                txtdata.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable jtfunc;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JFormattedTextField txtcpd;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
