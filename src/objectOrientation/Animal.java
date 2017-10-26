package objectOrientation;

public abstract class Animal {
	
	private double weight;
	int  fromanimal=7;
	protected double height=1;
	
    
	 public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}

	public abstract void eat (); 
 

}
