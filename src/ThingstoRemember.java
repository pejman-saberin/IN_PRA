import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;
import java.util.LinkedHashSet;
import java.util.Map;
/*
 * vector resizes the array by allocating twice as much memory, however, arraylist adds %50 of original size
 * read java generics
 */
import java.util.TreeMap;


public class ThingstoRemember {

	private class node <T>{
		int data;
		node next;
	}

	public static void  main (String args []){
		
		Integer p = new Integer(1);
		System.out.println(p);
//		int[][] ttt= {{1,2,3},{1,2,3},{1,2,3},{1,2,3}};	
//		System.out.println(ttt.length); 	 
//
//		for (int i=0; i<=ttt.length;i++){
//			System.out.println("The value of I "+i  );
//			for(int j=0; j<=ttt.length;j++){				
//				System.out.println("The value of J "+j );
//			}
//		}
//
//		int [][] p= new int [10][10]; //intilize materix
//		Character c='a';
		//System.out.println(c.hashCode());
		//		===========================================================
		//													SET INTERFACE (Does not allow duplicats)
		 HashSet <Object> p1= new HashSet<>();  //(does not gurantee order)
 		p1.add(7); 		 
		p1.add(2);
		p1.add(1);
		p1.add(51);
		
		System.out.println("p1size is "+p1.size());
		System.out.println("p1legnth is "+p1.toArray().length);

		//System.out.println(p1.toArray());
		Iterator hashset=p1.iterator();
		while(hashset.hasNext()){
			System.out.println(hashset.next());
		}
		 
		//		===========================================================
		/*TreeSet <Integer> treeset=new TreeSet <>();   (Gurantees sort and no duplicate(since it is part of Set)
		treeset.add(5); //it will sort in the tree autmatically
		treeset.add(1);
		treeset.add(2);

		Iterator itr=treeset.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		 */
		//		===========================================================
		/*		LinkedHashSet <Integer> lhs= new LinkedHashSet<>();  //gurantees order and no duplicate
		lhs.add(4);
		lhs.add(3);
		lhs.add(8);

		Iterator lhsitr=lhs.iterator();
		while (lhsitr.hasNext())System.out.println(lhsitr.next());*/
		//		===========================================================



		//		===========================================================
		//		MAP INTERFACE  

		TreeMap <String, Integer> treemap= new TreeMap<>();   //it sorts based on the key (replaces the existing key on duplicate
		treemap.put ("b",1);
		treemap.put ("a",1);
		treemap.put ("a",3);
		Iterator treemapIt=treemap.entrySet().iterator();
		while (treemapIt.hasNext()) {
			Map.Entry pair = (Map.Entry)treemapIt.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			treemapIt.remove(); // avoids a ConcurrentModificationException
		}

		/*System.out.println("pejman".equalsIgnoreCase("pejman"));
		System.out.println("a".hashCode());//gives the hascode of the perticular char or string. Use to implemet hashmap

		Integer test=null; //this can be null
		int test2=0; //test needs to be initilized to 0
		System.out.println(test.hashCode());//gives the hascode of the perticular char or string. Use to implemet hashmap

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

		//generics
		ThingstoRemember t=new ThingstoRemember();
		node ll= t.new node(); //this is weird 

		ArrayList <node <String>> pejman= new ArrayList<>();
		ArrayList <node <Integer>> pejman1= new ArrayList<>();
		ArrayList <node <Number>> pejman2= new ArrayList<>();
		// same as the following 
		ArrayList <node <Number>> pejman3= new ArrayList <node <Number>> ();*/


	}

}
