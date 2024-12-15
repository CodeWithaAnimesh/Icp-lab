package MyJava;

import java.util.Scanner;

public class integer2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer between 0 and 1000");
		int n = sc .nextInt();
		int digit1 = n%10;
		n=n/10;
		int digit2 = n%10;
		n= n/10;
		int digit3 = n%10;
		n=n/10;
		int sum= digit1+digit2+digit3;
		System.out.println("sum of digit is "+" "+" "+sum);
		
		
		
		// TODO Auto-generated method stub

	}

}
