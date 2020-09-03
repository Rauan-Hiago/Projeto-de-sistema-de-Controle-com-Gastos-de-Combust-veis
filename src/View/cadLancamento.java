/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModeloDao.LancamentoDao;
import ModeloDao.SecretariaDao;
import Modelos.Lancamento;
import static View.TelaInicial.jdinterno;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rauan Hiago
 */
public class cadLancamento extends javax.swing.JInternalFrame {

    public cadLancamento(String nome) {
        
        initComponents();
        String nome1 = nome;
        txtsec.setText(nome);

        if (txtsec.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo placa!!!!!");
        }

        readTabela();
    }

    public cadLancamento() {
        
        initComponents();

        setFrameIcon(new ImageIcon(this.getClass().getResource("/imagens/check.png")));
        
        readTabela();
    }

    void adicionarsecretaria(String nome) {
        txtsec.setText(nome);
    }

    public void readTabela() {

        DefaultTableModel produtos = (DefaultTableModel) jtcombustiveis.getModel();
        
        LancamentoDao dao = new LancamentoDao();

        produtos.setNumRows(0);

        for (Lancamento com : dao.read()) {
            produtos.addRow(new Object[]{
                com.getId(),
                com.getNome(),
                com.getPlaca(),
                com.getTipo(),
                com.getQtd(),
                com.getSecretaria(),
                com.getData()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtqtd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdata = new javax.swing.JFormattedTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtplaca = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jbmais = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtcombustiveis = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jTextField5.setText("jTextField5");

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
        setTitle("Cadastro de Consumo");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lançamento dos Gastos com Combustíveis"));

        jLabel1.setText("Tipo do Combustível");

        jLabel2.setText("Placa do Carro");

        jLabel3.setText("Quantidade de LT");

        jLabel4.setText("Nome do Motorista");

        jLabel6.setText("Secretaria");

        jLabel7.setText("Data de Cadastro");

        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton5.setText("jButton5");
        jButton5.setMaximumSize(new java.awt.Dimension(80, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 23));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton4");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerenciar Secretaria", "Gerenciar Veículos", "Gerenciar Motoristas", "Gerenciar usuários", "Gerenciar Combustíveis" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jbmais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jbmais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbmaisMouseEntered(evt);
            }
        });
        jbmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcom, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtsec, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtqtd))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbmais)
                        .addGap(88, 88, 88))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(316, 316, 316)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbmais)))
                .addGap(756, 756, 756))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(349, 349, 349)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(597, Short.MAX_VALUE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de Dados do Lançamentos do Gastos com Combustíveis"));

        jtcombustiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Servidor", "Placa do carro", "Tipo do combustível", "Quantiade", "Secretaria", "Data de cadastro."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtcombustiveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtcombustiveisMouseClicked(evt);
            }
        });
        jtcombustiveis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtcombustiveisKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jtcombustiveis);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        jBEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.setPreferredSize(new java.awt.Dimension(71, 50));
        jBEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEditarMouseEntered(evt);
            }
        });
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
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

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Limpar");
        jButton9.setPreferredSize(new java.awt.Dimension(79, 50));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        SecretariaDao daosec = new SecretariaDao();

        if (txtplaca.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo placa!!!!!");
        } else if (txtcom.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Tipo!!!!!");
        } else if (txtqtd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Quantidade!!!!!");
        } else if (txtsec.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Secretaria!!!!!");
        } else if (txtuser.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo Nome do motorista!!!!!");
        } else if (daosec.checarSecretaria(txtsec.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Não existe a secretaria Cadastrada!!!!!!!!!");
        } else {
            double mult = 0;
            int num;
            
            Lancamento commo = new Lancamento();
            
            LancamentoDao dao = new LancamentoDao();

            mult = dao.valor(txtcom.getText());

            if (mult != 1) {
                num = Integer.parseInt(txtqtd.getText());

                commo.setNome(txtuser.getText());
                commo.setPlaca(txtplaca.getText());
                commo.setQtd(Integer.parseInt(txtqtd.getText()));
                commo.setTipo(txtcom.getText());
                commo.setSecretaria(txtsec.getText());
                commo.setValor(num * mult);
                commo.setData(txtdata.getText());

                dao.create(commo);

                txtcom.setText("");
                txtplaca.setText("");
                txtqtd.setText("");
                txtuser.setText("");
                txtsec.setText("");
                txtdata.setText("");

                readTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Não esxite o combustível nos cadastros!!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION);

        if (confirme == JOptionPane.YES_OPTION) {
            if (jtcombustiveis.getSelectedRow() != -1) {
                Lancamento commo = new Lancamento();

                LancamentoDao dao = new LancamentoDao();

                commo.setId((int) jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 0));

                dao.deletar(commo);

                txtcom.setText("");
                txtplaca.setText("");
                txtqtd.setText("");
                txtuser.setText("");
                txtsec.setText("");
                txtdata.setText("");

                readTabela();

            } else {
                JOptionPane.showMessageDialog(null, "Selecione algum registro para excluir!!!!");
            }
        } else if (confirme == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int confirme = JOptionPane.showConfirmDialog(null, "Deseja realmente editar estes dados?", title, JOptionPane.YES_NO_OPTION);

        if (confirme == JOptionPane.YES_OPTION) {
            if (txtplaca.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo placa!!!!!");
            } else if (txtcom.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Tipo!!!!!");
            } else if (txtqtd.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Quantidade!!!!!");
            } else if (txtsec.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Secretaria!!!!!");
            } else if (txtuser.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o Campo Nome do motorista!!!!!");
            } else {
                if (jtcombustiveis.getSelectedRow() != -1) {

                    Lancamento commo = new Lancamento();

                    LancamentoDao dao = new LancamentoDao();

                    commo.setNome(txtuser.getText());
                    commo.setPlaca(txtplaca.getText());
                    commo.setQtd(Integer.parseInt(txtqtd.getText()));
                    commo.setTipo(txtcom.getText());
                    commo.setSecretaria(txtsec.getText());
                    commo.setData(txtdata.getText());
                    commo.setId((int) jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 0));

                    dao.atualizar(commo);

                    txtcom.setText("");
                    txtplaca.setText("");
                    txtqtd.setText("");
                    txtuser.setText("");
                    txtsec.setText("");
                    txtdata.setText("");

                    readTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione algum registro para editar!!!!");
                }
            }
        } else if (confirme == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Atualização cancelada!!!");
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jtcombustiveisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtcombustiveisKeyReleased
       if (jtcombustiveis.getSelectedRow() != -1) {
            txtuser.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 1).toString());
            txtplaca.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 2).toString());
            txtcom.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 3).toString());
            txtqtd.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 4).toString());
            txtsec.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 5).toString());
            txtdata.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_jtcombustiveisKeyReleased

    private void jtcombustiveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtcombustiveisMouseClicked
        if (jtcombustiveis.getSelectedRow() != -1) {
            txtuser.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 1).toString());
            txtplaca.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 2).toString());
            txtcom.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 3).toString());
            txtqtd.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 4).toString());
            txtsec.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 5).toString());
            txtdata.setText(jtcombustiveis.getValueAt(jtcombustiveis.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_jtcombustiveisMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ListCombustivel list = new ListCombustivel();
        TelaInicial.jdinterno.add(list);
        list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
        list.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ListSecretaria list = new ListSecretaria();
        TelaInicial.jdinterno.add(list);
        list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
        list.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ListPlaca list = new ListPlaca();
        TelaInicial.jdinterno.add(list);
        list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
        list.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ListMotorista list = new ListMotorista();
        TelaInicial.jdinterno.add(list);
        list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
        list.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jbmaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbmaisMouseEntered
        jbmais.setToolTipText("Escolha na lista acima a tela que você deseja abrir, e aperte neste botão!");
    }//GEN-LAST:event_jbmaisMouseEntered

    private void jbmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmaisActionPerformed
        String combo = (String) jComboBox1.getSelectedItem();
        if (combo == "Gerenciar Secretaria") {
            CadSecretaria list = new CadSecretaria();
            TelaInicial.jdinterno.add(list);
            list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
            list.setVisible(true);
        } else if (combo == "Gerenciar Veículos") {
            CadVeiculo list = new CadVeiculo();
            TelaInicial.jdinterno.add(list);
            list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
            list.setVisible(true);
        } else if (combo == "Gerenciar Motoristas") {
            CadMotorista list = new CadMotorista();
            TelaInicial.jdinterno.add(list);
            list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
            list.setVisible(true);
        } else if (combo == "Gerenciar usuários") {
            CadFuncionario list = new CadFuncionario();
            TelaInicial.jdinterno.add(list);
            list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
            list.setVisible(true);
        } else if (combo == "Gerenciar Combustíveis") {
            CadCombustivel list = new CadCombustivel();
            TelaInicial.jdinterno.add(list);
            list.setLocation(jdinterno.getWidth() / 2 - list.getWidth() / 2, jdinterno.getHeight() / 2 - list.getHeight() / 2);
            list.setVisible(true);
        }
    }//GEN-LAST:event_jbmaisActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setToolTipText("Cadastrar Lançamento!");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jBEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEditarMouseEntered
        jBEditar.setToolTipText("Editar Lançamento!");
    }//GEN-LAST:event_jBEditarMouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setToolTipText("Excluir Lançamento!");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        txtcom.setText("");
        txtplaca.setText("");
        txtqtd.setText("");
        txtuser.setText("");
        txtsec.setText("");
        txtdata.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbmais;
    private javax.swing.JTable jtcombustiveis;
    public static javax.swing.JTextField txtcom;
    private javax.swing.JFormattedTextField txtdata;
    public static javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtqtd;
    public static javax.swing.JTextField txtsec;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
