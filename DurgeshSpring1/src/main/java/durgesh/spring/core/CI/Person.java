package durgesh.spring.core.CI;

public class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.id;
	}

}
