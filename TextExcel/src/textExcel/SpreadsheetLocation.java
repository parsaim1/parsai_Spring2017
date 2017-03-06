package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
   
	private String locName = "";
	
	
	@Override
    public int getRow() {
        // TODO Auto-generated method stub
        return Integer.parseInt(locName.substring(1)) -1;
    }

    @Override
    public int getCol() {
        // TODO Auto-generated method stub
    	int test = 1;
        char letter = 'A';
    	while (locName.charAt(0) != letter) {
    		test++;
    		letter++;
    	}
    	return test - 1;
    }
    	
    public SpreadsheetLocation(String cellName) {
    	locName = cellName;
        // TODO: Fill this out with your own code
    }

}
