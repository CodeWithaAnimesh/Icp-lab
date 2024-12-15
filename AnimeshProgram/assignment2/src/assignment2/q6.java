package assignment2;
import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of seconds");
		double time=sc.nextDouble();
		double g=32.174;
		double d=(1.0/2)*g*(Math.pow(time,2));
		System.out.println("distance travelled :"+ d);
		

	}

}
