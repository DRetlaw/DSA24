import java.util.Arrays;

/**
 * 
 */

/**
 * @author WalterDsouza
 *
 */
public class RemoveCharRecursively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'b','a','c','c','a','d'};
		StringBuffer sbArrCleaned = removeARecursively(arr, new StringBuffer());
		printArr(sbArrCleaned);
		System.out.println("out");
	}
	
	static StringBuffer removeARecursively(char[] arr, StringBuffer sb)
	{
		if(arr.length <= 0)
			return sb;
		
		if(arr[0] != 'a')
		{
			sb.append(arr[0]);
		}
		
		sb = removeARecursively(Arrays.copyOfRange(arr, 1, arr.length),sb);
		return sb;
	}
	
	static void printArr(StringBuffer sb)
	{
		System.out.println("sb "+sb);
		for(int i=0; i<sb.length();i++)
		{
			System.out.println(sb.substring(i, i+1));
		}
	}

}
