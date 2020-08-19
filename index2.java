class Main {
	public static void main(String[] args) {
		int number = 3;
		System.out.println(number);

		// 変数numberの値に7を足して、変数numberを上書き
		number = number + 7;

		// 変数numberを出力
		System.out.println(number);

		// 自己代入の省略
		int number = 8;

	    // 変数numberに7をかけて、変数numberを上書き
	    number *= 7;

	    // 変数numberを出力してください
	    System.out.println(number);

	    // 変数numberの値に1を足して、変数numberを上書き
	    number ++;

	    // 変数numberを出力
	    System.out.println(number);


	    // 三角形と四角形の面積を出力
	    int length = 6;
	    int height = 8;

	    // 変数rectangleAreaに、四角形の面積を代入
	    int rectangleArea = length * height;

	    // 変数rectangleAreaを出力
	    System.out.println(rectangleArea);

	    // 変数triangleAreaに、三角形の面積を代入
	    int triangleArea = length * height / 2;

	    // 変数triangleAreaを出力
	    System.out.println(triangleArea);


	    // double型の変数number1を定義し、8.5を代入
	    double number1 = 8.5;

	    // double型の変数number2を定義し、3.4を代入
	    double number2 = 3.4;

	    // number1にnumber2を足した値を出力
	    System.out.println( number1 + number2 );

	    // number1からnumber2を引いた値を出力
	    System.out.println( number1 - number2 );


	    // 自動型変換
	    int month = 12;
	    int date = 31;

	    // 「12月31日」となるように変数と文字列を連結して出力
	    System.out.println( month + "月" + date + "日");

	    // 7を2で割った値を出力
	    System.out.println( 7 / 2 );

	    // 7.0を2.0で割った値を出力
	    System.out.println( 7.0 / 2.0 );

	    // 7を2.0で割った値を出力
    	System.out.println( 7 / 2.0 );


    	// 強制型変換 キャスト
    	int number1 = 7;
	    int number2 = 2;
	    System.out.println(number1 / number2);

	    // number1をdouble型にキャストし、number2で割った値を出力
	    System.out.println((double) number1 / number2);


	    // 変数nameに、好きな名前を代入
	    String name = "tommy";

	    // 変数ageに、好きな年齢を代入
	    int age = 18;

	    // 変数heightに、好きな身長を代入い（例: 1.2）
	    double height = 1.5;

	    // 変数weightに、好きな体重を代入（例: 20.0）
	    double weight = 40.0;

	    // 変数bmiに、BMIを計算して代入
	    double bmi = weight / height / height;

	    // 名前、年齢、身長、体重、BMIに関する情報を出力
	    System.out.println("名前は" + name + "です");
	    System.out.println("年齢は" + age + "歳です");
	    System.out.println("身長は" + height + "mです");
	    System.out.println("体重は" + weight + "kgです");
	    System.out.println("BMIは" + bmi + "です");

	    // ここまでがJava学習コース1

  }
}