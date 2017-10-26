package objectOrientation;

public class Cat extends Animal implements InterfaceExample {

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Animal kitty=new Cat ();
		 kitty.getWeight(); 
		 kitty.eat();
		 InterfaceExample pee= new Cat();
		 System.out.println(InterfaceExample.x);
		 kitty.height=0;
		 
		 kitty.fromanimal=9;
		 System.out.println("kitty is" +kitty.fromanimal); 
	}

	@Override
	public void eat() {
		 System.out.println("I am hungry");
		
	}

	@Override
	public boolean pejman() {
		 
		return false;
	}

}
