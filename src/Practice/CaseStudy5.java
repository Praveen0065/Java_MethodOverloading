package Practice;

public class CaseStudy5 {
	
	public void test( int a , float b) {
		System.out.println("int - float - version...!");
		System.out.println("A : " + a);
		System.out.println("B : "+ b);
	}
	
	public void test(float b, int a) {
		
		System.out.println("float - int- version...!");
		System.out.println("B : " + b);
		System.out.println("A : " + a);
	}
	
	public static void main(String[] args) {
		
		CaseStudy5 c5 = new CaseStudy5();
		c5.test(15, 45.2f);
		c5.test(25.6f, 4);
	}

}
