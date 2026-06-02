/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import beans.Pessoa;
import figuras2D.Ponto2D;
import rbg.Pixel;
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
        //Pessoa v1[] = new Pessoa[3];
        //Vetor V = new Vetor<Pessoa>(v1);
        //Pessoa pessoa1 = new Pessoa("123", "vinicius", "vin@email");
        
       Pixel v1[] = new Pixel[5];
       Vetor V = new Vetor<>(v1);
       Pixel p1 = new Pixel(255,255,255);
       Pixel p2 = new Pixel(0,0,0);
       Pixel p3 = new Pixel(255,0,0);
       Pixel p4 = new Pixel(0,255,0);
       Pixel p5 = new Pixel(0,0,255);
       
        V.inserirFinal(p1);
        V.inserirFinal(p2);
        V.inserirFinal(p3);
        V.inserirFinal(p4);
        V.inserirFinal(p5);
        
        System.out.println(V);
        System.out.println("Vincius Willian de Araujo, IPV6 = fe80::ff56:6431:9df:d803%5");
        
        
    }
}
