package boardgame;

public class Position {
	
	private int row;
	private int colum;
	
	public Position(int row, int calumn) {
		this.row = row;
		this.colum = calumn;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColum() {
		return colum;
	}

	public void setCalumn(int calumn) {
		this.colum = calumn;
	}

	@Override
	public String toString() {
		return row
				+ ", "
				+ colum;
	}


	
	
	
	

}
