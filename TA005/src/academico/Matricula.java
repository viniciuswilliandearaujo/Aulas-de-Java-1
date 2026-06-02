/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academico;

import java.util.Date;

/**
 *
 * @author arauj
 */
public class Matricula {
    private Long numero;
    private Aluno aluno;
    private Disciplina disciplina;
    private Date date;

    public Matricula(Long numero, Aluno aluno, Disciplina disciplina, Date date) {
        this.numero = numero;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.date = date;
    }

    public Long getNumero() {
        return numero;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
