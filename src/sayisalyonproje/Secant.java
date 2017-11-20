/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayisalyonproje;

/**
 *
 * @author maya
 */
public class Secant {
    public static void main(String[] args) {
      double x0=0.1,x1=0.6, x2=0; 
      int count=0;
        while (count<10) {  
            x2=xi(x0, x1);
            System.out.println((count++) +" " +x2 ); 
            if (Math.abs(x2 - x1) <= 0.0001) {
                break;
            }
            x0=x1;
            x1=x2;
        }
    }
 public static double f(double x) {   
        return 600*Math.pow(x, 4)-550*Math.pow(x, 3)+200*Math.pow(x, 2)-20*x-1;          
    }
 public static double xi(double x0, double  x1) {
        return x1 -((f(x1)*(x1-x0))/(f(x1)-f(x0)));
    }
}
