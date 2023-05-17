package Definitions;

import java.io.Serializable;
import java.time.LocalDate;

public class Tape extends Goods implements Serializable {
	
	private int tape_id;
	private String tape_name;
	private double tape_price;
	private LocalDate publishDate;
	private int rating;
	
	public int getTape_id() {
		return tape_id;
	}

	public void setTape_id(int tape_id) {
		this.tape_id = tape_id;
	}

	public String getTape_name() {
		return tape_name;
	}

	public void setTape_name(String tape_name) {
		this.tape_name = tape_name;
	}

	public double getTape_price() {
		return tape_price;
	}

	public void setTape_price(double tape_price) {
		this.tape_price = tape_price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Tape [tape_id=" + tape_id + ", tape_name=" + tape_name + ", tape_price=" + tape_price + ", publishDate="
				+ publishDate + ", rating=" + rating + "]";
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Tape(int tape_id, String tape_name, double tape_price, LocalDate publishDate, int rating) {
		super();
		this.tape_id = tape_id;
		this.tape_name = tape_name;
		this.tape_price = tape_price;
		this.publishDate = publishDate;
		this.rating = rating;
	}
	
	
	
	

}
