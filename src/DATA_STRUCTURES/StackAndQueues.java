package DATA_STRUCTURES;
//for stack and queues you need to implement linkedlist. Two popluar applicaiton of linkedlist are stack and queues 
//stack: whatever goes last , comes out first
public class StackAndQueues {
	class Node {
	    int val;
	    Node next;
	  
	    Node(int x) {
	        val = x;
	        next = null;
	    }
	}
	//implemets stack
	class Stack{
	    Node top; 
	  
	    public Node peek(){
	        if(top != null){
	            return top;
	        }
	  
	        return null;
	    }
	  //deletion is called pop
	    public Node pop(){
	        if(top == null){
	            return null;
	        }else{
	            Node temp = new Node(top.val);
	            top = top.next;
	            return temp;    
	        }
	    }
	    
	    public void push(Node n){
	        if(n != null){
	            n.next = top;
	            top = n;
	        }
	    }
	}
	class Queue{
	    Node first, last;
	  
	    public void enqueue(Node n){
	        if(first == null){
	            first = n;
	            last = first;
	        }else{
	            last.next = n;
	            last = n;
	        }
	    }
	  
	    public Node dequeue(){
	        if(first == null){
	            return null;
	        }else{
	            Node temp = new Node(first.val);
	            first = first.next;
	            return temp;
	        }   
	    }
	}


	

	public static void main(String[] args) {
		
		

	

		

	}

}
