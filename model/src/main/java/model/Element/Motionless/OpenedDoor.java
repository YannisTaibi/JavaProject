package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

public class OpenedDoor extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "OpenedDoor.jpg");

	OpenedDoor() {
		super(sprite, Permeability.BLOCKINGFOROTHERENTITIES);

	}
}