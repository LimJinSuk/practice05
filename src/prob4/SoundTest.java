package prob4;

public abstract class SoundTest implements Soundable{

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	public static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
	}

}