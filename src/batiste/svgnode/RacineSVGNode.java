package batiste.svgnode;

public class RacineSVGNode extends SVGNode {
	public final int N_ID = 0;
	
	private int width, height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return height;
	}
	public void setHeigth(int height) {
		this.height = height;
	}

	public RacineSVGNode(int width, int height, SVGNode parent) {
		super(parent);
		this.width = width;
		this.height = height;
		this.profondeur  = 1;
		
	}
	@Override
	public int getN_ID() {
		return this.N_ID;
	}
	

}
