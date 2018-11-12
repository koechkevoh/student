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
public class InstantVariable {
    int rollno;
    String name;
    float fee;
    
    InstantVariable(int rollno,String name, float fee){
    this.rollno = rollno;
    this.name = name;
    this.fee=fee;
    
    }
    public void display(){
        System.out.println(rollno+" "+name+ ""+fee);
    }
    
}
class Main{
    public static void main(String []args){
    InstantVariable s =new InstantVariable (10,"kevin",20000);
    InstantVariable z =new InstantVariable (12,"brayoo",2000);
    
    s.display();
    z.display();
    }
}
