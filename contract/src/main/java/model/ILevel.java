package model;

import java.util.Observable;

public interface ILevel {
	int getHeight();
	int getWidth();
	Observable getObservable();
	IElement getOnTheLevelXY(int x, int y);
	void setMobileHasChanged();

}
