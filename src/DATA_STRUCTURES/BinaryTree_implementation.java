package DATA_STRUCTURES;

public class BinaryTree_implementation {


	//Requirements: Node class, add a node, delete a node,
	//let's make this a integer graph
	class Node{
		Integer data;
		Node LeftChild,RightChild; //because now each node have a right child and a LeftChild child

		public Node (){		
		}
	}

	//requirement for a binary search tree: Leftside , RightSide, parent,
    Node Parent=new Node();	 
    Node focusnode=new Node();
	public void addnode(int data){
		//check to see if parent is empty
		 
		if (Parent.data==null){Parent.data=data;focusnode=this.Parent;}
		else 
		{
			focusnode=this.Parent;
			while (true){//Traverse the tree so we can find the spot for the node.
				//since this is a binary search tree the LeftChild children  are smaller than their parents , check for those 
				 
				
				if (focusnode.data>data ){
					focusnode.LeftChild=new Node();
					focusnode.LeftChild.data=data;	
					focusnode=focusnode.LeftChild;
				}
				else if ((focusnode.data<=data  )) {
					focusnode.RightChild=new Node();
					focusnode.RightChild.data=data;
					focusnode=focusnode.RightChild;
				}
				else break;					
			}
			 
		}


	}


	public static void main (String [] args){
		BinaryTree_implementation BST=new BinaryTree_implementation();
		BST.addnode(5);
		BST.addnode(4);
		

	}





}
