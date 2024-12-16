package assignment4;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter any no:");
		int n = sc .nextInt();
int sum=0;
int j = 1;
System.out.println("random gentrated are");
do 
{
int i = (int)(Math.random()*n+1);	
System.out.println(i+" ");
sum=sum+i;
j++;
}
while(j<=n);
System.out.println("average of"+n+"no are "+(sum/n));

	}

}
