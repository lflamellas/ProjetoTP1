package projetotp1;

import classes.Filme;
import classes.UsersFavoriteMovies;
import classes.Usuario;
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
public class screenUserFavorites extends javax.swing.JFrame {

  // Array de filmes
  static ArrayList<UsersFavoriteMovies> listaDeFilmesFavoritados;
  static ArrayList<UsersFavoriteMovies> listaDeFilmesFavoritadosCompleta;
  // Usuário
  static String username;

  public screenUserFavorites() {
    initComponents();

    listaDeFilmesFavoritados = new ArrayList();
    listaDeFilmesFavoritadosCompleta = new ArrayList();

    removeButton.setEnabled(false);
    
    pegarNomeDoUsuarioLogado();
    pegarFilmesFavoritadosDoArquivo();
    carregarTabelaFilmesFavoritados();
  }
  
  private void pegarNomeDoUsuarioLogado() {
    try (BufferedReader buffRead = new BufferedReader(new FileReader("loggeduser.txt"))) {
      String linha = buffRead.readLine();
      username = linha;
    } catch (IOException erro) {
      System.out.println(erro.getMessage());

      JOptionPane.showMessageDialog(null, "Não foi possível obter informações dos filmes favoritados!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
    }
  }

  // Método responsável por carregar a tabela de filmes favoritados
  private void carregarTabelaFilmesFavoritados() {
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Movie Title", "Genre", "Launch Date", "Rating"}, 0);

    for (int i = 0; i < listaDeFilmesFavoritados.size(); i++) {
      Object linha[] = new Object[]{
        listaDeFilmesFavoritados.get(i).getFilme().getTitulo(),
        listaDeFilmesFavoritados.get(i).getFilme().getGenero(),
        listaDeFilmesFavoritados.get(i).getFilme().getAnoDeLancamento(),
        listaDeFilmesFavoritados.get(i).getFilme().getRating()
      };
      modelo.addRow(linha);
    }

    moviesTable.setModel(modelo);
  }

  // Método responsável por coletar os filmes favoritados do arquivo
  public static void pegarFilmesFavoritadosDoArquivo() {
    try (BufferedReader buffRead = new BufferedReader(new FileReader("usersfavoritemovies.txt"))) {
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
          title = dados[1];
          genre = dados[2];
          launchDate = Integer.parseInt(dados[3]);
          rating = Integer.parseInt(dados[4]);
          
          if (dados[0].equals(username)) {
            Filme filme = new Filme(title, genre, launchDate, rating);
          
            UsersFavoriteMovies filmeFavorito = new UsersFavoriteMovies(username, filme);

            listaDeFilmesFavoritados.add(filmeFavorito);
          } else {
            Filme filme = new Filme(title, genre, launchDate, rating);
            
            UsersFavoriteMovies filmeFavoritoDeOutroUsuario = new UsersFavoriteMovies(dados[0], filme);
            
            listaDeFilmesFavoritadosCompleta.add(filmeFavoritoDeOutroUsuario);
          }
        } else {
          break;
        }
      }

      buffRead.close();

    } catch (IOException erro) {
      System.out.println(erro.getMessage());

      JOptionPane.showMessageDialog(null, "Não foi possível obter informações dos filmes favoritados!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
    }
  }

  // Método responsável por deletar o arquivo
  public static void apagarArquivo() throws IOException {
    File arquivo = new File("usersfavoritemovies.txt");

    arquivo.delete();
  }

  // Método responsável por regravar o arquivo com os dados modificados
  public static void regravarArquivo() throws IOException {
    String nomeDoUsuario;
    String title;
    String genre;
    int launchDate;
    int rating;

    apagarArquivo();
    
    for (int i = 0; i < listaDeFilmesFavoritadosCompleta.size(); i++) {
      UsersFavoriteMovies filmeFavoritado = listaDeFilmesFavoritadosCompleta.get(i);
      nomeDoUsuario = filmeFavoritado.getUsername();
      title = filmeFavoritado.getFilme().getTitulo();
      genre = filmeFavoritado.getFilme().getGenero();
      launchDate = filmeFavoritado.getFilme().getAnoDeLancamento();
      rating = filmeFavoritado.getFilme().getRating();

      try {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("usersfavoritemovies.txt", true))) {
          buffWrite.append(nomeDoUsuario + ";" + title + ";" + genre + ";" + launchDate + ";" + rating + "\n");
          buffWrite.close();
        }
      } catch (IOException erro) {
        System.out.println(erro.getMessage());
        JOptionPane.showMessageDialog(null, "Não foi possível salvar os filmes favoritados!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
      }
    }

    for (int i = 0; i < listaDeFilmesFavoritados.size(); i++) {
      UsersFavoriteMovies filmeFavoritado = listaDeFilmesFavoritados.get(i);
      title = filmeFavoritado.getFilme().getTitulo();
      genre = filmeFavoritado.getFilme().getGenero();
      launchDate = filmeFavoritado.getFilme().getAnoDeLancamento();
      rating = filmeFavoritado.getFilme().getRating();

      try {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("usersfavoritemovies.txt", true))) {
          buffWrite.append(username + ";" + title + ";" + genre + ";" + launchDate + ";" + rating + "\n");
          buffWrite.close();
        }
      } catch (IOException erro) {
        System.out.println(erro.getMessage());
        JOptionPane.showMessageDialog(null, "Não foi possível salvar os filmes favoritados!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
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
        removeButton = new javax.swing.JButton();
        pageIcon = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        leftRegion = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        rightRegion = new javax.swing.JPanel();
        exitIcon1 = new javax.swing.JLabel();

        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        dashboard.setBackground(new java.awt.Color(1, 21, 38));
        dashboard.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(150, 179, 217), null), "FAVORITES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambay Devanagari", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
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

        removeButton.setFont(new java.awt.Font("Cambay Devanagari", 1, 14)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        removeButton.setText("REMOVE");
        removeButton.setContentAreaFilled(false);
        removeButton.setFocusPainted(false);
        removeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        pageIcon.setForeground(new java.awt.Color(255, 255, 255));
        pageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star (3).png"))); // NOI18N

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(removeButton)
                    .addComponent(pageIcon))
                .addGap(0, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pageIcon)
                        .addGap(69, 69, 69)
                        .addComponent(removeButton)
                        .addGap(116, 116, 116))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
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

  private void moviesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesTableMouseClicked
    removeButton.setEnabled(true);
  }//GEN-LAST:event_moviesTableMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeButtonActionPerformed

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
      int index = moviesTable.getSelectedRow();

        if (index >= 0 && index < listaDeFilmesFavoritados.size()) {
            listaDeFilmesFavoritados.remove(index);
            JOptionPane.showMessageDialog(null, "Desfavoritado com sucesso!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }

        carregarTabelaFilmesFavoritados();

        removeButton.setEnabled(false);

        try {
            regravarArquivo();
        } catch (IOException erro) {
            System.out.println(erro.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível salvar as modificações!", "Ocorreu um erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_removeButtonMouseClicked

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
      java.util.logging.Logger.getLogger(screenUserFavorites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(screenUserFavorites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(screenUserFavorites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(screenUserFavorites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
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
      new screenUserFavorites().setVisible(true);
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel exitIcon1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftRegion;
    private javax.swing.JPanel menu;
    private javax.swing.JTable moviesTable;
    private javax.swing.JLabel pageIcon;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel rightRegion;
    // End of variables declaration//GEN-END:variables
}
