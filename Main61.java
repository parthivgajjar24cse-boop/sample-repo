import java.util.Scanner;
abstract class shape {
	abstract void area();
}

class circle extends shape {
	double PI=3.14,r; 
	void area(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the radius of circle");
		r = sc.nextDouble();
		System.out.println("Area of circle is "+(r*r*PI)); 
	}
}

class triangle extends shape {
	float base=20;
	float height=30;
	void area(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the base of triangle");
		base = sc.nextFloat();
		System.out.println("enter the height of triangle");
		height = sc.nextFloat();
		System.out.println("Area of triangle is "+(base*height/2)); 
	}
}

class square extends shape {
	float side=20;
	void area(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the side of square");
		side = sc.nextFloat();
		System.out.println("Area of square is "+(side*side)); 
	}
}

public class Main61 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		shape s = new circle();
		s.area();
		s = new triangle();
		s.area();
		s = new square();
		s.area();
	} 
}