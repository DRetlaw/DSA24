package ds.recursion;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author WalterDsouza
 *
 */
public class ReverseCharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'1','2','3','4','5'};
		//StringBuffer sbArrReverse = reverseRecursively(arr,null);
		//printArr(sbArrReverse);
		StringBuffer sbArrCopy =copyRecursively(arr, new StringBuffer());
		printArr(sbArrCopy);
		System.out.println("out");
	}
	
	static StringBuffer reverseRecursively(char arr[], StringBuffer sb)
	{
		
		if(arr.length<=0)
		//if(arr == null)
			return new StringBuffer();

		sb = reverseRecursively(Arrays.copyOfRange(arr, 1, arr.length),sb);
		sb.append(arr[0]);
		return sb;
	}
	
	static StringBuffer copyRecursively(char arr[], StringBuffer sb)
	{
		
		if(arr.length<=0)
		//if(arr == null)
			return sb;
		//System.out.println(arr[0]);
		sb.append(arr[0]);
		copyRecursively(Arrays.copyOfRange(arr, 1, arr.length),sb);
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
