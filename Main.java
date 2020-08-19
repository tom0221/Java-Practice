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


    }
}
