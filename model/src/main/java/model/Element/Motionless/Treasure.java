package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class Treasure extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "Treasure.jpg");

	Treasure() {
		super(sprite, Permeability.BLOCKINGFOROTHERENTITIES);

	}
}