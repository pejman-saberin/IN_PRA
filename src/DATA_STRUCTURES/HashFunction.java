package DATA_STRUCTURES;


public class HashFunction {
	
	String []theArray;
	int arraySize;
	int itemsInarray=0;
	
	
	public static void main (String [] args){
		System.out.println(96%10);
		System.out.println(56%10);
		
	}
	
	
	public HashFunction (int size){
		arraySize=size;
		theArray=new String [size];
		//Arrays.fill(theArray,"-1");
		
	}
	

}
