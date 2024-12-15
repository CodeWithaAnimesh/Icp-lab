package assignment2;
import java.util.Scanner;
public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values between 0and 1000");
		int n=sc.nextInt();
		int a =n%10;
		n=n/10;
		int b= n%10;
		n=n/10;
		int c= n%10;
		n=n/10;
		int sum=a+b+c;
		System.out.println(sum);
		

	}

}
