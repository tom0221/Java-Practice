// Java道場コースⅡ
class Main{
	public static void main(String[] args){
		Bicycle bicycle = new Bicycle("ビアンキ");
		System.out.println("[自転車の情報]");
		// System.out.println("名前：" + bicycle,getName());
		bicycle.printData();
		System.out.println("-----------------");
		// 改行しない出力の仕方
		System.out.print("走る距離を入力してください");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);
	}
}