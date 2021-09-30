package exercise;

public class ExecManager {

	public static void main(String[] args) {
		Manager mng = new Manager(110, "森下樹", 32, "プロジェクトマネージャー");
		System.out.print(mng.getId() + "\t");
		System.out.print(mng.getName() + "\t");
		System.out.print(mng.getAge() + "\t");
		System.out.print(mng.getTitle());
	}

}