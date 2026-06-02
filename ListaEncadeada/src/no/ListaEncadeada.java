/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no;

/**
 *
 * @author arauj
 */
public class ListaEncadeada {
    private No head;
    private No tail;
    private No no;

    public ListaEncadeada() {
        this.head = null;
        this.tail = head;
    }
    
    public void inserirFinal(No novo){
        if(head == null){
            head = novo;
            //head.setProximo(null); não é necessário
            tail = novo;
        } else {
            tail.setProximo(novo);
            tail = novo;
        }
    }
    
    public void inserirInicio(No novo){
        if(head == null){
            head = novo;
            //head.setProximo(null); não é necessário
            tail = novo;
        } else {
            novo.setProximo(head);
            head = novo;
        }
    }
    public void inserirDepoisValor(No anterior, No novo){
        novo.setProximo(anterior.getProximo());
        anterior.setProximo(novo);
    }
    
    public String contagem(){
       no = head;
       int cont = 0;
       do{
           cont++;
           no = no.getProximo();
       }while (no != null);
       return "Quantidade de elementos na lista "  + cont;
    }
    
    public String mostrarValores(){
       no = head;
       String nos = "";
       do{
           nos += " " + no.getValor();
           no = no.getProximo();
       }while (no != null);
       return "Valores: " + nos;
    }

    @Override
    public String toString() {
        return "ClasseListaEncadeada{" + "head=" + head.getValor() + ", tail=" + tail + '}';
    }

}

