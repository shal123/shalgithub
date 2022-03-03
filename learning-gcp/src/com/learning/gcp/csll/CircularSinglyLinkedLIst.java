package com.learning.gcp.csll;

public class CircularSinglyLinkedLIst {
	public Node head;
	public Node tail;
	int size;
	
	
	public Node createCSLL(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		head = node;
		tail = node;
		node.nextNode = node;
		size++;
		return head;
	}
	
	public Node insertNewNode(int nodeValue, int position)
	{
		Node node = new Node();
		node.value = nodeValue;
		if(head==null)
		{
			head = node;
			tail = node;
			node.nextNode = node;
		} else if (position >=size) {
			Node tempNode = tail.nextNode;
			tail.nextNode = node;
			node.nextNode = tempNode;
			tail = node;
			size++;
		} else {
			Node tempNode = head;
			for (int i=0; i < position-1;i++)
			{
				tempNode = tempNode.nextNode;
				
			}
				node.nextNode = tempNode.nextNode;
				tempNode.nextNode = node;	
				size++;
		}
		
		return head;
	}
	
	public void traverseCSLL()
	{
		Node tempNode = head;
		for (int i=0; i<size; i++)
		{
			System.out.print(tempNode.value);
			if(i<size-1)
			System.out.print("->");
			tempNode = tempNode.nextNode;
			
		}
		System.out.print("\n");
	}
}
