/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import javax.swing.*;
public class Car {
    public static void main (String []args){
    String partsStr = read("What is the parts cost");
    String hourStr = read("How many hours");
    double parts = Double.parseDouble(partsStr);
    double hours = Double.parseDouble(hourStr);
    //calculate bill before vat
    double bill = parts+hours*20;
    //add VAT
    
    bill*= 1.175;
    display("Your bill is $"+ bill);
 
    }
    private static void display(String s){
    JOptionPane.showMessageDialog(null, s);
    }
    private static String read(String prompt){
    return JOptionPane.showInputDialog(prompt);
    }
}
