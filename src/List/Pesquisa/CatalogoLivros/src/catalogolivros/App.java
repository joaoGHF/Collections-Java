/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogolivros;

/**
 *
 * @author joaoGHF
 */
public class App {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        
        catalogo.addLivro("Livro 1", "Autor 1", 2020);
        catalogo.addLivro("Livro 2", "Autor 2", 2018);
        catalogo.addLivro("Livro 3", "Autor 3", 1995);
        catalogo.addLivro("Livro 4", "Autor 2", 1998);
        catalogo.addLivro("Livro 4", "Autor 3", 2023);
        catalogo.addLivro("Livro 5", "Autor 3", 2020);
        
        System.out.println("Autor: " + catalogo.srcAutor("Autor 3"));
        
        System.out.println("Intervalo Anos: " + catalogo.srcIntervaloAnos(2020, 2024));
        
        System.out.println("Titulo: " + catalogo.srcTitulo("Livro 4"));
        
        
    }
}
