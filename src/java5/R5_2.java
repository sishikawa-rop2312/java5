package java5;

public class R5_2 {
	public static void main(String[] args) {
		email("メールタイトル", "hoge@gmail.com", "メール本文");
	}

	public static void email(String title, String address, String text) {
		System.out.printf("%sに、以下のメールを送信しました\n件名：%s\n本文：%s", address, title, text);
	}
}
