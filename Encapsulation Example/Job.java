//Encapsulation Example - Method Program

public class Job
{
	//Defining fields for object
	private int wage;
	private String job;

	//Setter methods / Mutator methods to set or change values of the fields
	public void setJobProgrammer(){
		job = "Java Programmer";
		wage = 50000;
	}
	public void setJobTester(){
		job = "Java Tester";
		wage = 40000;
	}
	public int raise(){
		wage += 15000;
		return wage;
	}

	//Getter methods / Accessor methods to get values of the fields
	public int getWage(){
		return wage;
	}
	public String getJob(){
		return job;
	}
}