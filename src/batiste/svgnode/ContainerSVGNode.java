package batiste.svgnode;

public class ContainerSVGNode extends SVGNode{
	private final int N_ID = 7;
	private String color;
	private String transformation;
	private int strokeWidth;
	public int getStrokeWidth() {
		return strokeWidth;
	}
	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	private String ID;
	public ContainerSVGNode(String color,int strokeWidth, String transformation, SVGNode parent) {
		super(parent);
		this.setColor(color);
		this.setStrokeWidth(strokeWidth);
		this.setTransformation(transformation);
		
	}
	public ContainerSVGNode(String color,int strokeWidth, String transformation,String id, SVGNode parent) {
		super(parent);
		this.setStrokeWidth(strokeWidth);
		this.setID(id);
		this.setColor(color);
		this.setTransformation(transformation);
		
	}

	@Override
	public int getN_ID() {
		return this.N_ID;
	}

	public String getTransformation() {
		return transformation;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getID() {
		return this.ID;
	}
	public void setID(String id) {
		this.ID = id;
	}
	
}
