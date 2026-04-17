/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package figuras2D;

/**
 *
 * @author aluno
 */

//toda interface é publica e abstrata
public interface Figuras2D extends Objeto2D {
    public abstract double area(); //todo medoto é publico e abstrato
    public abstract double perimetro();
}
