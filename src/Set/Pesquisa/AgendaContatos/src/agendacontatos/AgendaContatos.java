/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontatos;

import java.util.HashSet;

/**
 *
 * @author joaoGHF
 */
public class AgendaContatos {
    private HashSet<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }
    
    public void addContato(String nome, int numero) {
        setContatos.add(new Contato(nome, numero));
    }
    
    public void showContatos() {
        System.out.println(setContatos);
    }
    
    public HashSet<Contato> srcContatos(String nome) {
        HashSet<Contato> srcContatos = new HashSet<>();
        
        for (Contato c : setContatos) {
            if (c.getNome().contains(nome)) {
                srcContatos.add(c);
            }
        }
        
        return srcContatos;
    }
    
    public Contato attNum(String nome, int numero) {
        for (Contato c : setContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                return c;
            }
        }
        return null;
    }
}
