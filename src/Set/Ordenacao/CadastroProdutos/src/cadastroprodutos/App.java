/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroprodutos;

/**
 *
 * @author joaoGHF
 */
public class App {

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.addProduto("Produto 1", 1000, 20.3d, 3);
        produtos.addProduto("Produto 2", 1001, 10.22d, 1);
        produtos.addProduto("Produto 3", 1002, 22.6d, 1);
        produtos.addProduto("Produto 4", 1003, 3.5d, 5);

        System.out.println("HashSet    : " + produtos.setProdutos);
        System.out.println("Sort Nome  : " + produtos.sortNome());
        System.out.println("Sort Preco : " + produtos.sortPreco());
        

    }
}
