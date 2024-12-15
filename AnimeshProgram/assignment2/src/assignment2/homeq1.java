package assignment2;
import java.util.Scanner;
public class homeq1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter minutes");
		int minutes=sc.nextInt();
		int years= minutes/(365*24*60);
		int days=(minutes%(365*24*60))/(24*60);
		System.out.println(minutes +" minutes is approximately "+years+" " +"years "+" and "+ days +" days");
	
				

	}

}
