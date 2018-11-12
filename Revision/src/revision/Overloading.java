/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import javax.swing.JOptionPane;

/**
 *
 * @author kevo
 */
    class Rectangle{

  public static void printArea(int x,int y){
    JOptionPane.showMessageDialog(null,x*y);
  }
  public static void printArea(int x){
    JOptionPane.showMessageDialog(null,x*x);
  }
  public static void printArea(int x,double y){
    JOptionPane.showMessageDialog(null,x*y);
  }
  public static void printArea(double x){
    JOptionPane.showMessageDialog(null,x*x);
  }

  public static void main(String[] args){
    printArea(2,4);
    printArea(2,5.1);
    printArea(10);
    printArea(2.3);
}
}
   
