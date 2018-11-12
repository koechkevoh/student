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

    class Student{
  private String name;
  public Student(String n){
    name = n;
  }
  public Student(){
    name = "unknown";
  }
  public void printName(){
    System.out.println(name);
  }
}
class ConstructorOverriding {
  public static void main(String[] args){
    Student a = new Student("xyz");
    Student b = new Student();
    a.printName();
    b.printName();
  }
}
   
