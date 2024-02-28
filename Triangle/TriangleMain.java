public class TriangleMain
{	
    public static void main(String[] args)
	{
	Triangle t1= new Triangle(); 
	Triangle t2= new Triangle(10,10,10);
	System.out.println("1st Triangle");
	t2.showInfo();
	t2.testTriangle();
	
	Triangle t3= new Triangle(10,11,10);
	System.out.println("2nd Triangle");
	t3.showInfo();
	t3.testTriangle();
	
	Triangle t4= new Triangle(11,12,13);
	System.out.println("3rd Triangle");
	t4.showInfo();
	t4.testTriangle();
    }

}