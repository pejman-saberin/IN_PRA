package hackerRank_Algorithmwarmup;

import java.util.Scanner;

public class AverybigSum {	
	static long result;
	
	AverybigSum(){
		result=0;
		
	}
	
	 static long aVeryBigSum(int n, long[] ar) {
	        // Complete this function
		 for(int i=0;i<ar.length;i++){
			 result=result+ar[i];
		 }
		 	
		 return result;
		 
		 
	    }

	
	public static void main(String Args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long[]ar=new long[n];
		
		for (int ar_i=0; ar_i<n;ar_i++){
			ar[ar_i]=in.nextLong();			
		}
		long result = aVeryBigSum(n, ar);
        System.out.println(result);
	}

}
