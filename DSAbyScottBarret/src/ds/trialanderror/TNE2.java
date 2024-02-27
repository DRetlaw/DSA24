/**
 * 
 */
package ds.trialanderror;

import java.util.HashMap;

/**
 * @author WalterDsouza
 *
 */
public class TNE2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,4,4,4,4,4,4,4,3,2,4,4};//16
		HashMap<Integer, Integer> kv = new HashMap<>();
		for(int c=0;c<nums.length;c++) {
			if(kv.get(nums[c])==null)
			{
				kv.put(nums[c], 1);
			}
			else
			{
				int count = kv.get(nums[c]);
				if(++count>(nums.length/2)) {
					System.out.println("Maority - "+ nums[c]);
					break;
				}
				else
				{
					kv.put(nums[c], count);
					System.out.println(nums[c]+" "+count);
				}
			}
		}
		
		System.out.println("out");
	}

}
