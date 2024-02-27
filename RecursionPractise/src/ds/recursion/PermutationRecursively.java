package ds.recursion;
/**
 * 
 */

/**
 * @author WalterDsouza
 *
 */
public class PermutationRecursively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcd";
		getPermutationsRecursively(input,"");
		System.out.println("out");
	}
	
	static void getPermutationsRecursively(String up, String p)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		
		char c = up.charAt(0);
		
		for(int i=0;i<=p.length();i++)
		{
			String startPart = p.substring(0, i);
			String endPart = p.substring(i, p.length());
			getPermutationsRecursively(up.substring(1),startPart+c+endPart);
		}
		
		
	}

}
