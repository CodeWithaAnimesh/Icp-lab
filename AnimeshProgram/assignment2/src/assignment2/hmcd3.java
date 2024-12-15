package assignment2;

public class hmcd3 {

	public static void main(String[] args) {
		double num = Double.parseDouble(args[0]);
		double l = num%10.0;
		double f = num/1000.0;
double sum=l+f;
System.out.println("the sum of first and last no :"+sum);
	}

}
