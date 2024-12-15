package MyJava;

public class Cmd1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c = a/b;
		int d = a%b;
		System.out.println("The quotient is: "+c);
		System.out.println("The remainder is: "+d);
		
	}

}
