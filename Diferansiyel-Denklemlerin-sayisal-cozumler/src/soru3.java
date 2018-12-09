/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maya
 */
public class soru3 {
  static double   bas=Math.PI, bit=2*Math.PI;

  static  double h=(bit-bas)/19;//// 20 nokta oldüğü için
   
    static  double k1,k2,k3,k4;
    public static void main(String[] args) {
      // for (int i = 0; i < 20; i++) {
    System.out.println(w(20));  
      //  }   
    }
   public  static double f(double x,double y){
 
     return  Math.sin(x)-  (1/x)*y;
    }
   public  static double x(int i){
       return bas+ h*i;
   }
   public  static double w(int iterasyon){
        if (iterasyon==0)return 1;
        k1=h*f(x(iterasyon-1),w(iterasyon-1));
        k2=h*f(x(iterasyon-1)+(h/2),w(iterasyon-1)+(k1/2));
        k3=h*f(x(iterasyon-1)+(h/2),w(iterasyon-1)+(k2/2));
        k4=h*f(x(iterasyon-1)+h  ,w(iterasyon-1)+k3);
       
        return (w(iterasyon-1)+ ((double)1/6)*(k1+ 2*k2 + 2*k3 +k4));
                
    }
}
