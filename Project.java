package badri;

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
	int n=sc.nextInt();
	int rev=0;
	int temp=n;
	do {
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
		
	}while(n!=0);
	{
	if(rev==temp) 
		System.out.print("is a palindrome number");
	
	else 
	System.out.println("is not a palindrome number");
		
	}
	}
}
	