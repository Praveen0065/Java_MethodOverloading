package Practice;

public class CaseStudy1 {
	
	public void Run(int a) {
		System.out.println( "A : " + a);  // byte --> short --> int --> long --> float --> double      
	}                                     //                     ^
	                                      // char ---------------^
	
	public void Run(float b) {
		System.out.println("B : " + b);
	}
	
	public static void main(String[] args) {
		
		CaseStudy1 c1 = new CaseStudy1();
		c1.Run(25);
		c1.Run(30.5f);
		c1.Run('b');   // char can be promoted into int type // output b asci value 
		c1.Run(10L);   // long can be promoted into float type
		               
	}

}
