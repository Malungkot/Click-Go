package com.mycompany.sistemamercado.View;

import com.mycompany.sistemamercado.Controller.UsuarioController;
import com.mycompany.sistemamercado.Model.*;
import com.mycompany.sistemamercado.View.CadastroAdmin;
import com.mycompany.sistemamercado.View.Funcionalidades.AlimentoView;
import com.mycompany.sistemamercado.View.Funcionalidades.BebidaView;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class dashAdmin extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public dashAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        preencherListaAdministradores();
        String usuarioLogado = Usuario.getUsuarioLogado().getUser();
        if (usuarioLogado.equals("adminC")) {
            jButtonRemoverAdmin.setEnabled(true);
            jButtonAdicionarADM.setEnabled(true);
        } else {
            jButtonRemoverAdmin.setEnabled(false);
            jButtonAdicionarADM.setEnabled(false);
        }
    }

    public List<Usuario> carregarAdministradores() throws IOException {
        BancoDeDados banco = new BancoDeDados();
        banco.leBDUser(BancoDeDados.getBancoUsuario()); // Carrega os usuários do banco
        return Usuario.getListaAdmin(); // Retorna a lista de administradores
    }

    public void preencherListaAdministradores() {
        try {
            List<Usuario> listaAdministradores = carregarAdministradores();

            // Criar um modelo para a JList
            DefaultListModel<Usuario> listModel = new DefaultListModel<>();

            // Adicionar todos os administradores à lista
            for (Usuario admin : listaAdministradores) {
                listModel.addElement(admin);
            }

            // Definir o modelo à jListAdmin
            jListAdmin.setModel(listModel);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar administradores: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBtnAlimentos = new javax.swing.JButton();
        jBtnBebidas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListAdmin = new javax.swing.JList<>();
        jButtonAdicionarADM = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonRemoverAdmin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(585, 600));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setText("Bem-vindo Administrador: " + Usuario.getUsuarioLogado().getNome());
        jScrollPane2.setViewportView(jLabel1);

        jLabel7.setText("Produtos:");

        jBtnAlimentos.setText("Acessar Area de Alimentos");
        jBtnAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlimentosActionPerformed(evt);
            }
        });

        jBtnBebidas.setText("Acessar Area de Bebidas");
        jBtnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBebidasActionPerformed(evt);
            }
        });

        jListAdmin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(jListAdmin);

        jButtonAdicionarADM.setText("Adicionar");
        jButtonAdicionarADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarADMActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista de Administradores:");

        jButtonRemoverAdmin.setText("Remover Admin");
        jButtonRemoverAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdicionarADM, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jButtonRemoverAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonAdicionarADM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverAdmin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlimentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnBebidas)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Admin: " + Usuario.getUsuarioLogado().getNome());
        jMenu1.setActionCommand("");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produtos");

        jMenuItem1.setText("Alimentos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Alimentos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenuLogout.setText("Logout");
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
        int resposta = JOptionPane.showConfirmDialog(this, "Você realmente deseja sair?",
                "Confirmação de Logout", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            Usuario.setUsuarioLogado(null); // Limpa a sessão do usuário logado
            JOptionPane.showMessageDialog(this, "Logout realizado com sucesso!");
            Login telaLogin = new Login();
            this.dispose();
            telaLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Logout cancelado.");
        }
    }//GEN-LAST:event_jMenuLogoutMouseClicked

    private void jButtonAdicionarADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarADMActionPerformed
        CadastroAdmin telaCadastroAdmin = new CadastroAdmin();
        this.dispose();
        telaCadastroAdmin.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarADMActionPerformed

    private void jBtnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBebidasActionPerformed
        // TODO add your handling code here:
        BebidaView viewBebidas = new BebidaView();
        this.dispose(); // Fecha a janela atual
        viewBebidas.setVisible(true);// Usa o método getInstance para obter a instância

    }//GEN-LAST:event_jBtnBebidasActionPerformed

    private void jBtnAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlimentosActionPerformed
        AlimentoView viewAlimentos = new AlimentoView();// Usa o método getInstance para obter a instância
        this.dispose(); // Fecha a janela atual
        viewAlimentos.setVisible(true); // Torna a nova janela visível
    }//GEN-LAST:event_jBtnAlimentosActionPerformed

    private void jButtonRemoverAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverAdminActionPerformed
        // TODO add your handling code here:
        try {
            // Obtém o índice do usuário selecionado na lista
            int selectedIndex = jListAdmin.getSelectedIndex();
            int adminC = 0;
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um usuario para deletar.");
            }

            // Obtém o usuário selecionado
            Usuario usuarioSelecionado = Usuario.getListaAdmin().get(selectedIndex);
            for (Usuario aux : Usuario.getListaAdmin()) {
                if ("adminC".equals(aux.getUser())) {
                    adminC++;
                }
            }
            if (adminC == 1 && usuarioSelecionado.getUser().equals("adminC")) {
                JOptionPane.showMessageDialog(null, "Eh preciso ter ao menos um administrador Chefe");
            } else if (Usuario.getUsuarioLogado().equals(usuarioSelecionado)) {
                JOptionPane.showMessageDialog(null, "Nao eh possivel se auto deletar");
            } else{
            int resposta = JOptionPane.showConfirmDialog(null,
                    "Tem certeza que deseja deletar a conta: " + usuarioSelecionado.getNome() + "?",
                    "Confirmar Exclusao", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                // Remove o usuário selecionado da lista de usuários
                UsuarioController.removeADM(usuarioSelecionado);
                JOptionPane.showMessageDialog(null, "Conta de " + usuarioSelecionado.getNome() + " deletada com sucesso.");
                preencherListaAdministradores(); // Atualiza a lista de administradores, se necessário
            }
        }
    }
    catch (IOException e

    
        ) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar a conta: " + e.getMessage());
    }


    }//GEN-LAST:event_jButtonRemoverAdminActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AlimentoView viewAlimentos = new AlimentoView();// Usa o método getInstance para obter a instância
        this.dispose(); // Fecha a janela atual
        viewAlimentos.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        BebidaView view = new BebidaView();// Usa o método getInstance para obter a instância
        this.dispose(); // Fecha a janela atual
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
        java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(dashAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new dashAdmin().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlimentos;
    private javax.swing.JButton jBtnBebidas;
    private javax.swing.JButton jButtonAdicionarADM;
    private javax.swing.JButton jButtonRemoverAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<Usuario> jListAdmin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
