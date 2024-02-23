import java.util.Scanner;

public class Teacher
{
	private String id;
	private String name;
	private int officHr;
	Scanner sin=new Scanner(System.in);
	public void setValues()
	{
		System.out.print("Input ID: \t");
		this.id=sin.nextLine();
		System.out.print("Input Name:\t ");
		this.name=sin.nextLine();
		System.out.println("Input Office hour : ");
		this.officHr=sin.nextInt();
	}
	
	public void show()
	{
		System.out.println("............Teacher Info.............");
		System.out.println("ID:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Office hour:"+this.officHr);
	}
}