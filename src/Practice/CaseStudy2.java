package Practice;

public class CaseStudy2 {
	
	public void base( Object o) {
		
		System.out.println("Object Version --------");
	}
	
	public void base(String name) {
		
		System.out.println(name);
		System.out.println("String verion");
	}
	
	
    public static void main(String[] args) {
    	
    	CaseStudy2 c1 = new CaseStudy2();
    	
    	c1.base(new Object());    // Object Version
	    c1.base("Dasari Praveen"); // String Type
}
    
}
