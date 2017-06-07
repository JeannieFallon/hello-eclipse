package object;

public class Greeter {
	
	private int number;
	
	public Greeter() {}
	
	public Greeter(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void sayHi(String nameName) {
		for(int i = 0; i < this.number; i++) {
		System.out.println("Hello, " + nameName + ", my name is Eclipse!");
		}
	}
	
}
