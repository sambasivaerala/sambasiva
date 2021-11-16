package Assignment2;
import java.io.*;
import java.util.*;
public class Client 
{
	public static void main(String[] args)
	{
		
		Persistence dp=new DatabasePersistence();
		dp.persist();
	}
}

