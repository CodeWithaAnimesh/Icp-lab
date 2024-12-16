package assignment4;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter any no:");
		int a = sc .nextInt();
		System.out.println("mutlipication of "+a+"is:");
		  int i ;
		  for(i=1;i<=10;i++) {
			  System.out.println(a+"*"+i+"="+(a*i));
		}

	}

}
