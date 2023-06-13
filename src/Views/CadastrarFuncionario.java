/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.Funcionario;
import ServicesFactory.FuncionarioServicos;
import ServicesFactory.FactoryServicos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Validadores;

/**
 *
 * @author Maria Ines Medeiros
 */
public class CadastrarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFuncionario
     */
    public CadastrarFuncionario() {
        initComponents();
        addRowToTable();
        jbEditar.setEnabled(false);
        jbDeletar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlrg = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jlcelular = new javax.swing.JLabel();
        jfcelular = new javax.swing.JFormattedTextField();
        jlcpf = new javax.swing.JLabel();
        jtfRG = new javax.swing.JTextField();
        jlendereco = new javax.swing.JLabel();
        jtfendereco = new javax.swing.JTextField();
        jlcep = new javax.swing.JLabel();
        jtfcep = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jtTabela = new javax.swing.JScrollPane();
        jtFuncionarios = new javax.swing.JTable();
        jbEditar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlTitulo.setText("CADASTRAR FUNCIONARIO");

        jlNome.setForeground(new java.awt.Color(0, 0, 0));
        jlNome.setText("* Nome:");

        jtfNome.setToolTipText("Informe o nome completo.");
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomeKeyTyped(evt);
            }
        });

        jlrg.setForeground(new java.awt.Color(0, 0, 0));
        jlrg.setText("*RG");

        jtfCPF.setToolTipText("Informe somente números.");
        jtfCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCPFFocusLost(evt);
            }
        });
        jtfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFActionPerformed(evt);
            }
        });
        jtfCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCPFKeyTyped(evt);
            }
        });

        jlcelular.setForeground(new java.awt.Color(0, 0, 0));
        jlcelular.setText("*Celular");

        try {
            jfcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfcelular.setToolTipText("Informe somente números.");

        jlcpf.setForeground(new java.awt.Color(0, 0, 0));
        jlcpf.setText("* CPF:");

        jtfRG.setToolTipText("Informe somente números.");
        jtfRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfRGFocusLost(evt);
            }
        });
        jtfRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRGKeyTyped(evt);
            }
        });

        jlendereco.setForeground(new java.awt.Color(0, 0, 0));
        jlendereco.setText("* Endereço:");

        jtfendereco.setToolTipText("Informe o nome completo.");

        jlcep.setForeground(new java.awt.Color(0, 0, 0));
        jlcep.setText("*CEP");

        jtfcep.setToolTipText("Endereço completo.");

        jbSalvar.setMnemonic('S');
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbDeletar.setMnemonic('L');
        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbFechar.setMnemonic('F');
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jtFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Celular", "RG", "Endereço", "Cep"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFuncionariosMouseClicked(evt);
            }
        });
        jtTabela.setViewportView(jtFuncionarios);

        jbEditar.setMnemonic('E');
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(552, 552, 552)
                .addComponent(jSeparator))
            .addComponent(jtTabela, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlendereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfendereco)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlcpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jlcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jlrg)
                                .addGap(17, 17, 17)
                                .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlcep)
                        .addGap(18, 18, 18)
                        .addComponent(jtfcep, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlrg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlendereco)
                    .addComponent(jtfendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcep)
                    .addComponent(jtfcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbEditar)
                    .addComponent(jbDeletar)
                    .addComponent(jbFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
        // TODO add your handling code here:
        String nletras = "0123456789<>:?/~^}][{´`=+-_!|'\'#$%¨&*()²³£¢¬§º°ª";
        if (nletras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNomeKeyTyped

    private void jtfCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCPFFocusLost
        if (!jtfCPF.getText().equals(" ")) {
            if (!Validadores.isCPF(jtfCPF.getText())) {
                JOptionPane.showMessageDialog(this, "CPF Inválido!");
                jtfCPF.requestFocus();
            }
        }
    }//GEN-LAST:event_jtfCPFFocusLost

    private void jtfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFActionPerformed

    private void jtfCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCPFKeyTyped
        // TODO add your handling code here:
        String number = "0123456789";
        if (jtfCPF.getText().length() < 11) {
            if (!number.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfCPFKeyTyped

    private void jtfRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRGFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRGFocusLost

    private void jtfRGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRGKeyTyped
        String number = "0123456789";
        if (jtfRG.getText().length() < 7) {
            if (!number.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfRGKeyTyped

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        FuncionarioServicos fServicos = FactoryServicos.getFuncionarioServicos();
        if (validaInput()) {
            int idFuncionario = 0;
            String nome = jtfNome.getText();
            String cpf = jtfCPF.getText();
            String rg = jtfRG.getText();
            String endereco = jtfendereco.getText();
            String telefone = jfcelular.getText();
            String cep = jtfcep.getText();
            Funcionario f = new Funcionario(idFuncionario, rg, cpf, nome, telefone, endereco, cep);

            if (jbSalvar.getText().equals("Confirmar")) {
                fServicos.atualizaFuncionarioByDoc(f);
            } else {
                fServicos.cadastrarFuncionarioDAO(f);
            }
            limparCampo();
            addRowToTable();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        int linha;
        String cpf;
        linha = jtFuncionarios.getSelectedRow();
        cpf = (String) jtFuncionarios.getValueAt(linha, 1);
        FuncionarioServicos fServicos = FactoryServicos.getFuncionarioServicos();
        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este Funcionario ?", "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);
        if (resposta == 0) {
            fServicos.deletarFuncionarioDAO(cpf);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Funcionario deletado com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
        jbDeletar.setVisible(false);
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
     if (jbFechar.getText().equals("Limpar")) {
            limparCampo();
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFuncionariosMouseClicked
        jbEditar.setEnabled(true);
        jbDeletar.setEnabled(true);

    }//GEN-LAST:event_jtFuncionariosMouseClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbSalvar.setText("Confirmar");
        jbFechar.setText("Limpar");

        int linha;
        linha = jtFuncionarios.getSelectedRow();

        jtfNome.setText((String) jtFuncionarios.getValueAt(linha, 0));
        jtfCPF.setText((String) jtFuncionarios.getValueAt(linha, 1));
        jfcelular.setText((String) jtFuncionarios.getValueAt(linha, 2));
        jtfRG.setText((String) jtFuncionarios.getValueAt(linha, 3));
        jtfendereco.setText((String) jtFuncionarios.getValueAt(linha, 4));
        jtfcep.setText((String) jtFuncionarios.getValueAt(linha, 5));
        jtfNome.requestFocus();

    }//GEN-LAST:event_jbEditarActionPerformed

    public boolean validaInput() {
        if (jtfCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CPF!");
            jtfCPF.requestFocus();
            return false;
        }
        if (jtfRG.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher RG!");
            jtfRG.requestFocus();
            return false;
        }
        if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Nome!");
            jtfNome.requestFocus();
            return false;
        }
        if (jtfendereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Endereço!");
            jtfendereco.requestFocus();
            return false;
        }
        if (jtfcep.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CEP!");
            jtfcep.requestFocus();
            return false;
        } else if (jfcelular.getText() == null) {
            JOptionPane.showMessageDialog(this, "Preencher telefone!");
            jfcelular.requestFocus();
            return false;
        }
        return true;
    }

    public void limparCampo() {
        jbSalvar.setText("Salvar");
        jbFechar.setText("Fechar");
        jbEditar.setEnabled(false);
        jtfNome.setText("");
        jtfCPF.setText("");
        jtfRG.setText("");
        jtfcep.setText("");
        jtfendereco.setText("");
        jfcelular.setText("");
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtFuncionarios.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[6];
        FuncionarioServicos fServicos = FactoryServicos.getFuncionarioServicos();
        for (Funcionario f : fServicos.getFuncionarios()) {
            rowData[0] = f.getNome();
            rowData[1] = f.getCpf();
            rowData[2] = f.getCelular();
            rowData[3] = f.getRg();
            rowData[4] = f.getEndereco();
            rowData[5] = f.getCep();
            model.addRow(rowData);
        }
    }

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
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JFormattedTextField jfcelular;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlcelular;
    private javax.swing.JLabel jlcep;
    private javax.swing.JLabel jlcpf;
    private javax.swing.JLabel jlendereco;
    private javax.swing.JLabel jlrg;
    private javax.swing.JTable jtFuncionarios;
    private javax.swing.JScrollPane jtTabela;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRG;
    private javax.swing.JTextField jtfcep;
    private javax.swing.JTextField jtfendereco;
    // End of variables declaration//GEN-END:variables
}
