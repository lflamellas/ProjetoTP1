package classes;

// Classe responsável pela avaliação de um filme realizada por um usuário

import java.util.Date;

public abstract class Avaliacao {

  // Atributos
  private int nota;
  private int numeroDeAvaliacoes;
  private Date dataDeCriacao;
  private String relevancia;

  // Atributo de composição
  private Comentario comentario = new Comentario();

  // Atributo de associação
  private Filme filme;

  // Método construtor
  public Avaliacao(int nota, String comentario) {
    this.nota = nota;
    this.comentario.setTexto(comentario);
    this.dataDeCriacao = new Date();
    this.relevancia = "";
  }

  // Métodos Getters e Setters
  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  public Comentario getComentario() {
    return comentario;
  }

  public void setComentario(Comentario comentario) {
    this.comentario = comentario;
  }

  public Filme getFilme() {
    return filme;
  }

  public void setFilme(Filme filme) {
    this.filme = filme;
  }

  public int getNumeroDeAvaliacoes() {
    return numeroDeAvaliacoes;
  }

  public void setNumeroDeAvaliacoes(int numeroDeAvaliacoes) {
    this.numeroDeAvaliacoes = numeroDeAvaliacoes;
  }

  public Date getDataDeCriacao() {
    return dataDeCriacao;
  }

  public void setDataDeCriacao(Date dataDeCriacao) {
    this.dataDeCriacao = dataDeCriacao;
  }

  public String getRelevancia() {
    return relevancia;
  }

  public void setRelevancia(String relevancia) {
    this.relevancia = relevancia;
  }
  
  // Métodos
  
  // Método responsável por informar se a avaliação é relevante
  public boolean ehRelevante() {
    return this.relevancia.equals("relevante");
  }
  
  // Método informa se a avalição possui nota boa
  public boolean temNotaBoa() {
    return this.nota >= 7;
  }
  
  // Método informa se a avaliação é antiga
  public boolean ehAntigo() {
    return new Date().getMonth() - this.dataDeCriacao.getMonth() > 2;
  }

  // Método responsável por informar os dados da avaliação
  @Override
  public String toString() {
    return "Avaliacao{" + "nota=" + nota + ", numeroDeAvaliacoes=" + numeroDeAvaliacoes + ", dataDeCriacao=" + dataDeCriacao + ", relevancia=" + relevancia + ", comentario=" + comentario + ", filme=" + filme + '}';
  }
}
