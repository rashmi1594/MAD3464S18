/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Praveen
 */
public class ArrayListTest {
    public static void main(String args[])
    {
    
    //int [] productName=new int[6]; //not use because size restriction   }
    ArrayList<String> productsName=new ArrayList<String>();//spaecify the type of string in<>
    productsName.add("projector");
     productsName.add("excel");
      productsName.add("contigo");
       productsName.add("apple");
        //productsName.add(2,"oracle");//2 is the index where u want to add value
//        for(String raman:productsName)//raman take all value in array productsname
//       {
//           System.out.println(raman);
//       }System.out.println("----");
        productsName.remove("oracle"); 
        if(productsName.contains("oracle")){productsName.remove("oracle");}else{System.err.println("buy oracle first");}
       
       Collections.sort(productsName);
       System.out.println("=====");
    for(String raman:productsName)//raman take all value in array productsname
       {
           System.out.println(raman);
       }
    ArrayList<Books> library=new ArrayList<Books>();//libraary is object name
 Books book1=new Books(101,"the sky is faling",9);//book1 is object of books
     Books book2=new Books(102,"the love is faling",5);
      Books book3=new Books(103,"the monk",9);
       Books book4=new Books(105,"the love",7);
    library.add(book1);
     library.add(book2);
      library.add(book3);
        library.add(book4);
        for(Books bk:library)//bk is iteration variable
        {bk.displayInfo();}
        System.out.println("no of books in library  "+library.size());
        if(library.contains(book2)){library.remove(book2);}
          System.out.println("no of books in library  "+library.size());
          library.add(2,new Books(120,"fall in love",9));
          
          Collections.sort(library, new bookTitleComparator());
           Collections.sort(library, new bookRatingComparator());
          for(Books bk:library)//bk is iteration variable
        {bk.displayInfo();}
          
          
    }
       
       
}
