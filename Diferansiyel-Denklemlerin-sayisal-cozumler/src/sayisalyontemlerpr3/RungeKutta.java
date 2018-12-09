/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayisalyontemlerpr3;

/**
 *
 * @author maya
 */
public class RungeKutta {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
          System.out.println(rungeKutta(Math.PI, 1, i, Math.PI/19));  
        }
      
    }
     public  static double f(double x,double y){
      return Math.sin(x)-  (1/x)*y;
    }
 public static double rungeKutta(double x0, double y0, int  n, double h)
{
    double k1, k2, k3, k4, k5;
    
    double y = y0;
    for (int i=1; i<=n; i++)
    {
        k1 = h*f(x0, y);
        k2 = h*f(x0 + 0.5*h, y + 0.5*k1);
        k3 = h*f(x0 + 0.5*h, y + 0.5*k2);
        k4 = h*f(x0 + h, y + k3);
        y = y + (1.0/6.0)*(k1 + 2*k2 + 2*k3 + k4);;
        x0 += h;
    }
 
    return y;
}
}
