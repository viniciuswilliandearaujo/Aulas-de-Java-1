/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package figuras2D;

/**
 *
 * @author aluno
 */
public interface Objeto2D {
    
    //pode ser escrito dos dois jeitos ( public abstract void) ou só void
    public abstract void moveX(double dX);
    void moveY(double dY);
    void moveXY(double dX, double dY);
}
