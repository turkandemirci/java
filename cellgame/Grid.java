package development;

import java.util.ArrayList;

public class Grid {
	
	private ArrayList<Row> rows = new ArrayList<Row>();
	
	public Grid(ArrayList<Row> rows) {
		setRows(rows);
	}

	public Grid() {
		
	}
	public ArrayList<Row> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "Grid [rows=" + rows + "]";
	}

	
	
	
	
	
}
