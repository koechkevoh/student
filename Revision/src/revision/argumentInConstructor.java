
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
public class argumentInConstructor {
    A4 obj;
    argumentInConstructor(A4 obj){
        this.obj = obj;
    
    }
    void display (){
     System.out.println(obj.data);
    }
    
}
class A4 {
    int data =10;
    A4(){
        argumentInConstructor s =new argumentInConstructor(this);
        s.display();
    }
    
    public static void main (String []args){
    
    A4 a = new A4();
    }
}
