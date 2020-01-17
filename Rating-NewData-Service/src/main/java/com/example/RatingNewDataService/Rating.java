/**
 * 
 */
package com.example.RatingNewDataService;

/**
 * @author adms.java1
 *
 */
public class Rating {

	/**
	 * @param args
	 */
	private String movieId;
	private int rating;

	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public Rating() {
		super();
		
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}