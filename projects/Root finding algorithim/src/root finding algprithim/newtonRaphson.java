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
public class newtonRaphson {

    public static void main(String[] args) {
        double x1 = 0.1, x0 = 0;
        int sayac = 0;
        while (sayac < 20) {
            System.out.println((sayac++) + "   " + x1);
            if (Math.abs(x1 - x0) <= 0.0001) {
                break;
            }
            x0 = x1;
            x1 = xi(x0); 
        }
    }
    public static double f(double x) {
       return 600*Math.pow(x, 4)-550*Math.pow(x, 3)+200*Math.pow(x, 2)-20*x-1;
    }
    public static double df(double x) {
       return 2400*Math.pow(x, 3)-1650*Math.pow(x, 2)+400*x-20;
    }
    public static double xi(double x) {
        return x - ((f(x)) / (df(x)));
    }
}
