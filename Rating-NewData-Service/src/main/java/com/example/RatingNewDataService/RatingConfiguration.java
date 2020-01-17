/**
 * 
 */
package com.example.RatingNewDataService;

/**
 * @author adms.java1
 *
 */
public class RatingConfiguration {
	private int maximum;
	private int minimum;

	public RatingConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public RatingConfiguration() {
		super();

	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
