
public class Main {
	public static void main(String[] args) {
		// Personクラスから呼び出す記述の仕方
		Person0.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
		Person0.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	}
}


// 外部ライブラリjava.util.Scannerを読み込む
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("名前： ");

		// 変数nameを定義し、コンソールから文字列を受け取ってnameに代入
		String name = scanner.next();

		// 「こんにちは◯◯さん」と出力
		System.out.println("こんにちは" + name + "さん");
	}

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("名前：");
	    // 文字列の入力を受け取る
	    String firstName = scanner.next();

	    System.out.print("名字：");
	    // 文字列の入力を受け取る
	    String lastName =  scanner.next();

	    System.out.print("年齢：");
	    // 整数の入力を受け取る
	    int age = scanner.nextInt();

	    System.out.print("身長(m)：");
	    // 小数の入力を受け取る
	    double height = scanner.nextDouble();

	    System.out.print("体重(kg)：");
	    // 小数の入力を受け取る
	    double weight = scanner.nextDouble();

	    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
 	}
}

// ここまでJava学習コースⅢ
