package moderateProblems;
/*problem description: 
 * 4 slots: each  slot red(R), Yellow (Y), Green (G), Blue (B)
 *  one color can appear more then once : for example RGGB . Slots are in order
 *  When you guess the correct color for the slot you get hit. Guess correct color but for the wrong slot you get 'psudo hit'
 *  For example, if the actual solution is RGBYandyou guess GGRR, you have one hit
and one pseudo-hit.
write a method that returns hits and psudo hits when a guess and solution is given
 */

public class Problem17_5 {
	public static void main (String args []){

		char [] guess={'G','G','W','Y'};		
		char [] solution={'R','G','B','Y'};
		char []results=guessSlotColors(guess,solution);
		for (char x : results){
			System.out.println(x);
		}
	}
	//my solution
	public static char [] guessSlotColors(char [] guess, char []solution){//guess given by the user , solution is what actually exists in the the slots
		char [] results = new char [4];	
		boolean check=false;
		//we can check for lower and upper case as well or we can make all the charaters upper case
		//   TODO:
		//check to see if  array is larger than 4 
		//   TODO:
		for (int i=0; i<guess.length;i++){		
			//this will check for the hit
			if (guess[i]==solution[i]){
				results[i]='h';					
			}
			//This will check for the 'psudo hit'
			else if (guess[i]!=solution[i]){				
				for (int j=0; j<guess.length;j++){				 
					if(guess[i]==solution[j]){						
						results[i]='P';	
						check=true;
					}
					else if(check==false)
					{//case where the charater is not in the set 
						results[i]='N';						
					}
				}

			}
			check=false;
		}
		return results;	
	}	
}

