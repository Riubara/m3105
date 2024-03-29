package v04;

import v03.Builder;
import v03.Type;
import v03.Wood;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = 6;
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int nbCordes;

	public int getNbCordes() {
		return nbCordes;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public GuitarSpec(Builder builder, String model, Type type, int nbCordes, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.nbCordes = nbCordes;
	}

	public boolean matches(GuitarSpec whatErinLikes) {

		boolean res;
		Builder builder = whatErinLikes.getBuilder();
		String model = whatErinLikes.getModel();
		Type type = whatErinLikes.getType();
		int nbCordes = whatErinLikes.getNbCordes();
		Wood backWood = whatErinLikes.getBackWood();
		Wood topWood = whatErinLikes.getTopWood();

		return res;
	}

}
