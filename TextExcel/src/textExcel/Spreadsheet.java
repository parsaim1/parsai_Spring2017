package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	
	private Cell[][] setUp = new Cell[20][12];
	
	public Spreadsheet() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
				setUp[i][j] = new EmptyCell();
			}
		}
	}
	
	@Override
	public String processCommand(String command) {
		// TODO Auto-generated method stub
		return command;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText() {
		// TODO Auto-generated method stub
		return null;
	}

}
