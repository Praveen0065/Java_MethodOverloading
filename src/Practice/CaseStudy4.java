package Practice;

import java.util.Arrays;

public class CaseStudy4 {
	
	public void m1(int a) {
		System.out.println("General Method...!");
		System.out.println(a);
	}
	
	public void m1(int... a) {
		System.out.println("Var arg Method...!");
		System.out.println(Arrays.toString(a));
	}

	
	public static void main(String[] args) {
		
		CaseStudy4 c4 = new CaseStudy4();
		c4.m1(15); // General Method
		c4.m1(12,13); // Var arg Method
		c4.m1(12,13,20,25); // Var arg Method
		
		
	}
}
