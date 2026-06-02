/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import funcionarios.Aluno;
import funcionarios.Empregado;
import funcionarios.Horista;
import funcionarios.Mensalista;
import funcionarios.Pessoa;
import funcionarios.Professor;

/**
 *
 * @author arauj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //polimorfismo é a escrita de um metodo com o messmo nome, mas escrito de forma diferente, de acordo
       //com o Objeto
       
       Pessoa pessoa1 = new Mensalista("Repositor",
                                "123", "Administracao", "Repositor", 
                                "09876", "Joao", "joao@email");
       Pessoa pessoa2 = new Professor("Doutor", "C",
                        50, 40, 
                        "147", "Ensino", "Geografia", 
                        "678", "Jorge", "jorge@email");
        System.out.println(pessoa2);
    }
    
}
