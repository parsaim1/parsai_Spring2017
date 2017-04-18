package textExcel;

public class PercentCell extends RealCell {
	
	public PercentCell (String specValue) {
		super (specValue);
	}
	
	public String abbreviatedCellText() {
		String percent = (int) getDoubleValue() + "";   //you always want to have that percent sign (which occupies once character), so we should deal with truncating 9 characters instead
		if (percent.length() > 9) {
			return percent.substring(0, 9) + "%";    //truncates integer value longer than 9 characters and adds the percent sign
		} else if (percent.length() == 9) {	//no need to change the integer value since exactly 9 characters long
			return percent + "%";
		} else {
			percent += "%";  //places the percent sign before we add the spaces
			while (percent.length() < 10) {    //adds spaces so the cell will be 10 characters long if the integer value itself is shorter than 9 characters
				percent += " ";
			}
			return percent;
		}
	}
	
	public String fullCellText() {
		return (getDoubleValue() / 100) + "";   //dividing by 100 will still give you a double since getDoubleValue() will return a double
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(super.fullCellText().substring(0, super.fullCellText().length() - 1));
	}
}
