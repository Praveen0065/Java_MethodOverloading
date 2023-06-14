package Practice;

public class CaseStudy3 {
	
	public void test(String name) {
		System.out.println("String Method...!");
		System.out.println(name);
	}
	
	public void test(StringBuffer firtName) {
		System.out.println("String buffer Method...!");
		System.out.println(firtName);
		
	}
	
	public static void main(String[] args) {
		
		CaseStudy3 c3 = new CaseStudy3();
		
		c3.test("Praveen Kumar");   // String Version
		
		c3.test(new StringBuffer("Dasari"));  // String Buffer Version
	}

}
