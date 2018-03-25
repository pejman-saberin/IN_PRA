package random_erase;

public class HashMap {
	
	public static void main(String args []){		  
		String [] words={"pejman","is", "a","good","man"};
		System.out.println(makeSentence(words));
		System.out.println(bufferString(words));
		
		HashMap p=new HashMap();
		System.out.println(p.makeSentence(words));
		
	}
	
	//Concatenating the string:issue is space doubles, because for each copy it needs to copy the whole string 
	public static String makeSentence (String []words){
		String sentence="";
		for (String s: words){
			sentence=sentence+s+" ";
		}
		return sentence;		
	}
	
	public  String makeSentence2 (String []words){
		String sentence="";
		for (String s: words){
			sentence=sentence+s+" ";
		}
		return sentence;		
	}
	
	public static StringBuffer bufferString(String [] words){
		StringBuffer sentence=new StringBuffer();
		for (String s:words){
			sentence.append(s);
			sentence.append(" ");
		}
		return sentence;
	}
	
	//this will make sure that string has all the unique characters
	public static boolean stringUniqueCharacter(String word){
		boolean unqiue=false;
		
		return unqiue;
	}
	
	  
	
	
	
 

}
