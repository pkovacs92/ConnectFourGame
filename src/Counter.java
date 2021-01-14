
public class Counter {

	public Player player;
	public char symbol;
	
	public Counter(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public boolean equals(Counter counter) {
		if (counter.getPlayer().equals(this.getPlayer())) {
			return true;
		}
		return false;
	}
	
	public String toString(){
		return player.getSymbol();
	}
	
	
}
