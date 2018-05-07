package ctciproblems.dataStructure.tries;

//for explemation refer to https://www.youtube.com/watch?v=zIjfhVPRZCg&t=33s 
//This is based on https://www.youtube.com/watch?v=vlYZb68kAY0  Data Structures: Solve 'Contacts' Using Tries

//question given a set of strings, how many contacts start with that string
//you could solve this problem by using hashmap or list, but it will get ineffiecent since we have to loop through the entire list to find which contacts start with a given list
//trie is fast, because it is build on tree and it is fast at searching

public class Tries {
	
	private static class  Node{
		private final  int  NUMBER_OF_CHARACTERS=26;//number of characters in English  
		Node [] children=new Node [NUMBER_OF_CHARACTERS]; //this can be a hashmap instead of the array. A node then can store each of the 26 chars
		int size=0;
		
		private static int getCharIndex (char c){
			return c-'a';			
		}
		private  Node  getNode(char c){			
			return children[getCharIndex(c)];
		}
		
		private void setNode(char c,Node node){
			children[getCharIndex(c)]=node;
		}
		
		private void add (String s){
			add(s,0);
		}
		
		private void add (String s, int index){// add will walk throughly recursively until we get to it recursively
			 if (index== s.length())return;
			 char current=s.charAt(index);
			 int charCode=getCharIndex(current);
			 Node child=getNode(current);
			 if(child==null){
				 child=new Node();
				 setNode(current, new Node());
			 }
			 child.add(s,index+1);
			 
		}
		
		public int findCount(String s, int index){
			if (index==s.length()){
				return size;
			}
			Node child= getNode(s.charAt(index));
			if (child==null){
				return 0;
			}
			return child.findCount(s, index+1);
		}
		
		
		
		
	}

	

}
