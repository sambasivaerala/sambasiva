package Assignment2;
import java.util.*;
public abstract class Shape {
abstract void draw();
	
	public static void main(String[] args) 
	{
		Shape l=new Line();
		l.draw();
		Shape r=new Rectangle();
		r.draw();
		Shape c=new Cube();
		c.draw();
	}

}
