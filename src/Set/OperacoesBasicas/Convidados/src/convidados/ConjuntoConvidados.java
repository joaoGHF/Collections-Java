/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convidados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author joaoGHF
 */
public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void addConvidado(String nome, int cod) {
        this.convidados.add(new Convidado(nome, cod));
    }

    public void rmConvidadoByCod(int cod) {
        for (Convidado convidado : convidados) {
            if (convidado.getCod() == cod) {
                this.convidados.remove(convidado);
                return;
            }
        }
    }
    
   public int size() {
       return this.convidados.size();
   }
   
   public void showConvidados() {
       for (Convidado convidado : convidados) {
           System.out.println(convidado.toString());
       }
   }
   
   
}
