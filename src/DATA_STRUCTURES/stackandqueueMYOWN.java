package DATA_STRUCTURES;

import java.util.*;
//EASY VERSION
public class stackandqueueMYOWN {
	public static class Node
	{
		String x;
		Node next;
	}
	/*
	//make a linkedlist to be used in stack and queue
	public class linkedlist{
		 Node head;
		 
		 public void insert(){		 
			 
		 }
		
	}*/
	
	public static class stack{//LIFO: last in first out
		//let's make a linkedlist
		public static void LIFO(LinkedList ll){
		String P=(String) ll.getFirst();
		System.out.println(P);			
		}		
	}
	
	public static class queue{//LIFO: last in first out
		//let's make a linkedlist
		public static void FIFO(LinkedList ll){
		String P=(String) ll.getLast();
		System.out.println(P);			
		}		
	}
	
	
	public static void main (String [] args){
		LinkedList<String> ll = new LinkedList<String>();
		/*ll.add("1");
		ll.add("2");
		ll.add("3");		
		stackandqueueMYOWN.stack.LIFO(ll);
		stackandqueueMYOWN.queue.FIFO(ll);
		int dd=0b1011;
		int dc=0b0111; 		 
		System.out.println((Integer.toBinaryString(0b1011 & 0b0111)));*/
		
				
	}
	

}
