package batiste.svgnode;

public class AnimateTransformSVGNode extends SVGNode {
	public final int N_ID = 8;
	private String from, to;
	private int dur;
	private String begin,xlink, attributeName,type,repeatCount;
	private String id;
	
	public AnimateTransformSVGNode( String from, String to, int dur, String begin,String repeatCount, String attributeName,String type,
			 SVGNode parent,  String xlink) {
		super(parent);
		this.from = from;
		this.to = to;
		this.dur = dur;
		this.begin = begin;
		this.xlink = xlink;
		this.attributeName = attributeName;
		this.type = type;
		this.repeatCount = repeatCount;
		
	}
	public AnimateTransformSVGNode( String from, String to, int dur, String begin,String repeatCount, String attributeName,String type,
			 SVGNode parent,  String xlink, String id) {
		super(parent);
		this.from = from;
		this.to = to;
		this.dur = dur;
		this.begin = begin;
		this.xlink = xlink;
		this.attributeName = attributeName;
		this.type = type;
		this.id = id;
		this.repeatCount = repeatCount;
	}

	public AnimateTransformSVGNode( String from, String to, int dur, String begin,String repeatCount, String attributeName, SVGNode parent, String type) {
		super(parent);
		this.from = from;
		this.to = to;
		this.dur = dur;
		this.begin = begin;
		this.attributeName = attributeName;
		this.type = type;
		this.repeatCount = repeatCount;
		
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRepeatCount() {
		return repeatCount;
	}
	public void setRepeatCount(String repeatCount) {
		this.repeatCount = repeatCount;
	}

}
