/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendaeventos;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Reinaldo
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("HOJE: " + LocalDate.now());
        
        AgendaEventos agenda = new AgendaEventos();
        agenda.addEvento(LocalDate.of(2000, 8, 14), "A", "a2bcd");
        agenda.addEvento(LocalDate.of(2023, 8, 3), "B", "bvdc1");
        agenda.addEvento(LocalDate.of(2024, 2, 1), "C", "n6mjk");
        
        agenda.exibirAgenda();
        
        agenda.getNextEvento();
    }
}
