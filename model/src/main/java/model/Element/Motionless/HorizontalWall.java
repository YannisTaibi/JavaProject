package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

class HorizontalWall extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "HorizontalWall.jpg");

	HorizontalWall() {
		super(sprite, Permeability.BLOCKINGFORLORANN);

	}

}
