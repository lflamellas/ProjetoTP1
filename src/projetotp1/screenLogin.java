package projetotp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

// Classe do componente da tela de login
public class screenLogin extends javax.swing.JFrame {

//  static Usuario user;
  public screenLogin() {
    initComponents();

    try {
      try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("users.txt", true))) {
        buffWrite.close();
      }
    } catch (IOException erro) {
      System.out.println(erro.getMessage());
      JOptionPane.showMessageDialog(null, "Não foi possível salvar os filmes favoritados!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
    }

    try {
      try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("movies.txt", true))) {
        buffWrite.close();
      }
    } catch (IOException erro) {
      System.out.println(erro.getMessage());
      JOptionPane.showMessageDialog(null, "Não foi possível salvar os filmes favoritados!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
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

        dashboard = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loginRegion = new javax.swing.JPanel();
        userText = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();
        passwordText = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        pictureIcon = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerMessage = new javax.swing.JLabel();
        registerButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 500));

        dashboard.setPreferredSize(new java.awt.Dimension(400, 500));
        dashboard.setSize(new java.awt.Dimension(400, 500));
        dashboard.setLayout(new java.awt.BorderLayout());

        title.setBackground(new java.awt.Color(1, 21, 38));
        title.setLayout(new java.awt.BorderLayout());

        logo.setBackground(new java.awt.Color(1, 21, 38));
        logo.setFont(new java.awt.Font("Monospaced", 1, 64)); // NOI18N
        logo.setForeground(new java.awt.Color(150, 179, 217));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("XILFTEN");
        logo.setPreferredSize(new java.awt.Dimension(400, 75));
        title.add(logo, java.awt.BorderLayout.CENTER);

        dashboard.add(title, java.awt.BorderLayout.PAGE_START);

        loginRegion.setBackground(new java.awt.Color(1, 21, 38));
        loginRegion.setForeground(new java.awt.Color(255, 255, 255));
        loginRegion.setPreferredSize(new java.awt.Dimension(400, 425));
        loginRegion.setSize(new java.awt.Dimension(400, 425));

        userText.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userText.setText("USERNAME");

        inputUser.setBackground(new java.awt.Color(1, 34, 53));
        inputUser.setFont(new java.awt.Font("Andale Mono", 0, 14)); // NOI18N
        inputUser.setForeground(new java.awt.Color(255, 255, 255));
        inputUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        inputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserActionPerformed(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordText.setText("PASSWORD");

        inputPassword.setBackground(new java.awt.Color(1, 34, 53));
        inputPassword.setForeground(new java.awt.Color(255, 255, 255));
        inputPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        inputPassword.setMinimumSize(new java.awt.Dimension(5, 21));
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        pictureIcon.setForeground(new java.awt.Color(255, 255, 255));
        pictureIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clapperboard (1).png"))); // NOI18N

        loginButton.setBackground(new java.awt.Color(150, 179, 217));
        loginButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(1, 21, 38));
        loginButton.setText("LOGIN");
        loginButton.setFocusPainted(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        registerMessage.setForeground(new java.awt.Color(255, 255, 255));
        registerMessage.setText("Not registered yet?");

        registerButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register now!");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginRegionLayout = new javax.swing.GroupLayout(loginRegion);
        loginRegion.setLayout(loginRegionLayout);
        loginRegionLayout.setHorizontalGroup(
            loginRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginRegionLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(loginRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginRegionLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(passwordText))
                    .addGroup(loginRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(pictureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginButton)
                        .addComponent(registerMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerButton)
                        .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginRegionLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(userText))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        loginRegionLayout.setVerticalGroup(
            loginRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginRegionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pictureIcon)
                .addGap(28, 28, 28)
                .addComponent(userText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addGap(36, 36, 36)
                .addComponent(registerMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton)
                .addGap(30, 30, 30))
        );

        dashboard.add(loginRegion, java.awt.BorderLayout.CENTER);

        getContentPane().add(dashboard, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_inputUserActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
      if (inputUser.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Campos em branco!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
      } else {
        String user = inputUser.getText();
        String password = Arrays.toString(inputPassword.getPassword());

        if (user.equals("admin") && password.equals("[1, 2, 3, 4, 5, 6]")) {
          this.setVisible(false);
          new screenAdminMenu().setVisible(true);
          return;
        }

        try (BufferedReader buffRead = new BufferedReader(new FileReader("users.txt"))) {
          String linha;
          boolean logou = false;
          String[] dados;

          while (true) {
            linha = buffRead.readLine();
            if (linha != null) {
              dados = linha.split(";");
              logou = dados[0].equals(user) && dados[2].equals(password) ? true : logou;
            } else {
              break;
            }
          }

          if (logou) {
            this.setVisible(false);
            new screenUserMenu().setVisible(true);

            try {
              try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("loggeduser.txt"))) {
                buffWrite.append(inputUser.getText() + "\n");
                buffWrite.close();
              }
            } catch (IOException erro) {
              System.out.println(erro.getMessage());
              JOptionPane.showMessageDialog(null, "Não foi possível salvar o usuário!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
            }

          } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
          }

          buffRead.close();
        } catch (IOException erro) {
          System.out.println(erro.getMessage());

          JOptionPane.showMessageDialog(null, "Por favor, tente novamente!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
        }
      }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
      new screenRegister().setVisible(true);
    }//GEN-LAST:event_registerButtonMouseClicked

  private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_inputPasswordActionPerformed

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
      java.util.logging.Logger.getLogger(screenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(screenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(screenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(screenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new screenLogin().setVisible(true);
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboard;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUser;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginRegion;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel pictureIcon;
    private javax.swing.JLabel registerButton;
    private javax.swing.JLabel registerMessage;
    private javax.swing.JPanel title;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
