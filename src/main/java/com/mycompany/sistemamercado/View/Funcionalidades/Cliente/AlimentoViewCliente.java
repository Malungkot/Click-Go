package com.mycompany.sistemamercado.View.Funcionalidades.Cliente;

import com.mycompany.sistemamercado.Model.Alimento;
import com.mycompany.sistemamercado.Model.BancoDeDados;
import com.mycompany.sistemamercado.Model.BebidaSemAlcool;
import com.mycompany.sistemamercado.Model.ComValor;
import com.mycompany.sistemamercado.Model.ListaCompra;
import static com.mycompany.sistemamercado.Model.ListaCompra.adicionarPedido;
import static com.mycompany.sistemamercado.Model.ListaCompra.removerPedido;
import com.mycompany.sistemamercado.Model.Usuario;
import com.mycompany.sistemamercado.View.Login;
import com.mycompany.sistemamercado.View.dashCliente;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * @aluno: Augusto Benedito Carvalho da Silva
 * @Matricula: 202265552C
 */

public class AlimentoViewCliente extends javax.swing.JFrame {

    /**
     * Creates new form AlimentoViewCliente
     */
    private DefaultListModel<ComValor> listModel;

    public AlimentoViewCliente() {
        this.listModel = new DefaultListModel<>();
        initComponents();
        setLocationRelativeTo(null);
        preencherJList();
        try {

            BancoDeDados.leBDAlimento(BancoDeDados.getBancoAlimento());
            DefaultListModel<Alimento> alimento = new DefaultListModel<>();
            jListAlimentos.setModel(alimento);
            for (Alimento food : Alimento.getListaAlimento()) {
                alimento.addElement(food);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"erro");
        }
    }

    private void preencherJList() {
        listModel.clear(); // Limpa o modelo
        for (ComValor item : ListaCompra.getListaCompra()) {
            listModel.addElement(item); // Adiciona elementos ao modelo
        }
        jList1.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAlimentos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jBtnRemover = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVoltar = new javax.swing.JMenu();
        jMenuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setRequestFocusEnabled(false);

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jListAlimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListAlimentos.setToolTipText("");
        jListAlimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAlimentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListAlimentos);

        jLabel1.setText("Alimentos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionar)
                .addContainerGap())
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(178, 414));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(262, 134));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList1);

        jLabel2.setText("Lista de Compras:");

        jBtnRemover.setText("Remover da Lista");
        jBtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jBtnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnRemover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton1.setText("Voltar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jMenuVoltar.setText("Voltar");
        jMenuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVoltarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuVoltar);

        jMenuLogout.setText("Logout");
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
        });
        jMenuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogoutActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLogoutActionPerformed

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
        int resposta = JOptionPane.showConfirmDialog(this, "Você realmente deseja sair?",
                "Confirmação de Logout", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.setUsuarioLogado(null); // Limpa a sessão do usuário logado
            JOptionPane.showMessageDialog(this, "Logout realizado com sucesso!");
            ListaCompra.clear();
            Login telaLogin = new Login();
            this.dispose();
            telaLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Logout cancelado.");
        }
    }//GEN-LAST:event_jMenuLogoutMouseClicked

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jListAlimentos.getSelectedIndex();

        if (selectedIndex != -1) { // Verifica se algum alimento foi selecionado
            Alimento alimentoSelecionado = jListAlimentos.getModel().getElementAt(selectedIndex); // Obtém o alimento selecionado
            adicionarPedido(alimentoSelecionado);
            preencherJList();
        }
        else{
            JOptionPane.showMessageDialog(null,"selecione um alimento valido");
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jListAlimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAlimentosMouseClicked

    }//GEN-LAST:event_jListAlimentosMouseClicked

    private void jMenuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVoltarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        dashCliente view = new dashCliente();
        view.setVisible(true);
    }//GEN-LAST:event_jMenuVoltarMouseClicked

    private void jBtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverActionPerformed
        // TODO add your handling code here:
        try {
            BebidaSemAlcool bebidaBanco = null;
            BancoDeDados.leBDAlimento(BancoDeDados.getBancoAlimento());

            // Pega o alimento que foi selecionado
            int selectedIndex = jListAlimentos.getSelectedIndex(); // Obtém o índice do item selecionado
            if (selectedIndex != -1) { // Verifica se algum item foi selecionado
                bebidaBanco = BebidaSemAlcool.getListaBebidasSemAlcool().get(selectedIndex);
                removerPedido(bebidaBanco);
                preencherJList();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma bebida para tirar da Lista.");
                return; // Sai do método se nenhum alimento for selecionado
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tirar a bebida da Lista");
        }

    }//GEN-LAST:event_jBtnRemoverActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        dashCliente view = new dashCliente();
        view.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AlimentoViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlimentoViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlimentoViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlimentoViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlimentoViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBtnRemover;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<ComValor> jList1;
    private javax.swing.JList<Alimento> jListAlimentos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JMenu jMenuVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}
