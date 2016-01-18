package Example1;

public class Employee {
	public int calcAnnualSal(IcalcSalary icalcSalary)
	{ 
		return 12*icalcSalary.newSalary();
	}
}
