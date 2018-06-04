package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class ClosedDoor extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "ClosedDoor.jpg");

	ClosedDoor() {
		super(sprite, Permeability.BLOCKINGFOROTHERENTITIES);

	}
}