// Java道場コースⅡ
class Bicycle{
	private String name;
	private String color;

	// インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意
	Bicycle(String name, String color){
		this.name = name;
		this.color = color;
	}

	public void printData(){
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
	}
}