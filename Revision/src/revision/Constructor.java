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
public class Constructor {
    Constructor(){
    System.out.println("Created from super class");
    }
    
    
}
class sun extends Constructor{
    sun(){
    super();
    System.out.println("ffsfsafsf");
    
    }
}
class super3{
    public static void main(String []args){
    sun n = new sun();
    
    }

}
