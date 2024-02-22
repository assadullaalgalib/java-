public class Account
{
	private String id;
	private String name;
	private double balance;
	
	public Account()
	{
		System.out.println("Default");
	}
	
	public Account(String id,String name,double balance)
	{
		System.out.println("Valued");
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
		
	public void setValues(String id,String name,double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public String getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.id;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
		}
	}
	public void withdraw(double amount)
	{
		if(balance>=amount && amount>0)
		{
			this.balance-=amount;
		}
	}
	public void transfer(Account object,double amount)
	{
		this.withdraw(amount);
		object.deposit(amount);
		
	}
	public void show()
	{
		System.out.println("Acoount Info of...... "+this.name);
		System.out.println("ID "+this.id);
		System.out.println("Balance"+this.balance);
	}
	
}