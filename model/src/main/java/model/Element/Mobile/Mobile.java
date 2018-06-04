package model.Element.Mobile;

import java.awt.Point;

import model.ILevel;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;
import showboard.IBoard;

public class Mobile extends Element implements IMobile {

	private Point position;
	private Boolean alive = true;
	private IBoard board;
	private ILevel level;

	/**
	 *
	 * @param x
	 * @param y
	 * @param sprite
	 * @param level
	 * @param permeability
	 */
	Mobile(int x, int y, Sprite sprite, ILevel level, Permeability permeability) {
		this(sprite, level, permeability);
		this.setX(x);
		this.setY(y);
	}

	/**
	 *
	 * @param sprite
	 * @param road
	 * @param permeability
	 */
	Mobile(Sprite sprite, ILevel level, Permeability permeability) {
		super(sprite, permeability);
		this.setLevel(level);
		this.position = new Point();
	}

	protected void die() {
		this.alive = false;
		this.setHasMoved();
	}

	@Override
	public void doNothing() {
		this.setHasMoved();
	}

	protected IBoard getBoard() {
		return this.board;
	}

	public ILevel getLevel() {
		return this.level;
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	@Override
	public int getX() {
		return this.getPosition().x;
	}

	@Override
	public int getY() {
		return this.getPosition().y;
	}

	@Override
	public Boolean hasDied() {
		// TODO - implement Mobile.hasDied
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean isAlive() {
		return this.alive;
	}

	@Override
	public void moveDown() {
		// TODO - implement Mobile.moveDown
		throw new UnsupportedOperationException();
	}

	public void moveDownLeft() {
		// TODO - implement Mobile.moveDownLeft
		throw new UnsupportedOperationException();
	}

	public void moveDownRight() {
		// TODO - implement Mobile.moveDownRight
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveLeft() {
		// TODO - implement Mobile.moveLeft
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveRight() {
		// TODO - implement Mobile.moveRight
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveUp() {
		// TODO - implement Mobile.moveUp
		throw new UnsupportedOperationException();
	}

	public void moveUpLeft() {
		// TODO - implement Mobile.moveUpLeft
		throw new UnsupportedOperationException();
	}

	public void moveUpRight() {
		// TODO - implement Mobile.moveUpRight
		throw new UnsupportedOperationException();
	}

	private void setHasMoved() {
		this.getLevel().setMobileHasChanged();
	}

	/**
	 *
	 * @param level
	 */
	private void setLevel(ILevel level) {
		this.level = level;
	}

	/**
	 *
	 * @param position
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	/**
	 *
	 * @param x
	 */
	public void setX(int x) {
		this.getPosition().x = x;
		if (this.hasDied()) {
			this.die();
		}
	}

	/**
	 *
	 * @param y
	 */
	public void setY(int y) {
		this.getPosition().y = (y + this.getLevel().getHeight()) % this.getLevel().getHeight();
		if (this.hasDied()) {
			this.die();
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 */
	public boolean testCollision(int x, int y) {
		// TODO - implement Mobile.testCollision
		throw new UnsupportedOperationException();
	}

}