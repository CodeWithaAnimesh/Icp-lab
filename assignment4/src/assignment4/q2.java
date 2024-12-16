package assignment4;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter any no:");
		int a = sc .nextInt();
int sum=0;
int temp = a;

while(temp!=0){
	int digit=temp%10;
	sum=sum+digit;
	temp= temp/10;
}
if (sum%9==0) 
	System.out.println("The no is divisible by 9");
	else 
		System.out.println("the no is not divisible by 9");
}
	}

	
