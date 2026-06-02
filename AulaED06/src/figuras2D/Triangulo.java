/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras2D;

/**
 *
 * @author aluno
 */
public class Triangulo implements Figuras2D {
    private Ponto2D p0;
    private double base;
    private double altura;
    
    public Triangulo(Ponto2D p0, double altura, double base) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.altura = altura;
        this.base = base;
    }
    
    public Ponto2D getP0() {
        return new Ponto2D(p0.getX(), p0.getY());
    }
    
     public Ponto2D calcP1(){
        return new Ponto2D(p0.getX()+base, p0.getY());
    }
    
    public Ponto2D calcP2(){
        return new Ponto2D(p0.getX(), p0.getY() + altura);
    }
    
     public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return base*altura/2;
    }

    @Override
    public double perimetro() {
        double hipotenusa = Math.sqrt(base*base+altura*altura);
        return base+altura+hipotenusa;
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
    
    public String toString() {
        return "Triangulo(" + p0 
                            + "\n "+calcP1() 
                            + "\n "+calcP2() 
                            + "\n "+area()
                            + "\n "+perimetro() +
                            "\n, base=" + base + ", altura=" + altura + ')';
    }
    
}
