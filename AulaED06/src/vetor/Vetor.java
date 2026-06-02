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
public class Vetor {
    private Object V[];
    private int tamanho;

    public Vetor(int valTamanho) {
        V = new Object[valTamanho];
        tamanho = 0;
    }

    public long getTamanho() {
        return tamanho;
    }

    public Object getV(int indice) {
        if(indice >= 0 && indice <tamanho)
            return V[indice];
        return null;
    }

    public void inserirFinal(Object obj){
        if (tamanho < V.length) {
            V[tamanho] = obj;
        }
        tamanho++;
    }
    
    public void apagar(Object obj){
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
    
    public void inserirOrdemCrescente(Ponto2D obj){
        if (obj != null)
            for (int i = 0; i < tamanho; i ++){
                //System.out.println(V[i].getClass());
                if(obj.maior(V[i]) && !(obj.maior(V[i+1]))){
                    V[i+1+1] = V[i+1];
                    V[i+1] = obj;
                    tamanho++;
                }
            }
    }
    
    public void inserirOrdemDecrescente(Object obj){
        
    }
    
    public boolean pertence(Object obj){
        for(int i = 0; i < tamanho; i++)
            if(V[i].equals(obj))
                return true;
        return false;
    }
    
    public int indice(Object obj){
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
