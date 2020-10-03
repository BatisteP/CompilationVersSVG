package batiste.svgnode;

public class TextSVGNode extends SVGNode {
	public final int N_ID = 6;
	private int x,y;
	private String ID;
	
	private String text;
	public String getText() {
		return text;
	}
	public void setHeigth(String text) {
		this.text = text;
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
	
	
	public TextSVGNode(int x,int y,String text,String name, SVGNode parent) {
		super(parent);
		this.x = x;
		this.y = y;
		this.ID = name;
		this.text = text;
		this.parent = parent;
	}
	public TextSVGNode(int x,int y,String text , SVGNode parent) {
		super(parent);
		this.x = x;
		this.y = y;
		this.text = text;		
		this.parent = parent;
		
	}
	@Override
	public int getN_ID() {
		return this.N_ID;
	}

}
