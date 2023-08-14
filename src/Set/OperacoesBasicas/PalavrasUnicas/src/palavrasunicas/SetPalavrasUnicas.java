/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palavrasunicas;

import java.util.HashSet;

/**
 *
 * @author joaoGHF
 */
public class SetPalavrasUnicas {
    HashSet<Palavra> palavras;
    
    public SetPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }
    
    public void addPalavra(String palavra) {
        this.palavras.add(new Palavra(palavra));
    }
    
    public void rmPalavra(String palavra) {
        for (Palavra p : palavras) {
            if (p.getPalavra().equals(palavra)) {
                palavras.remove(p);
                return;
            }
        }
    }
    
    public boolean verifPalavra(String palavra) {
        for (Palavra p : palavras) {
            if (p.getPalavra().equals(palavra)) {
                return true;
            }
        }
        return false;
    }
    
    public void showPalavras() {
        for (Palavra palavra : palavras) {
            System.out.println("Palavra: " + palavra.getPalavra());
        }
    }
} 
