package batiste.svgnode;

public class AnimationSVGNode extends SVGNode {
	public final int N_ID = 3;
	private String from, to;
	int dur;
	private String begin,xlink, attributeName,fill;
	private String id;
	public AnimationSVGNode( String from, String to, int dur, String begin, String attributeName,
			String fill, SVGNode parent,  String xlink) {
		super(parent);
		this.from = from;
		this.to = to;
		this.dur = dur;
		this.begin = begin;
		this.xlink = xlink;
		this.attributeName = attributeName;
		this.fill = fill;
	}
	public AnimationSVGNode( String from, String to, int dur, String begin, String attributeName,
			String fill, SVGNode parent,  String xlink, String id) {
		super(parent);
		this.from = from;
		this.to = to;
		this.dur = dur;
		this.begin = begin;
		this.xlink = xlink;
		this.attributeName = attributeName;
		this.fill = fill;
		this.id = id;
	}

	public AnimationSVGNode( String from, String to, int dur, String begin,  String fill,String attributeName, SVGNode parent) {
		super(parent);
		this.from = from;
		this.to = to;
		this.dur = dur;
		this.begin = begin;
		this.attributeName = attributeName;
		this.fill = fill;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDur() {
		return dur;
	}

	public void setDur(int dur) {
		this.dur = dur;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getXlink() {
		return xlink;
	}

	public void setXlink(String xlink) {
		this.xlink = xlink;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}

	

	@Override
	public int getN_ID() {
		// TODO Auto-generated method stub
		return this.N_ID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
