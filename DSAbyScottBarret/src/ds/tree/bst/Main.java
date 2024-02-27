/**
 * 
 */
package ds.tree.bst;

/**
 * @author WalterDsouza
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST myBST = new BST();
		
		/*myBST.insertNode(47);
        myBST.insertNode(21);
        myBST.insertNode(76);
        myBST.insertNode(18);
        myBST.insertNode(27);
        myBST.insertNode(52);
        myBST.insertNode(82);
        
        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));
        System.out.println(myBST.containsR(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));
        System.out.println(myBST.containsR(17));*/
		
		myBST.insertR(2);
		myBST.insertR(1);
		myBST.insertR(3);
		
		System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);
		System.out.println("out");
	}

}
