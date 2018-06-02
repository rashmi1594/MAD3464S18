/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praveen
 */
public class overDraftlimit extends BankAccount {
    
    float overDraftlimit;
    overDraftlimit ()
    {
    super();
    this.overDraftlimit=0.00f;
    }
    overDraftlimit (String bankName,int bankId,String accountName,String ownerName,float balanceAmmount,float overDraftlimit)
    {
    super(bankName,bankId,accountName,ownerName,balanceAmmount);
    this.overDraftlimit=overDraftlimit;
    //}
    //void action()
    //{
    float j;
    j=withdraw();
    if((j-this.overDraftlimit)>0)
    {
    System.out.println("withdraw allow");
    
    }
    else
    {
    System.out.println("withdraw  not allow");
    
    }
    }
    
    
}
