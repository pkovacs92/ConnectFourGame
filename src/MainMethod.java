
import java.util.Random;

public class MainMethod {

	public static void main(String[] args) {

		
		Random rand = new Random();
		Board board = new Board(6,7);
		Player p1 = new Player("Clive", 'o');
		Player p2 = new Player("Sharon", 'x');
		
		//board.add(new Counter(p2), 6);
		//board.add(new Counter(p1), 3);
		//board.add(new Counter(p2), 4);
		//board.add(new Counter(p1), 4);
		//board.add(new Counter(p2), 5);
		//board.add(new Counter(p1), 5);
		//board.add(new Counter(p2), 6);
		//board.add(new Counter(p1), 5);
		//board.add(new Counter(p2), 6);
		//board.add(new Counter(p1), 6);
		
		ConnectFour game = new ConnectFour(6,7);
		
		
	}
	
	
	
}
