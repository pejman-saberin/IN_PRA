package DataStructures.HashTables;
//key is the item we want to put in the array. Value is the index in the memory that is calculated based on the hashfunction 

/*
 * if you define more than one class,
 */
class DataItem1  //hashmap unlike linked list, has one data item. Because it doesn't store the address to the next key
{	
	private int iData;
	public DataItem1 (int ii){//constructor
		this.iData=iData;	
	}
	//getter function
	public int getKey(){
		return iData;
	}	
}


class HashTable1
{
	private DataItem[] hashArray; //a hashmap is an array in which the location of its data in the memory is calculted based on the hasfucntion
	private int arraySize;
	private DataItem nonItem; //for deleted items

	public HashTable1(int size){
		this.arraySize=size;
		hashArray=new DataItem[arraySize]; //allocate memory to the hasharray but don't fill yet
		nonItem=new DataItem(-1);////???????
	}
	
	public void displayTable(){
		{
			System.out.print("Table: ");
			for(int j=0; j<arraySize; j++)
			{
				if(hashArray[j] != null)
					System.out.print(hashArray[j].getKey() + " ");
				else
					System.out.print("** ");
			}
			System.out.println("");
		}
		
	}	
	public void insert(DataItem item) // insert a DataItem: We always look for an empty sell in linear porbing
	//(assumes table not full)
	{
		int key = item.getKey(); // extract key
		int hashVal = hashFunc(key); // hash the key
		//until empty cell or -1, (the palce where we put the item is either deleted before meaning that it contains the value -1 or it is null meaning that we never have inserted any numbers before that  
		while(hashArray[hashVal] != null &&
				hashArray[hashVal].getKey() != -1)
		{
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		hashArray[hashVal] = item; // insert item
	} // end insert()
	 
	
	public int hashFunc(int key){		
		return  key%arraySize; //any number that devides by an another numbers, thier reminder will be smaller than the number that the first number is devided to. Example--> first number%second number=remander . Remainder < second number
	}
	public DataItem delete(int key){}
	public DataItem find(int key){}
	
}
 

class HashTableApp1
{
}
 