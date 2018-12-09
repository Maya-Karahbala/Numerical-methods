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
public class soru2 {
    static double   bas=Math.PI, bit=2*Math.PI;
     static  double h=(bit-bas)/19;//// 20 nokta oldüğü için
    public static void main(String[] args) {
       for (int i = 0; i < 20; i++) {
         System.out.println(w(i));   
        }
        
    }
   public  static double f(double x,double y){
        return Math.sin(x)-  (1/x)*y;
    }
   public  static double x(int i){
       return bas+ h*i;
   }
   public  static double w(int i){
        if (i==0)return 1;// baslanıç köşul
        return w(i-1)  +  
               (h/2)*
                (f(x(i-1),w(i-1))+
                f(x(i),w(i-1) +h*f(x(i-1),w(i-1))));
    }
}
