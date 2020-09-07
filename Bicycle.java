// Java道場コースⅡ
class Bicycle{
	private String name;

	// インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意
	Bicycle(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}