/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.Planodetreino;
import ServicesFactory.PlanoServicos;
import DAO.PlanodeTreinoDAO;
import ServicesFactory.FactoryServicos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria Ines Medeiros
 */
public class jfPlano extends javax.swing.JFrame {

    /**
     * Creates new form Plano
     */
    public jfPlano() {
        initComponents();
        addRowToTable();
        //CarregaPlano();
        jbDeletar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlnomePlano = new javax.swing.JLabel();
        jtfNomePlano = new javax.swing.JTextField();
        jlSeries = new javax.swing.JLabel();
        jtfSeries = new javax.swing.JTextField();
        jlRepetiçoes = new javax.swing.JLabel();
        jtfRepeticoes = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jtTabela = new javax.swing.JScrollPane();
        JtPlanodeTreino = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(831, 545));
        setMinimumSize(new java.awt.Dimension(831, 545));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PLANOS DE TREINO");

        jlnomePlano.setForeground(new java.awt.Color(0, 0, 0));
        jlnomePlano.setText("* Nome Plano :");

        jtfNomePlano.setToolTipText("Informe o nome completo.");
        jtfNomePlano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomePlanoKeyTyped(evt);
            }
        });

        jlSeries.setForeground(new java.awt.Color(0, 0, 0));
        jlSeries.setText("* Series:");

        jtfSeries.setToolTipText("Informe o nome completo.");
        jtfSeries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSeriesKeyTyped(evt);
            }
        });

        jlRepetiçoes.setForeground(new java.awt.Color(0, 0, 0));
        jlRepetiçoes.setText("* Repetiçoes:");

        jtfRepeticoes.setToolTipText("Informe o nome completo.");
        jtfRepeticoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRepeticoesKeyTyped(evt);
            }
        });

        jbSalvar.setMnemonic('S');
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbDeletar.setMnemonic('F');
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

        JtPlanodeTreino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome Plano", "Series", "Repetiçoes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtPlanodeTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtPlanodeTreinoMouseClicked(evt);
            }
        });
        jtTabela.setViewportView(JtPlanodeTreino);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlnomePlano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlRepetiçoes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jtTabela)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSeries)
                    .addComponent(jtfSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRepetiçoes)
                    .addComponent(jtfRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbDeletar)
                    .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jtTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomePlanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomePlanoKeyTyped
        // TODO add your handling code here:
        String nletras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (nletras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfNomePlanoKeyTyped

    private void jtfSeriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSeriesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSeriesKeyTyped

    private void jtfRepeticoesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRepeticoesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRepeticoesKeyTyped

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        PlanoServicos pServicos = FactoryServicos.getPlanoServicos();

        if (validaInput()) {
            int idPlano = 0;
            String nome = jtfNomePlano.getText();
            String series = jtfSeries.getText();
            String repeticoes = jtfRepeticoes.getText();
            Planodetreino p = new Planodetreino(idPlano, nome, series, PROPERTIES);

            if (jbSalvar.getText().equals("Confirmar")) {
                pServicos.cadPlano(p);
            } else {
                pServicos.cadPlano(p);
            }
            limparCampo();
            addRowToTable();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) JtPlanodeTreino.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        PlanoServicos pServicos = FactoryServicos.getPlanoServicos();
        for (Planodetreino c : pServicos.getPlanodetreinos()) {
            rowData[0] = c.getIdPlano();
            rowData[1] = c.getNomePlano();
            rowData[2] = c.getSeries();
            rowData[3] = c.getRepeticoes();
            model.addRow(rowData);

        }
    }


    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        int linha;        
        linha = JtPlanodeTreino.getSelectedRow();
        int idPlano = (int) JtPlanodeTreino.getValueAt(linha, 0);
        PlanoServicos pServicos = FactoryServicos.getPlanoServicos();
        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este Plano ?", "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);
        if (resposta == 0) {
            pServicos. deletarPlano(linha);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Cliente deletado com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
        jbDeletar.setEnabled(false);
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        if (jbFechar.getText().equals("Limpar")) {
            limparCampo();
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_jbFecharActionPerformed

    private void JtPlanodeTreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtPlanodeTreinoMouseClicked

        jbDeletar.setEnabled(true);
    }//GEN-LAST:event_JtPlanodeTreinoMouseClicked

    public boolean validaInput() {
        if (jtfNomePlano.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Nome Plano!");
            jtfNomePlano.requestFocus();
            return false;
        }

        if (jtfRepeticoes.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Preencher Repeticoes!");
            jtfRepeticoes.requestFocus();
            return false;

        } else if (jtfSeries.getText() == null) {
            JOptionPane.showMessageDialog(this, "Preencher Series: "
                    + "!");
            jtfSeries.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */

    public void limparCampo() {
        jbSalvar.setText("Salvar");
        jbFechar.setText("Fechar");
        jbDeletar.setEnabled(false);
        jtfNomePlano.setText("");
        jtfSeries.setText("");
        jtfRepeticoes.setText("");

    }

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
            java.util.logging.Logger.getLogger(jfPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPlano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtPlanodeTreino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlRepetiçoes;
    private javax.swing.JLabel jlSeries;
    private javax.swing.JLabel jlnomePlano;
    private javax.swing.JScrollPane jtTabela;
    private javax.swing.JTextField jtfNomePlano;
    private javax.swing.JTextField jtfRepeticoes;
    private javax.swing.JTextField jtfSeries;
    // End of variables declaration//GEN-END:variables

    

}
