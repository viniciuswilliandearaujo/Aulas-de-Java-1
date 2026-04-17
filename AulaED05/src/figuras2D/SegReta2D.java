/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras2D;

/**
 *
 * @author aluno
 */
public class SegReta2D implements Objeto2D{
    private Ponto2D p0;
    private Ponto2D p1;
    
    public SegReta2D(Ponto2D p0, Ponto2D p1){
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.p1 = new Ponto2D(p1.getX(), p1.getY());
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
        p1.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
        p1.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
        p1.moveXY(dX, dY);
    }

    public Ponto2D getP0(){
        return p0;
    }
    
     public Ponto2D getP1(){
        return p1;
    }
    
    
 
    @Override
    public String toString() {
        return "SegReta2D{" + p0 + "," + p1 + '}';
    }
    
    
    
}


