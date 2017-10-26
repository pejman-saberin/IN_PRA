/**
 * 
 */
package DATA_STRUCTURES;

import java.util.HashMap;

/**
 * @author User
 *
 */
public class CrackingtheQuestionsPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrackingtheQuestionsPractice pejman=new CrackingtheQuestionsPractice();
		//pejman.isUniqueChars("grt");
		int val=1;
		System.out.println(~1);
		System.out.println(2<<val);
		System.out.println(5<<val);
		if (true){
			System.out.println(-1>>>1);
		}
		System.out.println(new String("stirng").length());
		 for (Byte b : new String("stirng").getBytes()) {
		     System.out.print("["+b+"]"); 
		 }
		
	}
	 
	
	
	public boolean isUniqueChars (String str){
		int checker=0;
		for (int i=0; i<str.length();i++){
			int val=str.charAt(i)-'a';			 
			System.out.println((int)'x');
			if ((checker & (1<<val))>0){
				System.out.println("dear lovliest man IT IS NOT UNIQUE");
				return false;
				}
			checker |= (1<<val);  //
			System.out.println("this is checker"+checker);
		}
		System.out.println("be happy that it is unique");
		return true;		
	}
	
	public char[] sortthestring(String str){
		char [] sortedString=str.toCharArray();
		return sortedString;
	}
	
	public String permutation(String a, String b){
		return  a;
	}
	
	public String RepalceCharacters(String s, int length){
		char [] S=s.toCharArray();
		int count=0;
		for (int i=0; i<length; i++){
			if (S[i]==' '){				
				count++;				
			}
			
			
		}
		return s;
		
		
	}
	
	

}
