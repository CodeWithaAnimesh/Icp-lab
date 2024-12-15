package MyJava;

import java.util.Scanner;

public class integer3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer between 0 and 1000");
		int n = sc .nextInt();
		int t=n;
		int digit1 = t%10;
		t=t/10;
		int digit2 = t%10;
		t= t/10;
		int digit3 = t%10;
		t=t/10;
	int sum= digit1+digit2+digit3;
	
		System.out.println("sum of digit of"+" "+ n +" "+ "is"+" "+sum);
		
		

}
}
