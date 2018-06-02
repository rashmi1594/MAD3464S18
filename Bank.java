
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashmi
 */
public class Bank {
    String bankName;
    int bankId;
    Scanner in = new Scanner(System.in);
    Bank()
    {
    this.bankName="unknown";
    this.bankId=0;
    }
     Bank(String bankName,int bankId)
    {
    this.bankName=bankName;
    this.bankId=bankId;
    }
     void setbankName()
     {

    System.out .println("enter bankName :");
    bankName=in.nextLine();
     
     
     }
     String getbankName()
     {
         
         return bankName;
     }
     void setbankId()
     {

    System.out .println("enter bankId :");
    bankId=Integer.parseInt(in.nextLine());
     
     
     }
     int getbankId()
     {
         
         return bankId;
     }
     
     void data()
     {
     setbankName();
     setbankId();
     }
       @Override
    public String toString()
     {String data="BankName:"+bankName+"\n BankId:"+bankId;
         return data;
     }
}
