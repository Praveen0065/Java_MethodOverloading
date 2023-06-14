package Practice;

public class Basic {
	
	public void jump(int a) {
		
		System.out.println("A : " + a );
	}
	
	public void jump(int a , int b) {
		System.out.println("A : " + a);
		System.out.println("B : "+ b);
	}
	
	public void jump(String name) {
		
		System.out.println("Name : " + name);
	}
	
	public void jump(String firtName, String lastName) {
		System.out.println("firstName : " + firtName);
		System.out.println("lastName : " + lastName);
		
	}

}

class BasicMain {
	
	public static void main(String[] args) {
		Basic b1 = new Basic();
		b1.jump(15);
		b1.jump(25, 30);
		b1.jump("Eidiko");
		b1.jump("Praveen", "Dasari");
		b1.jump(null); // defines String
	}
}
