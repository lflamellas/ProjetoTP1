/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotp1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author lflamellas
 */
public class screenRegister extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public screenRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    dashboard = new javax.swing.JPanel();
    confirmPasswordText = new javax.swing.JLabel();
    passwordText = new javax.swing.JLabel();
    loginButton = new javax.swing.JButton();
    pictureIcon = new javax.swing.JLabel();
    inputUser = new javax.swing.JTextField();
    userText = new javax.swing.JLabel();
    inputEmail = new javax.swing.JTextField();
    emailText = new javax.swing.JLabel();
    inputConfirmPassword = new javax.swing.JPasswordField();
    inputPassword = new javax.swing.JPasswordField();

    setSize(new java.awt.Dimension(800, 500));

    dashboard.setBackground(new java.awt.Color(47, 54, 89));
    dashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null), "CREATE ACCOUNT", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
    dashboard.setPreferredSize(new java.awt.Dimension(800, 500));
    dashboard.setLayout(null);

    confirmPasswordText.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
    confirmPasswordText.setForeground(new java.awt.Color(255, 255, 255));
    confirmPasswordText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    confirmPasswordText.setText("CONFIRM PASSWORD ");
    dashboard.add(confirmPasswordText);
    confirmPasswordText.setBounds(0, 310, 190, 30);

    passwordText.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
    passwordText.setForeground(new java.awt.Color(255, 255, 255));
    passwordText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    passwordText.setText("PASSWORD ");
    dashboard.add(passwordText);
    passwordText.setBounds(90, 290, 100, 20);

    loginButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
    loginButton.setText("REGISTER");
    loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        loginButtonMouseClicked(evt);
      }
    });
    dashboard.add(loginButton);
    loginButton.setBounds(220, 350, 120, 27);

    pictureIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pictureIcon.setText("ICON");
    pictureIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
    dashboard.add(pictureIcon);
    pictureIcon.setBounds(190, 60, 128, 128);

    inputUser.setBackground(new java.awt.Color(153, 153, 255));
    inputUser.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
    inputUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    inputUser.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputUserActionPerformed(evt);
      }
    });
    dashboard.add(inputUser);
    inputUser.setBounds(190, 230, 170, 20);

    userText.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
    userText.setForeground(new java.awt.Color(255, 255, 255));
    userText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    userText.setText("USER ");
    dashboard.add(userText);
    userText.setBounds(110, 230, 80, 20);

    inputEmail.setBackground(new java.awt.Color(153, 153, 255));
    inputEmail.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
    inputEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    inputEmail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        inputEmailActionPerformed(evt);
      }
    });
    dashboard.add(inputEmail);
    inputEmail.setBounds(190, 260, 170, 20);

    emailText.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
    emailText.setForeground(new java.awt.Color(255, 255, 255));
    emailText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    emailText.setText("EMAIL");
    dashboard.add(emailText);
    emailText.setBounds(110, 260, 80, 20);

    inputConfirmPassword.setBackground(new java.awt.Color(153, 153, 255));
    dashboard.add(inputConfirmPassword);
    inputConfirmPassword.setBounds(190, 320, 170, 20);

    inputPassword.setBackground(new java.awt.Color(153, 153, 255));
    dashboard.add(inputPassword);
    inputPassword.setBounds(190, 290, 170, 20);

    getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        if (inputEmail.getText().equals("") || inputUser.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else if (inputPassword.getPassword().length < 6) {
          JOptionPane.showMessageDialog(null, "A senha deverá ter no mínimo 6 caracteres!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else if (!Arrays.toString(inputPassword.getPassword()).equals(Arrays.toString(inputConfirmPassword.getPassword()))) {
          JOptionPane.showMessageDialog(null, "As senhas devem coincidir!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
          String user = inputUser.getText();
          String email = inputEmail.getText();
          String senha = Arrays.toString(inputPassword.getPassword());
          
          try {
            try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("users.txt", true))) {
              buffWrite.append(user + ";" + email + ";" + senha + "\n");
              buffWrite.close();
            }
          } catch (IOException erro) {
            System.out.println(erro.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
          }
          
          JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void inputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUserActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

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
            java.util.logging.Logger.getLogger(screenRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screenRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screenRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screenRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screenRegister().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel confirmPasswordText;
  private javax.swing.JPanel dashboard;
  private javax.swing.JLabel emailText;
  private javax.swing.JPasswordField inputConfirmPassword;
  private javax.swing.JTextField inputEmail;
  private javax.swing.JPasswordField inputPassword;
  private javax.swing.JTextField inputUser;
  private javax.swing.JButton loginButton;
  private javax.swing.JLabel passwordText;
  private javax.swing.JLabel pictureIcon;
  private javax.swing.JLabel userText;
  // End of variables declaration//GEN-END:variables
}
