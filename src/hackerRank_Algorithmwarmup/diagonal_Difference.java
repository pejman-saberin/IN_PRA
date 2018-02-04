package hackerRank_Algorithmwarmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


import java.util.Scanner;

public class diagonal_Difference {

	public static void main(String [] Args){

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();//dimensions of the Square matrix
		int a[][]=new int[n][n];

		for(int a_i=0; a_i < n; a_i++){
			for(int a_j=0; a_j < n; a_j++){
				a[a_i][a_j] = in.nextInt();
			}
		}

		int Sum=DiagnalSum(a ,n); 
		 
		System.out.println(Sum);

	}
	/*
	 *i=j=0 ,i=j=1,i=j=n    /
	 * 
	 */
	static int DiagnalSum(int [][]a,int n){
		int localSum1=0; //first diagnal
		int localSum2=0; //first diagnal
		int temp=0;
		 
		for (int i=0;i<n;i++){
			
			for (int j=0;j<n;j++){
				//first di3agnal
				if (i==j){
					localSum1=localSum1+a[i][j];

				}
				/*second diagnal  i=0 ,i=1, i=2, ... ,i=n
				 * 				  j=n , j=n-1, j(n-2), ... j=0 */	
				if (i==temp &&j==n-1-temp){
					localSum2=localSum2+a[i][j];

				}
				 
			}
			temp++;
			

		}
		
		return Math.abs(localSum1-localSum2) ;
	}	
}
