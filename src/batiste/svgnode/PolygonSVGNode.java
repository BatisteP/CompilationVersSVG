package batiste.svgnode;

import java.util.ArrayList;

import batiste.util.Point;

public class PolygonSVGNode extends SVGNode {
	public final int N_ID = 9;
	private ArrayList<Point> ar;
	private String ID;
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public ArrayList<Point> getAr() {
		return ar;
	}
	public void setAr(ArrayList<Point> ar) {
		this.ar = ar;
	}
	public void addPoint(int x,int y) {
		Point p = new Point(x,y);
		this.getAr().add(p);
	}
	public PolygonSVGNode(SVGNode parent, ArrayList<Point> ar, String iD, String color) {
		super(parent);
		this.ar = ar;
		ID = iD;
		this.color = color;
	}
	public PolygonSVGNode(SVGNode parent, ArrayList<Point> ar, String iD, String color, String transf) {
		super(parent);
		this.ar = ar;
		ID = iD;
		this.color = color;
		this.transf = transf;
	}
	@Override
	public int getN_ID() {
		return this.N_ID;
	}
	
	

}
