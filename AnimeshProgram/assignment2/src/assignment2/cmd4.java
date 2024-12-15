package assignment2;

public class cmd4 {

	public static void main(String[] args) {
	double t =Double.parseDouble(args[0]);
	double r =Math.toRadians(t);
	double sum=Math.cos(5*r)+Math.sin(7*r);
	
System.out.println( sum);
	}

}
