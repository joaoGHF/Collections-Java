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
        
        contatos.addContato("Joao", 222);
        contatos.addContato("Joao", 111); // nome inválido
        contatos.addContato("Joao Gabriel", 223);
        contatos.addContato("Joao Gabriel Ab", 224);
        contatos.addContato("Joao Gabriel Aa", 225);
        contatos.addContato("Maria", 333);
        
        contatos.showContatos();
        
        contatos.attNum("Joao", 123);
        
        System.out.println("SRC 'Joao': " + contatos.srcContatos("Joao"));
        System.out.println("SRC 'Joao G': " + contatos.srcContatos("Joao G"));
    }

}
