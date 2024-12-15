package MyJava;

public class exchangevalues {

	public static void main(String[] args) {
		int W = 1,G=2,K=3,A=4;
		System.out.println("before swapping:");
		System.out.println("W="+W);
		System.out.println("G="+G);
		System.out.println("K="+K);
		System.out.println("A="+A);
		
		int temp=W;
		W=G;
		G=K;
		K=A;
		A=temp;
		System.out.println("After swapping:");
		System.out.println("W="+W);
		System.out.println("G="+G);
		System.out.println("K="+K);
		System.out.println("A="+A);
		
		// TODO Auto-generated method stub

	}

}
/*output
 * before swapping:
W=1
G=2
K=3
A=4
After swapping:
W=2
G=3
K=4
A=1

 */

