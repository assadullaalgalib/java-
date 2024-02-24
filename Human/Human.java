public class Human
{
	private String name;//Instance variable
	private int age;//Instance variable
	private float height;//Instance variable
	//public static int no=10;
	public static int no;//Class variable
	
	public Human()
	{
		System.out.println("Default Constructor");
		no++;
	}
	public Human(String name,int age,float height)
	{
		System.out.println("Valued Constructor");
		this.name=name;
		this.age=age;
		this.height=height;
		no++;
	}
	public void setValues(String name,int age,float height)
	{
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public void setValues(String name)
	{
		//int a;//local variable
		this.name=name;
		//System.out.println(" A: "+a);//Will provide error as no default value 
		
	}
	
	public void showInfo()
	{
		System.out.println("Info>>>>>>>>>");
		System.out.println("Name: "+this.name+"\n"+"Age: "+this.age+"\n"+"Height: "+this.height);
	}
	public static void showNo()
	{     
	    //this.showInfo();
		System.out.println("Object No : "+no);
	}
	
}