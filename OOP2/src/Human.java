
public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){
		// this is constructor
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " je");
	}
	void drink() {
		System.out.println(this.name + " pije");
	}
	
}
