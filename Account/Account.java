public class Account
{
	private String accName;
	private String acid;
	private int balance;

public Account()
	{
      System.out.println("Empty Constructor-" +"\n");		
	}
	public Account(String accName,String acid, int balance)
	{ //Valued constructor
		System.out.println("Valued Constructor-");
		this.accName=accName;
		this.acid=acid;
		this.balance=balance;
	}
	public void show(){
	System.out.println("ACCOUNT NAME: " +this.accName);
	System.out.println("ACCOUNT HOLDER ID: " +this.acid);
	System.out.println("BALANCE: " +this.balance +"\n");
}
public void deposit(int amount){
	
	amount=amount;
	balance=balance+amount;
	System.out.println("Deposit Amount is:"+amount+"TK");
	System.out.println("New Balance After Deposit is:"+balance+"TK");
}
public void withdraw(int amount){
	amount=amount;
	balance=balance-amount;
	System.out.println("Withdraw Amount is:"+amount+"TK");
	System.out.println("New Balance After Withdraw is:"+balance+"TK");
}
public void transfer(Account ob, int amount){
	ob.balance=ob.balance;
	balance=balance-amount;
	System.out.println("After transfer Mr.Khan Balance is:"+balance+"TK");
	System.out.println("After transfer MD.Faruk Balance is:"+ob.balance+"TK");
	
}

}