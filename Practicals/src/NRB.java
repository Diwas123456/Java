import java.util.Scanner;
public interface NRB{
	 abstract public void InterestRate();
	 abstract public void Depositor_Display();
	 abstract public void Customer_Display();
}
 class Account implements NRB {
	
String CoustomerName;
long AccNumber;
double BalanceAmount;
double TotalBalanceAmount=100000;
String AccBranchName;
long ContactNumber;
String NameOfDepositor;
String DepositedBranch;
    Account(String CoustomerName,
            long AccNumber,
            double BalanceAmount,
            String AccBranchName,
            long ContactNumber,
            String NameOfDepositor,
            String DepositedBranch)  //parameterized constructor
{
	this.CoustomerName = CoustomerName;
	this.AccNumber = AccNumber;
	this.BalanceAmount = BalanceAmount;
	this.AccBranchName = AccBranchName;
	this.ContactNumber = ContactNumber;
	this.NameOfDepositor = NameOfDepositor;
	this.DepositedBranch = DepositedBranch;
	
	
}
    public void InterestRate()
	{
    	TotalBalanceAmount = TotalBalanceAmount+BalanceAmount;
	 if(TotalBalanceAmount>1000000)
	 {
		 System.out.println("Interest rate is 6% annual and your total interest is : " + TotalBalanceAmount*1*6/100);
	 }
	 //if(BalanceAmount<1000000)
	 else{
		 System.out.println("Interest rate is 4.5% annual and your total interest is : " +" "+ TotalBalanceAmount*1*4.5/100);
	 }
	}
    
    public void Depositor_Display()
    {
    	System.out.println("Depositor's Detail");

    	System.out.println("Depositor's Name :"+NameOfDepositor);
    	System.out.println("Deposited Branch :"+DepositedBranch);
    	System.out.println("Depositor's contact number :"+ContactNumber);

    	System.out.println("Deposited Ammount of balance:"+BalanceAmount);
    	System.out.println("Total Balance after Deposit :"+TotalBalanceAmount);
    	
    }
    
    public void Customer_Display()
    {
    	System.out.println("Customer Detail :");

    	System.out.println("Customer's Name :"+CoustomerName);
    	System.out.println("Customer's Account Number :"+AccNumber);

        
    }
    
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	String C_Name,Brc_Name,N_Depositor,D_Brc,inputt;
    	long Acc_No=-1,Contact_Num;
    	double Blc_Amt; 
    	System.out.println("Enter customer name : ");
    	C_Name = sc.next();
    	while(Acc_No<0)
    	{
    		
    		System.out.println("Enter customer's account number(type only digits) : ");
    		inputt = sc.nextLine();
    		
    		try
    		{
    		Acc_No = Integer.valueOf(inputt);	
    		}
    		catch(NumberFormatException e)
    		{
    			Acc_No = -1;
    			//System.out.println("Invalid integer");
    		}
    	}
    	
    	System.out.println("Enter Account branch name : ");
        Brc_Name = sc.next();
    	System.out.println("Enter Balance Amount : ");
    	Blc_Amt = sc.nextDouble();
    	System.out.println("Enter depositor's contact number : ");
    	Contact_Num = sc.nextLong();
    	System.out.println("Enter name of depoditor : ");
        N_Depositor = sc.next();
    	System.out.println("Enter deposited branch : ");
    	D_Brc = sc.next();
        sc.close();
    	
    	
    	Account a1 = new Account(C_Name,Acc_No,Blc_Amt,Brc_Name,Contact_Num,N_Depositor,D_Brc);
    	a1.InterestRate();
    	a1.Depositor_Display();
    	a1.Customer_Display();
    	
    }
    
}
