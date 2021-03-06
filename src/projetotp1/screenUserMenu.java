package projetotp1;

// Classe do componente de menu do usuário
public class screenUserMenu extends javax.swing.JFrame {

  public screenUserMenu() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        moviesButton = new javax.swing.JLabel();
        favoritesButton = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        leftRegion = new javax.swing.JPanel();
        rightRegion = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        dashboard.setBackground(new java.awt.Color(1, 21, 38));
        dashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(150, 179, 217), null), "USER MENU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambay Devanagari", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        dashboard.setLayout(new java.awt.GridLayout(1, 0));

        moviesButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 18)); // NOI18N
        moviesButton.setForeground(new java.awt.Color(255, 255, 255));
        moviesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moviesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/film-reel (1).png"))); // NOI18N
        moviesButton.setText("MOVIES");
        moviesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moviesButton.setIconTextGap(25);
        moviesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        moviesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesButtonMouseClicked(evt);
            }
        });
        dashboard.add(moviesButton);

        favoritesButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 18)); // NOI18N
        favoritesButton.setForeground(new java.awt.Color(255, 255, 255));
        favoritesButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        favoritesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star (3).png"))); // NOI18N
        favoritesButton.setText("FAVORITES");
        favoritesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        favoritesButton.setIconTextGap(25);
        favoritesButton.setPreferredSize(null);
        favoritesButton.setSize(new java.awt.Dimension(800, 500));
        favoritesButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        favoritesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritesButtonMouseClicked(evt);
            }
        });
        dashboard.add(favoritesButton);

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        menu.setBackground(new java.awt.Color(1, 21, 38));
        menu.setPreferredSize(new java.awt.Dimension(800, 50));
        menu.setLayout(new java.awt.BorderLayout());

        leftRegion.setBackground(new java.awt.Color(1, 21, 38));
        leftRegion.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout leftRegionLayout = new javax.swing.GroupLayout(leftRegion);
        leftRegion.setLayout(leftRegionLayout);
        leftRegionLayout.setHorizontalGroup(
            leftRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        leftRegionLayout.setVerticalGroup(
            leftRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        menu.add(leftRegion, java.awt.BorderLayout.LINE_START);

        rightRegion.setBackground(new java.awt.Color(1, 21, 38));
        rightRegion.setPreferredSize(new java.awt.Dimension(100, 50));

        exitButton.setBackground(new java.awt.Color(1, 21, 38));
        exitButton.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        exitButton.setForeground(new java.awt.Color(150, 179, 217));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightRegionLayout = new javax.swing.GroupLayout(rightRegion);
        rightRegion.setLayout(rightRegionLayout);
        rightRegionLayout.setHorizontalGroup(
            rightRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightRegionLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );
        rightRegionLayout.setVerticalGroup(
            rightRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightRegionLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(exitButton))
        );

        menu.add(rightRegion, java.awt.BorderLayout.LINE_END);

        getContentPane().add(menu, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void favoritesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritesButtonMouseClicked
      this.setVisible(false);
      new screenUserFavorites().setVisible(true);
    }//GEN-LAST:event_favoritesButtonMouseClicked

    private void moviesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesButtonMouseClicked
      this.setVisible(false);
      new screenUserMovies().setVisible(true);
    }//GEN-LAST:event_moviesButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
      // TODO add your handling code here:
      this.setVisible(false);
      new screenLogin().setVisible(true);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

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
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(screenUserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    //</editor-fold>
    java.awt.EventQueue.invokeLater(() -> {
      new screenUserMenu().setVisible(true);
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel favoritesButton;
    private javax.swing.JPanel leftRegion;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel moviesButton;
    private javax.swing.JPanel rightRegion;
    // End of variables declaration//GEN-END:variables
}
