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
public class Animals {
    public void sound(){
    System.out.println("sounds of animals");
    }
    
}
class Dogs extends Animals{
    public void sound(){
    
    System.out.println("Barks");

    }
}
class Cats extends Animals{
public void sound(){
    System.out.println("miaow");
   }


}
class Monkeys extends Animals{
    public void sound(){
    System.out.println("kejfiejf");
    }
}
class m{
public static void main(String []args){
    Animals d= new Dogs();
    Animals c = new Cats();
    Animals m = new Monkeys();
    d.sound();
    c.sound();
    m.sound();

}

}

