/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModeloDao.VeiculoDao;
import Modelos.Veiculo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rauan Hiago
 */
public class CadVeiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroDeveiculos
     */
    public CadVeiculo() {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/school-bus.png")));
        readTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtveiculo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        txtdono = new javax.swing.JTextField();
        txtano = new javax.swing.JTextField();
        txtcor = new javax.swing.JTextField();
        txtdata = new javax.swing.JFormattedTextField();
        txtplaca = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jTextField6.setText("jTextField6");

        jFormattedTextField2.setText("jFormattedTextField2");

        jLabel1.setText("jLabel1");

        jLabel8.setText("jLabel8");

        jTextField7.setText("jTextField7");

        jFormattedTextField3.setText("jFormattedTextField3");

        jButton4.setText("jButton4");

        setClosable(true);
        setTitle("Gerenciador de Veículos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Taabela de Dados dos veículos"));

        jtveiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID.", "Placa", "Cor", "Modelo", "Ano", "Dono", "Data de Cad."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtveiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtveiculoMouseClicked(evt);
            }
        });
        jtveiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtveiculoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtveiculo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados dos Veículos"));

        jLabel2.setText("N° Placa:");

        jLabel3.setText("Cor:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Responsável");

        jLabel7.setText("Ano");

        jLabel9.setText("Data Cad:");

        txtdono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdonoActionPerformed(evt);
            }
        });

        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtplaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtcor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtdono, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(733, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setToolTipText("");
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
        jButton2.setText("Editar");
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
        BotaoLimpar.setPreferredSize(new java.awt.Dimension(79, 50));
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdonoActionPerformed

    }//GEN-LAST:event_txtdonoActionPerformed

    public void readTable() {

        DefaultTableModel produtos = (DefaultTableModel) jtveiculo.getModel();

        VeiculoDao cdao = new VeiculoDao();

        produtos.setNumRows(0);

        for (Veiculo veic : cdao.read()) {
            produtos.addRow(new Object[]{
                veic.getId(),
                veic.getPlaca(),
                veic.getCor(),
                veic.getModelo(),
                veic.getAno(),
                veic.getDono(),
                veic.getData()
            });
        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        VeiculoDao dao = new VeiculoDao();

        Veiculo carros = new Veiculo();

        if (txtplaca.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo placa!!!!!");
        } else if (txtano.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Tipo!!!!!");

        } else if (txtcor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo cor!!!!!");
        } else if (txtdata.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Secretaria!!!!!");
        } else if (txtdono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Dono!!!!!");
        } else if (txtmodelo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Modelo!!!!!");
        } else if (txtplaca.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome do Placa!!!!!");
        } else {
            carros.setAno(Integer.parseInt(txtano.getText()));
            carros.setCor(txtcor.getText());
            carros.setData(txtdata.getText());
            carros.setDono(txtdono.getText());
            carros.setModelo(txtmodelo.getText());
            carros.setPlaca(txtplaca.getText());

            dao.create(carros);

            readTable();

            txtano.setText("");
            txtcor.setText("");
            txtdata.setText("");
            txtdono.setText("");
            txtplaca.setText("");
            txtmodelo.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente editar os dados?", title, JOptionPane.YES_NO_OPTION);

        if (confirme == JOptionPane.YES_OPTION) {
            if (txtplaca.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo placa!!!!!");
            } else if (txtano.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Tipo!!!!!");
            } else if (txtcor.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo cor!!!!!");
            } else if (txtdata.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Secretaria!!!!!");
            } else if (txtdono.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Dono!!!!!");
            } else if (txtmodelo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Modelo!!!!!");
            } else if (txtplaca.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Nome do Placa!!!!!");
            } else {
                if (jtveiculo.getSelectedRow() != -1) {
                    Veiculo veic = new Veiculo();

                    VeiculoDao dao = new VeiculoDao();

                    veic.setData(txtdata.getText());
                    veic.setPlaca(txtplaca.getText());
                    veic.setAno(Integer.parseInt(txtano.getText()));
                    veic.setDono(txtdono.getText());
                    veic.setModelo(txtmodelo.getText());
                    veic.setCor(txtcor.getText());
                    veic.setId((int) jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 0));

                    dao.atualizar(veic);

                    txtano.setText("");
                    txtplaca.setText("");
                    txtcor.setText("");
                    txtdata.setText("");
                    txtmodelo.setText("");
                    txtdono.setText("");

                    readTable();

                } else {
                    JOptionPane.showMessageDialog(null, "Selecione algum registro para editar!!!!");
                }
            }
        } else if (confirme == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Atualização cancelada!!!");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtveiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtveiculoKeyReleased
        if (jtveiculo.getSelectedRow() != -1) {
            txtplaca.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 1).toString());
            txtcor.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 2).toString());
            txtmodelo.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 3).toString());
            txtano.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 4).toString());
            txtdono.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 5).toString());
            txtdata.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 6).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jtveiculoKeyReleased

    private void jtveiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtveiculoMouseClicked
        if (jtveiculo.getSelectedRow() != -1) {
            txtplaca.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 1).toString());
            txtcor.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 2).toString());
            txtmodelo.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 3).toString());
            txtano.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 4).toString());
            txtdono.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 5).toString());
            txtdata.setText(jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_jtveiculoMouseClicked
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Veiculo veic = new Veiculo();
        
        VeiculoDao dao = new VeiculoDao();
        
        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);
        
        if (confirme == JOptionPane.YES_OPTION) {
            if (txtplaca.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo placa!!!!!");
            } else if (txtano.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Tipo!!!!!");
            } else if (txtcor.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo cor!!!!!");
            } else if (txtdata.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Secretaria!!!!!");
            } else if (txtdono.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Dono!!!!!");
            } else if (txtmodelo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Modelo!!!!!");
            } else if (txtplaca.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Nome do Placa!!!!!");
            } else {
                if (jtveiculo.getSelectedRow() != -1) {
                    veic.setData(txtdata.getText());
                    veic.setPlaca(txtplaca.getText());
                    veic.setAno(Integer.parseInt(txtano.getText()));
                    veic.setDono(txtdono.getText());
                    veic.setModelo(txtmodelo.getText());
                    veic.setCor(txtcor.getText());
                    veic.setId((int) jtveiculo.getValueAt(jtveiculo.getSelectedRow(), 0));

                    dao.deletar(veic);
                    
                    readTable();
                    
                    txtano.setText("");
                    txtplaca.setText("");
                    txtcor.setText("");
                    txtdata.setText("");
                    txtmodelo.setText("");
                    txtdono.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, " Selecione um resgitro para apagá-lo!!!");
                }
            }
        } else if (confirme == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setToolTipText("Cadastrar Veículo!");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setToolTipText("Editar Veículo!");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setToolTipText("Excluir Veículo!");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        txtano.setText("");
        txtplaca.setText("");
        txtcor.setText("");
        txtdata.setText("");
        txtmodelo.setText("");
        txtdono.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable jtveiculo;
    private javax.swing.JTextField txtano;
    private javax.swing.JTextField txtcor;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JTextField txtdono;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JFormattedTextField txtplaca;
    // End of variables declaration//GEN-END:variables
}
