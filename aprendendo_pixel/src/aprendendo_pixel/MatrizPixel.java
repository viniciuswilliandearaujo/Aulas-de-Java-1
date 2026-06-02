/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendendo_pixel;

import java.util.Arrays;

/**
 *
 * @author arauj
 */
public class MatrizPixel {
    private final int nLin;
    private final int nCol;
    private Pixel M[][]; //pq usou double na matriz
    
    public static Pixel red = new Pixel(255, 0, 0);
    public static Pixel green = new Pixel(0, 255, 0);
    public static Pixel blue = new Pixel(0, 0, 255); 
    public static Pixel white = new Pixel(255, 255, 255);
    public static Pixel black = new Pixel(0, 0, 0);
    
    public MatrizPixel(int nLin, int nCol){
        this.nLin = nLin;
        this.nCol = nCol;
        M = new Pixel[nLin][nCol];
        for(int i = 0; i < M.length; i++)
            for( int j = 0; j < M[0].length; j++)
                M[i][j] = black;
    }
    
    public MatrizPixel(int nLin, int nCol, Pixel rgb){
        this.nLin = nLin;
        this.nCol = nCol;
        M = new Pixel[nLin][nCol];
        for(int i = 0; i < M.length; i++)
            for( int j = 0; j < M[0].length; j++)
                M[i][j] = rgb;
    }

    public int getnLin() {
        return nLin;
    }

    public int getnCol() {
        return nCol;
    }

    public Pixel[][] getM(int i, int j) {
        return M;
    }
    
    public Pixel getP(int nLin, int nCol){
        return M[nLin][nCol];
    }

    public void setM(int i, int j, Pixel valor){
        if(i<=nLin && j<=nCol)
            M[i][j] = valor;
    }
    

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < M.length; i++){
            for( int j = 0; j < M[0].length; j++)
                if(M[i][j].equals(red))
                    str += "red ";
                else if(M[i][j].equals(green))
                    str += "green ";
                else if (M[i][j].equals(blue))
                    str += "blue ";
                else if(M[i][j].equals(white))
                    str += "white ";
                else if(M[i][j].equals(black))
                    str += "black ";
                else 
                    str += "?? ";
            str += "\n";
        }  
        return str;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Arrays.deepHashCode(this.M);
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
        final MatrizPixel other = (MatrizPixel) obj;
        return Arrays.deepEquals(this.M, other.M);
    }
}

/*public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        /*final MatrizPixel other = (MatrizPixel) obj;
        for(int i = 0; i < M.length; i++){
            for( int j = 0; j < M[0].length; j++)
                if(!(this.getP(i, j).equals(other.getP(i, j))))
                    return false;
        }
        return true;
    }
    
}
*/
