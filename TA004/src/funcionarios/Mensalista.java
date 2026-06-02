/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarios;

/**
 *
 * @author arauj
 */
public class Mensalista extends Funcionario{
    protected String cargo;

    public Mensalista(String cargo, String matricula, String departamento, String lotado, String RG, String nome, String email) {
        super(matricula, departamento, lotado, RG, nome, email);
        this.cargo = cargo;
    }

    
    @Override
    public double salarioBruto() {
        switch (cargo){
            case "Repositor":
                return 1600;
            case "Caixa":
                return 2500;
            case "Gerente":
                return 3200;
            default:
                    return 0;
        }
    }

    @Override
    public String toString() {
        return "Mensalista{" + "cargo=" + cargo + ", salario bruto= " + salarioBruto() +'}';
    }
    
    
    
}
