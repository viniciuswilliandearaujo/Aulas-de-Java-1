/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

/**
 *
 * @author arauj
 */
public class Horista extends Funcionario{
    protected double valorHora;
    protected double totalHoras;

    public Horista(double valorHora, double totalHoras, String matricula, String departamento, String lotado, String RG, String nome, String email) {
        super(matricula, departamento, lotado, RG, nome, email);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }
    
    @Override
    public double salarioBruto() {
        return valorHora*totalHoras*4;
    }

    @Override
    public String toString() {
        return "Horista{" + "valorHora=" + valorHora + ", totalHoras=" + totalHoras +
                "\n salario bruto = " + salarioBruto() + '}';
    }
    
}
