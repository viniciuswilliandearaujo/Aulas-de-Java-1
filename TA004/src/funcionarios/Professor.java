/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

/**
 *
 * @author arauj
 */
public class Professor extends Horista{
    protected String titulo;
    protected String nivel;

    public Professor(String titulo, String nivel, double valorHora, double totalHoras, String matricula, String departamento, String lotado, String RG, String nome, String email) {
        super(valorHora, totalHoras, matricula, departamento, lotado, RG, nome, email);
        this.titulo = titulo;
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public double acrescimoTitulo(){
        switch (titulo){
                case "Especialista":
                    return 0.1;
                case "Mestre":
                    return 0.3;
                case "Doutor":
                    return 0.4;
                default:
                    return 0;
        }
    }
    
    public double acrescimoNivel() {
        return switch (nivel) {
            case "A" -> 0.1;
            case "B" -> 0.2;
            case "C" -> 0.3;
            default -> 0;
        };
    }
    
    @Override
    public double salarioBruto(){
        return super.salarioBruto() + 
                super.salarioBruto()*acrescimoTitulo() + 
                super.salarioBruto()*acrescimoNivel();
    }

    @Override
    public String toString() {
        return "Professor{" + "titulo=" + titulo + ", nivel=" + nivel + 
                "\n acrescimo do titulo = " + acrescimoTitulo() +
                "\n acrescimo do nivel = " + acrescimoNivel() + 
                "\n salario bruto = " + salarioBruto() +'}';
    }
    
    
}
