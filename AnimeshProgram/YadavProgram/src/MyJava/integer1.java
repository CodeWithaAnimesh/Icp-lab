package MyJava;

import java.util.Scanner;

public class integer1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		System.out .println("enter basic salary");
		double BA   = sc.nextDouble();
		double DA  = 0.4* BA;
		double HRA = 0.2* BA;
		double GS = BA+DA+HRA;
		System.out.println("\n DA is"+" "+DA);
		System.out.println("HRA is"+" "+ HRA);
		System.out.println("GS is"+" "+ GS);
		

		// TODO Auto-generated method stub

	}

}
