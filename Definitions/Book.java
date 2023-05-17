package Definitions;

import java.io.Serializable;
import java.time.LocalDate;

public class Book extends Goods implements Serializable {
	
	private int book_id;
	private String book_name;
	private LocalDate publishDate;
	private double book_price;
	private int ratings;
	
	public Book(int book_id, String book_name, LocalDate publishDate, double book_price, int ratings) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.publishDate = publishDate;
		this.book_price = book_price;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", publishDate=" + publishDate
				+ ", book_price=" + book_price + ", ratings=" + ratings + "]";
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
}
