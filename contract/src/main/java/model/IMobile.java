package model;

import java.awt.Point;

import showboard.IPawn;

public interface IMobile extends IPawn {

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