package MyJava;
import java . util.Scanner;
public class ques5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a no");
		int a = sc .nextInt();
		int temp =a;
		int rev=0;
		for( temp =a;temp!=0;temp=temp/10) {
			
			int digit=temp%10;
			rev=rev*10+digit;}
			if(a==rev) {
				System.out.println("it is a palindrome");
				
				}
			else {
				System.out.println("it is not a palindrome");
			
			}
				
		}
		

	}

