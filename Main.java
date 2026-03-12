import java.util.Scanner; 

class Employee {
	int emp_numb;
	String name;
	String gender;

	Employee()
	{
		emp_numb = 0;
	}

	void input_data(int en,String s,String g){
	emp_numb = en;
	name = s;
	gender = g;
	}
	void show_data()
	{
		System.out.println("employee code: "+emp_numb);
		System.out.println("employee name: "+name);
		System.out.println("employee gender: "+gender);
	}
}

class SalariedEmployee extends Employee{
	
	double salary;
	double HRA;
	double DA;

	SalariedEmployee(int sa){
	super();
	salary = sa;
	}

	void namelyallowance(){
		double HRA;
		double DA;
		if(gender=="female")
		{
			HRA=0.1*salary;
		}
		else
		{
			HRA=0.09*salary;
		}
		DA =0.05*salary;
		 
	}
	void increment()
	{
		salary = salary+0.1*salary;
	}
	void grosssalary()
	{
		salary = salary+HRA+DA;
		System.out.println("Employee salary: "+salary);
	} 
}

public class Main {
	public static void main (String[] args)
	{	System.out.println("enter the employee name: ");
		Scanner s= new Scanner(System.in);
		String name = s.nextLine();

		System.out.println("enter the employee gender: ");
		String gender = s.nextLine();

		System.out.println("enter the employee number");
		int num = s.nextInt();

		System.out.println("enter the employee salary");
		int salary = s.nextInt();
		
		SalariedEmployee se= new SalariedEmployee(salary);
		se.input_data(num,name,gender);
		se.show_data();
		se.namelyallowance();
		se.grosssalary();	
	}
} 