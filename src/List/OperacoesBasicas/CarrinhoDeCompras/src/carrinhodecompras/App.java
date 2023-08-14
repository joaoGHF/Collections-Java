/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrinhodecompras;

/**
 *
 * @author joaoGHF
 */
public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();
        
        cc.addItem("Caneta", 2, 2.25);
        cc.addItem("Borracha", 1, 3);
        cc.addItem("Frango", 1, 35);
        cc.addItem("Pao", 3, 5);
        cc.addItem("Margarina", 3, 4.6);
        
        cc.exibirItems();
        
        System.out.println("Total: " + cc.calcularValorTotal());
        
        cc.rmItem("borracha");
        cc.rmItem("Frango");
        
        cc.exibirItems();
        System.out.println("Total: " + cc.calcularValorTotal());
    }
}
