//Inheritance Example - Runner

public class JobRunner
{
	public static void main (String [] args)
	{
		Job Person1 = new Job("Steve", 40000);
		Programmer Person2 = new Programmer("Alex", 55000);
		Job Person3 = new Programmer("Markus", 75000);

		//For the Job Person1
		Person1.jobInfo();
		Person1.payRaise(5000);
		Person1.jobInfo();
		//Person1.completeproject();

		//Person1 cannot run command completeproject because the object is of type Job, and
		//completeproject is only for objects of type Programmer.

		System.out.println("===");

		//For the Programmer Person2
		Person2.jobInfo();
		Person2.payRaise(5000);
		Person2.jobInfo();

		Person2.completeProject();
		//Person2 can run completeproject because it is an object of type Programmer.
		Person2.jobInfo();

		System.out.println("===");

		//For the Job/Programmer Person3
		Person3.jobInfo();
		Person3.payRaise(5000);
		Person3.jobInfo();
		//Person3.completeProject();

		//Person3 cannot run command completeproject because the object is of type Job, and
		//completeproject is only for objects of type Programmer.
		//Even though Person3 is defined with Programmer fields, it is still only within reach of class Job.

		System.out.println("===");

	}
}