import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GoogleInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] errorSoon = new String[4];
		errorSoon[0] = "word1 word2 word3";
		errorSoon[1] =  "word1 word4 word5";
		errorSoon[2]= "word1 word5";
		wordCount(errorSoon);
 	 
		 
		 
	}

	
	public static HashMap wordCount(String [] input){
		HashMap <String, Integer> result = new HashMap<>();
		for (int i=0; i<= input.length;i++){			
			String [] array=input[i].split(null);
			for (int i1=0;i1<= array.length;i1++){
				int count=0;			
				if (array[i1] != null){
					count++;	
				}
				else  count=1; 

				result.put(array[i], count );
			}
		}
		Iterator entries = result.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry entry = (Map.Entry) entries.next();
		    Integer key = (Integer)entry.getKey();
		    Integer value = (Integer)entry.getValue();
		    System.out.println("Key = " + key + ", Value = " + value);
		}
		return result;
	}
	
}






