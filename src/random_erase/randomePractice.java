package random_erase;
import java.util.HashMap;
import java.util.Map;


public class randomePractice {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("magna", "Pejman");
		hm.put("magnar"," ");
		
		for (String key: hm.keySet()){
			System.out.println(key+":"+hm.get(key));
		}
		
		int [][] p= new int [10][10];
	}

}
