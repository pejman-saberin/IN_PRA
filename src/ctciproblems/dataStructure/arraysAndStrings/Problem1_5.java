package ctciproblems.dataStructure.arraysAndStrings;

/*
 * Implement a method to perform basic string compression using the counts of
repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string.
 */



public class Problem1_5 {
	
	public static void main (String Args[]){
		System.out.println(compressBad("aabcccccaaa"));;

	}
	
	/*//below is mine and it didn't work

	public static void countChar(String A){	
		System.out.println(A.length());
		Object []result=new Object [A.length()]; //result will be copied heree
		int j=0, count=1; // indexes of results and count the number of alphabets 		

		char [] ACharArray=new char [A.length()]; //covert to character array
		ACharArray=A.toCharArray();
		System.out.println(ACharArray.);
		java.util.Arrays.sort(ACharArray); //sort the array

		result[0]=ACharArray[0]; //copies the first char
		j++;
		System.out.println(result[0]);
		for (int i=1;i<=ACharArray.length-1;i++){
			result[j]=ACharArray[i]; 
			if (ACharArray[i]==ACharArray[i-1]){
				count++;				
			}

			else if (ACharArray[i]!=ACharArray[i-1]){				
				result[j]=(char) count;
				count=1;
				j++;
			}

		}		
		for (int i=0; i<=result.length-1;i++){
			System.out.print(result[i]);
		}


	}
	 */



	public static String compressBad(String str) {
		String mystr = "";
		char last = str.charAt(8);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) { // Found repeat char
				count++;
			} else { // Insert char count, and update last char
				mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}
		return mystr + last + count;
	}
}
