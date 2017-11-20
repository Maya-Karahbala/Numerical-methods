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
public class bisection {
    public static NumberFormat formatter = new DecimalFormat("#.######"); 
    public static void main(String[] args) {
      
       double a=0.1,b=1.0,p=(a+b)/2;
       int count=0;
       //(f(p)*100)>0
       while(count<20){
           count++;
           p=Double.valueOf(formatter.format(p));
          
           System.out.println(count+"   a: "+a+"    b: "+b+"   p:"+p+
          "   f(p): "+f(p));
           if(Math.abs(f(p))<=0.0001){
             break;
           }
           // hangisi eksi hangisi artı kontrolu
        if((f(p)<0&&f(a)<0)||(f(p)>0&&f(a)>0)){
            
            a=Double.valueOf(formatter.format(p));
        }
        else if((f(p)<0&&f(b)<0)||(f(p)>0&&f(b)>0)){
           b=Double.valueOf(formatter.format(p));
        }
        p=(a+b)/2;   
       }
       
       
    }
  public static  double  f(double x){
     return    Double.valueOf(formatter.format(600*Math.pow(x, 4)-550*Math.pow(x, 3)+200*Math.pow(x, 2)-20*x-1));
     
    }
}
