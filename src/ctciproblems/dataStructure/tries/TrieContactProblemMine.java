package ctciproblems.dataStructure.tries;

import java.util.HashMap;
import java.util.Hashtable;

//Follow this video : https://www.youtube.com/watch?v=-urNrIAQnNo&t=11s: Best

/* Hacker rank: https://www.hackerrank.com/challenges/contacts/problem
 * ..two methods: add name, find partial  
 * rules: name contains lower case letters only. No duplicates
 * 
 */

public class TrieContactProblemMine {
	Node head;	

	
	//since we are doing a lot of unknown searching, the binary tree and in perticular Trie works great.
	//binary tree contains Nodes.

	public static void main(String[] args) {
		Node o=new Node(); //Initlize a node
		o.charatersArray[0]=new Node();	//iniliize a node within the node array	
		String word="count";
		char t=word.charAt(0);
		o.charatersArray[0].charac=t;
		System.out.println(o.charatersArray[0].charac);
  
	}

	 static class  Node{
		private final static int NUMBER_OF_CHARACTERS_ENGLISH=26; //lower case a-z 
		//each node need to be able to contain 1-Array of char 0-26 a-z lower case no duplicates. Also need to have a reference to the next node. We can also record how many word stem from a given character
		//HashMap <Character, Integer> p = new HashMap<>(NUMBER_OF_CHARACTERS_ENGLISH); //this stores the alphabets can use array too
		Node [] charatersArray=new Node[NUMBER_OF_CHARACTERS_ENGLISH];//each node can contain 26 characters.
		int count; //also how many branches are underneth it
		char charac;
		boolean isItWord; //if this charateer represents a complete word, set the next note to empty and this boollean to true
		Node next; // reference to the next note
	}

	TrieContactProblemMine (){
		this.head=new Node();		 
	}


	//inserting words
	public void insert (String word){
		
		//need a function to check the chars in the array
		Node temp=new Node();		 
		temp=head;
	
		for (int i=0; i<=temp.charatersArray.length;i++){
			
			while(temp.charatersArray[i].next!=null)
				if ((temp.charatersArray[0].charac)==(word.charAt(0))){  //search to see if you have the character, if yes go to the next char in the string
					
				}			
		}


	}





}
