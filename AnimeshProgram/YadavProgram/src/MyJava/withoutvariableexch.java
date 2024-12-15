package MyJava;

public class withoutvariableexch {

	public static void main(String[] args) {
		int W = 1,G=2,K=3,A=4;
		System.out.println("before swapping:");
		System.out.println("W="+W);
		System.out.println("G="+G);
		System.out.println("K="+K);
		System.out.println("A="+A);
		W=W+G+K+A;
		A=W-(G+K+A);
		K=W-(G+K+A);
		G=W-(G+K+A);
		W=W-(G+K+A);
		
		// TODO Auto-generated method stub
		System.out.println("AFTER swapping:");
		System.out.println("W="+W);
		System.out.println("G="+G);
		System.out.println("K="+K);
		System.out.println("A="+A);
		
/*OUTPUT
 * before swapping:
W=1
G=2
K=3
A=4
AFTER swapping:
W=2
G=3
K=4
A=1

 */
	}

}
