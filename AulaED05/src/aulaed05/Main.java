/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaed05;

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
        Pessoa p0 = new Pessoa("12345 678", "Pedro", "pedro@email.com");
        Pessoa p1 = new Pessoa("987654321", "João", "joao@email.com");
        Pessoa p2 = new Pessoa("12345 678", "Pedro", "pedroasd@email.com");
        Ponto2D p00 = new Ponto2D(1,1);
        Ponto2D p01 = new Ponto2D(1,1);
        v1.inserirFinal(p0);
        v1.inserirFinal(p1);
        v1.inserirFinal(p00);
        v1.inserirFinal(p01);
        
        System.out.println(v1);
        
        Pessoa p03 = new Pessoa("2589630", "Henrique");
        Pessoa p04 = new Pessoa("2589630", "Henrique");
        v1.inserirFinal(p2);
        
        /*if(v1.pertence(p03))
            System.out.println("p03 Pertence ao vetor");
        else
            System.out.println("p03 Não pertence ao vetor");
        
        int indice = v1.indice(p04);
        if(indice != -1)
            System.out.println("Objeto está no indice " + indice);
        else
            System.out.println("Objeto não está no vetor"); 
        
        if (v1.getV(indice) == p04)
            System.out.println("P04 esta na vetor");
        else
            System.out.println("P04 nao esta no vetor");
        */
        
        v1.inserirFinal(p04);
        
        v1.apagar(p04);
        
        System.out.println(v1);
        
        System.out.println("Vinicius Willian de Araujo");
    }
}
