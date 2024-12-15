package assignment2;

public class cmd5 {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double max=Math.max((Math.max(a, b)),c);
		double min=Math.min((Math.min(a, b)),c);
		double mid=(a+b+c)-(min+max);
		System.out.println(min+" "+mid+" "+max);
		
				

	
	}

}
