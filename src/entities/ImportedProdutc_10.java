package entities;

public class ImportedProdutc_10 extends Product_10 {
	private Double customsFee;

	
	public ImportedProdutc_10(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}	

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}	
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	

}
