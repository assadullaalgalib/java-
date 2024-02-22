public class AccountMain
{
	public static void main(String[] args)
	{
		Account ob1=new Account();
		ob1.setValues("11-2","Mr. X",20000);
		ob1.show();
		Account ob2=new Account("122-A","Ms Y",5000);
		ob2.show();
		ob1.transfer(ob2,1000);
		
		ob1.show();
		ob2.show();
		
		
		
	}
}