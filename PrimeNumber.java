public class PrimeNumber{
	public static void main(String[] args)
	{int num = 10;
         int isprime; 
	 if(num <= 1)
	{   isprime = 0;
	 for(int i=2;i*i<=num;i++)
 	 if (num % i== 0)
         {   isprime =1;
            break; 
	 }
	else
         { isprime =0;
         }
        if (isprime ==0)
        { System.out.println("number is not prime");
        }
        else
        { System.out.println("number is prime");
	}
}