/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palavrasunicas;

/**
 *
 * @author joaoGHF
 */
public class App {

    public static void main(String[] args) {
        SetPalavrasUnicas palavras = new SetPalavrasUnicas();

        palavras.addPalavra("hello");
        palavras.addPalavra("HELlo");
        palavras.addPalavra("hello");
        palavras.addPalavra("By");
        palavras.addPalavra("World");
        palavras.addPalavra("joaoGHF");

        palavras.showPalavras();

        System.out.println("\nhas 'joaoGHF': " + palavras.verifPalavra("joaoGHF") + "");

        palavras.rmPalavra("By");
        palavras.rmPalavra("HELlo");
        
        System.out.println("\nDepois das remocoes\n");
        palavras.showPalavras();

    }
}
