public class Student extends Human 
{
	private float cgpa;
	private String sid;
	
	public Student()
	{
		System.out.println("Default constructor in Student");
	}
	public Student(String name,int age,float height,float cgpa,String sid)
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.cgpa=cgpa;
		this.sid=sid;
		System.out.println("Default constructor in Student");
	}
	public void SetValues(String name,int age,float height,float cgpa,String sid)
	{
		
		this.name=name;
		this.age=age;
		this.height=height;
		this.cgpa=cgpa;
		this.sid=sid;
	}
	public void showInfo()//Method Overriding
	{
		System.out.println("Student Info>>>>>>>>>");
		System.out.println("Name: "+this.name+"\n"+"Age: "+this.age+"\n"+"Height: "+this.height);
		System.out.println("Sid: "+this.sid);
		System.out.println("CGPA: "+this.cgpa);
	}
	
}