package controller;

import model.ILorannModel;

public class LorannController implements IOrderPerformer, ILorannController {

	private final int TIME_SLEEP = 100;
	private ILorannModel model;

	/**
	 *
	 * @param lorannModel
	 * @param lorannView
	 */
	public LorannController(ILorannModel lorannModel, ILorannView lorannView) {
		this.setView(view);
		this.setModel(this.model);
		this.clearStackOrder();
	}

	private void gameLoop() {
		// TODO - implement LorannController.gameLoop
		throw new UnsupportedOperationException();
	}

	private ILorannModel getModel() {
		// TODO - implement LorannController.getModel
		throw new UnsupportedOperationException();
	}

	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
	}

	private ILorannView getView() {
		// TODO - implement LorannController.getView
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param userOrder
	 */
	@Override
	public void orderPerform(UserOrder userOrder) {
		this.setStackOrder(userOrder);
	}

	@Override
	public void play() {
		// TODO - implement LorannController.play
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param model
	 */
	private void setModel(ILorannModel model) {
		this.model = model;
	}

	/**
	 *
	 * @param view
	 */
	private view setView(ILorannView view) {
		// TODO - implement LorannController.setView
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param viewSystem
	 */
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}

}