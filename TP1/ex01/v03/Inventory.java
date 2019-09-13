package v03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec whatErinLikes) {
		
		List<Guitar> listGuitar = new ArrayList<Guitar>();
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			Builder builder = whatErinLikes.getBuilder();
			if ((builder != null)  && (!builder.equals(guitar.getSpec().getBuilder())))
				continue;
			
			String model = whatErinLikes.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getSpec().getModel())))
				continue;
			
			Type type = whatErinLikes.getType();
			if ((type != null)  && (!type.equals(guitar.getSpec().getType())))
				continue;
			
			Wood backWood = whatErinLikes.getBackWood();
			if ((backWood != null)  && (!backWood.equals(guitar.getSpec().getBackWood())))
				continue;
			
			Wood topWood = whatErinLikes.getTopWood();
			if ((topWood != null)  && (!topWood.equals(guitar.getSpec().getTopWood())))
				continue;
			
			listGuitar.add(guitar);
		}
		return listGuitar;
	}

}
