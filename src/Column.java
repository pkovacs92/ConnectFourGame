
public class Column {

	public int numRows;
	public Counter[] elementsArray;
	
	public Column(int numRows) {
		this.numRows = numRows;
		elementsArray = new Counter[numRows];
	}
	
	public boolean isFull() {
		for (int i = 0; i<elementsArray.length; i++) {
			if (elementsArray[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	public boolean add(Counter counter) {
		if (this.isFull()) {
			return false;
		}
		for (int i = (elementsArray.length -1); i>-1; i--) {
			if (elementsArray[i] == null) {
				elementsArray[i] = counter;
				return true;
			}
		}
		return true;
	}
	
	public String displayRow(int rownumber) {
		if (elementsArray[rownumber]==null) {
			return " ";
		}else {
			return elementsArray[rownumber].toString();
		}
	}
	
	public void display() {
		for(int i=0; i<elementsArray.length; i++) {
			System.out.println(elementsArray[i]);
		}
		
	}
	
	public int highestRow() {
		int result = 0;
		for (int i = elementsArray.length-1; i>-1; i--) {
			if (elementsArray[i] != null) {
				result = i;
			}
		}
		System.out.println("DEBUG: highest row in column is " + result);
		return result;
	}
	
}
