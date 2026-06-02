/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras2D;

/**
 *
 * @author aluno
 */
public class Circulo implements Figuras2D{
    private Ponto2D centro;
    private double raio;

    public Circulo(Ponto2D centro, double raio) {
        this.centro = new Ponto2D(centro.getX(), centro.getY());
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public Ponto2D getCentro() {
        return centro;
    }

    @Override
    public String toString() {
        return "Circulo(" + "centro=" + centro + ", raio=" + raio + ", area="+ area() + ", perimetro="+ perimetro() +')';
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        centro.moveXY(dX, dY);
    }
    
  
    
}
