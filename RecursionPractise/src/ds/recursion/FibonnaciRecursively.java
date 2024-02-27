package ds.recursion;
/**
 * 
 */

/**
 * @author WalterDsouza
 *
 */
public class FibonnaciRecursively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
		System.out.println("out");
	}
	
	static int fib(int n)
	{
		//if(n<=1)
			//return 1;
		if(n==1 || n==0)
			return n;
		
		return fib(n-1) + fib(n-2);
	}
	
}
