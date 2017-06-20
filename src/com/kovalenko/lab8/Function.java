package com.kovalenko.lab8;

public class Function {
    
    double x;
    
    public Function(){
        
    }
    
    public Function(double x){
        this.x = x;
    }
    
    public double work(double x){
    
        double y = (Math.sqrt(Math.pow(x, 2) - 4))/x;
        return y;
    }
    
    public String teylor(double x, int i){
        
        double  sum1 , sum2 = 0;
        double accuracy = 0.0001, q = 1;
        //int i = 1;
        int k = -1;
        double f = Math.sqrt(x);

        while(Math.abs(q) > accuracy){
            double n = Math.pow(2, i);
            sum1 = (Math.pow(k, i+1))/(n*Math.pow(x, i-0.5));
            q = Math.abs(sum1) - Math.abs(sum2);
            sum2 = Math.abs(sum1);
            f+=sum1;
            i++;
        }
        String formattedF2 = String.format("%.10f", f);

        return formattedF2;
    }
    
    public static double factorial(double num) {
       double fact = 1;
 
       for (double i = 1; i <= num; i++) {
           fact *= i;
       }
           return fact;
   }
    
}
