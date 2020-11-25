/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotp1;

/**
 *
 * @author lflamellas
 */
public class screenAdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form screenAdminMenu
     */
    public screenAdminMenu() {
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
        moviesManagementButton = new javax.swing.JLabel();
        usersManagementButton = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        leftRegion = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        rightRegion = new javax.swing.JPanel();
        exitIcon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard.setBackground(new java.awt.Color(39, 40, 64));
        dashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null), "ADMIN MENU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        dashboard.setLayout(null);

        moviesManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        moviesManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moviesManagementButton.setText("MOVIES MANAGEMENT");
        moviesManagementButton.setSize(new java.awt.Dimension(256, 256));
        moviesManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesManagementButtonMouseClicked(evt);
            }
        });
        dashboard.add(moviesManagementButton);
        moviesManagementButton.setBounds(420, 60, 256, 256);

        usersManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        usersManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersManagementButton.setText("USER MANAGEMENT");
        usersManagementButton.setSize(new java.awt.Dimension(256, 256));
        usersManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersManagementButtonMouseClicked(evt);
            }
        });
        dashboard.add(usersManagementButton);
        usersManagementButton.setBounds(100, 60, 256, 256);

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        menu.setBackground(new java.awt.Color(39, 40, 64));
        menu.setPreferredSize(new java.awt.Dimension(800, 50));
        menu.setLayout(new java.awt.BorderLayout());

        leftRegion.setBackground(new java.awt.Color(39, 40, 64));
        leftRegion.setPreferredSize(new java.awt.Dimension(50, 50));

        backIcon.setForeground(new java.awt.Color(255, 255, 255));
        backIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backIcon.setText("ICON");

        javax.swing.GroupLayout leftRegionLayout = new javax.swing.GroupLayout(leftRegion);
        leftRegion.setLayout(leftRegionLayout);
        leftRegionLayout.setHorizontalGroup(
            leftRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftRegionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftRegionLayout.setVerticalGroup(
            leftRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftRegionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backIcon)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        menu.add(leftRegion, java.awt.BorderLayout.LINE_START);

        rightRegion.setBackground(new java.awt.Color(39, 40, 64));
        rightRegion.setPreferredSize(new java.awt.Dimension(50, 50));

        exitIcon1.setForeground(new java.awt.Color(255, 255, 255));
        exitIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitIcon1.setText("ICON");
        exitIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIcon1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightRegionLayout = new javax.swing.GroupLayout(rightRegion);
        rightRegion.setLayout(rightRegionLayout);
        rightRegionLayout.setHorizontalGroup(
            rightRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightRegionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitIcon1)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        rightRegionLayout.setVerticalGroup(
            rightRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightRegionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(exitIcon1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        menu.add(rightRegion, java.awt.BorderLayout.LINE_END);

        getContentPane().add(menu, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIcon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitIcon1MouseClicked

    private void moviesManagementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesManagementButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_moviesManagementButtonMouseClicked

    private void usersManagementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersManagementButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usersManagementButtonMouseClicked

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
            java.util.logging.Logger.getLogger(screenAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screenAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screenAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screenAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screenAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel exitIcon1;
    private javax.swing.JPanel leftRegion;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel moviesManagementButton;
    private javax.swing.JPanel rightRegion;
    private javax.swing.JLabel usersManagementButton;
    // End of variables declaration//GEN-END:variables
}
