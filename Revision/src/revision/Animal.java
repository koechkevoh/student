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
public class Animal {
    void eat(){
        System.out.println("eating....");
    }
    
}

class Cow extends Animal{
    void eat(){
        System.out.println("eating bread");
        
    }
    void mow(){
        System.out.println("Moooows");
    }
    void display (){
        super.eat();
        mow();
    }

}
class mw{
     public static void main(String []args){
         Cow e = new Cow();
         e.display();
     
     }
}
