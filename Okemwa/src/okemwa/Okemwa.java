/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okemwa;

/**
 *
 * @author kevo
 */
public class Okemwa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerator = 40;
        int denomenator = 0;
        
         method1(numerator,denomenator);
        System.out.println("This will not be printed");
     
    }
    static void method1(int num, int denom){
        method2(num,denom);
        System.out.println("This will not be printed");
        
    }
    static void method2(int num ,  int denom){
        int div = num/denom;
        System.out.println("no changes here as well");
        
    }
    
}

