/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashmi
 */
public class Arithmetic {
 
    int num1 = 10;
    
    void addition(){
        System.out.println("addition : " +(num1 + 20));
        
    }
    
    int addition(int n1,int n2){
        //System.out.println("sum : "+ n1 + " and " + n2 + " is " + (n1 +n2));
        
        return (n1 + n2);
    }
        
        // use void with println or use int with return.
        
     float addition (float n1 , float n2){
        return (n1+n2);
    }
     // add more than 2 numbers then use arrays
     //void addition(int n1[])
     //{
         //int sum =0;
         //for(int i=0; i<n1.length; i++)
         //{
          //   sum += n1[i];
         //}
         //System.out.println("sum = " + sum);
     //}
     
     
     //method overloading
     
     void addition(int ... numbers)
     {
         int sum =0;
         for (int no : numbers)
         {
             sum += no;
         }
         System.out.println("sum : " + sum);
         }
     //method overloading
    }


    