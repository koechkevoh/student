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
public class InvokeCurrentConstructor {
    InvokeCurrentConstructor(){
    System.out.println("my friend is ");
    
    }
    InvokeCurrentConstructor(int x){
        this();
    System.out.println(x);
    
    }
    
}
class p{
    public static void main(String []args){
        InvokeCurrentConstructor g = new InvokeCurrentConstructor(10);
        
    
    }
}
