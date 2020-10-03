package batiste.svgnode;

public class RectSVGNode extends SVGNode {
	public final int N_ID = 2;
	private int x,y,width,height;
	private String ID;
	private String color;
	public int getHeigth() {
		return height;
	}
	public void setHeigth(int height) {
		this.height = height;
	}
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
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public RectSVGNode(int x,int y,int width,int height,String color,String name, SVGNode parent) {
		super(parent);
		this.x = x;
		this.y = y;
		this.color = color;
		this.ID = name;
		this.width = width;
		this.height = height;
		this.parent = parent;
	}
	public RectSVGNode(int x,int y,int width,int height,String color, String transf,String name, SVGNode parent) {
		super(parent);
		this.x = x;
		this.y = y;
		this.transf = transf;
		this.color = color;
		this.ID = name;
		this.width = width;
		this.height = height;
		this.parent = parent;
	}
	public RectSVGNode(int x,int y,int width,int height,String color, SVGNode parent) {
		super(parent);
		
		this.x = x;
		this.y = y;
		this.color = color;
		this.width = width;
		this.height = height;
		this.parent = parent;
	}
	@Override
	public int getN_ID() {
		return this.N_ID;
	}

}
