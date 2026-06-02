/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import no.ListaEncadeada;
import no.No;

/**
 *
 * @author arauj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        No no1 = new No("no01");
        No no2 = new No("no02");
        No no3 = new No("no03");
        No no4 = new No("no04");
        ListaEncadeada list1 = new ListaEncadeada();
        list1.inserirFinal(no1);
        list1.inserirFinal(no2);
        list1.inserirFinal(no3);
        list1.inserirInicio(no4);
        //System.out.println(list1);
        //System.out.println(list1.contagem());
        No no5 = new No("no05");
        list1.inserirDepoisValor(no2, no5);
        System.out.println(list1.mostrarValores());
    }
    
}
