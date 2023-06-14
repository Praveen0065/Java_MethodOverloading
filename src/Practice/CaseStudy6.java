package Practice;
class Animal {
	
}

class Monkey extends Animal {
	
}
public class CaseStudy6 {

	public void test(Animal a) {
		System.out.println("Animal version...!");
	}
	
	public void test(Monkey m) {
		System.out.println("Monkey Verion...!");
		
	}
	
	public static void main(String[] args) {
		
		CaseStudy6 c6 = new CaseStudy6();
		
		Animal a  = new Animal();
        c6.test(a);	
        
        Monkey m = new Monkey();
        c6.test(m);
		
        Animal a1 = new Monkey();
        c6.test(a1);
        
		
		
	}
}
