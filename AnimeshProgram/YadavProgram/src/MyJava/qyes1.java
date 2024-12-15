package MyJava;
import java .util.Scanner;
public class qyes1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int a=sc.nextInt();
		int fact=1;
  for (int i = a;i>0;i--)
  {

      fact=fact*i;

  }
          System.out.println(fact);
}


	}


