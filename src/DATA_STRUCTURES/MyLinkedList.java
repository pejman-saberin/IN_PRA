package DATA_STRUCTURES;
//Java works by reference. So if you set two variables equal, they are both pointing to the same memory location. If you erase one , that memory location gets erased
//ADD,DISPLAY,Find,DELETE,REVERSE,EMBED before , EMBED AFTER,EMPTY
public class MyLinkedList {
	Node head;	
	Node Temp;
	public static void main (String args[]){
		MyLinkedList test=new MyLinkedList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.DISPLAY();
		test.find(7);
		test.delete(8);
		test.DISPLAY();
	 

	}

	public MyLinkedList(){	
		head=new Node();//allocate new memory for head. sets head data to 0 when you use the keyword new as well. This is how java works. 
		System.out.println("head data has been initilized and automatically set to "+head.data);
	}
	public void empty(){ //you can use this in the delete and display in case LinkedList has not been started yet
		if (head.data==0 && head.next==null){
			System.out.println("This list is empty");
		}
	}

	public  void add(int data){		
		//Scenario 1: head data is empty
		if (head.next==null){
			Temp=new Node();
			head.next=Temp;
			Temp.data=data;	
			Temp.next=new Node();
			Temp=Temp.next;			
		}
		else{
			while (Temp.data!=0 && Temp.next!=null)
			{//Iterate through the linkedlist until you get to the end where the last node is set to null			
				Temp=Temp.next;			
			}			 
			Temp.next=new Node();			
			Temp.data=data;	
			Temp=Temp.next;
		}
	}

	public  void DISPLAY(){
		Node tmp=new Node();
		if (head.next==null){
			System.out.println("LinkedList has only one data within: "+Temp.data);						
		}
		tmp=head.next;

		while (tmp.next!=null){//Iterate through the linkedlist until you get to the end where the last node is set to null			 
			System.out.println(tmp.data);// iterate through the loop and print out the content one by one
			tmp=tmp.next;				
		}		
	}

	public void find (int data){
		Node Tmp=new Node();		
		Tmp=head.next;		
		while (Tmp.next!=null){//Iterate through the linkedlist until you get to the end where the last node is set to null	
			if (Tmp.data==data){
				System.out.println("I've found the data that you passed in");
				break;
			}			 
			Tmp=Tmp.next;				
		}
		if (Tmp.data!=data){
			System.out.println("The data you are searching is NOT present");
		}
	}
	//Need to implemet the head data.
	public void delete(int data){
		Node Tmp=new Node();
		Node Hold=new Node();
		int p=0;
		Tmp=head.next;	
		if (head.next.data==data){
			Hold=head.next.next;
			head.next=null;
			head.next=Hold;	
			p=1;
		}
		while (Tmp.next!=null && p!=1){//Iterate through the linkedlist until you get to the end where the last node is set to null	
			if (Tmp.data==data){
				Hold=Tmp.next; //Hold variable will hold hte memory location of hte next node.
				Tmp.next=null;
				Tmp.next=Hold;//Temp.next is out of the  picture since current temp is now connected to the temp.next.next instead of temp.next.
				System.out.println("This data is DELETED "+ data);
				p=1;
				break;
			}			 
			Tmp=Tmp.next;				
		}
		if (p!=1){
			System.out.println("The data you are trying to delete is NOT present");
		}
		
	}

	 


}





class Node{
	int data;
	Node next;
}





