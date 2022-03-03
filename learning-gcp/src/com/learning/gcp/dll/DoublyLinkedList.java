package com.learning.gcp.dll;

public class DoublyLinkedList {
	public DoublyNode head;
	public DoublyNode tail;
	int size;
	
	public void createDLL(int nodeValue)
	{
		head = new DoublyNode();
		DoublyNode node = new DoublyNode();
		node.value = nodeValue;
		node.prev = null;
		node.next = null;
		head = node;
		tail = node;
		size++;
		
	}
	
	public void traverseDLL()
	{
		DoublyNode tempNode = new DoublyNode();
		if (head !=null)
		{
			tempNode= head;
		  for (int i=0; i<=size-1;i++)
		  {
			  System.out.println(tempNode.value);
			  tempNode = tempNode.next;
		  }
		}
		else {
			System.out.println("DLL does not exist");
		}
	}

}
