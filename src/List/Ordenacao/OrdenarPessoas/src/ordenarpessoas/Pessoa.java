/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenarpessoas;

import java.util.Comparator;

/**
 *
 * @author joaoGHF
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.getIdade());
    }
}

class ComparatorAltura implements Comparator<Pessoa>{
        
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Float.compare(p1.getAltura(), p2.getAltura());
        }
        
    }
