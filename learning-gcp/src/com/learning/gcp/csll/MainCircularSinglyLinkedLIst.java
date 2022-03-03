package com.learning.gcp.csll;

public class MainCircularSinglyLinkedLIst {
	public static void main(String args[])
	{
		CircularSinglyLinkedLIst circularSinglyLinkedLIst = new CircularSinglyLinkedLIst();
		circularSinglyLinkedLIst.createCSLL(5);
		System.out.println(circularSinglyLinkedLIst.head.value);
		circularSinglyLinkedLIst.insertNewNode(4, 1);
		circularSinglyLinkedLIst.traverseCSLL();
		System.out.println(circularSinglyLinkedLIst.head.nextNode.value);
		System.out.println(circularSinglyLinkedLIst.head.nextNode.nextNode.value);
		/*circularSinglyLinkedLIst.insertNewNode(4, 1);
		circularSinglyLinkedLIst.insertNewNode(3, 2);
		circularSinglyLinkedLIst.insertNewNode(1, 3);
		circularSinglyLinkedLIst.insertNewNode(6, 2);*/
		//circularSinglyLinkedLIst.traverseCSLL();
	}

}
