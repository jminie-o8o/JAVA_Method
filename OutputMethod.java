
public class OutputMethod {
	
	public static String a() {
		//...
		return "a";
	}
	              //메소드는 메소드의 return값이 어떤 데이터 타입인지 정의해주어야함 
	public static int one() {
		//...
		return 1; //메소드의 return값 뒤의 값이 메소드의 실행결과가 된다. 또 return값은 메소드를 종료시키는 효과도 있다.
	}
                  //return값이 없을때 void
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());

	}

}
