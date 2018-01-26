package development;

import java.util.ArrayList;

public class Row {
	
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	
	public Row() {
		
	}
	
	public Row(ArrayList<Cell> cells) {
		setCells(cells);
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "Row [cells=" + cells + "]";
	}

	
	
	
}
