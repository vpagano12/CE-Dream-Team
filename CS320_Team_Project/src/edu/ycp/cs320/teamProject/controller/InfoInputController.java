package edu.ycp.cs320.teamProject.controller;

import edu.ycp.cs320.teamProject.model.InfoInput;

/**
 * Controller for the guessing game.
 */
public class InfoInputController {
	private InfoInput model;

	/**
	 * Set the model.
	 * 
	 * @param model the model to set
	 */
	public void setModel(InfoInput model) {
		this.model = model;
	}

	/**
	 * Start a new guessing game by setting the minimum to 1 and the maximum to 100.
	 */
	public void startGame() {
		throw new UnsupportedOperationException("TODO - implement");
	}

	/**
	 * Called to indicate that the current guess is correct.
	 * Set the min and max to the current guess.
	 */
	public void setNumberFound() {
		throw new UnsupportedOperationException("TODO - implement");
	}

	/**
	 * Called to indicate that the user is thinking of a number that
	 * is less than the current guess.
	 */
	public void setNumberIsLessThanGuess() {
		throw new UnsupportedOperationException("TODO - implement");
	}

	/**
	 * Called to indicate that the user is thinking of a number that
	 * is greater than the current guess.
	 */
	public void setNumberIsGreaterThanGuess() {
		throw new UnsupportedOperationException("TODO - implement");
	}
}
