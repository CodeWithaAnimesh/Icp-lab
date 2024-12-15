package assignment2;
import java.util.Scanner;
public class q2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values in kilometer");
	double kilometer=sc.nextDouble();
double meter=kilometer*1000;
System.out.println(kilometer+" km is "+meter+" meter ");
double feet=kilometer*3280.8399;
System.out.println(kilometer+" km is "+feet+" feet");
double inch=kilometer*39370.0787;
System.out.println(kilometer+" km is "+inch+" inch ");
double centimeter=kilometer*100000;
System.out.println(kilometer+" km is "+centimeter+" centimeter ");
	}

}
