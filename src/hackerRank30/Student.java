package hackerRank30;

class Student extends Person{
	private int[] testScores;
	protected static String firstName;
	protected static String lastName;
	protected static int idNumber;
	

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int identification,int[] testScores){
    	super(firstName, lastName, identification);         
    	this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
		this.testScores=testScores;
        
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public static void main (String []args){
        Person S=new Person(firstName, lastName, idNumber);
        S.printPerson();
    }
    public  char calculate(){
    	int AvgSum=0;
    	int count=0;
    	int results=0;
    	for (int i=0;i<testScores.length;i++){
    		AvgSum=AvgSum+testScores[i];
    		count++;
    	}
    	results=AvgSum/count;
    	if (results>=90||results<=100 ){
    		return 'O';
    	}
    	else if (results>=80||results<=90 ){
    		return 'E';    	
    	}
    	else if (results>=70||results<=80 ){
    		return 'E';    	
    	}
    	else if (results>=55||results<=70 ){
    		return 'P';    	
    	}
    	else if (results>=40||results<=55 ){
    		return 'D';    	
    	}
    	else if ( results<50 ){
    		return 'T';    	
    	}
    	else System.out.println("the avarage must be between 0 and 100");   	
    	return (Character) null;
    }
    
    
    
}