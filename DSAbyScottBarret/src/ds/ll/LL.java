/**
 * 
 */
package ds.ll;

/**
 * @author WalterDsouza
 *
 */
public class LL {
	Node head;
	Node tail;
	int length;

	class Node{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value = value;
		}
	}
	
	LL(int value){
		Node firstNode = new Node(value);
		this.head = firstNode;
		this.tail = firstNode;
		length++;
	}
	
	//when do we not insert a node?
	boolean insert(int value)
	{
		Node newNode = new Node(value);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			length = 1;
			return true;
		}
		
		Node currentNode = head;
		while(true)
		{
			if(currentNode.next!=null)
				currentNode = currentNode.next;
			else
			{
				currentNode.next = newNode;
				tail = newNode;
				length++;
				break;
			}
		}
		return true;
	}
	
	void printList()
	{
		Node currentNode = head;
		while(currentNode!=null)
		{
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
	}
	void reverseList()
	{
		Node firstNode = reverseList(this.head);
		firstNode.next = null;
	}
	
	private Node reverseList(Node cNode)
	{
		if(cNode.next == null)
        {
            head = cNode;//last node becomes head
            return cNode;
        }

        Node previousNode = reverseList(cNode.next);
        
        previousNode.next = cNode;
        return cNode;
	}
}
