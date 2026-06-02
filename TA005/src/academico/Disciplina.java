/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

/**
 *
 * @author arauj
 */
public class Disciplina {
    private String codigo;
    private String nome;
    private Integer semestre;

    public Disciplina(String codigo, String nome, Integer semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getCodigo() {
        return codigo;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    
    
}
