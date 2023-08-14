/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import listatarefas.ListaTarefa;

/**
 *
 * @author joaoGHF
 */
public class java {

    public static void main(String[] args) {
        ListaTarefa lt = new ListaTarefa();

        lt.addTarefa("hello");
        lt.addTarefa("rm -rf /");
        lt.addTarefa("world!");
        lt.addTarefa("here");
        lt.addTarefa("isolated");
        lt.addTarefa("Shold");
        lt.addTarefa("here");
        
        System.out.println("\n\t***Antes da remocao***\n");

        System.out.println(lt.getTarefas());
        System.out.println("Size: " + lt.numTarefas() + "\n");

        lt.rmTarefa("rm -rf /");
        lt.rmTarefa("here");
        lt.rmTarefa("isolated");
        
        System.out.println("\n\t***Depois da remocao***\n");

        System.out.println(lt.getTarefas());
        System.out.println("Size: " + lt.numTarefas());
    }
}
