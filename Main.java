// Java学習コースⅡ
class Main {
    public static void main(String[] args) {
        // 「true」を用いて、「真」を表す真偽値を出力
        System.out.println(true);

        // 「false」を用いて、「偽」を表す真偽値を出力
        System.out.println(false);

        // 「==」を用いて、値を比較した結果を出力
        System.out.println( 12 / 4 == 3 );

        // 「!=」を用いて、値を比較した結果を出力
        System.out.println( 12 / 4 != 3 );

        // boolean型の変数boolを定義し、「3 * 9 == 27」を代入
        boolean bool = 3 * 9 == 27;

        // 変数boolの値を出力
        System.out.println(bool);


        // 8と5を比較し、falseとなるように出力
        System.out.println( 8 < 5 );

        // 3と2を比較し、trueとなるように出力
        System.out.println( 3 >= 2 );


        System.out.println(true || false);

        // falseと出力されるようにする
        System.out.println(false && true);

        // 「8 < 5」かつ「3 >= 2」の結果を出力
        System.out.println( 8 < 5 && 3 >= 2 );

        // 「8 < 5」または「3 >= 2」の結果を出力
        System.out.println( 8 < 5 || 3 >= 2 );

        // 「8 < 5」でない、の結果を出力
        System.out.println( !(8 < 5) );



        // if文 条件式に直接trueをいれる
        if (true) {
          System.out.println("条件式がtrueのため、出力されます");
        }

        // 条件式に直接falseをいれる
        if (false) {
          System.out.println("条件式がfalseのため、出力されません");
        }

        int x = 5;
        // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力
        if (x > 2){
          System.out.println("xは2より大きい");
        }

        // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力
        if (x > 8){
          System.out.println("xは8より大きい");
        }


        // elseifとelse文
        int number = 12;

        // numberが20より小さいとき、どちらでもないときの条件分岐を追加
        if (number < 10) {
          System.out.println("10より小さい");
        }else if (number < 20){
          System.out.println("10以上、20より小さい");
        }else{
          System.out.println("20以上");
        }


        // switchm文
        int number = 12;

        // switch文を用いて、numberを3で割った余りで条件分岐
        switch (number % 3){
          case 0:
            System.out.println("3で割り切れます");
            break;
          case 1:
            System.out.println("3で割ると1余ります");
            break;
          case 2:
            System.out.println("3で割ると2余ります");
            break;
        }


        // dafaultを定義したswitch文
        int number = 20;

        // defaultを用いて、どのcaseにも合致しない場合の処理を記述
        switch (number % 5) {
          case 0:
            System.out.println("大吉です");
            break;
          case 1:
            System.out.println("中吉です");
            break;
          case 4:
            System.out.println("凶です");
            break;
          default:
            System.out.println("吉です");
            break;
        }

        // while文で、1になるまでカウントダウン処理
        int number = 10;

        // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理
        while ( number > 0 ){
            System.out.println(number);
          number --;
        }

        // for文(while文の簡略した書き方)
        for ( int i = 1; i <= 10; i++) {
            System.out.println(i + "回目のループです");
        }



        // break処理とcontinue処理
        System.out.println("=== while文 ===");
        int i = 1;
        while (i < 10) {
            // iが5の倍数のとき、繰り返し処理を終了させる
            if ( i % 5 == 00 ){
                break;
            }

        System.out.println(i);
        i++;
        }

        System.out.println("=== for文 ===");
        for (int j = 1; j < 10; j++) {
            // jが3の倍数のとき、処理をスキップさせる
            if ( j % 3 == 0 ){
                continue;
            }

        System.out.println(j);
        }



        // 配列 変数namesに、配列を代入
        String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

        // インデックス番号が0の要素を出力
        System.out.println(names[0]);

        // インデックス番号が2の要素を出力
        System.out.println(names[2]);

        // 配列の要素に新しい値を上書きする

        // 変数languagesを定義し、配列を代入
        String[] languages = {"Ruby", "PHP", "Python"};

        // インデックス番号が「1」の要素を出力
        System.out.println(languages[1]);

        // インデックス番号が「1」の要素を「Java」で上書き
        languages[1] = "Java";

        // インデックス番号が「1」の要素を出力
        System.out.println(languages[1]);



        // for文を使っての配列の繰り返し
        String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};

        // for文を用いて、「私の名前は◯◯です」と出力
        for ( int i = 0; i < names.length; i++){
            System.out.println("私の名前は" + names[i] + "です");
        }


        // 拡張for文
        for (String name:names){
            System.out.println("私の名前は" + name +"です");
        }

    }
}
