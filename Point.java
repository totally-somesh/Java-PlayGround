package Definitions;

import java.lang.Math;

public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	public String show()
	{
		return ("X Coordinate : " +this.x+ " | Y Coordinate :  " +this.y);
	}
	
	public boolean isSame(Point p)
	{
		if((this.x == p.x ) && (this.y == p.y) )
			return true;
		else
			return false;
	}
	
	public Double distance(Point p)
	{
		
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
		
	}
	
}
