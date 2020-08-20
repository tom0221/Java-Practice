// Java学習コースⅢ
class Main {
	public static void main(String[] args) {
		hello();
	}

	public static void hello() {
		// "Hello World"を、"Hello Java"に書き換え
		System.out.println("Hello Java");
	}


	public static void main(String[] args) {
	    // 次にprintDataメソッドを呼び出し②
	    printData();
	  }

		// まずprintDataメソッドを定義①
	public static void printData(){
		System.out.println("私の名前はKate Jonesです");
	}



	// 引数の基本
	public static void main(String[] args) {
	    // 引数に「Kate Jones」を渡す
	    printData("Kate Jones");

	    // 引数に「John Christopher Smith」を渡す
	    printData("John Christopher Smith");

	}

		// 引数を受け取る
	public static void printData(String name) {
		// 「私の名前は◯◯です」と出力されるように書き換える
		System.out.println("私の名前は" + name + "です");

	}

	// 複数の引数
	public static void main(String[] args) {
	    // それぞれ年齢に関する引数を追加してください
	    printData("Kate Jones", 27);
	    printData("John Christopher Smith", 65);
	}

  	// 年齢に関する引数を受け取れるようにする
	public static void printData(String name, int age) {
	    System.out.println("私の名前は" + name + "です");
	    // 「年齢は◯◯歳です」と出力してください
	    System.out.println("年齢は" + age + "歳です");
	}






}