package practice;

import java.time.LocalDate;

public class Machine {
	public static String manufacture = "WEBS";	// ① 継承されない(スタティック変数)
	private int weight = 2000;	// ② 継承されない(privateの変数)
	double power = 3.5;	// ③ 継承される(パッケージアクセス)
	final LocalDate shippingDate;	// ④継承される(finalの変数)
	Machine(LocalDate shippingDate) {	// ⑤継承されない(コンストラクタ)
		this.shippingDate = shippingDate;
	}
	
	public void start() {	// ⑥継承される(インスタンスメソッド)
	}
	
	public static void output() {	// ⑦継承されない(スタティックメソッド)
	}
	
	public final void doit() {	// ⑧継承される(finalのメソッド)
	}
	
	public static void print() {	// ⑨継承されない(スタティックメソッド)
	}
}