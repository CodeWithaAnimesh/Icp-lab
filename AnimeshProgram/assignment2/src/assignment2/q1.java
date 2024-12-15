package assignment2;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter value for farenheit");
 double farenheit=sc.nextDouble();
 double celcius=(farenheit-32)*(5.0/9);
 System.out.println(farenheit+" farenheit is "+celcius+" celcius");

	}

}
