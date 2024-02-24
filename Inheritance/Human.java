public class Human
{
	protected String name;//Instance variable
	protected int age;//Instance variable
	protected float height;//Instance variable
	
	public Human()
	{
		System.out.println("Default Constructor Human");
		
	}
	public Human(String name,int age,float height)
	{
		System.out.println("Valued Constructor Human");
		this.name=name;
		this.age=age;
		this.height=height;
		
	}
	public void setValues(String name,int age,float height)
	{
		this.name=name;
		this.age=age;
		this.height=height;
	}
		
	
	
	public void showInfo()
	{
		System.out.println("Human Info>>>>>>>>>");
		System.out.println("Name: "+this.name+"\n"+"Age: "+this.age+"\n"+"Height: "+this.height);
	}
	
	
}