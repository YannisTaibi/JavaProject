package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

class Blank extends MotionlessElement {
	private static final Sprite sprite = new Sprite('[', "Blank.jpg");

	Blank() {
		super(sprite, Permeability.PENETRABLE);

	}
}
