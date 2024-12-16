package assignment4;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter base no:");
		int a = sc .nextInt();
		System.out.print("enter power  no:");
		int b = sc .nextInt();
		int pr = 1;
for(int i =1;i<=b;i++) {
	pr=pr*a;
	
}
System.out.println(pr);
	}

}
