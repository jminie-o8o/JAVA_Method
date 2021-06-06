
public class WhyMethod {


	public static void main(String[] args) {
		
		              //a,- 는 인자(argument)
//		printTwoTimes("a","-");
		System.out.println(twoTimes("a", "-"));
		//1000000000
//		printTwoTimes("a","*");
//		//1000000000
//		printTwoTimes("a","&");

		

	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter +"\n" ;
		out = out + text +"\n";
		out = out + text +"\n";
		return out;

	}
	
	
	                                 // text,delimeter = 매개변수(parameter)
	public static void printTwoTimes(String text,String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
