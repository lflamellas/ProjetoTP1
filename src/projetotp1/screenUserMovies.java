package projetotp1;

import classes.Filme;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// Classe do componente de administração de filmes do admin
public class screenUserMovies extends javax.swing.JFrame {

  // Array de filmes
  static ArrayList<Filme> listaDeFilmes;

  public screenUserMovies() {
    initComponents();

    listaDeFilmes = new ArrayList();

    commentButton.setEnabled(false);
    favoriteButton.setEnabled(false);

    pegarFilmesDoArquivo();
    carregarTabelaFilmes();
  }

  // Método responsável por carregar a tabela de filmes
  private void carregarTabelaFilmes() {
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Movie Title", "Genre", "Launch Date", "Rating"}, 0);

    for (int i = 0; i < listaDeFilmes.size(); i++) {
      Object linha[] = new Object[]{
        listaDeFilmes.get(i).getTitulo(),
        listaDeFilmes.get(i).getGenero(),
        listaDeFilmes.get(i).getAnoDeLancamento(),
        listaDeFilmes.get(i).getRating()
      };
      modelo.addRow(linha);
    }

    moviesTable.setModel(modelo);
  }

  // Método responsável por coletar os filmes do arquivo
  public static void pegarFilmesDoArquivo() {
    try (BufferedReader buffRead = new BufferedReader(new FileReader("movies.txt"))) {
      String linha;
      String[] dados;

      String title;
      String genre;
      int launchDate;
      int rating;

      while (true) {
        linha = buffRead.readLine();
        if (linha != null) {
          dados = linha.split(";");
          title = dados[0];
          genre = dados[1];
          launchDate = Integer.parseInt(dados[2]);
          rating = Integer.parseInt(dados[3]);

          Filme filme = new Filme(title, genre, launchDate, rating);

          listaDeFilmes.add(filme);
        } else {
          break;
        }
      }

      buffRead.close();

    } catch (IOException erro) {
      System.out.println(erro.getMessage());

      JOptionPane.showMessageDialog(null, "Não foi possível obter informações dos filmes!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
    }
  }

  // Método responsável por deletar o arquivo
  public static void apagarArquivo() throws IOException {
    File arquivo = new File("movies.txt");

    arquivo.delete();
  }

  // Método responsável por regravar o arquivo com os dados modificados
  public static void regravarArquivo() throws IOException {
    String title;
    String genre;
    int launchDate;
    int rating;

    apagarArquivo();

    for (int i = 0; i < listaDeFilmes.size(); i++) {
      Filme filme = listaDeFilmes.get(i);
      title = filme.getTitulo();
      genre = filme.getGenero();
      launchDate = filme.getAnoDeLancamento();
      rating = filme.getRating();

      try {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("movies.txt", true))) {
          buffWrite.append(title + ";" + genre + ";" + launchDate + ";" + rating + "\n");
          buffWrite.close();
        }
      } catch (IOException erro) {
        System.out.println(erro.getMessage());
        JOptionPane.showMessageDialog(null, "Não foi possível salvar os filmes!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
      }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        favoriteButton = new javax.swing.JButton();
        commentButton = new javax.swing.JButton();
        commentLabel = new javax.swing.JLabel();
        userRatingLabel = new javax.swing.JLabel();
        pageIcon = new javax.swing.JLabel();
        inputUserRating = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputComment = new javax.swing.JTextPane();
        menu = new javax.swing.JPanel();
        leftRegion = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        rightRegion = new javax.swing.JPanel();
        exitIcon1 = new javax.swing.JLabel();

        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        dashboard.setBackground(new java.awt.Color(1, 21, 38));
        dashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(150, 179, 217), null), "MOVIES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambay Devanagari", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        dashboard.setPreferredSize(new java.awt.Dimension(800, 425));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        moviesTable.setBackground(new java.awt.Color(1, 21, 38));
        moviesTable.setForeground(new java.awt.Color(255, 255, 255));
        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Inception", "Sci-fi", "2010", "10"},
                {"Matrix", "Sci-fi", "1999", "10"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MOVIE TITLE", "GENRE", "LAUNCH DATE", "RATING"
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
        moviesTable.setGridColor(new java.awt.Color(1, 21, 38));
        moviesTable.setPreferredSize(new java.awt.Dimension(225, 640));
        moviesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(moviesTable);
        moviesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (moviesTable.getColumnModel().getColumnCount() > 0) {
            moviesTable.getColumnModel().getColumn(0).setResizable(false);
            moviesTable.getColumnModel().getColumn(1).setResizable(false);
            moviesTable.getColumnModel().getColumn(2).setResizable(false);
        }

        favoriteButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        favoriteButton.setForeground(new java.awt.Color(255, 255, 255));
        favoriteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star (5).png"))); // NOI18N
        favoriteButton.setText("FAVORITE");
        favoriteButton.setContentAreaFilled(false);
        favoriteButton.setFocusPainted(false);
        favoriteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        favoriteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        favoriteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoriteButtonMouseClicked(evt);
            }
        });
        favoriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoriteButtonActionPerformed(evt);
            }
        });

        commentButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        commentButton.setForeground(new java.awt.Color(255, 255, 255));
        commentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/speech-bubble.png"))); // NOI18N
        commentButton.setText("COMMENT");
        commentButton.setContentAreaFilled(false);
        commentButton.setFocusTraversalKeysEnabled(false);
        commentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        commentButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        commentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentButtonMouseClicked(evt);
            }
        });
        commentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentButtonActionPerformed(evt);
            }
        });

        commentLabel.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        commentLabel.setForeground(new java.awt.Color(255, 255, 255));
        commentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        commentLabel.setText("COMMENT");

        userRatingLabel.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        userRatingLabel.setForeground(new java.awt.Color(255, 255, 255));
        userRatingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userRatingLabel.setText("USER RATING");

        pageIcon.setForeground(new java.awt.Color(255, 255, 255));
        pageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/film-reel (1).png"))); // NOI18N

        inputUserRating.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jScrollPane2.setViewportView(inputComment);

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(commentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(favoriteButton)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userRatingLabel)
                            .addComponent(inputUserRating, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(pageIcon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboardLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {commentButton, favoriteButton});

        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userRatingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUserRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commentButton)
                    .addComponent(favoriteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(dashboard, java.awt.BorderLayout.CENTER);

        menu.setBackground(new java.awt.Color(1, 21, 38));
        menu.setPreferredSize(new java.awt.Dimension(800, 50));
        menu.setLayout(new java.awt.BorderLayout());

        leftRegion.setBackground(new java.awt.Color(1, 21, 38));
        leftRegion.setPreferredSize(new java.awt.Dimension(50, 50));

        backIcon.setForeground(new java.awt.Color(255, 255, 255));
        backIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(leftRegion, java.awt.BorderLayout.LINE_START);

        rightRegion.setBackground(new java.awt.Color(1, 21, 38));
        rightRegion.setPreferredSize(new java.awt.Dimension(50, 50));

        exitIcon1.setForeground(new java.awt.Color(255, 255, 255));
        exitIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightRegionLayout.setVerticalGroup(
            rightRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightRegionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(exitIcon1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.add(rightRegion, java.awt.BorderLayout.LINE_END);

        getContentPane().add(menu, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
      // TODO add your handling code here:
      this.setVisible(false);
      new screenUserMenu().setVisible(true);
    }//GEN-LAST:event_backIconMouseClicked

    private void exitIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIcon1MouseClicked
      // TODO add your handling code here:
      this.setVisible(false);
      new screenLogin().setVisible(true);
    }//GEN-LAST:event_exitIcon1MouseClicked

    private void commentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentButtonActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_commentButtonActionPerformed

  private void commentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentButtonMouseClicked
    // TODO add your handling code here:
    
  }//GEN-LAST:event_commentButtonMouseClicked

  private void moviesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesTableMouseClicked
    favoriteButton.setEnabled(true);
    commentButton.setEnabled(true);
  }//GEN-LAST:event_moviesTableMouseClicked

    private void favoriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoriteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoriteButtonActionPerformed

    private void favoriteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoriteButtonMouseClicked
        
    }//GEN-LAST:event_favoriteButtonMouseClicked

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
      java.util.logging.Logger.getLogger(screenUserMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(screenUserMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(screenUserMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(screenUserMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new screenUserMovies().setVisible(true);
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JButton commentButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel exitIcon1;
    private javax.swing.JButton favoriteButton;
    private javax.swing.JTextPane inputComment;
    private javax.swing.JSpinner inputUserRating;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leftRegion;
    private javax.swing.JPanel menu;
    private javax.swing.JTable moviesTable;
    private javax.swing.JLabel pageIcon;
    private javax.swing.JPanel rightRegion;
    private javax.swing.JLabel userRatingLabel;
    // End of variables declaration//GEN-END:variables
}