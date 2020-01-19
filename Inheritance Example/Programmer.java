//Inheritance Example - Child Class

public class Programmer extends Job
{
	//Constructor for Programmer object
	public Programmer(String nm, int st)
	{
		//Uses fields from object type Job, specifically name and salary
		super(nm, st);
	}

	//Methods associated with objects of type Programmer
	public void payRaise(int x){
		System.out.println("Through your work as a programmer, you have recieved a pay raise of $"+x);
	}
	public void jobInfo(){
		super.jobInfo();
	}
	public void completeProject(){
		super.payRaise(500);
		System.out.println("You have completed an independent project and earned $500");
	}
}