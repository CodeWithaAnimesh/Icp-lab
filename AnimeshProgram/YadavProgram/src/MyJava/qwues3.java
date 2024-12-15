package MyJava;

import java.util.Scanner;

public class qwues3 {

	public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
	          System.out.println("enter first no");
	  int a = sc .nextInt();
	  System.out.println("enter last no ");
	  int b = sc .nextInt();
	
	  for(int i = a;i<=b;i++) {
		  System.out.println("multiplication of "+" "+i+":");
		  for(int j =1;j<=10;j++) {
			  System.out.println(i+"*"+j+"="+(i*j));
			  System.out.println();
		  }
	  }

	}

}
