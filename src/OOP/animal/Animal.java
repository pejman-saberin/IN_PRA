package animal;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Animal {
	
	public static final double FAVNUMBER=1.6180;	
	private String name;
	private int weight;
	private boolean hasOwnder=false;
	private byte age;
	private long uniqueID;
	private char favoriteColor;
	public char getFavoriteColor() {
		return favoriteColor;
	}

	public void setFavoriteColor(char favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	
	public void setFavoriteColor( ) {
		int randomNumber=(int)(Math.random()*126)+1;		
		this.speed=speed;
		
		if (randomNumber ==32){
			System.out.println("Favorite characjter set to Speace");			
		}else if (randomNumber ==10){
			System.out.println("dasd");
		}else {
			System.out.println("ad");
		}
		switch (randomNumber){
		case 8:
			System.out.println("Favirtie charactre set to backspace");
			break;
		
		}
		
	}

	private double speed;
	private float height;
	private Scanner userInput;	
	protected static int numberOfAnimals= 0;
	
	static Scanner useriput =new Scanner(System.in);// getting data from the keyboard
	public String makeSound(){
		return "grrr";
	}
	
	public  void speakAnimal(Animal randAnimal){
		System.out.println(randAnimal.makeSound());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwnder() {
		return hasOwnder;
	}

	public void setHasOwnder(boolean hasOwnder) {
		this.hasOwnder = hasOwnder;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	} 

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Scanner getUserInput() {
		return userInput;
	}

	public void setUserInput(Scanner userInput) {
		this.userInput = userInput;
	}
	public void setUniqueID() {
		long minNumber=1;
		long maxNumbar=100000;
		
		this.uniqueID=minNumber+(long)(Math.random())*((maxNumbar-minNumber)+1);
		String stringNumber=Long.toString(maxNumbar);
		
		int numberString= Integer.parseInt(stringNumber);
		
	}

	

	public Animal( ) {
		// super();	//no need for this keyword because Animal doesn't have a super class.  
		numberOfAnimals++;
		int sumOfNumbers=5+1;
		System.out.println("5+1= "+ sumOfNumbers );		
		int diffOfNumbers=5-1;
		System.out.println("5-1= "+ diffOfNumbers );
		 
		int divOfNumbers=5/1;
		System.out.println("5*1= "+ divOfNumbers );
		int modOfNumbers=5%3;
		System.out.println("5%1= "+ modOfNumbers );
		
		System.out.print("Enter the name: \n");
		//hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean  these insures returning the correct data type
		//hsaNextByte
		//nextInt, nextFloat, nextDouble,
		
		this.setFavoriteColor( ); //the getter and setter methods written above require an input variables, to be able to create a method with different number of paramter or with no parameters we need to do method overloading
		this.setUniqueID( );
	
	}
	
	

	public static void main (String [] args){
		 
		Animal rr = new Dog();
		Animal P=new Animal();
		 
		P.speakAnimal(rr) ;
		 int [] p=new int[10];
		 String [] pe= {"e","er"};
		 for (String r: pe){
			 System.out.println(r);
		 }
		
	}
	
	
	
	
	
	

}
