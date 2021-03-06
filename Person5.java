// Java学習コースⅣ 自己紹介プログラムを作ろう
class Person {
	// int型のクラスフィールドcountを定義し初期値0を代入
	public static int count = 0;


	// 以下にインスタンスフィールドを定義する
	// カプセル化で、以下privateに変える
	private String firstName;
	public String middleName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	// クラス外から直接アクセスできないインスタンス作成
	private String job;

	// 以下にコンストラクタを定義し、インスタンスフィールドに値をセットしてください
	Person(String firstName, String lastName, int age, double height, double weight, String job){

		// 変数countに1を足す
		Person.count ++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
	}

	// middleNameを受け取るコンストラクタを定義する
	Person(String firstName, String middleName, String lastName, ini age, double height, double weight, String job){
		// Person.count++;
	    // this.firstName = firstName;
	    // this.lastName = lastName;
	    // this.age = age;
	    // this.height = height;
	    // this.weight = weight;

	    // 上と重複する為、削除し、this()を用いて、コンストラクタを呼び出す(重複を避ける)
	    this(firstName, lastName, age, height, weight);

	    // 後から、追加する項目のみ下に追加↓
	    this.middleName = middleName;
	}

	// middleNameフィールドのゲッターを定義(外部から安全にアクセスする)
	public String getMiddleName(){
		return this.middleName;
	}

	// jobのゲッター定義
	public String getMiddleName(){
		return this.job;
	}

	// middleNameフィールドのセッターを定義(戻り値なしの為voidつける + 仮引数はString型middleName指定)
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}

	// jobのセッター定義
	public void setJob(Strign job){
		this.job = job;
	}


	// fullNameメソッドを定義
	public String fullName(){
		// if文での条件分岐を使い、middleNameが存在するときは、middleNameも出力する。
		if(this.middleName == null){
			return this.firstName + " " + this.lastName;
		}else{
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
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
// 〜Java学習コースⅣ (Main5.java)