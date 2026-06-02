/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprendendo_pixel;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 *
 * @author arauj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Date today = new Date();
            InetAddress localHost = InetAddress.getLocalHost();
            String hostName = localHost.getHostName();
            String ipAddress = localHost.getHostAddress();
            System.out.println("Vinícius Willian de Araujo");
            System.out.println("Date: " + today);
            System.out.println("Hostname: " + hostName);
            System.out.println("Endereço IP: " + ipAddress);
            
            Pixel red = new Pixel(255, 0, 0);
            Pixel green = new Pixel(0, 255, 0);
            Pixel blue = new Pixel(0, 0, 255);
            Pixel c1 = new Pixel(10000, 10000, 10000);
            Pixel c2 = new Pixel(35, 35, 35);
            Pixel c3 = new Pixel(45, 45, 45);
            Pixel c4 = new Pixel(47, 47, 47);

            MatrizPixel m1 = new MatrizPixel(3, 3, red); // começa em 0
            m1.setM(2,2,blue);
            m1.setM(1,2,green);
            m1.setM(1, 1, new Pixel(255,0,255));
            m1.setM(1,0, new Pixel(0,0,0));
            m1.setM(0,0,new Pixel(255,255,255));
            System.out.println(m1);
        } catch(UnknownHostException ex){
            System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, ex);
        }
    }
    
}
