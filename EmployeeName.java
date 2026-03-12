 class Employee {
	int employee_code;
	String name;
	String designation;
	double basic_pay;
	double HRA;
	double DA;
	double total_pay;
	Employee(int ec,String n,String d, double bp)
	{
		employee_code = ec;
		name = n;
		designation = d;
		basic_pay = bp;
	}
	void calculate(){ 
		HRA = basic_pay/10;
		DA = (basic_pay*45)/100;
		total_pay = basic_pay+DA+HRA;
		
	}
	void display(){
		System.out.println("\nemployee code: "+employee_code);
		System.out.println("employee name: "+name);
		System.out.println("employee designation: "+designation);
		System.out.println("employee basic pay: "+basic_pay);
		System.out.println("employee total pay: "+ total_pay);
		
	}
}

public class EmployeeName {
	public static void main (String[] args)
	{
		Employee e1 = new Employee(163,"het","CEO",550000);
		e1.calculate();
		e1.display();
		Employee e2 = new Employee(197,"Priyal","Director",500000);
		e2.calculate();
		e2.display();
		Employee e3 = new Employee(156,"Samarth","manager",50000);
		e3.calculate();
		e3.display();
	}
} 