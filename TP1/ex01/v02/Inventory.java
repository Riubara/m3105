package v02;

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

	public List<Guitar> search(Guitar searchGuitar) {
		
		List<Guitar> listGuitar = new ArrayList<Guitar>();
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null)  && (!builder.equals(guitar.getBuilder())))
				continue;
			
			String model = searchGuitar.getModel();
			if ((model != null) && (!builder.equals("")) && (!model.equalsIgnoreCase(guitar.getModel())))
				continue;
			
			Type type = searchGuitar.getType();
			if ((type != null)  && (!type.equals(guitar.getType())))
				continue;
			
			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null)  && (!backWood.equals(guitar.getBackWood())))
				continue;
			
			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null)  && (!topWood.equals(guitar.getTopWood())))
				continue;
			
			listGuitar.add(guitar);
		}
		return listGuitar;
	}

}
