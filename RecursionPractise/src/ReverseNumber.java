/**
 * 
 */

/**
 * @author WalterDsouza
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumberRecursively(0,3459021);
		System.out.println("out"+3%7);
	}
	
	//returns reverse number
	static void reverseNumberRecursively(int m, int n)
	{
		
		
		if(n<10)
		{
			System.out.println(m * 10 + n);
			return;
		}
		
		m = m * 10 + n%10;
		//System.out.println(m);
		reverseNumberRecursively(m,n/10);
		
	}
	
	//displays reverse order
	/*static void reverseNumberRecursively(int n)
	{
		if(n<10)
		{
			System.out.println(n);
			return;
		}
		
		System.out.print(n%10);//remainder//9
		reverseNumberRecursively(n/10);
	}*/

}
