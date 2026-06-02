/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import beans.Pessoa;
import figuras2D.Ponto2D;
import vetor.Vetor;

/**
 *
 * @author arauj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vetor v1 = new Vetor (10);
        Ponto2D p0 = new Ponto2D (1, 1);
        Ponto2D p1 = new Ponto2D (2, 2);
        Ponto2D p2 = new Ponto2D (3, 3);
        Ponto2D p3 = new Ponto2D (4, 4);
        Ponto2D p4 = new Ponto2D (5, 5);
        Ponto2D p5 = new Ponto2D (6, 6);
        Ponto2D p6 = new Ponto2D (7, 7);
        Ponto2D p7 = new Ponto2D (8, 8);
        Ponto2D p8 = new Ponto2D (9, 9);
        Ponto2D p9 = new Ponto2D (10, 10);
        Ponto2D p10 = new Ponto2D (11, 11);
        
        // ordem de leitura: p9 é maior do que p10?
        //System.out.println(p9.maior(p10));
        
        v1.inserirFinal(p0);
        v1.inserirFinal(p1);
        v1.inserirFinal(p2);
        v1.inserirFinal(p4);
        v1.inserirFinal(p6);
        System.out.println(v1);
        
        v1.inserirOrdemCrescente(p3);
        System.out.println(v1);
        System.out.println("Vinicius Willian de Araujo, IPV6 = 2804:868:d043:7ec0:cb49:7f63:c925:2dc");
        
    }
}
