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
public class Super {
    String color = "White";   
}
class Dog extends Super{
    String color = "Black";
    void printColor(){
    System.out.println(color);
    System.out.println(super.color);
    
    }

}
class Color{
    public static void main(String []args){
        Dog g = new Dog();
        g.printColor();
    }
}

