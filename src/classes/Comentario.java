package classes;

// Classe responsável pelos comentários feitos pelos usuários
public class Comentario {

  // Atributos
  private String texto;
  private int quantidadeDeCaracteres;
  private boolean positivo;
  private boolean relevante;

  // Métodos construtores
  public Comentario(String texto) {
    this.texto = texto;
    this.quantidadeDeCaracteres = texto.length();
    this.positivo = false;
    this.relevante = false;
  }

  Comentario() {
  }

  // Métodos Getters e Setters
  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public int getQuantidadeDeCaracteres() {
    return quantidadeDeCaracteres;
  }

  public void setQuantidadeDeCaracteres(int quantidadeDeCaracteres) {
    this.quantidadeDeCaracteres = quantidadeDeCaracteres;
  }

  public boolean isPositivo() {
    return positivo;
  }

  public void setPositivo(boolean positivo) {
    this.positivo = positivo;
  }

  public boolean isRelevante() {
    return relevante;
  }

  public void setRelevante(boolean relevante) {
    this.relevante = relevante;
  }
  
  // Métodos
  
  // Método responsável por informar se o comentário é grande
  public boolean ehGrande() {
    return this.quantidadeDeCaracteres >= 50;
  }
  
  // Método responsável por mostrar o comentário
  public void exibirComentario() {
    
  }
  
  // Método responsável por ocultar o comentário
  public void ocultarComentario() {
    
  }

  // Método responsável por exibir informações do comentário
  @Override
  public String toString() {
    return "Comentario{" + "texto=" + texto + ", quantidadeDeCaracteres=" + quantidadeDeCaracteres + ", positivo=" + positivo + ", relevante=" + relevante + '}';
  }
}
