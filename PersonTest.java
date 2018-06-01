/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praveen
 */
public class PersonTest {
    public static void main(String args[])
    {
    Person sumanth = new Person();
   sumanth.name="sumath";
  sumanth.address="toronto";
  sumanth.age=20;
   System.out.println("name:" +sumanth.name+"\n address:" + sumanth.address + "\n age :" +sumanth.age);
//    Person foram = new Person();
//    foram.setName();
//    String nm =foram.getName();
//    foram.setAddress();
//    String add = foram.getAddress();
//    foram.setAge();
//    int age = foram.getAge();
//    
//    System.out.println("name :"+ nm + "\n addresss :"+ add+ "\n age:"+age);
//    
//    Person rashmi = new Person();
//    rashmi.setData();
//    System.out.println(rashmi.toString());
    
    Person aman =new Person();
   System.out.println( aman.toString());
    
    Person rimpal =new Person("rimpal","brapmpton",20);
    System.out.println(rimpal.toString());
    Person rimpal2 = new Person(rimpal);
    System.out.println(rimpal2.toString());
    }
    

}
