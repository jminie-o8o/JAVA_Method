
public class OutputMethod {
	
	public static String a() {
		//...
		return "a";
	}
	              //�޼ҵ�� �޼ҵ��� return���� � ������ Ÿ������ �������־���� 
	public static int one() {
		//...
		return 1; //�޼ҵ��� return�� ���� ���� �޼ҵ��� �������� �ȴ�. �� return���� �޼ҵ带 �����Ű�� ȿ���� �ִ�.
	}
                  //return���� ������ void
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());

	}

}
