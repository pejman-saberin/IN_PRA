package ctciproblems.dataStructure.arraysAndStrings;

/*
 * 1.3 Given two strings, write a method to decide if one is a permutation of the other 
 */

/*
 * does this case take numbers as well. 
 * Are uppser case and lower case the same. 
 * Do we consider white spaces.
 */

public class Problem_1_3 {
	
	public static void main(String args[])
	{
		
	}
	
	public boolean compareStrings ( String A, String B){
		//some checks on the strings itself
		if (A== null){
			System.out.println("the first string you have entered is empty");
		}
		if (B== null){
			System.out.println("the second you have entered is empty");
		}
		//if number are entered, do we treat them as string?
		/*
		 * two ways to figure out if the two strings are equl or not .
		 * Sort the string and check for characters. 
		 */
		if (A.length()!= B.length()){
			return false;
		}		
		else{
			A=java.util.Arrays.sort(A); //runs a merge sort
		}
		
		
		return true;
	}
}
