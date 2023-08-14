/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convidados;

/**
 *
 * @author joaoGHF
 */
public class App {

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.addConvidado("Convidado 1", 1);
        convidados.addConvidado("Convidado 2", 2);
        convidados.addConvidado("Convidado 3", 2);
        convidados.addConvidado("Convidado 4", 4);
        convidados.addConvidado("Convidado 5", 5);

        System.out.println("\nSize: " + convidados.size());
        convidados.showConvidados();

        convidados.rmConvidadoByCod(5);
        convidados.rmConvidadoByCod(1);

        System.out.println("\nSize: " + convidados.size());
        convidados.showConvidados();

    }
}
