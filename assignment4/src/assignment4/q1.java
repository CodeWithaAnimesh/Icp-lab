package assignment4;
import java .util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter first no:");
		int a = sc .nextInt();
		System.out.print("enter second no:");
		int b = sc .nextInt();
		System.out.print("enter third no:");
		int c = sc .nextInt();
		int sum=0;
		for(int i = a;i<=b;i=i+c) {
			System.out.println(i+" ");
			sum=sum+i;
		}
		System.out.println("\nthe sum is :"+sum);
	}

}
