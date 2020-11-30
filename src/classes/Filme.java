package classes;

// Classe representando a entidade de Filme do nosso projeto
public class Filme {

  // Atributos
  private String titulo;
  private String genero;
  private int anoDeLancamento;
  private int rating;

  // Atributo de associação
  private Avaliacao avaliacao;

  // Método construtor
  public Filme(String titulo, String genero, int anoDeLancamento, int rating) {
    this.titulo = titulo;
    this.genero = genero;
    this.anoDeLancamento = anoDeLancamento;
    this.rating = rating;
  }

  // Métodos Getters e Setters
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public Avaliacao getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(Avaliacao avaliacao) {
    this.avaliacao = avaliacao;
  }

  //Métodos
  // Método retorna true se é um filme
  public boolean ehFilme() {
    return true;
  }

  // Método retorna true se o filme é antigo
  public boolean ehAntigo() {
    return this.anoDeLancamento < 200;
  }

  // Método retorna true se o filme é bom
  public boolean ehBom() {
    return this.rating >= 7;
  }

  // Método responsável por retornar informações do filme
  @Override
  public String toString() {
    return "Filme{" + "titulo=" + titulo + ", genero=" + genero + ", anoDeLancamento=" + anoDeLancamento + ", rating=" + rating + ", avaliacao=" + avaliacao + '}';
  }
}
