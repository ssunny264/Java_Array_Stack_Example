public class Coin {		//lecture example of array stack

	int value;
	String name;

	public Coin (int v, String n) { //constructor!
		value = v;
		name = n;
	}

//CoinStack Class

public class CoinStack {

	private Coin[myarray];
	private int Size;
	private int currentIndex;

	public CoinStack (int s){
		myarray = new Coin[s];
		Size = s;
		currentIndex = 0;
	}
	
	public boolean isFull() {
		if (currentIndex == Size) return true;
		else return false;
	}
	
	public boolean isEmpty() {
		if (currentIndex == 0) return true;
		else return false;
	}
	
	public boolean push (Coin c) {
		if (isFull() == false) {
			myarray[currentIndex] = c;
			currentIndex++;
			return true;
		}
		else return false;		//failed to store coin c
	}

	public Coin pop() {
		if (isEmpty() == false) {
			currentIndex--;
			return myarray[currentIndex];
		}
		else return null;
	}
//or based on lecture
	public Coin pop() {
		if (isEmpty == true) return null;
		else {
			currentIndex--;
			return myarray[currentIndex];
		}
	}

//main class

public class StackApp {
	public static void main (String[] args){
	
		CoinStack coins = new CoinStack(50); //must pass in parameter
		
		Coin c1 = new Coin(1, "penny");
		Coin c2 = new Coin(25, "quarter");
		Coin c3 = new Coin(100, "dollar");
		Coin c4 = new Coin(5, "nickel");

		coins.push(c1);
		coins.push(c2);
		coins.push(c3);
		coins.push(c4);

		while (coins.isEmpty() == false) {
			Coin c = (Coin) coins.pop();
			System.out.println(c.name);
		}
	}
}
/*
Displays as
nickel
dollar
quarter
penny
*/
