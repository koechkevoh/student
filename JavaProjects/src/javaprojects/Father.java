/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojects;
import java.util.*;
/**
 *
 * @author kevo
 */
public class Father {
     String name;
        int Age;
        int networth;
    public void nameFather(){
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter fathers name");
        name = s.nextLine();
        System.out.println("Enter fathers Age");
        Age = s.nextInt();
        System.out.println("Enter fathers networth");
        networth = s.nextInt();
   
        
    }
    
}
