package LambdaAssignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StringProgram {
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		Consumer<String> letter=(s)->
		{
			sb.append(s.charAt(0)); 
		};
		List<String> li=new ArrayList<>();
		li.add("Samba");
		li.add("Rakesh");
		li.add("Jagadeesh");
		li.add("Siva");
		for (Iterator iterator = li.iterator(); iterator.hasNext();) 
		{
			String string = (String) iterator.next();
			letter.accept(string);
			
		}
        System.out.println("-----");
		System.out.println(sb);
		System.out.println("-----");
	}
}
