/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenarpessoas;

import java.util.List;

/**
 *
 * @author joaoGHF
 */
public class App {

    public static void main(String[] args) {
        OrdemPessoas pessoas = new OrdemPessoas();
        pessoas.addPessoa("Nome 1", 20, 1.65f);
        pessoas.addPessoa("Nome 2", 16, 1.82f);
        pessoas.addPessoa("Nome 3", 10, 1.56f);
        pessoas.addPessoa("Nome 4", 50, 1.7f);
        
        System.out.println("\nOrdem inicial");
        for (Pessoa pessoa : pessoas.getPessoas()) {
            System.out.println("Pessoa: " + pessoa.toString());
        }
        
        System.out.println("\nOrdem altura");
        for (Pessoa pessoa : pessoas.sortAltura()) {
            System.out.println("Pessoa: " + pessoa.toString());
        }
        
        System.out.println("\nOrdem idade");
        for (Pessoa pessoa : pessoas.sortIdade()) {
            System.out.println("Pessoa: " + pessoa.toString());
        }
    }
}
