package java5;

public class Code5_5 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドを呼び出し完了");
	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
