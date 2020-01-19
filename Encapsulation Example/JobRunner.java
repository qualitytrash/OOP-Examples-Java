//Encapsulation Example - Runner Program

public class JobRunner
{
	public static void main (String [] args)
	{
		Job Steve = new Job();

		//Setting Steve to Job Tester
		Steve.setJobTester();

		//Retrieving values from Steve of wage and job title
		System.out.println("Steve's wage is $"+Steve.getWage());
		System.out.println("Steve works as a "+Steve.getJob());
		System.out.println("===");

		//Setting Steve to Job Programmer
		Steve.setJobProgrammer();
		System.out.println("Steve has changed jobs!");
		System.out.println("===");

		//Retrieving values from Steve of wage and job title
		System.out.println("Steve's wage is $"+Steve.getWage());
		System.out.println("Steve works as a "+Steve.getJob());
		System.out.println("===");

		//Incrementing wage variable
		Steve.raise();
		System.out.println("Steve has recieved a raise!");
		System.out.println("===");

		//Retrieving values from Steve of wage and job title
		System.out.println("Steve's wage is $"+Steve.getWage());
		System.out.println("Steve works as a "+Steve.getJob());

	}
}