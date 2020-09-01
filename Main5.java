// Java学習コースⅣ 自己紹介プログラムを作ろう
class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
		person1.printData();

		Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    	person2.printData();

    	// 合計何人かを出力する
    	System.out.println("合計" + Person.count + "人です");

    	// printCountメソッドの呼び出し
    	Person.printCount();



		System.out.println(person1.firstName);
		System.out.println(person1.lastName);
		System.out.println(person1.height);
		System.out.println(person1.weight);

		System.out.println(person1.fullName());
		System.out.println(person1.age);
		System.out.println(person1.bmi());

	}
}