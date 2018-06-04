package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class Key extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "Key.jpg");

	Key() {
		super(sprite, Permeability.BLOCKINGFOROTHERENTITIES);

	}
}