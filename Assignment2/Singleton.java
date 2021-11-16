package Assignment2;
import java.util.*;
public class Singleton {
private static Singleton single=new Singleton();
	
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return single;
	}
	public void getInfo()
	{
		System.out.println("In Singleton class...!!!");
	}

}



