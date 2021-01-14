import java.util.Random;

public class ConnectFour {
	
	public int boardRows;
	public int boardColumns;
	Random rand = new Random();
	
	public ConnectFour(int rows, int columns) {
		this.boardRows = rows;
		this.boardColumns = columns;
		this.playMatch();
	}
	

	
	public void playMatch() {
		
		Board board = new Board(boardRows,boardColumns);
		Player p1 = new Player("Player1", 'o');
		Player p2 = new Player("Player2", 'x');
		
		int randomRow;
		int randomCol;
		
		while (true) {
			if (board.isFull()==false) {
				while(true) {
					randomCol = rand.nextInt(boardColumns);
					if (board.columnArray[randomCol].isFull()) {
						continue;
					}else {
						board.add(new Counter(p1), randomCol);
						break;
					}
				}
				if (board.isWinner(board ,p1, board.columnArray[randomCol].highestRow(), randomCol)) {
					System.out.print("\n Player 1 (" + p1.getSymbol() + ") wins! \n");
					System.out.print(board.toString());
					break;
				}
				while(true) {
					randomCol = rand.nextInt(boardColumns);
					if (board.columnArray[randomCol].isFull()) {
						continue;
					}else {
						board.add(new Counter(p2), randomCol);
						break;
					}
				}
				if (board.isWinner(board ,p2, board.columnArray[randomCol].highestRow(), randomCol)) {
					System.out.print("\n Player 2 (" + p2.getSymbol() + ") wins! \n");
					System.out.print(board.toString());
					break;
				}
			}else {
				System.out.print("\n Board is full! \n");
				System.out.print(board.toString());
				break;
			}
		}
		
		//board.add(new Counter(p2), 6);
		//int n = rand.nextInt(50);
		
	}
	
}
