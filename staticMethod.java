class Print{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");

	}
	//�޼ҵ带 �����Ҷ� static�� ������ �ν��Ͻ���
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");

	}
	//�޼ҵ带 �����Ҷ� static�� ���� Ŭ������
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
		
		//t1�� �ν��Ͻ�
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
//		Print.a(); //������� �ʴ´� �ֳ��ϸ� a()�޼ҵ�� Ŭ������ �ƴ� �ν��Ͻ� �Ҽ��̱� ������
		Print.c("&");
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		

	}

}
