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
public class screenAdminMovieManagement extends javax.swing.JFrame {

    /**
     * Creates new form screenAdminMenu
     */
    public screenAdminMovieManagement() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        movieTitleLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        launchDateLabel = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        inputMovieTitle = new javax.swing.JTextField();
        pageIcon = new javax.swing.JLabel();
        inputGenre = new javax.swing.JSpinner();
        inputLaunchDate = new javax.swing.JSpinner();
        inputRating = new javax.swing.JSpinner();
        menu = new javax.swing.JPanel();
        leftRegion = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        rightRegion = new javax.swing.JPanel();
        exitIcon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard.setBackground(new java.awt.Color(39, 40, 64));
        dashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null), "MOVIES MANAGEMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Inception", "Sci-fi", "2010", "10"},
                {"Matrix", "Sci-fi", "1999", "10"},
                {null, null, null, ""},
                {null, null, null, null}
            },
            new String [] {
                "Movie Title", "Genre", "Launch Date", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        moviesTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(moviesTable);
        moviesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (moviesTable.getColumnModel().getColumnCount() > 0) {
            moviesTable.getColumnModel().getColumn(0).setResizable(false);
            moviesTable.getColumnModel().getColumn(1).setResizable(false);
            moviesTable.getColumnModel().getColumn(2).setResizable(false);
        }

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        movieTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        movieTitleLabel.setText("Movie Title");

        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genreLabel.setText("Genre");

        launchDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        launchDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        launchDateLabel.setText("Launch Year");

        ratingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ratingLabel.setText("Rating");

        pageIcon.setForeground(new java.awt.Color(255, 255, 255));
        pageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageIcon.setText("ICON");
        pageIcon.setPreferredSize(new java.awt.Dimension(128, 128));

        inputGenre.setModel(new javax.swing.SpinnerListModel(new String[] {"Action", "Adventure", "Sci-fi", "Drama", "Terror", "Comedy"}));

        inputLaunchDate.setModel(new javax.swing.SpinnerNumberModel(Long.valueOf(1980L), Long.valueOf(1980L), Long.valueOf(2020L), Long.valueOf(1L)));

        inputRating.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(pageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(movieTitleLabel)
                            .addComponent(genreLabel)
                            .addComponent(launchDateLabel)
                            .addComponent(ratingLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputMovieTitle)
                            .addComponent(inputLaunchDate)
                            .addComponent(inputRating)
                            .addComponent(inputGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(pageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(movieTitleLabel)
                            .addComponent(inputMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreLabel)
                            .addComponent(inputGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(launchDateLabel)
                            .addComponent(inputLaunchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ratingLabel)
                            .addComponent(inputRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        menu.setBackground(new java.awt.Color(39, 40, 64));
        menu.setPreferredSize(new java.awt.Dimension(800, 50));
        menu.setLayout(new java.awt.BorderLayout());

        leftRegion.setBackground(new java.awt.Color(39, 40, 64));
        leftRegion.setPreferredSize(new java.awt.Dimension(50, 50));

        backIcon.setForeground(new java.awt.Color(255, 255, 255));
        backIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backIcon.setText("ICON");
        backIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconMouseClicked(evt);
            }
        });

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

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backIconMouseClicked

    private void exitIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIcon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitIcon1MouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(screenAdminMovieManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screenAdminMovieManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screenAdminMovieManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screenAdminMovieManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screenAdminMovieManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel backIcon;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel exitIcon1;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JSpinner inputGenre;
    private javax.swing.JSpinner inputLaunchDate;
    private javax.swing.JTextField inputMovieTitle;
    private javax.swing.JSpinner inputRating;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel launchDateLabel;
    private javax.swing.JPanel leftRegion;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel movieTitleLabel;
    private javax.swing.JTable moviesTable;
    private javax.swing.JLabel pageIcon;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JPanel rightRegion;
    // End of variables declaration//GEN-END:variables
}
