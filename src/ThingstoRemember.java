import java.util.ArrayList;
import java.util.Vector;
/*
 * vector resizes the array by allocating twice as much memory, however, arraylist adds %50 of original size
 */


public class ThingstoRemember {
	
	class node <T>{
		T data;
		node T;
	}
	
	public static void  main (String args []){
		int [][] p= new int [10][10]; //intilize materix
		
		Integer test=null; //this can be null
		int test2=0; //test needs to be initilized to 0
		ArrayList <Integer> P= new ArrayList <>(); //intilize ArrayList
		Vector <Integer> vector= new Vector <>();
		
		//Matrix
		int [][] key= new int[3][2];
		System.out.println(key.length);
		for (int i=0;i <key.length; i++){
			for  (int j=0;j <key.length-1; j++){
				System.out.print(key[i][j]+" ");
			}
			System.out.println( );
		}
		
	}

}
