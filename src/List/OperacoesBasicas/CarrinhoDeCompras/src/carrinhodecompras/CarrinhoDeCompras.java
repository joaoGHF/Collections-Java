/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoGHF
 */
public class CarrinhoDeCompras {
    List<Item> lc;
    
    public CarrinhoDeCompras() {
        lc = new ArrayList<>();
    }
    
    public void addItem(String nome, int quantidade, double preco) {
        this.lc.add(new Item(nome, quantidade, preco));
    }
    
    public void rmItem(String nome) {
        List<Item> rmItems = new ArrayList<>();
        
        for (Item i : this.lc) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                rmItems.add(i);
                System.out.println("rm Item: " + i.getItem());
            }
        }
        
        this.lc.removeAll(rmItems);
    }
    
    public double calcularValorTotal() {
        double total = 0;
        for (Item i : this.lc) {
            total += i.getPreco() * i.getQuantidade();
        }
        
        return total;
    }
    
    public void exibirItems() {
        System.out.println("Items={");
        
        for (Item i : this.lc) {
            System.out.println(i.getItem());
        }
        
        System.out.println("}\n");
    }
}
