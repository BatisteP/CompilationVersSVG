package batiste.svgnode;



public class CircleSVGNode extends SVGNode {
	public final int N_ID = 5;
	private int cx,cy,r;
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
	public int getCx() {
		return cx;
	}
	public void setCx(int cx) {
		this.cx = cx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int cy) {
		this.cy = cy;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	public CircleSVGNode(int cx,int cy,int r,String color,String name, SVGNode parent) {
		super(parent);
		this.cx = cx;
		this.cy = cy;
		this.color = color;
		this.ID = name;
		this.r = r;
		this.parent = parent;
	}
	public CircleSVGNode(int cx,int cy,int r,String color, SVGNode parent) {
		super(parent);
		this.cx = cx;
		this.cy = cy;
		this.color = color;
		this.r = r;		
		this.parent = parent;
	}
	@Override
	public int getN_ID() {
		return this.N_ID;
	}

}
