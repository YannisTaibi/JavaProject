package model;

public interface ILevel {

	int getWidth();

	int getHeight();

	/**
	 * 
	 * @param x
	 * @param y
	 */
	IElement getOnTheLevelXY(int x, int y);

	void setMobileHasChanged();

	Observable getObservable();

}