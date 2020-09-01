// Java学習コースⅣ 自己紹介プログラムを作ろう
class Person {
	// int型のクラスフィールドcountを定義し初期値0を代入
	public static int count = 0;


	// 以下にインスタンスフィールドを定義する
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	// 以下にコンストラクタを定義し、インスタンスフィールドに値をセットしてください
	Person(String firstName, String lastName, int age, double height, double weight){

		// 変数countに1を足す
		Person.count ++;

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// fullNameメソッドを定義
	public String fullName(){
		return this.firstName + " " + this.lastName;
	}


	// printDataメソッドを定義
	public void printData(){
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
	}

	// bmiメソッドを定義
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// クラスメソッドprintCountを定義
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}

}