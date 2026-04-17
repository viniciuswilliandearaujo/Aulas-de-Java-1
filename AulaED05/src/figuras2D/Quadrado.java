/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras2D;

/**
 *
 * @author aluno
 */
public class Quadrado implements Figuras2D {
    private Ponto2D p0;
    private double lado;

    public Quadrado(Ponto2D p0, double lado) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
    }

    public Ponto2D getP0() {
        return new Ponto2D(p0.getX(), p0.getY());
    }
    
    public Ponto2D calcP1(){
        return new Ponto2D(p0.getX()+lado, p0.getY());
    }
    
    public Ponto2D calcP2(){
        return new Ponto2D(p0.getX(), p0.getY() + lado);
    }
    
    public Ponto2D calcP3(){
        return new Ponto2D(p0.getX()+lado, p0.getY()+ lado);
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Quadrado(" + p0 
                            + "\n, "+calcP1()
                            + "\n, "+calcP2()
                            + "\n, "+calcP3() + lado + ')';
    }
        
}
