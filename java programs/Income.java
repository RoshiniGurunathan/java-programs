public class Income
{
	private int salary;
	private String name;
	public String getName()
	{
	return name;
	}
	public void setName(String n)
	{
	name=n;
	}

	public int getSalary()
	{
	return salary;
	}
	public void setSalary(int s)
		{
		if(s>10000)
			
			salary=s;
			
		else
			salary=10000;
			
		}
}