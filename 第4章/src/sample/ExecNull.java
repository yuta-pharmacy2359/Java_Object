package sample;

public class ExecNull {

	public static void main(String[] args) {
		Product p1 = null;
		p1.setNumber("B200");
	}

}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "sample.Product.setNumber(String)" because "p1" is null at sample.ExecNull.main(ExecNull.java:7)
// 実行時例外