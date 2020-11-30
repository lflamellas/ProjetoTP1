package classes;

import java.util.Date;

// Classe representando a entidade de usuário do nosso projeto
public class Usuario {

  // Atributos
  protected String username;
  protected String email;
  protected String password;
  protected Date dataDeCriacao;

  // Método construtor
  public Usuario(String username, String email, String password, Date dataDeCriacao) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.dataDeCriacao = dataDeCriacao;
  }

  // Métodos Getters e Setters
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getDataDeCriacao() {
    return dataDeCriacao;
  }

  public void setDataDeCriacao(Date dataDeCriacao) {
    this.dataDeCriacao = dataDeCriacao;
  }

  // Métodos
  // Método retorna se é um usuário ou não
  public boolean ehUsuario() {
    return true;
  }

  // Método retorna true se a senha do usuário é forte
  public boolean senhaEhForte() {
    return this.password.length() >= 6;
  }

  // Método retorna a quantidade de caracteres da senha do usuario
  public int caracteresDaSenha() {
    return this.password.length();
  }

  // Método retorna informações do usuário
  @Override
  public String toString() {
    return "Usuario{" + "username=" + username + ", email=" + email + ", password=" + password + ", dataDeCriacao=" + dataDeCriacao + '}';
  }
}
