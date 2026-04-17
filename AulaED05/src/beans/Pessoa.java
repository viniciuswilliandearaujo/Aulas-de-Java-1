/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Objects;

/**
 *
 * @author arauj
 */
public class Pessoa {
    protected String RG;
    protected String nome;
    protected String email;

    public Pessoa(String RG, String nome, String email) {
        this.RG = RG;
        this.nome = nome;
        this.email = email;
    }

    public Pessoa(String RG, String nome) {
        this.RG = RG;
        this.nome = nome;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.RG);
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.RG, other.RG)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "RG=" + RG + ", nome=" + nome + ", email=" + email + '}';
    }
    
    
}

