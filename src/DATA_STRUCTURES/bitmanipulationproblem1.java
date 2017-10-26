/**
 * 
 */
package DATA_STRUCTURES;

/**
 * @author Pejman Saberin
 *
 */
public class bitmanipulationproblem1 {

	/**
	 * 
	 */
	public bitmanipulationproblem1() {
		// TODO Auto-generated constructor stub
	}
	static int updateBits (int n , int m,int i, int j){
		/*Create a mask to clear bits i through j in n 
		 *Example: i=2, j=4. Result should be 11100011
		 * For simplicity, we'll use just 8 bits for the example		 * 
		 */
		int allOnes=~0; //will equal sequence of all 1s
		//1's before position j, then 0s. left = 11100000
		int left =allOnes << (j+1);
		
		// 1's after position i. right = 00000011
		int right = ((1  << i) - 1);
		
		// All Is, except for 0s between i and j. mask = 11100011
		int mask = left | right;
		
		/* Clear bits j through i then put m in there */
		int n_cleared = n & mask; // Clear bits j through i.
		int m_shifted = m<< i; // Move m into correct position.
		
		return n_cleared |m_shifted;// OR them, and we're done!
		
		 
		
	}

	 
	public static void main(String[] args) {
		int allOnes=~0;
		System.out.println(Integer.toBinaryString(allOnes)); //~ is the not operator, it converts 0 to 1 and 1 to 0 . This is two's complement represents negative numbers in the memory. ~x==(-x)-1 is the formula
		int left =allOnes << (5);
		System.out.println(Integer.toBinaryString(left));
		int right =allOnes << (((1  << 2) - 1)); // the expresion in the prenthesis becomes 3 and therefore we shift allones 3 to the left
		System.out.println("the right is "+ Integer.toBinaryString(right));
		int mask = left | right;
		System.out.println("mask is " +Integer.toBinaryString(mask));
		int n_cleared = 4 & mask; // Clear bits j through i.
		System.out.println("4 is " +Integer.toBinaryString(4));
		System.out.println("n_cleared " +Integer.toBinaryString(n_cleared));
		int m_shifted = 5<< 2; // Move m into correct position.
		System.out.println("m_shifted " +Integer.toBinaryString(m_shifted));
		System.out.println(m_shifted);
		int p= n_cleared |m_shifted;// OR them, and we're done!
		System.out.println(Integer.toBinaryString(p));
	 

	}

}
