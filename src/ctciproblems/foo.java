package ctciproblems;

public class foo {


	public static void main(String args[] ){
		foo();
	} 

	public static int[][] foo(){

		int[][] a = { { 2, 0, 2,0 }, {  2, 0, 2,0 }, { 0, 0, 0,0},{ 0, 0, 0,0}  };


		for (int y=0;y<=3;y++){
			for (int x=0;x<=2;x++){
				if (a[x+1][y] != 0){
					if( a[x+1][y] == a[x][y]){
						a[x][y] = a[x][y]*2;
						a[x+1][y] = 0;
					}

					if (a[x][y] == 0){
						a[x][y] = a[x+1][y];
						a[x+1][y] =0;
					}
				}
			}


		}
		//priting 
		for (int y=0;y<=3;y++){
			
			for (int x=0;x<=3;x++){
				System.out.print(a[y][x]);
				System.out.print(" ");
			}
			System.out.println();
		}


		return  a;
	} 



}
