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
public class method {
  public static int add_int(int x, int y){
      
      JOptionPane.showInputDialog(null,"Enter x");
      JOptionPane.showInputDialog(null,"Enter y");
      return x+y;
      
    
  }
  public static void main(String[] args){
    int z;
    z = add_int(2,3);
    JOptionPane.showMessageDialog(null, z);
}}
    
