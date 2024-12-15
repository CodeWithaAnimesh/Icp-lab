package assignment2;
import java.util.Scanner;
public class ques7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter values of a and b");
		int a = sc .nextInt();
		int b = sc.nextInt();
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a, b)));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a, b)));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a, b)));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a, b)));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a, b)));
		a++;
		b++;

	}

}
