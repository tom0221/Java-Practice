// Java学習コースⅣ
class Main {
	public static void main(String[] args) {
		Person person1 = new Person();
		// Personクラス1 helloメソッドを呼び出し。
		person1.hello();

		// person1のインスタンスフィールドnameに名前を定義
		person1.name = "Kate Jones";
		// インスタンスフィールドnameの値を出力
		System.out.println(person1.name);



		// 2番目のperson2のhelloメソッドを呼び出す。
		Person person2 = new Person();
		// Personクラス2 helloメソッドを呼び出し。
		person2.hello();

		// person2のインスタンスフィールドnameに名前を定義
		person2.name = "John Christopher Smith";
		// インスタンスフィールドnameの値を出力
		System.out.println(person2.name);
	}
}