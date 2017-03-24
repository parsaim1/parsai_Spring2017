package textExcel;

public class RealCell implements Cell {
	
	private String value;
	public RealCell (String specValue) {   //constructor
		value = specValue;
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return null;
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
