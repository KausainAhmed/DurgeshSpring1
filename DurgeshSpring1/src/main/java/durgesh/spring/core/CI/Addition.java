package durgesh.spring.core.CI;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Cnstructor : int, int");
	}

	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Cnstructor : double, double");
	}

	public void doSum() {
		System.out.println("Sum is = " + (this.a + this.b));
	}
}
