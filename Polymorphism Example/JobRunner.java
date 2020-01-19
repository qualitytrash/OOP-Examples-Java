//Polymorphism Example - Runner

public class JobRunner
{
	public static void main (String [] args)
	{
		//Polymorphism - runtime example
		Job jobbase = new JobDeveloper();
		jobbase.jobDesc();
		//^ inherits overwritten method from JobDeveloper instead of using from Job

		//Polymorphism - compiletime example
		JobDeveloper jobdev = new JobDeveloper();
		//Changing number of arguements defines which method from which class
		System.out.println(jobdev.calculatePay(20,100));
		//^ inherited from Job object
		System.out.println(jobdev.calculatePay(20,100,500));
		//^ defined in JobDeveloper object
	}
}