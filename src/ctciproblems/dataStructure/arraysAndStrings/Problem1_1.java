package ctciproblems.dataStructure.arraysAndStrings;
/*
 * Implement an algorithm to determine if a string has all unique characters. What if
you cannot use additional data structures?
 */

//this is ASCII , 254 invidual cases. 

public class Problem1_1 { 
boolean result;	 
	
	public static void main (String args[]){
		  Problem1_1 p= new Problem1_1();
		  p.result=p.stringHasUniqueChar("pejjman");
		  System.out.println(p.result);
	}
	
	/*Loop through an string and see if sting has repeatd characters
	Special cases: 
	1-String is empty, null
	2-The object is not an string
	 @param  url  an absolute URL giving the base location of the image
 * @param  name the location of the image, relative to the url argument
 * @return      the image at the specified URL
 * @see	
	*/
	public boolean stringHasUniqueChar (String p){
		 if (p==null){
			 System.out.println("the string is empty");
			 return false;
		 }
		 if ( !(p instanceof String)){
			 System.out.println("this needs to be an string");
		 }
		 if (p.length() >256) return false;
		 boolean [] char_set= new boolean [256];
		 for (int i=0; i<p.length();i++){
			 int val=p.charAt(i);
			 if(char_set[val]){
				 return false; //return false because char at that val in char_set is repeated				 
			 }
			 char_set [val]=true;
		 }
		 return true;		 
	}
	

}
