// Java学習コースⅣ 自己紹介プログラムを作ろう
class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "医者");
		person1.printData();

		Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    	person2.printData();

    	// 合計何人かを出力する
    	System.out.println("合計" + Person.count + "人です");

    	// printCountメソッドの呼び出し
    	Person.printCount();

    	System.out.println("-----------------")
    	// person1のmiddleフィールドの値をClaireに変更する
    	person1.setMiddleName;

    	// person1の仕事を[獣医]に変更
    	person1.setJob("獣医");

    	// 「person1の仕事を〇〇に変更しました」と出力
    	System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");

    	// person2に対して、getMiddleNameメソッドを呼び出し、person2のミドルネームを出力する
    	System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");



		System.out.println(person1.firstName);
		System.out.println(person1.lastName);
		System.out.println(person1.height);
		System.out.println(person1.weight);

		System.out.println(person1.fullName());
		System.out.println(person1.age);
		System.out.println(person1.bmi());

	}
}

// 〜Java学習コースⅣ (person5.java)