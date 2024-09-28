package com.mycompany.sistemamercado.View;

import com.mycompany.sistemamercado.Controller.UsuarioController;
import com.mycompany.sistemamercado.Excecoes.*;
import com.mycompany.sistemamercado.Model.*;
import com.toedter.calendar.JDateChooser;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class CadastroAdmin extends javax.swing.JFrame {

    private JDateChooser dateChooser = new JDateChooser();

    public CadastroAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                dispose();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        buttonCriarConta = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        txt_cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLICK & GO");

        jLabel1.setText("Nome:");

        jLabel2.setText("Email:");

        jLabel3.setText("Data de Nascimento: ");

        jLabel4.setText("Senha:");

        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });

        buttonCriarConta.setText("Criar Conta");
        buttonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarContaActionPerformed(evt);
            }
        });

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, -15);
        cal.add(Calendar.DAY_OF_MONTH, -2);
        jCalendar1.setMaxSelectableDate(cal.getTime());
        jCalendar1.setDate(cal.getTime());
        jCalendar1.setMinSelectableDate(new java.util.Date(-2208973893000L));

        txt_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpfActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        jCheckBoxAdmin.setText("Definir como ADM chefe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(txt_email)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cpf)
                            .addComponent(txt_senha)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCheckBoxAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCriarConta))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    private void buttonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarContaActionPerformed
        // TODO add your handling code here:
        Date selectedDate = this.jCalendar1.getDate();
        String formattedDate = (selectedDate != null) ? new SimpleDateFormat("dd/MM/yyyy").format(selectedDate) : "";
        try {
            Email.validarEmail(txt_email.getText().trim());
            Email email = new Email(txt_email.getText());
            CPF.validarCPF(txt_cpf.getText().trim());
            CPF cpf = new CPF(txt_cpf.getText());
            boolean adminC = jCheckBoxAdmin.isSelected();
            if (adminC) {
                String admin = "adminC";
                Usuario.validaCadastroVazio(txt_nome.getText().trim(), txt_senha.getText().trim());
                Usuario clienteCadastro = new Usuario(email, txt_nome.getText().trim(), txt_senha.getText().trim(), formattedDate, admin, cpf);
                UsuarioController.CadastroUsuario(clienteCadastro);
            } else {
                String admin = "admin";
                Usuario.validaCadastroVazio(txt_nome.getText().trim(), txt_senha.getText().trim());
                Usuario clienteCadastro = new Usuario(email, txt_nome.getText().trim(), txt_senha.getText().trim(), formattedDate, admin, cpf);
                UsuarioController.CadastroUsuario(clienteCadastro);
            }

            JOptionPane.showMessageDialog(null, "Admin cadastrado com sucesso!!");
            dashAdmin DashAdmin = new dashAdmin();
            this.dispose();
            DashAdmin.setVisible(true);

        } catch (EmailInvalido e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (CampoVazio e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (EmailJaCadastrado e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(CadastroAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CpfEmUso ex) {
            Logger.getLogger(CadastroAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCriarContaActionPerformed

    private void txt_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpfActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAdmin().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCriarConta;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBoxAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables

}
