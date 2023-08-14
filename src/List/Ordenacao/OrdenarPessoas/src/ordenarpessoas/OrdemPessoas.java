/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenarpessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author joaoGHF
 */
public class OrdemPessoas {
    private List<Pessoa> pessoas;
    
    public OrdemPessoas() {
        pessoas = new ArrayList<>();
    }
    
    public void addPessoa(String nome, int idade, float altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> sortIdade() {
       List<Pessoa> sortList = new ArrayList<>(pessoas);
       
        Collections.sort(sortList);
        return sortList;
    }
    
    public List<Pessoa> sortAltura() {
        List<Pessoa> sortList = new ArrayList<>(pessoas);
        
        Collections.sort(sortList, new ComparatorAltura());
        return sortList;
    }

    public List<Pessoa> getPessoas() {
        return new ArrayList(pessoas);
    }
    
}
