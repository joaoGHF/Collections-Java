/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogolivros;

/**
 *
 * @author joaoGHF
 */
public class Livro {
    private String titulo;
    private String Autor;
    private int anoPublicacao;

    public Livro(String titulo, String Autor, int anoPublicacao) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", Autor=" + Autor + ", anoPublicacao=" + anoPublicacao + '}';
    }
}
