package model.Element.Mobile;

import java.awt.Point;

import model.ILevel;
import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;
import showboard.IBoard;

public class Mobile extends Element implements IMobile {

	private Point position;
	private final Boolean alive = true;
	private IBoard board;

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
		// TODO - implement Mobile.die
		throw new UnsupportedOperationException();
	}

	@Override
	public void doNothing() {
		// TODO - implement Mobile.doNothing
		throw new UnsupportedOperationException();
	}

	protected IBoard getBoard() {
		return this.board;
	}

	public ILevel getLevel() {
		// TODO - implement Mobile.getLevel
		throw new UnsupportedOperationException();
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	@Override
	public int getX() {
		// TODO - implement Mobile.getX
		throw new UnsupportedOperationException();
	}

	@Override
	public int getY() {
		// TODO - implement Mobile.getY
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean hasDied() {
		// TODO - implement Mobile.hasDied
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean isAlive() {
		// TODO - implement Mobile.isAlive
		throw new UnsupportedOperationException();
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
		// TODO - implement Mobile.setHasMoved
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param level
	 */
	private void setLevel(ILevel level) {
		// TODO - implement Mobile.setLevel
		throw new UnsupportedOperationException();
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
		// TODO - implement Mobile.setX
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param y
	 */
	public void setY(int y) {
		// TODO - implement Mobile.setY
		throw new UnsupportedOperationException();
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