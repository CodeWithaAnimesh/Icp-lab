package assignment2;

public class cmd1 {

	public static void main(String[] args) {
	int dividend=Integer.parseInt(args[0]);
	int divisor=Integer.parseInt(args[1]);
	int quotient=dividend/divisor;
	int remainder=dividend%divisor;
	System.out.println(quotient+" "+remainder);
/*output
 * 2 0
 */
	}

}