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
abstract class Employeee{
  abstract int getSalary();
}
class Developer extends Employeee{
  private int salary;
  public Developer(int s){
    salary = s;
  }
  int getSalary(){
    return salary;
  }
}
class Driver extends Employeee{
  private int salary;
  public Driver(int t){
    salary = t;
  }
  int getSalary(){
    return salary;
  }
}
class abstract0{
public static void main(String[] args){
  Developer d1 = new Developer(5000);
  Driver d2 = new Driver(3000);
  int a, b;
  a = d1.getSalary();
  b = d2.getSalary();
  System.out.println("Salary of developer : " + a);
  System.out.println("Salary of driver : " + b);
}
}
