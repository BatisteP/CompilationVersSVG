package batiste.svgnode;

import java.util.ArrayList;
import java.util.List;



public abstract class SVGNode {
	protected int profondeur;
	List<SVGNode> children;
	SVGNode parent;
	String transf;
	public String getTransf() {
		return transf;
	}
	public void setTransf(String transf) {
		this.transf = transf;
	}
	public static int N_ID;
	public List<SVGNode> getChildren() {
		return children;
	}
	public void setChildren(List<SVGNode> children) {
		this.children = children;
	}
	public SVGNode getParent() {
		return parent;
	}
	public void setParent(SVGNode parent) {
		this.parent = parent;
	}
	public SVGNode(SVGNode parent){
		
		children = new ArrayList<SVGNode>();
		if (parent!=null) {
			this.parent = parent;
			parent.getChildren().add(this);
			
			this.profondeur = parent.profondeur + 1;
			
			
		}
		
		
	}
	public abstract int getN_ID();
	public int getProfondeur() {
		return profondeur;
	}

		
}
