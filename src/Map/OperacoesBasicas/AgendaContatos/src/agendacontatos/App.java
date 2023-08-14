/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontatos;

/**
 *
 * @author joaoGHF
 */
public class App {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        
        contatos.addContato("Joao", 2000);
        contatos.addContato("Joao G", 2010);
        contatos.addContato("Joao GH", 2100);
        contatos.addContato("Joao GHF", 3000);
        contatos.addContato("JoaoGHF", 3001);
        contatos.addContato("joaoGHF", 3010);
        
        contatos.showContatos();
        
        System.out.println("SRC 'Joao GHF': " + contatos.srcNome("Joao GHF"));
        System.out.println("SRC 'Joao': " + contatos.srcNome("Joao"));
        
        contatos.rmContato("JoaoGHF");
        contatos.rmContato("Joao G");
        contatos.rmContato("Joao GHF");
        
        contatos.showContatos();
    }
}
