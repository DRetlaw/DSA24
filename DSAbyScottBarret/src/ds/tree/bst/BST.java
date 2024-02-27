/**
 * 
 */
package ds.tree.bst;

/**
 * @author WalterDsouza
 *
 */
public class BST {
	Node root;
	
	class Node{
		int value;
		Node left;
		Node right;
		
		private Node(int value) {
			this.value = value;
		}
		
	}
	
	boolean insertNode(int val) {
		Node newNode = new Node(val);
		//Edge case 1
		if(root == null) {
			root = newNode;
			return true;
		}
		
		
		Node currentNode = root;
		
		//need to consider equals
		while(true) {
			//Edge case 2
			if(val == currentNode.value)
				return false;
			
			if(val > currentNode.value) {
				if(currentNode.right == null)
				{
					currentNode.right = newNode;
					return true;
				}
				currentNode = currentNode.right;
				
			}
			else
			{
				if(currentNode.left == null)
				{
					currentNode.left = newNode;
					return true;
				}
				currentNode = currentNode.left;
			}
		}
			
	}

	boolean contains(int val) {
		Node current = root;
		/*if(current == null)
			return false;*/
		
		while(current != null) {
			if(current.value == val)
				return true;
			else 
				if(val > current.value)
					current = current.right;
				else 
					current = current.left;
		}
		return false;
	}
	
	boolean containsR(int val) {
		return containsR(root, val);
	}
	
	boolean containsR(Node root, int val){
		Node current = root;
		if(current == null)
			return false;
		if(current.value == val)
			return true;
		
		if(current.value > val)
			return containsR(current.left, val);
		else
			return containsR(current.right, val);
	}
	
	void insertR(int val) {
		if(root == null)
		{
			root = new Node(val);
			return;
		}
		insertR(root, val);
	}
	
	Node insertR(Node current, int val) {
		if(current == null) {
			return new Node(val);
		}
		
		if(val > current.value)
			current.right = insertR(current.right, val);
		else
			current.left = insertR(current.left, val);
		
		return current;
		
	}
	
	
	
}
