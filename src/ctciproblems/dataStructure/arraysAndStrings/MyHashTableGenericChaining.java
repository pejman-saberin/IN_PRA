//package ctciproblems.dataStructure.arraysAndStrings;
///*
// * represenation of Hashtable writeten by me that cotains generics and
// * it prevernts collisions by separate chaining, Linkedlist
// */
//
//import java.util.ArrayList;
//
//////Insert, Find, Delete, 
//
//public class MyHashTableGenericChaining <K extends Object,V extends Object> {// <K,V> this makes the class generic   
//
//	private K [] HashArray; //the hashmap. use Integer instead of int so that we can use null
//	//private ArrayList<MyHashTableGenericChaining<K, V>> bucketArray;  --> can do this bucketArray=new ArrayList<>()
//	private K data; // we could insert any data, String, int  
//	private int key; //for storage within the hashArray
//	int size;
//
//	public static void main ( String []args){
//
//	}
//
//	MyHashTableGenericChaining (int size)
//	{
//		this.size=size;
//		//HashArray=(K[]) new MyHashTableGenericChaining [size];// https://stackoverflow.com/questions/2927391/whats-the-reason-i-cant-create-generic-array-types-in-java  K extends object		
//		this.HashArray=(K[]) new  Object [size];
//	}
//	public int hashFunc(K Data){		 
//		key=Data.hashCode(); //gives Hashcode //hashcode of any number is the number itself
//		key=key%size;		
//		return key;			
//	}
//
//	//Insert 
//	public void Insert (K DATA){
//		//Find theh index by using HashFunction
//
//
//
//	}
//
//
//}
