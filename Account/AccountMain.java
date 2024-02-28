public class AccountMain{
	
	public static void main(String[] args)
{       
		Account z1= new Account();
		Account x1= new Account("Mr.Khan","21-Khan",94999);
		x1.show();
		
		Account y1= new Account("MD.Faruk","22-Faruk",5050);
		y1.show();
	
	x1.deposit(500);
    x1.withdraw(100);
	x1.transfer(y1,400);
}
}