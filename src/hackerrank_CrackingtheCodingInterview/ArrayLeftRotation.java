package hackerrank_CrackingtheCodingInterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//a is the array itself
//n number of elements in the array
//k is the rotation

public class ArrayLeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		//Store the first k elements of the array into temp
		int[] temp_k=new int[k];
		for(int i=0;i<k-1;i++){
			temp_k[i]=a[i];
		}
		//store the rest of the array into a new array
		int noneK=n-k;
		int[] temp=new int[noneK];//stores the none elements in the array temp
	    for (int i=k;i<n-1;i++){
	    	temp[i]=a[i];
	    }
	    //let's add the last k elemets
	    int t=0;
	    for (int i= noneK;i<n;i++){
	    	temp[i]=temp_k[t];
	    	t++;
	    }
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for(int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}

