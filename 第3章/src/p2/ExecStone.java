package p2;

import p1.Stone;

public class ExecStone {

	public static void main(String[] args) {
		Stone stone = new Stone(100);
		// stone.methodA(); → コンパイルエラー
		// stone.methodB(); → コンパイルエラー
		// System.out.println(stone.varA); → コンパイルエラー
		// System.out.println(stone.varB); → コンパイルエラー
		System.out.println(stone.varC);
	}

}
