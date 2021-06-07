class Print{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");

	}
	//메소드를 정의할때 static이 없으면 인스턴스다
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");

	}
	//메소드를 정의할때 static을 쓰면 클래스다
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");

	}
}


public class staticMethod {
	
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		//t1은 인스턴스
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
//		Print.a(); //실행되지 않는다 왜냐하면 a()메소드는 클래스가 아닌 인스턴스 소속이기 때문에
		Print.c("&");
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		

	}

}
