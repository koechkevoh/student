/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author kevo
 */
public class InvokeCurrentClass {
    void m(){
    System.out.println("hello woll");
    
    }
    void n(){
     System.out.println("hello");
      this.m();
    }
   
    
    
}
class z{
    public static void main(String[] args){
    InvokeCurrentClass n = new InvokeCurrentClass();
    n.n();
    
    }
}
