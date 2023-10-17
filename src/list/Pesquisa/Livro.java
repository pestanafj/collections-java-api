package list.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDeFabricacao;

    public Livro(String titulo, String autor, int anoDeFabricacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                '}';
    }
}
