package classes;

public class UsersFavoriteMovies {
  // Atributos
  private Usuario usuario;
  private Filme filme;
  private String username;

  // Método construtor
  public UsersFavoriteMovies(String username, Filme filme) {
    this.username = username;
    this.filme = filme;
  }
  
  // Métodos Getters e Setters
  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Filme getFilme() {
    return filme;
  }

  public void setFilme(Filme filme) {
    this.filme = filme;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
