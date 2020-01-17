/**
 * 
 */
package com.catalog.moviecatalognewservice;

/**
 * @author adms.java1
 *
 */
public class MovieConfiguration {
	private int maximum;
	private int minimum;

	public MovieConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public MovieConfiguration() {
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
