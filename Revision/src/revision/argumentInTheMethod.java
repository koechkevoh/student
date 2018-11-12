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
public class argumentInTheMethod {
    
    void m(argumentInTheMethod se){
        System.out.println("Method Invoked");
    }
    void p (){
    m(this);
    }
    
    public static void main (String []args){
        argumentInTheMethod se= new argumentInTheMethod();
        se.p();
    }
    
    
}
