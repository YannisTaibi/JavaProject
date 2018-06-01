package model.Element.Mobile;

import model.*;
import model.Element.*;

public class Mobile extends Element implements IMobile {

	private Point position;
	private Boolean alive = true;
	private IBoard board;

	/**
	 * 
	 * @param sprite
	 * @param road
	 * @param permeability
	 */
	Mobile(Sprite sprite, IRoad road, Permeability permeability) {
		// TODO - implement Mobile.Mobile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param sprite
	 * @param level
	 * @param permeability
	 */
	Mobile(int x, int y, Sprite sprite, ILevel level, Permeability permeability) {
		// TODO - implement Mobile.Mobile
		throw new UnsupportedOperationException();
	}

	public void moveUp() {
		// TODO - implement Mobile.moveUp
		throw new UnsupportedOperationException();
	}

	public void moveLeft() {
		// TODO - implement Mobile.moveLeft
		throw new UnsupportedOperationException();
	}

	public void moveRight() {
		// TODO - implement Mobile.moveRight
		throw new UnsupportedOperationException();
	}

	public void moveDown() {
		// TODO - implement Mobile.moveDown
		throw new UnsupportedOperationException();
	}

	public void doNothing() {
		// TODO - implement Mobile.doNothing
		throw new UnsupportedOperationException();
	}

	private void setHasMoved() {
		// TODO - implement Mobile.setHasMoved
		throw new UnsupportedOperationException();
	}

	public int getX() {
		// TODO - implement Mobile.getX
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		// TODO - implement Mobile.setX
		throw new UnsupportedOperationException();
	}

	public int getY() {
		// TODO - implement Mobile.getY
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

	public ILevel getLevel() {
		// TODO - implement Mobile.getLevel
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

	public Boolean isAlive() {
		// TODO - implement Mobile.isAlive
		throw new UnsupportedOperationException();
	}

	protected void die() {
		// TODO - implement Mobile.die
		throw new UnsupportedOperationException();
	}

	public Boolean hasDied() {
		// TODO - implement Mobile.hasDied
		throw new UnsupportedOperationException();
	}

	public Point getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	protected IBoard getBoard() {
		return this.board;
	}

	public void moveUpLeft() {
		// TODO - implement Mobile.moveUpLeft
		throw new UnsupportedOperationException();
	}

	public void moveUpRight() {
		// TODO - implement Mobile.moveUpRight
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