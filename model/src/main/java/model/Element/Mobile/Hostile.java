package model.Element.Mobile;

import model.Element.Permeability;
import model.Element.Sprite;

public class Hostile extends Mobile {

	Hostile(Sprite sprite) {
		super(sprite, null, Permeability.BLOCKINGFOROTHERENTITIES);

	}

	public boolean testNextPosition() {
		// TODO - implement Hostile.testNextPosition
		throw new UnsupportedOperationException();
	}

}