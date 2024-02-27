/**
 * 
 */
package ds.stack;

/**
 * @author WalterDsouza
 *
 */
public class Stack {
private int height;
Node top;

	class Node{
		Node next;
		int value;
		
		Node(int value) {
			this.value = value;
		}
	}
	
	public Stack(int value) {
		top = new Node(value);
		height = 1;
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		if(height == 0)
		{
			top = newNode;
			return;
		}
		else
		{
			newNode.next = top;
			top = newNode;
		}
		height++;
	}
	
	public void pop() {
		if(height <= 0)
			return;
		else
		{
			Node temp = top;
			top = top.next;
			temp.next = null;
			height--;
		}
	}
	
	public void getTop() {
		System.out.println(top.value);
	}
	
	public void getHeight() {
		System.out.println(height);
	}
	
	public void printStack() {
		if(height == 0)
			return;
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.value);
			temp =  temp.next;
		}
	}

}
