package cs2hw1;
import java.util.*;
import java.util.Scanner;
	// A Rectangle stores an (x, y) coordinate of its top/left corner, a width and height.
	public class Rectangle { 
		private int x; 
		private int y; 
		private int width; 
		private int height;
		
	// constructs a new Rectangle with the given x,y, width, and height public Rectangle(int x, int y, int w, int h)
		public Rectangle(int x, int y, int width, int height) {
			this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	// returns the fields' values public
		}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getArea() {
		return (width*height);
	}
	public void changeSize(int newWidth,int newHeight) {
		this.width=newWidth;
		this.height=newHeight;
	}
	
	// returns a string such as “Coordinate is (5,12) and dimension is 4x8” where 4 is width and 8 is height.
	public String toString() {
		return "Coordinate is ("+x+","+y+") and the dimension is "+width+"x"+height+" and area is "+this.getArea();

		}
}
