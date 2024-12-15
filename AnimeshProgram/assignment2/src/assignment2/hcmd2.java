package assignment2;

public class hcmd2 {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		double area =Math.PI*r*r+2*Math.PI*r*h;
System.out.println("surfac area is:"+area);
	}

}
