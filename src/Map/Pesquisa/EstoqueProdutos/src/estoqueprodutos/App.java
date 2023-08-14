/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoqueprodutos;

/**
 *
 * @author joaoGHF
 */
public class App {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        
        estoque.showProdutos();
        
        estoque.addItem(0L, "A", 4, 5d);
        estoque.addItem(1L, "B", 1, 6d);
        estoque.addItem(2L, "C", 2, 8d);
        estoque.addItem(3L, "D", 1, 12d);
        
        estoque.showProdutos();
        
        System.out.println("Valor Total: " + estoque.calcValorTotalEstoque());
        
        System.out.println("Maior preco: " + estoque.getProdutoMaisCaro());
        System.out.println("Menor preco: " + estoque.getProdutoMaisBarato());
        System.out.println("Maior preco*quantidade: " + estoque.getMaiorQuantidadeValor());
    }
}
