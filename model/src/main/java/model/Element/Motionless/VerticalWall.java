package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

class VerticalWall extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "VerticalWall.jpg");

	VerticalWall() {
		super(sprite, Permeability.BLOCKINGFORLORANN);

	}

}
