package model;

import java.util.Observable;

import model.Element.IElement;

public class Level implements ILevel {

	private int width;
	private int height;

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public Observable getObservable() {
		// TODO - implement Level.getObservable
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param x
	 * @param y
	 */
	@Override
	public IElement getOnTheLevelXY(int x, int y) {
		// TODO - implement Level.getOnTheLevelXY
		throw new UnsupportedOperationException();
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	/**
	 *
	 * @param height
	 */
	private void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setMobileHasChanged() {
		// TODO - implement Level.setMobileHasChanged
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param element
	 * @param x
	 * @param y
	 */
	private void setOnTheLevelXY(IElement element, int x, int y) {
		// TODO - implement Level.setOnTheLevelXY
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param width
	 */
	private void setWidth(int width) {
		this.width = width;
	}

}