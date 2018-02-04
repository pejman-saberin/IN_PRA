package hackerRank30;
https://www.youtube.com/watch?v=glENxqtJzAQ  Day 9 of Code: Recursion! (+ Joseph Gordon-Levitt)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Recursion_factorial {

    public static int factorial(int n) {
    	int count =0;
        //exit the function
        if (n > 12 || n<=0 ){
            System.out.println("n can not be larger than 12 or smaller or equal to  0");
            return -1;  
        }
        else if (n<2 && count==0){
        	return 1; 
        }
       
        else if (n <=1){// we have reach the bottom of the factorial
            return 1; 
        }
        else{
        	 count ++;
        	 System.out.println(count);
            return n*factorial(n-1);
            
        }
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
