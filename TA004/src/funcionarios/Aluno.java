/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

import java.util.Objects;

/**
 *
 * @author arauj
 */
public class Aluno extends Pessoa {
    protected String RA;
    protected String curso;
    protected Integer semestre;
    protected String emailAcademico;

    public Aluno(String RA, String curso, Integer semestre, String RG, String nome) {
        super(RG, nome);
        this.RA = RA;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getRA() {
        return RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getEmailAcademico() {
        return emailAcademico;
    }

    public void setEmailAcademico(String emailAcademico) {
        this.emailAcademico = emailAcademico;
    }

    @Override
    public String toString() {
        return "Aluno{" + "RA=" + RA + ", curso=" + curso + ", semestre=" + semestre + ", emailAcademico=" + emailAcademico
                + "\nRG=" + RG + ", nome=" + nome + ", email=" + email + '}';
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.RG, other.RG)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.RA, other.RA);
    }
    
    
    
}
