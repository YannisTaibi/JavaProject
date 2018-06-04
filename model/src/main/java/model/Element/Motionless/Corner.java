package model.Element.Motionless;

import model.Element.Permeability;
import model.Element.Sprite;

class Corner extends MotionlessElement {

	private static final Sprite sprite = new Sprite('[', "Corner.jpg");

	Corner() {
		super(sprite, Permeability.BLOCKINGFORLORANN);

	}

}
