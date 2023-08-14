/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogolivros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoGHF
 */
public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int anoPub) {
        livros.add(new Livro(titulo, autor, anoPub));
    }

    public List<Livro> srcAutor(String autor) {
        List<Livro> srcList = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    srcList.add(l);
                }
            }
        }

        return srcList;
    }

    public List<Livro> srcIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> srcList = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                int anoPub = l.getAnoPublicacao();
                if (anoPub >= anoInicial && anoPub <= anoFinal) {
                    srcList.add(l);
                }
            }
        }
        return srcList;
    }
    
    public Livro srcTitulo(String titulo) {
        for (Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
