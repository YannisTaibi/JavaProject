package model.Element.Mobile;

import model.ILevel;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public class MyLorann extends Mobile {

	private static final Sprite sprite = new Sprite('H', "Lorann.png");

	private static final Sprite spriteUp = new Sprite('H', "LorannUp.png");

	private static final Sprite spriteLeft = new Sprite('H', "LorannLeft.png");

	private static final Sprite spriteDown = new Sprite('H', "LorannDown.png");

	private static final Sprite spriteRight = new Sprite('H', "LorannRight.png");

	private static final Sprite spriteUpLeft = new Sprite('H', "LorannUpLeft.png");

	private static final Sprite spriteUpRight = new Sprite('H', "LorannUpRight.png");

	private static final Sprite spriteDownLeft = new Sprite('H', "LorannDownLeft.png");

	private static final Sprite spriteDownRight = new Sprite('H', "LorannDownRight.png");

	/**
	 *
	 * @param x
	 * @param y
	 * @param level
	 */
	public MyLorann(int x, int y, ILevel level) {
		super(x, y, sprite, level, Permeability.PENETRABLE);
		spriteUp.loadImage();
		spriteLeft.loadImage();
		spriteDown.loadImage();
		spriteRight.loadImage();
		spriteUpLeft.loadImage();
		spriteUpRight.loadImage();
		spriteDownLeft.loadImage();
		spriteDownRight.loadImage();
	}

	public void castSpell() {
		// TODO - implement MyLorann.castSpell
		throw new UnsupportedOperationException();
	}

	@Override
	protected void die() {
		// TODO - implement MyLorann.die
		throw new UnsupportedOperationException();
	}

	@Override
	public void doNothing() {
		// TODO - implement MyLorann.doNothing
		throw new UnsupportedOperationException();
	}

	public void goingThroughDoor() {
		// TODO - implement MyLorann.goingThroughDoor
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveDown() {
		super.moveLeft();
		this.setSprite(spriteDown);
	}

	@Override
	public void moveDownLeft() {
		super.moveLeft();
		this.setSprite(spriteDownLeft);
	}

	@Override
	public void moveDownRight() {
		super.moveLeft();
		this.setSprite(spriteDownRight);
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
		this.setSprite(spriteLeft);
	}

	@Override
	public void moveRight() {
		super.moveLeft();
		this.setSprite(spriteRight);
	}

	@Override
	public void moveUp() {
		super.moveLeft();
		this.setSprite(spriteUp);
	}

	@Override
	public void moveUpLeft() {
		super.moveLeft();
		this.setSprite(spriteUpLeft);
	}

	@Override
	public void moveUpRight() {
		super.moveLeft();
		this.setSprite(spriteUpRight);
	}

	public void pickupKey() {
		// TODO - implement MyLorann.pickupKey
		throw new UnsupportedOperationException();
	}

	public void pickupTreasure() {
		// TODO - implement MyLorann.pickupTreasure
		throw new UnsupportedOperationException();
	}

	public boolean testNextPosition() {
		// TODO - implement MyLorann.testNextPosition
		throw new UnsupportedOperationException();
	}

	public Element testPosition() {
		// TODO - implement MyLorann.testPosition
		throw new UnsupportedOperationException();
	}

}