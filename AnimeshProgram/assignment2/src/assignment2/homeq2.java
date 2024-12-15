package assignment2;
import java.util.Scanner;
public class homeq2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many eggs do you have");
		int eggs=sc.nextInt();
		int gross=eggs/144;
		int extra=eggs%144;
		int dozen=extra/12;
		int lo=extra%12;
		System.out.println(eggs+" no of eggs is "+gross+"gross, "+dozen+"dozen, "+"and "+lo+".");
		

	}

}
