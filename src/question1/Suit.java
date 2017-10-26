package  question1;


public enum Suit {	
	 Club (0), Dimond (1), Heart (2) , Spade (3);	
	private int value;
	private Suit (int v){
		setValue(v);		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public static Suit getSuitFromValue(int value) {return  null;} 	 
 }


