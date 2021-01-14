
public class Player {

	public String name;
	public char symbol;
	
	public Player(String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return Character.toString(symbol);
	}
	
	public String toString() {
		return this.name;
	}
	
}
