package classes;

import java.util.Date;

// Classe que herda o funcionamento da classe de Usuário, contendo
// os atributos correspondentes de um usuário administrador
public class Administrador extends Usuario {

  // Atributos
  private int codigoDeIdentificacao;
  private int idade;
  private int cpf;
  private boolean privilegiosDeAdmin;

  // Método construtor
  public Administrador(String username, String email, String password, Date dataDeCriacao, int idade, int cpf) {
    super(username, email, password, dataDeCriacao);
    this.idade = idade;
    this.cpf = cpf;
    this.privilegiosDeAdmin = true;
    this.codigoDeIdentificacao = 1;
  }

  // Métodos Getters e Setters
  public boolean isPrivilegiosDeAdmin() {
    return privilegiosDeAdmin;
  }

  public void setPrivilegiosDeAdmin(boolean privilegiosDeAdmin) {
    this.privilegiosDeAdmin = privilegiosDeAdmin;
  }

  public int getCodigoDeIdentificacao() {
    return codigoDeIdentificacao;
  }

  public void setCodigoDeIdentificacao(int codigoDeIdentificacao) {
    this.codigoDeIdentificacao = codigoDeIdentificacao;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getCpf() {
    return cpf;
  }

  public void setCpf(int cpf) {
    this.cpf = cpf;
  }

  // Métodos
  // Método responsável por informar se o usuário é administrador
  public boolean ehAdmin() {
    return true;
  }
  
  // Método responsável por informar se é um usuário comum
  @Override
  public boolean ehUsuario() {
    return false;
  }

  // Método responsável por informar se o administrador é experiente ou não
  public boolean ehExperiente() {
    return this.idade >= 30;
  }

  // Método responsável por informar o último dígito do cpf do administrador
  public int ultimoDigitoCpf() {
    return cpf % 10;
  }

  // Método responsável por informar os dados do administrador
  @Override
  public String toString() {
    return "Administrador{" + "codigoDeIdentificacao=" + codigoDeIdentificacao + ", idade=" + idade + ", cpf=" + cpf + ", privilegiosDeAdmin=" + privilegiosDeAdmin + '}';
  }
}
