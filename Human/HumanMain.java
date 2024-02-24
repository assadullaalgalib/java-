public class HumanMain
{
	public static void main(String[] args)
	{
		  Human h1=new Human("Ms. Y",21,5.4F);
		  h1.showNo();
          Human h2=new Human();
		  h2.showNo();
		  Human h3=new Human();
	   // h1.setValues("Ms. XYZ");
		//h1.showInfo();
		 
		  h3.showNo();
		System.out.println("Total object :"+Human.no);
	}
}