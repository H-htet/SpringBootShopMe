package collection;

public class Product {
	
	private String pdCode;
	private String pdName;
	private double pdPrice;
	
	public String getPdCode() {
		return pdCode;
	}
	
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}
	
	public String getPdName() {
		return pdName;
	}
	
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	
	public double getPdPrice() {
		return pdPrice;
	}
	
	public void setPdPrice(double pdPrice) {
		this.pdPrice = pdPrice;
	}
	
	public String toString() {
		return pdCode + " " + pdName +" "+ pdPrice;
	}
	
}
