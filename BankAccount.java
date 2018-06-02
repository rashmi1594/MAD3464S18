/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praveen
 */
public class BankAccount extends Bank{
    
    String accountName;
    String ownerName;
    float balanceAmmount;
    BankAccount()
          
    {
        super();
    this.accountName="unknown";
    
    this.ownerName="unknown";
     this.balanceAmmount=0.0f;
   
    }
    
    BankAccount( String bankName,int bankId,String accountName,String ownerName,float balanceAmmount)
        {
            super(bankName,bankId);
           this.accountName=accountName;
            this.ownerName=ownerName;
            this.balanceAmmount=balanceAmmount;
        }
    float deposit()
    { 
    float a=0.0f;
    float b;
    a=balanceAmmount;
    System.out.println("add money");
    b=Float.parseFloat(in.nextLine());
    a=a+b;
    this.balanceAmmount=a;
    return 0;
    
    
    
    }
    
    float withdraw()
    { 
    float a= 0.00f;
    float b;
    a=balanceAmmount;
    System.out.println("withdraw money");
    b=Float.parseFloat(in.nextLine());
    a=a-b;
    this.balanceAmmount=a;
    return a;
    
    
    
    }
    
    
    @Override
    public String toString(){
       String detail= super.toString();
    String data="accountName:" +this.accountName+"\n ownerName:"+this.ownerName+"\n balanceAmmount:"+this.balanceAmmount;
    return detail + data;
    
    
    }
    
    
}
