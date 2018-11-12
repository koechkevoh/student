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

public class Son extends Father {
    
    public void sonDetails(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter sons Name");
         name=s.nextLine();
         System.out.println("enter sons age");
         Age=s.nextInt();
    }
}
