//Inheritance Example - Mother Program

public class Job
{
	//Private fields for object Job
	private int salary;
	private String name;

	//Declares an object under Job
	public Job(String n, int s)
	{
		name = n;
		salary = s;
	}

	//Methods associated with objects of type Job
	public void payRaise(int x){
		salary += x;
		System.out.println("Through hard work, you have recieved a pay raise of $"+x);
	}
	public void jobInfo(){
		System.out.println("Your name is "+name+" and you make $"+salary);
	}
}