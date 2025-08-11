package Week1.Day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		int number,count=0,i;
		// TODO Auto-generated method stub
		System.out.println("Enter number");
Scanner input= new Scanner (System.in);
number=input.nextInt();
for (int i1=2;i1<=number/2;i1++) {
	if(number % i1==0)
	{
		count++;
		break;
	}
}
if (count==0 && number !=1)
{
System.out.println(number + " is prime number");
	}
else 
{
	System.out.println(number + " is not prime number");	
}
}
}
