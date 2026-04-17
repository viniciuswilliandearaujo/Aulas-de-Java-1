/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor;

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
        /*if (pertence(obj) == true){
            int i = indice(obj);
            Object[] Va = new Object [V.length];
            for (int j = 0; j <= V.length; j++){
                if(j == i)
                    break;
                Va[j] = V[j];
            }
        }*/
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
    
    public void inserirOrdemCrescente(Object obj){
        
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
