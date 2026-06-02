/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no;

/**
 *
 * @author arauj
 */
public class No {
    private Object valor;
    private No proximo;

    public No(Object valor, No proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public No(Object valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Object getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" + "valor=" + valor + ", proximo=" + proximo + '}';
    }
}
