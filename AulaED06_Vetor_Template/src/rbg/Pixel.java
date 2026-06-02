/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rbg;

/**
 *
 * @author arauj
 */
public class Pixel implements Comparable<Pixel> {
    private int r;
    private int g;
    private int b;

    public Pixel(int r, int g, int b) {
        if(r >= 0 && r<= 255 && 
                g >= 0 && g<= 255 && 
                b >= 0 && b<= 255 ){
            this.r = r;
            this.g = g;
            this.b = b;
        } else {
            this.r = 0;
            this.g = 0;
            this.b = 0;
        }
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if(r >= 0 && r<= 255)
            this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        if(g >= 0 && g <= 255)
            this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(r >= 0 && r<= 255)
            this.b = b;
    }

    @Override
    public String toString() {
        return "Pixel{" + "rgb = (" + r + "," + g + "," + b + ")}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.r;
        hash = 29 * hash + this.g;
        hash = 29 * hash + this.b;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pixel other = (Pixel) obj;
        if (this.r != other.getR()) {
            return false;
        }
        if (this.g != other.getG()) {
            return false;
        }
        return this.b == other.getB();
    }

    @Override
    public int compareTo(Pixel o) {
        return 0;
    }
    
}
