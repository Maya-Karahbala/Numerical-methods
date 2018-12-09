/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayisalyonproje;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author maya
 */
public class fixedPoint {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.000000");
        double xi = 0.785, previousValue = 0;
        int count = 0;
        while (count < 100) {
            count++;
           xi = Double.valueOf(formatter.format(g(xi)));
            System.out.println(count + " " + xi);
            if (Math.abs((g(xi) - g(previousValue))) < 0.0001) {
                break;
            }
            previousValue = xi;
        }
    }
    public static double g(double x) {// x=g(x) 
        return Math.pow((550 * Math.pow(x, 3) - 200 * Math.pow(x, 2) + 20 * x + 1) / 600, 0.25);

    }
}
