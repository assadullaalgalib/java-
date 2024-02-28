public class Triangle{
	private int x;
	private int y;
	private int z;
	
	public Triangle()//Empty Constructor
	{
		System.out.println("Empty Constructor" +"\n");
	}
	
	public Triangle(int x ,int y , int z){ //Valued constructor
		System.out.println("Valued Constructor" +"\n");
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	public void testTriangle()//if else statement for findout equilateral,isosceles,scalene
	{
		if(x==y&&y==z){ 
			System.out.println("The Triangle is equilateral" +"\n");
		}
		else if(x==y||x==z||y==z){
			System.out.println("The Triangle is isosceles" +"\n");
		}
		else{
			System.out.println("The Triangle is scalene " +"\n");
		}
	}
	
	public void showInfo(){ //Show Information
		System.out.println("X: " +x);
		System.out.println("Y: " +y);
		System.out.println("Z: " +z);
	}
	
	
	
}