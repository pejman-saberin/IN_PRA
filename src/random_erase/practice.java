package random_erase;

import java.util.*;

public class practice {

	//PAGE 82 arrays and strings 
	//1.1

	public static void main (String args[])
	{
		//Java collections :sets and list:  when to use list : when you like to allow duplicates because sets do not allow duplicaes. use unorederd and unsorted for fasteder speed. Linked means ordered. Tree means sorted. 
		//below is the list: ArrayList , Vector, LinkedList
		//ArrayList is quicker than Vector because it is not synchronized
		//ArrayList and Vector are better at finding because they are indexd
		//but the LinkedList is better at deletion and addition because once you 
		//add or delete an array or vector it size changs and elements need to move but not in the linked list
		//
		ArrayList<String> al= new ArrayList<String>();
		al.add("Pejman");	
		al.add("Joe");
		al.add("Jim");
		al.add("Aghadas");

		System.out.println("\n using iterator to list items");
		Iterator <String >aliterator= al.iterator() ;
		while (aliterator.hasNext()){
			System.out.println(aliterator.next());
		}

		System.out.println("\n Using WHILE LOOP");
		int i=0;
		while (i< al.size()){System.out.println(al.get(i));
		i++;}

		System.out.println("\n using for loop to list items");
		for (i=0; i<al.size();i++)
			System.out.println(al.get(i));


		System.out.println("\n using new way to list items");
		for (String temp: al){
			System.out.println(temp);
		}
		IsCharacterUnqie ("jefsdfsdf");
		permutation("PEJMAN", "PEJMAN");
		
		final int[][] matrix = {
				  { 1, 2, 3 ,5},
				  { 4, 5, 6 ,11},
				  { 7, 8, 9 ,45},
				  { 56, 48, 39 ,43}
				};
		FlipMatrix(matrix,matrix.length);		

	}

	//1.1 page 82: 
	//Implement an algorithm to determine if a string has all unique characters. 
	//What if you can not use additional data structure.
	public static boolean IsCharacterUnqie(String Word){
		/*In ASCII there is 256 unique characters possible
		 * compare to ASCII characters and not unicode for simplicity
		 */
		//first check if we have more than 256 characters then return false
		if (Word.length()>256)return false;			
		boolean charset []=new boolean[256];
		for (int i=0;i<Word.length();i++){
			int valueofthecharacter=Word.charAt(i);
			if (charset[valueofthecharacter]){
				System.out.println("Not Unique");
				return false;
			}	
			charset[valueofthecharacter]=true;
		}
		System.out.println("Unique");
		return true;
	}

	//1.3 given two strings, write a method to decide if one is a permutation of the other.
	public static boolean permutation(String A, String B) {
		char [] A1= A.toCharArray();
		char [] B1= B.toCharArray();
		Arrays.sort(A1);
		System.out.println( A1);
		Arrays.sort(B1);
		System.out.println( B1);
		String A11=A1.toString();
		String B11=A1.toString();
		if (A1.length!=B1.length){System.out.println("Lengths are not equal");return false;}
		if ( A11.equals(B11) ){
			System.out.println("They are equal");
		}
		else 
			System.out.println("They are  NOT equal");
		return false;	
	}
	//1.5:  
	/*
	 * we are compressing a string aacc to ac and writing it as a2c2, if it can't get compressed
	 * we return the original string
	 */
	
	
	
	//1.6:
	/*Given an image represented by an NxN matrix where each pixel is a 4 bytes, write a method to rotate the image by 90 degrees
	 * . Can you do this in place. 
	 */
	
	public static void FlipMatrix(int [][] matrix, int size){
		System.out.println("\n\nWE ARE INSIDE FLIP MATRIX");
		//we want to iterate through the entire matrix and swap x and y
		//print the matrix before flip:
		int [][] matrixtemp=new int [size] [size];
		System.out.println("Print before Flip");
		for (int x=0; x<size ;x++){				
			for (int y=0; y<size ;y++){
				System.out.print(matrix[x][y]+ "        ");								 
			}
			System.out.println();
		}		
		for (int x=0; x<matrix.length ;x++){			 			
			for (int y=0; y<matrix.length ;y++){					 
				matrixtemp[x][y]=matrix[y][x];					  	
			}
		}			
		System.out.println("after flip");
		for (int x=0; x<matrix.length ;x++){				
			for (int y=0; y<matrix.length ;y++){
				System.out.print(matrixtemp[x][y]+ "        ");								 
			}
			System.out.println();
		}	
		
	}
	
}
