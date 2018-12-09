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
public class soru4 {
     //// 20 nokta oldüğü için
    public static void main(String[] args) {
       double   bas=Math.PI, bit=2*Math.PI;
       double h=(bit-bas)/19;
       double y=1 ,x=bas;
        for (int i = 1; i < 20; i++) {
        y=y*(1-(h/x))+h*Math.sin(x);
            System.out.println(""+y);
            x+=h;
        }
        
    }
   public  static double f(double x,double y){
        return Math.sin(x)-  (1/x)*y;
    }
  
   
}
