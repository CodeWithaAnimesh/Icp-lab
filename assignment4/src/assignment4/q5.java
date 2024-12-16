package assignment4;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter any no:");
		int a = sc .nextInt();
		int sum=0;
for(int i = 1;i<=a/2;i++) {
	if(a%i==0)
		sum=sum+i;
}
if (sum==a)
	System.out.println(a+"is perfect no");
else 
	System.out.println(a+"is not perfect no");
	}

}
