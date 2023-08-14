/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroprodutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Reinaldo
 */
public class CadastroProdutos{

    public Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }
    
    public void addProduto(String nome, long cod, double preco, int quantidade) {
        this.setProdutos.add(new Produto(nome, cod, preco, quantidade));
    }
    
    public Set<Produto> sortNome() {
        Set<Produto> sortedSet = new TreeSet<>(this.setProdutos);
        return sortedSet;
    }
    
    public Set<Produto> sortPreco() {
        Set<Produto> sortedSet = new TreeSet<>(new ComparatorPreco());
        sortedSet.addAll(this.setProdutos);
        return sortedSet;
    }

}
