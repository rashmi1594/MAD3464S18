/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praveen
 */
public class BankMain {
    public static void main(String args[])
    {
    
    
        
        BankAccount bk1 = new BankAccount("idb",2,"a101","rashmi",400.0f);
   
   
            System.out.println(bk1.toString());
            overDraftlimit ol1 = new overDraftlimit("idbk",2,"a102","rashmi",2000.0f,1000.0f);
              System.out.println(ol1.toString());
}
