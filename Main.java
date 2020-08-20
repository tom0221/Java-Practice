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



}