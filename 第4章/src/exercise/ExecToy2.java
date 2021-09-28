package exercise;

public class ExecToy2 {

	public static void main(String[] args) {
		Toy toy = null;
		System.out.println(toy.getItem());
	}

}
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "exercise.Toy.getItem()" because "toy" is null at exercise.ExecToy2.main(ExecToy2.java:7)
// 実行時例外
