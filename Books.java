/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Praveen
 */
public class Books {
    
    int bookId;
    String bookTitle;
    int bookRating;
    Scanner in= new Scanner(System.in);
    Books()
    {
    this.bookId=0;
    this.bookTitle="unknown";
    this.bookRating=0;
    
    }
    Books(int bookId,String bookTitle,int bookRating)
    {
    this.bookId=bookId;
    this.bookTitle=bookTitle;
    this.bookRating=bookRating;
    
    }
            void setbookId()
     {

    System.out .println("enter bankid :");
     bookId=Integer.parseInt(in.nextLine());
     
     
     }
     int getbookId()
     {
         
         return bookId;
     }
        void setbookTitle()
     {

    System.out .println("enter bankTitle :");
     bookTitle=in.nextLine();
     
     
     }
     String getbookTitle()
     {
         
         return bookTitle;
     }
       void setbookRating()
     {

    System.out .println("enter bankTitle :");
     bookRating=Integer.parseInt(in.nextLine());
     
     
     }
     int getbookRating()
     {
         
         return bookRating;
     }
     void displayInfo()
     {
     System.out.println("bookId   "+this.bookId+"\nbookName  "+this.bookTitle+"\n book rting  "+this.bookRating);
     }
}
class bookTitleComparator implements Comparator<Books>
{
@Override
public int compare(Books o1 ,Books o2)
{
return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
}
}
class bookRatingComparator implements Comparator<Books>
{
@Override
public int compare(Books o1 ,Books o2)
{
if(o1.bookRating==o2.bookRating){
return 0;}
else if(o1.bookRating<o2.bookRating)
    return 1;
else
    return -1;
}

}

