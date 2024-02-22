public class A
{
	public static void main(String[] args)
	{
		String a="Hello";
		System.out.println(a);
		String b;
		b="Bye";
		System.out.println(b);
		String c=new String("JAVA");
		//c="JAVA";
		System.out.println(c);
		a=a.concat(c);
		System.out.println("a +c:"+a);
		
		System.out.println("looking for index no: "+a.indexOf("llo"));
		
		System.out.println("looking for char : "+a.charAt(0));
		
		
	}
}