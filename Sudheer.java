package badri;

import java.util.Scanner;

public class Sudheer {
	
 static boolean isnion(int a)
 {
	 int n=a*a;
	 int sum=0,temp=a;
	 do {
		 int d =n%10;
		 sum=sum+d;
		   n=n/10;
	 }while(n!=0);
	 
	 return sum==temp;
	 
 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int a = sc.nextInt();
		boolean rs = isnion(a);
		
		if(rs==true)
			System.out.println(a+" is a Nion Number.");
		else
			System.out.println(a+" is not a Noin Number");
}
	}
