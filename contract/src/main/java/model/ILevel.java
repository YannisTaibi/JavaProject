package model;

import java.util.Observable;

import showboard.ISquare;

public interface ILevel {
	int getHeight();
	int getWidth();
	Observable getObservable();
	ISquare getOnTheLevelXY(int x, int y);
	void setMobileHasChanged();

}
