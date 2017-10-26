package DATA_STRUCTURES_2; 
//Important points: New creates a new memory location. Int data; 
//my own implementation is below: this also could be helpful ://https://www.youtube.com/watch?v=VR363sIAvr4&t=6s
///ADD,FIND,DELETE,DISPLAY 
public class LinkedList {	 
	node start;	
	node temp=new node();
	static int count =0;
	public static void main (String args []) {
		LinkedList p=new LinkedList(5);
		p.add(6);
		p.add(7);
		p.add(8);
		p.add(9);
		p.add(10);
		p.display();
		p.delete(8);
		p.delete(9);
		p.delete(10);
		p.display();	
		p.find(55);
		p.add(656);
		p.display();
		p.add(9);
		p.find(9);
	}
	//the constructor is startig a new node
	public LinkedList (int data){	
		start=new node();  //start a new linkedlist		 
		start.data=data; //set the data for the next node to that.
	}

	//add fields to the node
	public void add(int data){

		//we have 2 conditions: condition 1: we haven't add to the node. so we are at the beginning condition2 : we have added and we need to traverse the linked list first
		//if we haven't linked to the start yet
		if (start.next==null){	
			start.next=temp;
			temp.data=data;		
		}	

		while(temp.data!=0 && temp.next!=null){	 			
			temp=temp.next;	
		}	
		temp.next=new node();
		temp.data=data;

	}

	//display our linkedlist
	public void display(){
		empty();
		node temp=new node();
		temp=start;
		while (temp.data!=0 && temp.next!=null){			
			System.out.println(temp.data);
			temp=temp.next;
		}


	}
	//find
	public void find (int data){
		//find the data and then remove it s		 
		empty();
		node temp=new node();
		node hold=new node();
		//node hold=new node();
		temp=start; //start from the begining of the LinkedList		 
		while (temp.data!=0 && temp.next!=null ){			 
			System.out.println();
			if (temp.next.data==data){
				System.out.println("Data exists");	
				break;
			}
			else{
				temp=temp.next;
			}

		}
		if (temp.data!=data  && temp.next==null ){
			System.out.println("Couldn't find what you are looking for");
		}

	}

	//delete from the list
	public void delete (int data){
		//find the data and then remove it s		 
		empty();
		node temp=new node();
		node hold=new node();
		//node hold=new node();
		temp=start; //start from the begining of the LinkedList		 
		while (temp.data!=0 && temp.next!=null ){			 
			System.out.println();
			if (temp.next.data==data){
				hold=temp.next.next;				 
				temp.next=null;
				temp.next=hold;				 			
			}
			else{
				temp=temp.next;
			}

		}

	}

	//is the list empty?
	public  void empty(){
		if (start.next==null){
			System.out.println("this list is empty");			
		}
	}
}

class node{
	int data;
	node next;
}
