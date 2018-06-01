package model.Element.Mobile;

import model.Element.*;

public interface IMobile extends IElement {

	void moveUp();

	void moveLeft();

	void moveRight();

	void moveDown();

	void doNothing();

	int getX();

	int getY();

	Boolean isAlive();

	Boolean hasDied();

	Point getPosition();

}