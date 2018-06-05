package model;

import java.io.IOException;

import model.Element.Mobile.IMobile;
import model.Element.Mobile.MyLorann;

public class LorannModel implements ILorannModel {

	private ILevel level;
	private IMobile myLorann;

	/**
	 *
	 * @param filename
	 * @param myLorannStartX
	 * @param myVehicleStartY
	 */
	public LorannModel(String filename, int myLorannStartX, int myVehicleStartY) throws IOException {
		this.setLevel(new Level(fileName));
		this.setMyLorann(new MyLorann(myLorannStartX, myLorannStartY, this.getLevel()));
	}

	@Override
	public ILevel getLevel() {
		return this.level;
	}

	@Override
	public IMobile getMyLorann() {
		return this.myLorann;
	}

	/**
	 *
	 * @param map
	 */
	private void setLevel(ILevel level) {
		this.level = level;
	}

	/**
	 *
	 * @param myLorann
	 */
	private void setMyLorann(IMobile myLorann) {
		this.myLorann = myLorann;
	}

}