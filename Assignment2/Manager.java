package Assignment2;

public class Manager extends Employee {
	int incentives=6000;
	void salary()
	{
		int sal;
		sal=25000+incentives;
		System.out.println("The salary of a Manager is Rs:" +sal);
	}
}
