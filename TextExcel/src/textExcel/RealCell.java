package textExcel;

public class RealCell implements Cell {
	
	private String value;
	public RealCell (String specValue) {   //constructor
		value = specValue;
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		if (value.length() > 10) {
			return value.substring(0, 10);    //truncates value longer than 10 characters
		} else if (value.length() == 10) {	//no need to change the value since exactly 10 characters long
			return value;
		} else {
			while (value.length() < 10) {    //adds spaces so the cell will be 10 characters long if the value itself is shorter
				value += " ";
			}
			return value;
		}
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return value;
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(value);
	}

}
