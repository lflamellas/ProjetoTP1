package classes;

public class Filme {
  private String titulo;
  private String genero;
  private int anoDeLancamento;
  private int rating;

  public Filme(String titulo, String genero, int anoDeLancamento, int rating) {
    this.titulo = titulo;
    this.genero = genero;
    this.anoDeLancamento = anoDeLancamento;
    this.rating = rating;
  }

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
}
