
public class Person {
	String name;
	int age;
	int salary;
	Person(String n,int a,int s){ 
	name = n;
	age = a;
	salary = s;
	}
	public static void main(String[] args) {
		Person p1 = new Person("het",19,15000);
		System.out.println("pearson name: "+p1.name);
		System.out.println("pearson age: "+p1.age);
		System.out.println("pearson salary: "+p1.salary);

	}
}