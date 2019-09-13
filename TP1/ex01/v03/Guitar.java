package v03;

public class Guitar {

	private String serialNumber;
//	private Builder builder;
//	private String model;
//	private Type type;
//	private Wood backWood;
//	private Wood topWood;
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

//	public String getModel() {
//		return model;
//	}
//
//	public Type getType() {
//		return type;
//	}
//
//	public Wood getBackWood() {
//		return backWood;
//	}
//
//	public Wood getTopWood() {
//		return topWood;
//	}
//
//	public Builder getBuilder() {
//		return builder;
//	}

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.serialNumber = serialNumber;
//		this.builder = builder;
//		this.model = model;
//		this.type = type;
//		this.backWood = backWood;
//		this.topWood = topWood;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
