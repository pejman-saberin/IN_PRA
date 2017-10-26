package ctciproblems;

import java.lang.reflect.Array;
import java.util.Random;

public class Problems {

	public static void main (String args[]){
		int [] Array={1,7,5,9,0,6,2,3,2};
		quicksort(Array, 0,Array.length-1);
		for (int i=0;i<Array.length;i++){
			System.out.println(Array[i]);
		}
	}
	//18.6 Describe an algorithm to find the smallest one million numbers in one billion
	//numbers. Assume that the computer memory can hold all one billion numbers.
	//three ways to solve this : 1- sort 2- meanheap  3- selection rank algorithm

	//let's sort: But instead of using the java array.sort()that uses the quicksort let's implement quicksort


	/* mergesort implementation:
	 * quicksort is in place algorithm (marks the original array instead of making new array, uses pivot (random location)
		pseudocode:
	   Partition function : partitions the array recursively
	      sort left of the array (left of pivot)
	      sort right of the array (right of pivot)
	      condition: if all the elements in the left smaller then the pivot or one element left exit the recursion
	 */

	public static void quicksort(int [] undsortedArray,int left,int right){//array is the passed in array, start is the begning of the array and end is the end location
		//choose a random pivot. then sort to the left of the pivot and then right of the pivot
		if (left>=right){
			return;
		}
		int pivot=undsortedArray[(left+right)/2];

		int index=partition(undsortedArray, left,right,pivot);		
		quicksort(undsortedArray, left,index-1); 
		quicksort(undsortedArray, index,right);
		  
	}

	public static int partition(int [] undsortedArray,int left,int right, int pivot){
		int temp;
		while (left<= right){
			while (undsortedArray[left] <pivot) left++;
			while (undsortedArray[right] >pivot) right--;
			if (left<=right){
				temp= undsortedArray[left];
				undsortedArray[left]=undsortedArray[right];
				undsortedArray[right]=temp;	
				left++;
				right--;
			}
		}
		return left;
	}
    //18.6 Solution 1 is in the work laptoop. use quicksort to sort first and then take the smallest one million numbers (Therefore uses array data structure at it's base, but fast O(n  log (n))
	//Solution 2: Use min and max heap (uses list data sttructure at it's base)
	//the heap can be implmented with array or list https://www.youtube.com/watch?v=t0Cq6tVNRBA 
	/*Solution 2 (from the book: Min Heap
	We can use a min heap to solve this problem. We first create a max heap (largest element
			at the top) for the first million numbers.
			Then, we traverse through the list. On each element, we insert it into the list and delete
			the largest element.
			At the end of the traversal, we will have a heap containing the smallest one million
			numbers. This algorithm is 0(n log(m)), where m is the number of values we are
			looking for.
			t
			
	*/
	



}
