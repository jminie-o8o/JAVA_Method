class Greeting{
	//public, protected, default, private
	//같은 class 안에서만 사용가능한 것이 private
	public static void hi() {
		System.out.println("Hi");
	}
	
}

public class AccessLevelModifierMethod {

	public static void main(String[] args) {
		Greeting.hi();

	}

}
