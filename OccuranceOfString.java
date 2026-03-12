import java.util.Scanner;
public class  OccuranceOfString{
	public static void main (String args[]){
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		s = sc.nextLine();
		int ch= 0;
		int a[] = new int[256];
	
		for(int i=0; i < s.length();i++){
			ch = (int)s.charAt(i);
			a[ch]++ ;
		}
		for(int i=0;i<256;i++){
			if( a[i] != 0){
			System.out.println((char)i+" is occured "+a[i]+" times");
			}
		}
	}
}