package exercise;

public class Adder {
	private int number;

	public Adder(int number) {
		this.number = number;
	}
	
	public void add() {
		number++;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}


/*
 クラス図 
 -----------------------------
  		Adder
 -----------------------------
  -number:int 
 -----------------------------
 +Adder(number:int)
 +add():void
 +getNumber():int
 +setNumber(int number):void
 -----------------------------
  
  
  
  
 */