package model;

import java.util.Observable;

import model.Element.IElement;

public interface ILevel {

	int getHeight();

	Observable getObservable();

	/**
	 *
	 * @param x
	 * @param y
	 */
	IElement getOnTheLevelXY(int x, int y);

	int getWidth();

	void setMobileHasChanged();

}