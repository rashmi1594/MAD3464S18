
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rashmi
 */
public class Person 
{
    
    
    String name;
    String address;
    int age;
        Scanner in = new Scanner(System.in);
        //default construstor
        Person()
        
        {
        name="unknown";
        address="unknown";
        age=1;
        
        
        }
       //parametraised constructor
        Person(String name,String address,int age)
        {
           this.name=name;
            this.address=address;
            this.age=age;
        }
        //copy constructor
        Person(Person anotherPerson){
        this.name=anotherPerson.name;
        this.address=anotherPerson.address;
        this.age=anotherPerson.age;}
     void setName()
     {

    System.out .println("enter name :");
    name=in.nextLine();
     
     
     }
     String getName()
     {
         
         return name;
     }
     void setAddress()
     {
     System.out.println("enter address:");
     address = in.nextLine();
     }
     String getAddress()
     {
     return address;
     }
     void setAge()
     {
     System.out.println("enter age:");
     age = Integer.parseInt(in.nextLine());
     
    }
     int getAge()
     {return age;}
     void setData()
     {
     setName();
     setAddress();
             setAge();
     }
     
    @Override
    public String toString()
     {String data="name:"+name+"\n address:"+address+"\n age:"+age;
         return data;
     }
     }

