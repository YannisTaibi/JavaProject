package controller;

import model.ILorannModel;

public class LorannController implements IOrderPerformer, ILorannController {

	private final int TIME_SLEEP = 100;
	private ILorannModel model;
	private ILorannView view;
	private Order stackOrder;

	/**
	 *
	 * @param lorannModel
	 * @param lorannView
	 */
	public LorannController(ILorannModel lorannModel, ILorannView lorannView) {
		this.setView(this.view);
		this.setModel(this.model);
		this.clearStackOrder();
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = Order.NOP;
	}

	private void gameLoop() {
		// TODO - implement LorannController.gameLoop
		throw new UnsupportedOperationException();
	}

	private ILorannModel getModel() {
		return this.model;
	}

	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
	}

	/**
	 * Gets the stack order.
	 *
	 * @return the stack order
	 */
	private Order getStackOrder() {
		return this.stackOrder;
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
	public void orderPerform(Order Order) {
		this.setStackOrder(Order);
	}

	@Override
	public void play() {
		while (this.getModel().getMyLorann().isAlive()) {
			Thread.sleep(this.TIME_SLEEP);
			switch (this.getStackOrder()) {

			}
			this.clearStackOrder();
			if (this.getModel().getMyLorann().isAlive()) {
				this.getModel().getMyLorann().moveDown();
			}
			this.getView().followMyVehicle();
		}
		this.getView().displayMessage("CRASH !!!!!!!!!.");
	}

	/**
	 *
	 * @param model
	 */
	private void setModel(ILorannModel model) {
		this.model = model;
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final Order stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 *
	 * @param view
	 */
	private void setView(ILorannView view) {
		this.view = view;
	}

	/**
	 *
	 * @param viewSystem
	 */
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}

}