//Polymorphism Example - Child Class

public class JobDeveloper extends Job
{
	//Overwritten methods from parent class Job
	public void jobDesc()
	{
		System.out.println("You work as a developer!");
	}
	public int calculatePay(int h, int w, int b)
	{
		return (h*w)+b;
	}
}