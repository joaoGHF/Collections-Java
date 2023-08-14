/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estoqueprodutos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joaoGHF
 */
public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void addItem(Long cod, String nome, int quantidade, double preco) {
        this.estoque.put(cod, new Produto(nome, preco, quantidade));
    }

    public void showProdutos() {
        System.out.println(this.estoque);
    }

    public double calcValorTotalEstoque() {
        Double total = 0d;

        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }

    public Produto getProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        
        return produtoMaisCaro;
    }
    
    public Produto getProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        
        return produtoMaisBarato;
    }
    
    public Produto getMaiorQuantidadeValor() {
        Produto produto = null;
        Double valor = Double.MIN_VALUE;
        
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if ((p.getPreco() * p.getQuantidade()) > valor) {
                    produto = p;
                    valor = produto.getPreco() * produto.getQuantidade();
                }
            }
        }
        
        return produto;
    }
    

}
