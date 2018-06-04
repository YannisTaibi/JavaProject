package model;

import java.awt.Point;

public interface IMobile extends IElement {

	void doNothing();

	Point getPosition();

	int getX();

	int getY();

	Boolean hasDied();

	Boolean isAlive();

	void moveDown();

	void moveLeft();

	void moveRight();

	void moveUp();

}