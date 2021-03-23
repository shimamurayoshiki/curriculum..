package study;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//①以下のルールに従いAccoutクラスのインスタンスを生成
		//変数名：「accout」
		Account account = new Account("hoge", 123, "abc123");
		//②　①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出す
        account.printAccountInfo();
		;
        //ユーザー名は、hege
         //IDは、１２３
         //パスワードは、abc123　と出力するようにする
	}

}