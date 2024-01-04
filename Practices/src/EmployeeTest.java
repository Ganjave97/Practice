class Employee 
{
	int empNum;
	double empSalary;
	String empName;
	
	void setEmpDetails()
	{
		empNum=111;
		empName="Vaibhav";
		empSalary=10000;
	}
	void dispEmpDeatils()
	{
		System.out.println("Emp Num= " +empNum);
		System.out.println("Emp Name= " +empName);
		System.out.println("Emp Salary= " +empSalary);
	}
	
}



public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmpDetails();
		e1.dispEmpDeatils();
		

	}

}
