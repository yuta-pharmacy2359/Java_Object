package practice;

	class First {
		public First() {
			System.out.print("First ");
		}
	}
	
	class Second extends First {
		public Second() {
			System.out.print("Second ");
		}
	}
	
	class Exec {
		public static void main(String[] args) {
			Second s = new Second();
			First f = new First();
		}
	}

