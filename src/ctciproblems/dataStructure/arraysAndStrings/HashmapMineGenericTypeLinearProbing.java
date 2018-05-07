package ctciproblems.dataStructure.arraysAndStrings;

//can't really use hashmap with generic type becyuase the hashfuciton depends on the key or else we have to consider all the data types
//so although I am using general type for practice, but I will use integer for the hash funciton
//we assume that we are dealing with an int  a number and also that our key is the data and the value is the data. and if data is smaller than array size then index=key (data) that is past 
/* How to make class a generic type 
 *  To make a class generic add <T> public class HashmapMineGenericType <T>. Then instead of any type you'll have eneric type
 */
//insert  //delete // search //display 

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//public class HashmapMineGenericType <T> { 
public class HashmapMineGenericTypeLinearProbing { 

	private int  size;
	//private T [] hashmapArray;
	private Integer [] hashmapArray;  //the reason I choose integer because int is a primitive type and will always be initilize to 0 and hence we can't use the condtion if equals to null
	private int iData;
	private int key; //the key will be determined by the hash function

	public static void main (String []args){	
		//for the sake of testing userinput I have the user

		/*//we ask the user to enter the size of the hashmap
		Scanner reader=new Scanner(System.in); //Reading from System in
		System.out.println("Enter a number for the size of the array");
		//need a method to let the user know that they enter incorrcet number
		int userinputsize= reader.nextInt(); // Scans the next token of the input as an int.
		HashmapMineGenericType p=new HashmapMineGenericType(userinputsize);	*/	

		HashmapMineGenericTypeLinearProbing test= new HashmapMineGenericTypeLinearProbing (60, 1);
		/*test.insert(5);
		test.insert(5);
		test.insert(4);
		test.insert(4);
		test.insert(4);*/
		test.insert(6);
		//test.display();
		System.out.println(test.find(6));
		test.delete(6);



	}
	//two constrcutors one for userinput and also one for regukar	
	HashmapMineGenericTypeLinearProbing (int size, int  iData){
		this.size=size; //size of the hashmap, can not be changed
		this.iData=iData; //the data that goes into hashmap
		this.hashmapArray= new Integer [size]; //assuming that we are dealing with int size
		//ArrayList<Integer> bucket = new ArrayList<Integer>(); we could possibly do arraylist
		key=HashFunction(iData); //determine the location of the first data
		this.hashmapArray[key]=iData;
	}	

	//constructor for user input
	HashmapMineGenericTypeLinearProbing (int userinputsize){
		this.size=size;		
		//List<T> hashmapArray= new ArrayList<T>(this.size); //initilizing an arraylist with generic type	
		int []hashmapArray = new int [this.size];		
		ArrayList<Integer> bucket = new ArrayList<Integer>();
	}

	//hasfunction
	public int  HashFunction(int data){
		//data is an int in this case. So if data is smaller than the array size. The data will become the index becuse for example 3%10=3 for int
		key=data%this.size;
		return key;
	}


	//public  T insert (T data){
	public  void insert (int data){		
		/*
		 * Steps to insert
		 * We need to find the correct index by using a hashfunction
		 */
		//Step 1: find the correct index by using the hash function
		this.key=HashFunction(data);

		//if no data exists enter the data at that location
		if (this.hashmapArray[this.key] ==  null ){
			this.hashmapArray[this.key]=data;
		}
		else{
			//handle collisions with linear probing
			while (this.hashmapArray[key] !=  null){ 
				key++;				
			}
			this.hashmapArray[this.key]=data;
		}




	}

	void display (){
		for (int i=0;i<=size-1;i++){
			System.out.println(this.hashmapArray[i]);
		}
	}
	//this is not complete. Need to search the next index 
	void delete(int data){
		int temp=find(data);
		this.hashmapArray[temp]=-1;
		display();
	}

	//this is not complete. Need to search the next index

	int find(int data){
		this.key=HashFunction(data);
		if (this.hashmapArray[key]==  data ){
			return this.hashmapArray[key];	
		}
		else
		{
			return 1;
		}




	}




}
