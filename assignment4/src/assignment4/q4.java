package assignment4;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter first no:");
		int x = sc .nextInt();
		System.out.print("enter second no:");
		int y = sc .nextInt();
		if(x%y==0) {
			System.out.println("GCD is "+y);
			return;
		}
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
					
		}
		System.out.println("GCD is"+x);
	}

}
