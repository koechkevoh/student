/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okemwa;

import static okemwa.Okemwa.method1;

/**
 *
 * @author kevo
 */
public class Try {
    public static void main (String []args){
     int numerator = 40;
        int denomenator = 0;
        
       try{
    
    System.out.println("Answer"+ numerator/denomenator);

}
       catch(ArithmeticException e){
      System.out.println("Attempt to divide to zero");
    
}
       System.out.println("This will be printed");
    
}
}