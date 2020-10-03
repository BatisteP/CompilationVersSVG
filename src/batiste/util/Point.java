package batiste.util;

import java.util.ArrayList;


public class Point {
    private int x;
    private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
 
	public Point(String string) {
		// TODO Auto-generated constructor stub
	}
	public static String pointsToString(ArrayList<Point> ar) {
		String s=" ";
		for (Point p : ar) {
			s+=p.getX()+","+p.getY()+" " ;
		}
		return s;
	}
}