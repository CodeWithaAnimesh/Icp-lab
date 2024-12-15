package assignment2;
import java.util.Scanner;
public class q5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		System.out.println("The radius of hemisphere:");
			double r=sc.nextInt();
		double surfacearea=3*Math.PI*(Math.pow(r,2));
		double volume=(2.0/3)*Math.PI*(Math.pow(r,3));
		System.out.println("The surface area of hemisphere is :"+surfacearea);
		System.out.println("The volume area of the hemisphere is:"+volume);
		
		
		

	}

}
