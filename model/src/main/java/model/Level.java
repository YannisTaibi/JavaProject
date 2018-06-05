package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

import model.Element.IElement;
import model.Element.Motionless.MotionlessElementsFactory;

public class Level implements ILevel {

	private int width;
	private int height;
	private IElement[][] onTheLevel;

	Level(final String filename) {
		super();
		this.loadFile(filename);
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public Observable getObservable() {
		return this;
	}

	/**
	 *
	 * @param x
	 * @param y
	 */
	@Override
	public IElement getOnTheLevelXY(int x, int y) {
		return this.onTheLevel[x][y];
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	private void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int y = 0;
		line = buffer.readLine();
		this.setWidth(Integer.parseInt(line));
		line = buffer.readLine();
		this.setHeight(Integer.parseInt(line));
		this.onTheLevel = new IElement[this.getWidth()][this.getHeight()];
		line = buffer.readLine();
		while (line != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				this.setOnTheLevelXY(MotionlessElementsFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
			}
			line = buffer.readLine();
			y++;
		}
		buffer.close();
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
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 *
	 * @param element
	 * @param x
	 * @param y
	 */
	private void setOnTheLevelXY(IElement element, int x, int y) {
		this.onTheLevel[x][y] = element;
	}

	/**
	 *
	 * @param width
	 */
	private void setWidth(int width) {
		this.width = width;
	}

}