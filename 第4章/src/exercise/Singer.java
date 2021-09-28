package exercise;

public final class Singer {
	private final String name;

	public Singer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
/*
 ①セッターメソッドを消す 
 ②フィールド変数にfinal修飾子をつける
 ③クラス宣言にfinal修飾子をつける
 */