package demo;

public class MyKeywords {
	 
	public String sayHi(String name)
	{
		return "Hello " +name ;
	}
 
	public String sayHi()
	{
		return "Hello World!";
	}
 
	public String typeOf(Object param)
	{
		return param.getClass().getSimpleName();
	}
}