/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor;

import figuras2D.Ponto2D;

/**
 *
 * @author arauj
 */
public class Vetor<T> {
    private final T V[];
    private int tamanho;

    public Vetor (T[] V) {
        this.V = V;
        //this.tamanho = V.length;
    }
    /*
    public Vetor(T[] V, int length){
        V = new T[length];
        tamanho = 0;
    }*/

    public long getTamanho() {
        return tamanho;
    }

    public T getV(int indice) {
        if(indice >= 0 && indice <tamanho)
            return V[indice];
        return null;
    }

    public void inserirFinal(T obj){
        if (tamanho < V.length) {
            V[tamanho] = obj;
        }
        tamanho++;
    }
    
    public void apagar(T obj){
        int aux = 0;
        for (int i = 0; i < tamanho; i++)
            if(V[i].equals(obj)){
                aux = i;
                tamanho --;
                break;
            }
        for(int i = aux; i < tamanho; i++)
            V[i] = V[i+1];
    }
    
    public void inserirOrdemCrescente(T obj){
    }
    
    public void inserirOrdemDecrescente(T obj){
    }
    
    public boolean pertence(T obj){
        for(int i = 0; i < tamanho; i++)
            if(V[i].equals(obj))
                return true;
        return false;
    }
    
    public int indice(T obj){
        for(int i = 0; i < tamanho; i++)
            if(V[i].equals(obj))
                return i;
        return -1;
    }
    
    @Override
    public String toString() {
        String str;
        str = "Vetor{" + ", tamanho " + V.length + "V=\n";
        for(int i = 0; i < V.length; i++)
            str += V[i] + ",\n";
        str += '}';
        return str;
    }
}
