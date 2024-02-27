/**
 * 
 */
package ds.recursion;

/**
 * @author WalterDsouza
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));

	}
	
	static int factorial(int n) {
		//base case
		if(n==1)
			return 1;
		
		return n * factorial(n-1);
	}

}
