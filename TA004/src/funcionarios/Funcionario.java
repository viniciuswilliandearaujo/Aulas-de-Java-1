/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

/**
 *
 * @author arauj
 */
public abstract class Funcionario extends Pessoa implements Empregado{
    protected String departamento;
    protected String matricula;
    protected String lotado;

    public Funcionario(String matricula, String departamento, String lotado, String RG, String nome, String email) {
        super(RG, nome, email);
        this.departamento = departamento;
        this.matricula = matricula;
        this.lotado = lotado;
    }

    
    @Override
    public double salarioLiquido() {
        return salarioBruto()-IRRF()-INSS();
    }

    @Override
    public double INSS() {
        return salarioBruto()*0.11;
    }

    @Override
    public double IRRF() {
        return salarioBruto()*0.27;
    }
}
