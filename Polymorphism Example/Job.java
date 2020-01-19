//Polymorphism Example - Parent Class

public class Job
{
	//Defines variables for parent class Job
	private int hours;
	private int wage;

	//Methods for objects of type Job
	public void jobDesc()
	{
		System.out.println("You have a job!");
	}
	public int calculatePay(int h, int w)
	{
		return h*w;
	}
}