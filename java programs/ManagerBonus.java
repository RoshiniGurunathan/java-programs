

public class ManagerBonus extends Employee {
	String bonus;
	public ManagerBonus()
	{
		empid="EM0001";
		empname="roshini";
		salary="10000";
		bonus="20000";
	
	}
public void showBonus()
{
System.out.println("employee bonus:" +bonus);	
}
	public static void main(String[] args) {
		ManagerBonus obj=new ManagerBonus();
		
		obj.show();
		obj.showBonus();
	}
		// TODO Auto-generated method stub

	}


