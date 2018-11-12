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
public class Employee {
    private String name;
    private double salary;
    //constructor
    Employee(String n,double s){
    name = n;
    salary = s;
    } 
    //method
    void pay(){
    System.out.println("Pay to the order of "+name+ "$"+salary);
    }
    public String getName(){
    return name;
    }
    
}
