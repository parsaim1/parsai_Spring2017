package textExcel;

public class ValueCell extends RealCell {
	private String s;
	public ValueCell (String specValue) {
		super(Double.parseDouble(specValue) + "");
		s = specValue;
	}
	public String fullCellText() {
		return s;
	}
	
	
	
	
	
	/*public ValueCell (String specValue){
		super(specValue);
	}*/
	
}
