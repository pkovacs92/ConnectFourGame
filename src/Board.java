
public class Board {
	
	public int rows;
	public int columns;
	public Column[] columnArray;
	

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		columnArray = new Column[columns];
		
		for (int i = 0; i<columnArray.length; i++) {
			columnArray[i] = new Column(rows);
		}
		
		System.out.println("DEBUG: New board created with columnArray size: " +  columnArray.length + " and rows: " + rows);
	}
	
	public boolean isFull() {
		int fullColumns = 0;
		for (int i=0; i<columns; i++) {
			if (columnArray[i].isFull()) {
				fullColumns ++;
			}else {
			}
		}
		return fullColumns==columns;
	}
	
	public boolean add(Counter c, int col) {
		
		if (columnArray[col].add(c)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		
		String returnString = "";
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				if (j==0) {
					returnString += " | ";
				}
				returnString += columnArray[j].displayRow(i);
				returnString += " | ";
			}
			returnString += "\n";
		}
		
		return returnString;
	}
	
	public boolean isWinner(Board board, Player player, int posRow, int posCol) {
		String playerChar = player.getSymbol();
		//DEBUG
		System.out.println("testing if winner: " + playerChar + " " + posRow + " " + posCol);
		//DEBUG
		
		//STRAIGHTS---------------------------------------------------------------------------------------------------------------------------------------------------------
		try {
			System.out.println(board.columnArray[posCol].displayRow(posRow-1) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol].displayRow(posRow-1).equals(playerChar)) {
				if (board.columnArray[posCol].displayRow(posRow-2).equals(playerChar)) {
					if (board.columnArray[posCol].displayRow(posRow-3).equals(playerChar)) {
						System.out.println("upward vertical row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
			
		try {	
			System.out.println(board.columnArray[posCol].displayRow(posRow+1) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol].displayRow(posRow+1).equals(playerChar)) {
				if (board.columnArray[posCol].displayRow(posRow+2).equals(playerChar)) {
					if (board.columnArray[posCol].displayRow(posRow+3).equals(playerChar)) {
						System.out.println("downward vertical row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
			   System.out.println(exception);
		}
			
		try {
			System.out.println(board.columnArray[posCol+1].displayRow(posRow) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol+1].displayRow(posRow).equals(playerChar)) {
				if (board.columnArray[posCol+2].displayRow(posRow).equals(playerChar)) {
					if (board.columnArray[posCol+3].displayRow(posRow).equals(playerChar)) {
						System.out.println("right horizontal row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
		    System.out.println(exception);
		}
		
		try {
			System.out.println(board.columnArray[posCol-1].displayRow(posRow) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol-1].displayRow(posRow).equals(playerChar)) {
				if (board.columnArray[posCol-2].displayRow(posRow).equals(playerChar)) {
					if (board.columnArray[posCol-3].displayRow(posRow).equals(playerChar)) {
						System.out.println("left horizontal row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
		    System.out.println(exception);
		}
		
		//DIAGONALS---------------------------------------------------------------------------------------------------------------------------------------------------------
		try {
			System.out.println(board.columnArray[posCol-1].displayRow(posRow-1) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol-1].displayRow(posRow-1).equals(playerChar)) {
				if (board.columnArray[posCol-2].displayRow(posRow-2).equals(playerChar)) {
					if (board.columnArray[posCol-3].displayRow(posRow-3).equals(playerChar)) {
						System.out.println("NW diagonal row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
			
		try {	
			System.out.println(board.columnArray[posCol+1].displayRow(posRow+1) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol+1].displayRow(posRow+1).equals(playerChar)) {
				if (board.columnArray[posCol+2].displayRow(posRow+2).equals(playerChar)) {
					if (board.columnArray[posCol+3].displayRow(posRow+3).equals(playerChar)) {
						System.out.println("SE diagonal row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
			   System.out.println(exception);
		}
			
		try {
			System.out.println(board.columnArray[posCol+1].displayRow(posRow-1) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol+1].displayRow(posRow-1).equals(playerChar)) {
				if (board.columnArray[posCol+2].displayRow(posRow-2).equals(playerChar)) {
					if (board.columnArray[posCol+3].displayRow(posRow-3).equals(playerChar)) {
						System.out.println("NE diagonal row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
		    System.out.println(exception);
		}
		
		try {
			System.out.println(board.columnArray[posCol-1].displayRow(posRow+1) + " equals? " + board.columnArray[posCol].displayRow(posRow));
			if (board.columnArray[posCol-1].displayRow(posRow+1).equals(playerChar)) {
				if (board.columnArray[posCol-2].displayRow(posRow+2).equals(playerChar)) {
					if (board.columnArray[posCol-3].displayRow(posRow+3).equals(playerChar)) {
						System.out.println("SW diagonal row of 4 found!" + " Origin (col, row): " + posCol + " " + posRow);
						return true;
					}
				}
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
		    System.out.println(exception);
		}
		
		
		
		return false;
	}
	
}
