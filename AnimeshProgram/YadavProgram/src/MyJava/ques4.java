package MyJava;
import java . util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a no");
		int a = sc .nextInt();
		int temp = a;
		int rev=0;
		int i;
		for(i=temp;temp!=0;temp=temp/10) {
			int digit=temp%10;
			rev=rev*10+digit;
		}
		System.out.println(rev);
		

	}

}
