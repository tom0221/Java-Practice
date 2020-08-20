
public class Main {
	public static void main(String[] args) {
		// Personクラスから呼び出す記述の仕方
		Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
		Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	}

}
