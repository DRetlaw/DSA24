/**
 * 
 */

/**
 * @author WalterDsouza
 *
 */
public class SubsetsRecursively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		createSubsetsRecursively(s,"");
		System.out.println("out");

	}
	
	static void createSubsetsRecursively(String up, String p)
	{
		if(up.isEmpty())
		{
			System.out.println("s -"+p);
			return;
		}
		char c = up.charAt(0);
		createSubsetsRecursively(up.substring(1),p+c);
		createSubsetsRecursively(up.substring(1),p);
	}
}
