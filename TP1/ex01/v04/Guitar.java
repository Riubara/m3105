package v04;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
